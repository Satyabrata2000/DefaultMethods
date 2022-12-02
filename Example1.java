package DefaultMethods;

//Java default method example
public interface Example1 {

           //default method
        default void say(){
            System.out.println("This is a default method");
        }

        //Abstract method
        void sayMore(String msg);

}
