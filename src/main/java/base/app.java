package base;

import java.util.Scanner;

public class app {



    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        System.out.print("What is the principal amount:");
        String input0 = in.nextLine();
        int i0 = Integer.parseInt(input0);

        System.out.print("What is the rate?:");
        String input1 = in.nextLine();
        double i1 = Double.parseDouble(input1);
        double inter = i1/100;

        System.out.print("What is the number of years:");
        String input2 = in.nextLine();
        int i2 = Integer.parseInt(input2);

        System.out.print("What is the number of times the interest is compounded for year?:");
        String input3 = in.nextLine();
        int i3 = Integer.parseInt(input3);

        double total;
        total = i0*(1 + (inter/i3));

        double exponent = i3*i2;

        double ctotal = Math.pow(total, exponent);


        System.out.print("$"+i0 + " invested at " + i1 + " for " + i2 + " years compounded " + i3 + " times per year is " + ctotal);



    }}

