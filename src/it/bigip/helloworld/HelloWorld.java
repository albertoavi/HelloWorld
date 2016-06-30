package it.bigip.helloworld;

/**
 * Created by alberto on 6/30/16.
 */
public class HelloWorld {

    public HelloWorld() {
    }

    private void doSomething(){
        System.out.println(System.currentTimeMillis() + " Hello world!");
    }

    public static int main(String [] args){
        HelloWorld hello = new HelloWorld();
        hello.doSomething();
        
        return 0;
    }
}
