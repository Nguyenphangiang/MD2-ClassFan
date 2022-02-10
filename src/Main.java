public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan(3,10,"Yellow",true);
        Fan fan2 = new Fan(2,5,"blue",false);
        System.out.println("Fan1 Status: " + fan1.toString());
        System.out.println("Fan2 Status: " + fan2.toString());
    }
}
