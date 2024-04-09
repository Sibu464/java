public class Employee {
    private
            String name;
            int empNum;
            double salary;
            String surname;

//Employee(String name,int empNum,double salary,String surname){
//this.name=name;
//this.empNum=empNum;
//this.salary=salary;
//this.surname=surname;
// }
    Employee(){

}


    public String getName(){return this.name;}
    public int getEmpNum(){return this.empNum;}
    public double getSalary(){return this.salary;}

    public String getSurname(){return this.surname;}

    public void setEmpNum(int empNum) {
        this.empNum = empNum;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
