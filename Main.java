
/*
Implement Swing frontend(minimal) and SQL database backend using JDBC
Try to divide the project into multiple files(maybe move the Item,Inventory,Admin and other similar classes to a separate package)
Decide how to use the Main class(maybe add a root Admin object which controls all others)
*/


class Main{
    public static void main(String args[]){
        System.out.println("Main class");
    }
}
class Item{
    private String name;
    private double quantity,weight;
    Item(String n,double q,double w){
        name=n;
        quantity=q;
        weight=w;
    }
}
class Inventory{
    private Item Items[];
    Inventory(Item i[]){
        Items=i.clone();
    }
    void addItem();
    void removeItem();
}
class Admin{
    private String name;
    private int ID,phone;
    Admin(String n,int id,int ph){
        name=n;
        ID=id;
        phone=ph;
    }
    void makeManager();
    void removeManager();
    void getOrder();
}
class Manager{
    private String name;
    private int ID,phone;
    Manager(String n,int id,int ph){
        name=n;
        ID=id;
        phone=ph;
    }
    void loadInventory();
    void unloadInventory();
}
