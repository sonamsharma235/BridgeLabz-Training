package Reflection;

import java.lang.reflect.*;
interface Greeting{
    void sayHello();
}

class GreetingImpl implements Greeting{
 public void sayHello(){
  System.out.println("Hello!");
 }
}



public class ProxyDemo {
 public static void main(String[] args){

  Greeting g = new GreetingImpl();

  Greeting proxy =
  (Greeting) Proxy.newProxyInstance(
   g.getClass().getClassLoader(),
   new Class[]{Greeting.class},

   (obj,method,params)->{
    System.out.println("Calling: "+method.getName());
    return method.invoke(g,params);
   });

  proxy.sayHello();
 }
}

