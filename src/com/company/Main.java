package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] names = {"John Sibeso", "Jack Phiri", "Jane Banda", "Kalumbi Bwalya"};
        String[] subjects = {"id", "Chemistry", "Physics", "Mathematics", "Biology"};

        int[][] gradesAndId = {{1, 45, 54, 45, 54},
                {2, 56, 65, 78, 89},
                {3, 98, 67, 43, 45},
                {4, 76, 33, 58, 82}};


        int o = 1;
        for(int i = 0; i < names.length; i++) {
            System.out.println(names[i] + "'s computer# : " + o);
            o++;
        }

        System.out.print("\n");

        System.out.print("Choose ");
        int computerNumber = input.nextInt();

        for(int i = 0; i < gradesAndId.length; i ++) {
            if(computerNumber == gradesAndId[i][0]){
                System.out.println("\t\tNAME: " + names[i]);
                System.out.println("Subjects" + "\t\tScore" + "\t\t\tComments");
            }
        }

        for (int i = computerNumber; i < computerNumber + 1; i++) {

            if (computerNumber > names.length || computerNumber < 1) {
                System.out.println("Invalid input.");
                break;
            }

            for (int j = 1; j < subjects.length; j++) {
                System.out.print(subjects[j]);

                int p = i-1;

                for (int k = 0; k < 1; k++) {
                    System.out.print("\t\t  " + gradesAndId[p][j]);

                    String comment = null;
                    if (gradesAndId[p][j] > 70) {
                        comment = "Above average";
                        System.out.print("\t\t\t"+comment);
                    } else if (gradesAndId[p][j] > 50) {
                        comment = "Average";
                        System.out.print("\t\t\t"+comment);
                    } else {
                        comment = "Below average";
                        System.out.print("\t\t\t"+comment);
                    }
                }
                System.out.println();
            }
        }

    }
}
