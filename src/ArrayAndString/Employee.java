package ArrayAndString;

public class Employee {
    public int id;
    public String name;
    public double sal;

    public Employee(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    @Override
    public String toString() {
        String s= "THE NAME IS "+name+ " AND HIS/HER ID IS "+id+" AND SAL IS "+sal;
        return s;
    }
}
