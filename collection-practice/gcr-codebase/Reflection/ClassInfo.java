package Reflection;

import java.lang.reflect.*;

public class ClassInfo {
    public static void main(String[] args) throws Exception {

        Class<?> c = Class.forName("java.util.ArrayList");

        System.out.println("Methods:");
        for (Method m : c.getDeclaredMethods())
            System.out.println(m.getName());

        System.out.println("\nFields:");
        for (Field f : c.getDeclaredFields())
            System.out.println(f.getName());

        System.out.println("\nConstructors:");
        for (Constructor<?> con : c.getDeclaredConstructors())
            System.out.println(con);
    }
}

