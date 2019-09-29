package pack1;

public class App {
    static SameName firstName = new SameName();
    static pack2.SameName secondName = new pack2.SameName();

    public static void main (String[] args){
        System.out.println(firstName.id + firstName.name + firstName.age + firstName.gender);
        System.out.println(secondName.id + secondName.name + secondName.age + secondName.gender);
    }
}
