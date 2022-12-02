package DefaultMethods;

public class Example4  implements Example3{

    public void sayMore(String msg){ //Implementing abstarct method
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Example4 ex = new Example4();
        ex.say(); //calling default method
        ex.sayMore("Test String"); //calling abstract method
        Example3.sayLouder("Test Another String"); //calling static method
    }
}
