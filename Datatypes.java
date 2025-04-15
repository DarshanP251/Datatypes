package Datatypes;

public class Datatypes {
    public static void main(String[] args) {
        int num1  = 100000;
        float num2 = 10.5f;
        double num3 = 99.9;
        long num4 = 1000000;
        short num5 = 10000;

        boolean num6 = true;
        String str1 = "Darshan";
        char ch1 = 'A';
        byte bt1 = 100;

        int[] Array = { 1, 2, 3, 4, 5};


        System.out.println("Integer : " + num1);
        System.out.println("Float : " + num2);
        System.out.println("double : " + num3);
        System.out.println("long : " + num4);
        System.out.println("short : " + num5);
        System.out.println("boolean : " + num6);
        System.out.println("String : " + str1);
        System.out.println("char : " + ch1);
        System.out.println("Byte : " + bt1);

        System.out.println("Array : ");
        for(int i : Array){
            System.out.println(i + " ");
        }




        System.out.println("\nInside the git Mater Branch!");
    }
}
