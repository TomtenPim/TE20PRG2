package GameOfLife;

public class Controller implements Runnable{
    Model model;
    View view;

    private Thread thread;
    private boolean running = false;


    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;
    }

    public synchronized void start() {
        running = true;
        thread = new Thread(this);
        thread.start();
        //view.setVisible();
    }

    public synchronized void stop() {
        running = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        view.setVisible();

        //model.update();
//        view.draw(model.getShapes());

        long startTime = System.currentTimeMillis();
        long lastUpdate = startTime;
        while (true) {
            view.draw(model.getShapes());
            if (System.currentTimeMillis()-lastUpdate > 50000) {
                model.update();
                lastUpdate = System.currentTimeMillis();
            }
        }
    }
}
