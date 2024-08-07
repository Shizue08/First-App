/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mainproject;

/**
 *
 * @author Kazuha
 */


 // class Student{
 //     public int roll_no;
 //     public String name;
 //     Student (int roll_no, String name)
 //     {
 //         this.roll_no = roll_no;
 //         this.name = name;
 //     }
 // }
 public class MainProject {
 
     public static void main(String[] args) {
 
         makeDiamond(5);
     }
     
     private static void makeDiamond(int numberOfStars) {
         int spaceCount = numberOfStars;
 
         for(int x = 0; x <= numberOfStars; x++) {
             repeat(spaceCount, " ");
             repeat(x - 2, "*");
             repeat(x - 1, "*");
             consoleLog("\n");
             spaceCount--;
         }
         for(int x = numberOfStars; x >= 0; x--) {
             repeat(spaceCount, " ");
             repeat(x, "*");
             repeat(x - 1, "*");
             consoleLog("\n");
             spaceCount++;
         }
     }
 
     private static void consoleLog(String characterToReapeat){
         System.out.print(characterToReapeat);
     }
 
     private static void repeat(int numbersOfRepeat, String characterToRepeat) {
         for(int x = 0; x <= numbersOfRepeat; x++) {
             consoleLog(characterToRepeat);
         }
     }
 }      
         
         // int intArray [] = {1,2,3};
         // int cloneArray [] = intArray.clone();
 
         // System.out.print(cloneArray == intArray);
 
         // for (int i = 0; i < cloneArray.length; i++)
         // System.out.print(cloneArray[i] + " ");
 
         // System.out.println(cloneArray[0] == intArray[0]);
         // System.out.println(cloneArray[1] == intArray[1]);
 
         // int arr [] = {1,2,3,4,5};
         // sum(arr);
     // public static void sum(int[] arr) {
     //     int sum = 0;
     //     for (int i = 0; i < arr.length; i++)
     //     sum = arr[i];
     //     System.out.print("The sum of the values :" + sum);
 
         
     // }
 
     // int arr [][] = {{1,2,3}, {4,5,6}, {7,8,9,}};
         
 
         // for (int i = 0; i < 3; i++) {
         //     for (int j = 0; j < 3; j++)
         //     System.out.print(arr[i][j] + "");
         //     System.out.println(); 
         // }
 
 
 
     // Student arr [];
     // arr = new Student [10];
     
     // arr[0] = new Student (1, "Gwapo");
     // arr[1] = new Student (2, "Gwapo1");
     // arr[2] = new Student (3, "Gwapo2");
     // arr[3] = new Student (4, "Gwapo3");
     // arr[4] = new Student (5, "Gwapo4");
     // arr[5] = new Student (1, "Gwapo5");
     // arr[6] = new Student (2, "Gwapo6");
     // arr[7] = new Student (3, "Gwapo7");
     // arr[8] = new Student (4, "Gwapo8");
     // arr[9] = new Student (9, "Gwapo9");
     
     // for(int i = 0; i < arr.length; i++)
     //     System.out.println("The element at Index" + i + " : " + arr[i].roll_no + " " + arr[i].name);
 
 
 // //public class FirstProject {
 // //
 // //    public static void main(String[] args) {
 
 //         // String arr [];
 //         // arr = new String [5];
         
 //         // arr[0] = "Gwapo";
 //         // arr[1] = "Gwapo1";
 //         // arr[2] = "Gwapo2";
 //         // arr[3] = "Gwapo3";
 //         // arr[4] = "Gwapo4";
         
 //         // for(int i = 0; i < arr.length; i++)
 //         //     System.out.println("The element at Index" + i + " : " + arr[i]);
 
 //         // int arr [];
 //         // arr = new int [5];
         
 //         // arr[0] = 10;
 //         // arr[1] = 20;
 //         // arr[2] = 30;
 //         // arr[3] = 40;
 //         // arr[4] = 50;
         
 //         // for(int i = 0; i < arr.length; i++)
 //         //     System.out.println("The element at Index" + i + " : " + arr[i]);
 //     }
 // }