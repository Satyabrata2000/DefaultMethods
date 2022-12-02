package DefaultMethods;

//Static methods inside Java 8 interface
public interface Example3 {

    //default method
    default void say(){
        System.out.println("This is a default method");
    }

    //abstract method
    void sayMore(String msg);
        //static method
        static void sayLouder(String msg){
            System.out.println(msg);

    }
}
