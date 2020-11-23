/*
* Type Overloading 
*/

public class TypeOverload {
    public static String type(long num) {
        return "long";
    }

    public static String type(int num) {
        return "int";
    }

    public static String type(double num) {
        return "double";
    }

    public static String type(float num) {
        return "float";
    }

    
    public static void main(String[] args) {
        System.out.println(type(1.576));
        System.out.println(type(156));
        //System.out.println(type(567656753176));
        System.out.println(type(156.8970707870787));
    }
}
