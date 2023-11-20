package entities;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    protected String name;
    protected Integer hours;
    protected Double valuePerHour;

    List<Employee> empList = new ArrayList<>();

    public Employee(String name, Integer hours, Double valuePerHour) {
        this.name = name;
        this.hours = hours;
        this.valuePerHour = valuePerHour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public void addEmployee(Employee emp){
        empList.add(emp);
    }

    public void removeEmployee(Employee emp){
        empList.remove(emp);
    }

    public Double payment(){
        return getValuePerHour() * getHours();
    }

    @Override
    public String toString(){
        return getName() + " - $ " + payment();
    }
}
