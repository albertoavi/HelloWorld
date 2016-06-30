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

    public static void main(String [] args){
        HelloWorld hello = new HelloWorld();

        for (int x=0; x<20; x++) {
            hello.doSomething();
        }
    }
}
