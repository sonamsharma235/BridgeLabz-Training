package Reflection;

import java.lang.reflect.*;
class Configuration {
    private static String API_KEY="OLD123";
}


public class StaticModify {
 public static void main(String[] args)throws Exception{

  Field f =
   Configuration.class.getDeclaredField("API_KEY");

  f.setAccessible(true);

  f.set(null,"NEW999");

  System.out.println("Updated: "+f.get(null));
 }
}
