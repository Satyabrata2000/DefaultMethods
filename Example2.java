package DefaultMethods;

//Java default method example
public class Example2 implements Example1{

    public void sayMore(String msg){  //implementing abstract method
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Example2 ex = new Example2();
        ex.say(); //calling default method
        ex.sayMore("This is a string"); //calling abstract method
    }
}
