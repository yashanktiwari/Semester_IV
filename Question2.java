/*
Question:
Q2. There is a company that manufactures three types of products. In this company, there are 5 salesmen. Each salesman is supposed to sell three products. Write a program to print 
(i) The total no of sales by each salesman and 
(ii) total sales of each item. 
The structure of the class Company is as follows:-
class Company
{
	int products[];
}

HInt:- 
Company salesman[]= new Company[5];

Output :-
Enter the sales of 3 items sold by salesman 1: 23 23 45 
Enter the sales of 3 items sold by salesman 2: 34 45 63 
Enter the sales of 3 items sold by salesman 3: 36 33 43 
Enter the sales of 3 items sold by salesman 4: 33 52 35 
Enter the sales of 3 items sold by salesman 5: 32 45 64 
Total Sales By Salesman 1 = 91
Total Sales By Salesman 2 = 142
Total Sales By Salesman 3 = 112 
Total Sales By Salesman 4 = 120 
Total Sales By Salesman 5 = 141 
Total sales of item 1 = 158 
Total sales of item 2 = 198 
Total sales of item 3 = 250

*/

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Company[] salesman = new Company[5];
        for(int i=0; i<5; i++) {
            System.out.println("Enter the sales of 3 items sold by salesman " + (i+1) + ": ");
            salesman[i] = new Company(scan.nextInt(), scan.nextInt(), scan.nextInt());
        }

        for(int i=0; i<5; i++) {
            System.out.println("Total Sales by Salesman " + (i+1) + ": " + (salesman[i].products[0] + salesman[i].products[1] + salesman[i].products[2]));
        }
        int sum;
        for(int i=0; i<3; i++) {
            sum = 0;
            for(int j=0; j<5; j++) {
                sum += salesman[j].products[i];
            }
            System.out.println("Total sales of the item " + (i+1) + " is: " + sum);
        }

    }
}

class Company {
    int[] products = new int[3];
    public Company(int pdt1, int pdt2, int pdt3) {
        products[0] = pdt1;
        products[1] = pdt2;
        products[2] = pdt3;
    }
}
