package test1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Animal {
}

public class SimpleClass {
    public static void main(String[] args) {
        try {
            // create an object of Dog
            Dog d1 = new Dog();

            /**
             CREATE OBJECT BLOCK
             **/

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // create an object of class
            // using Class.forName()
            Class obj2 = Class.forName("test1.Dog");

            // create an object of class
            // using .class
            Class obj3 = Dog.class;

            /**
             PRINT INFO BLOCK
             **/

            // get name of the class
            String name = obj.getName();
            System.out.println("Name: " + name);

            // get the access modifier of the class
            int modifier = obj.getModifiers();

            // convert the access modifier to string
            String mod = Modifier.toString(modifier);
            System.out.println("Modifier: " + mod);

            // get the superclass of Dog
            Class superClass = obj.getSuperclass();
            System.out.println("Superclass: " + superClass.getName());


            /**
             GET METHODS OF OBJECT BLOCK
             **/
            // using object of Class to
            // get all the declared methods of Dog
            Method[] methods = obj.getDeclaredMethods();

            // create an object of the Method class
            for (Method m : methods) {

                // get names of methods
                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int modifier2 = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier2));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }

            /**
             GET AND SET FIELDS OF OBJECT BLOCK
             **/

            // access and set the type field
            Field field1 = obj.getField("type");
            field1.set(d1, "labrador");

            // get the value of the field type
            String typeValue = (String) field1.get(d1);
            System.out.println("Value: " + typeValue);

            // get the access modifier of the field type
            int mod1 = field1.getModifiers();

            // convert the modifier to String form
            String modifier1 = Modifier.toString(mod1);
            System.out.println("Modifier: " + modifier1);

            /**
             GET AND SET PRIVATE FIELDS OF OBJECT BLOCK
             **/

            // access the private field color
            Field field2 = obj.getDeclaredField("color");

            // allow modification of the private field
            field2.setAccessible(true);

            // set the value of color
            field2.set(d1, "brown");

            // get the value of field color
            String colorValue = (String) field2.get(d1);
            System.out.println("Value: " + colorValue);

            // get the access modifier of color
            int mod2 = field2.getModifiers();

            // convert the access modifier to string
            String modifier2 = Modifier.toString(mod2);
            System.out.println("Modifier: " + modifier2);

            /**
             CONSTRUCTOR OF OBJECT BLOCK
             **/

            // get all constructors of Dog
            Constructor[] constructors = obj.getDeclaredConstructors();

            for (Constructor c : constructors) {

                // get the name of constructors
                System.out.println("Constructor Name: " + c.getName());

                // get the access modifier of constructors
                // convert it into string form
                int modifier3 = c.getModifiers();
                String mod3 = Modifier.toString(modifier3);
                System.out.println("Modifier: " + mod3);

                // get the number of parameters in constructors
                System.out.println("Parameters: " + c.getParameterCount());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
