import Model.Manager;
import Model.employee;

public class Main2{
   public static void main(String[] args) {

      Manager m1 = new Manager("Shyam", 18, 776688, "Kathmandu", 70, "Coder");

      m1.getSalary(2);

      employee e1 = new employee("Hari", 18, 778899, "chabahil", 50, "Gamer");

      e1.getSalary(0);
   }
}
