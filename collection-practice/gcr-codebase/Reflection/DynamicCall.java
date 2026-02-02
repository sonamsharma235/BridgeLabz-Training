package Reflection;

import java.lang.reflect.*;
import java.util.Scanner;

class MathOperations {
    public int add(int a, int b){ return a+b; }
    public int subtract(int a,int b){ return a-b; }
    public int multiply(int a,int b){ return a*b; }
}

public class DynamicCall {
 public static void main(String[] args) throws Exception {

  MathOperations m = new MathOperations();

  Scanner sc = new Scanner(System.in);
  System.out.print("Enter method name: ");
  String name = sc.next();

  Method method =
   MathOperations.class.getMethod(name,int.class,int.class);

  Object r = method.invoke(m,10,5);

  System.out.println("Result: "+r);
 }
}

