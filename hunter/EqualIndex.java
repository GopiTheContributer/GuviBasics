/*package whatever //do not write package name here */

import java.io.*;
import java.util.Scanner;

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] input = new int[n];
		int temp, index = 0;
		for(int i = 0; i < n; i++){
		    temp = sc.nextInt();
		    if(temp == i){
		        input[index] = temp;
		        index++;
		    }
		}
		if(input[1] == 0){
		    System.out.println("-1");
		}
		else{
		    for(int i = 0; i < index; i++){
		        System.out.print(input[i] + " ");
		    }
		}
	}
}
