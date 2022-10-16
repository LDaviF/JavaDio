/* The first letter of a Class name needs to be Upper case, and the subsequence words too.
The .java file always needs to have the same name as the main class, and  properly case-sensitive.
In a generic way, a java code always starts like this: */
public class Main {
    /* If a class works like an executable, it needs of a special method, a main method.
    This method is unique in your initialization behavior, so it needs to be written in a specific way: */
    public static void main(String[] args) {
        /* “void” means that: this method won’t return a value.
        The method expect, follow some parameters (those are Strings, Arrays and Arguments, respectively) */

        // The curly bracket is the body
        System.out.println("Hello world!");
        /* The "System" class has a lot of operations of input and output */

        /* Variables needs to be written in camelCase */

        /* Variables written fully in upper case shouldn't be change*/

        /* How to declare a variable:
         Type camelCaseName = attribution (optional)
         Example:
         int age = 23;
         double height = 1.62;
         Dog spike; */
/*
        String myName = "Davi";

        int myAge = 21;

        boolean truly = true;

        truly = false;
*/
        /*
        How to declare a method:
        TypeReturn ObjectNameInInfinitiveWay Parameter(s)
        Example:
         */

        // int somar (int numberOne,int numberTwo);

        // Diferent parameters, porpouse defined and a type.
        // String formatPostalCode (long PostalCode);

        String firstName = "Davi";
        String SurName = "Ferreira";
        String fullName = fullName(firstName, SurName);
        System.out.println(fullName);
    }

    public static String fullName (String firstName, String SurName) {
        return "Method result " + firstName.concat(" ").concat(SurName);
    }
}