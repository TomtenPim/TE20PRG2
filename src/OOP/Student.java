package OOP;

public class Student extends Person{

    private String program;
    private int year;
    private double fee;

    public Student(String name, String address , String program, int year, double fee) {
        super(name, address);
    }

    public String getProgram(){
        return program;
    }
    public void setProgram(){
        this.program = program;
    }
    public int getYear(){
        return year;
    }
    public void setYear(){
        this.year = year;
    }
    public double getFee(){
        return fee;
    }
    public void setFee(){
        this.fee = fee;
    }
    public String toString(){
    return "Student[Person[" + super.getName() + "," + super.getAddress() + "]," + getProgram() + "," + getYear() + "," + getFee() + "]"   ;
    }
}
