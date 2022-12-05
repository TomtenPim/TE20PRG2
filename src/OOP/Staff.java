package OOP;

public class Staff extends Person{

    private String school;
    private double pay;
    public Staff(String name, String address,String school, double pay) {
        super(name, address);
    }
    public String getSchool(){
        return school;
    }
    public void setSchool(String school){
        this.school = school;
    }
    public double getPay(){
        return pay;
    }
    public void setPay(double pay){
        this.pay = pay;
    }
    public String toString(){
        return  "Staff[Person["+ super.getName() + "," + super.getAddress()+ "]," + school + "," + pay + "]";
    }
}
