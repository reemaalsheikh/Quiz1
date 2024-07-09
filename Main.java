import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);

 //1. Write a Java program that accept three numbers from the user and print the largest number .

/*
        System.out.println("Please enter three numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is " + num1);
        }else if(num2 > num1 && num2 > num3){
            System.out.println("The largest number is " + num2);
        }else
            System.out.println("The largest number is " + num3); */



//2.Write a Java program that accept a String and a number from the user,
// then print the character in the given index .

        /*
        System.out.println("Please enter a string: ");
        String string1 = input.nextLine();
        System.out.println("Please enter an Index: ");
        int index = input.nextInt();
        System.out.println("The character of the given index is:   "+ string1.charAt(index)); */



//3.Write a program to enter the numbers till the user wants
// and at the end it should display the sum entered .

     /* System.out.println("Please Enter a number or 0 to Exit: ");
        int sum=0;
        int number=0;

        do{
            number = input.nextInt();
            sum+=number;

        }while(number!=0);
        System.out.println("The sum of the numbers is: "+sum); */



//4.Write a Java program to find positive and negative numbers of agiven array:

     /*  int [] originalarray = {10,-21,30,31,-25};

        for (int i = 0; i < originalarray.length ; i++) {

            if(originalarray[i]>0){
                System.out.println(originalarray[i]+"    Is a positive number");
            }else if(originalarray[i]<0){
                System.out.println(originalarray[i]+"   Is a negative number");

            }

        } */



//5.Write a Java program to find the shortest word of agiven array
// original array: ["Tuwaiq", "Bootcamp","Student" ,"JAVA"]
//Expected output: JAVA

/*
  String []  originalarray = {"Tuwaiq", "Bootcamp","Student","JAVA"};

  for(String word : originalarray){
      if (word.length() < originalarray[0].length() && word.length() < originalarray[1].length()){
                System.out.println(word);
            }
        } */




















    }
}