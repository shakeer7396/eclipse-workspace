package class7_Inheritance1;

// Multiple classes inheritance will work with interface only not in class
public interface IAdmin extends IGuest, IDeveloper {
//public void read();
//public void write(); // It takes automatically
public void manage();

}
