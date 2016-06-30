package it.bigip.helloworld;

import java.util.Map;

/**
 * Created by alberto on 6/30/16.
 */
public class HelloWorld {

    public HelloWorld() {
    }

    private void printSysInfo(){
        // this function is develeped to test dev-branch
        Map<String, String> env = System.getenv();
        for (String envName : env.keySet()) {
            System.out.format("%s=%s%n",
                    envName,
                    env.get(envName));
        }
    }

    public static void main(String [] args){
        HelloWorld hello = new HelloWorld();
        hello.printSysInfo();
    }
}
