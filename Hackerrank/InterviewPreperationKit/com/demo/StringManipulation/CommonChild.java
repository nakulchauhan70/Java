package com.demo.StringManipulation;

import java.io.IOException;
import java.util.Scanner;

public class CommonChild {

	public static int count = 0;
    // Complete the commonChild function below.
    static int commonChild(String s1, String s2) {
    	char[] chArr1 = makeDistictArr(s1.toCharArray());
    	char[] chArr2 = makeDistictArr(s2.toCharArray());
    	for(int i=0;i<chArr2.length;i++) {
    		if((chArr1.toString()).contains(String.valueOf(chArr2[i]))) {
    			count++;
    			System.out.println(s2);
    		}
    	}
		return count;

    }

    private static char[] makeDistictArr(char[] arr) {
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i=0;i<arr.length;i++) {
    		for(int j=i;j<arr.length;j++) {
    			if(arr[i]==arr[j]) {
    				break;
    			}else {
    				sb.append(arr[i]);
    			}
    		}
    	}
    	System.out.println("arrr:"+new String(sb.toString()));
    	return sb.toString().toCharArray();
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s1 = scanner.nextLine();

        String s2 = scanner.nextLine();

        int result = commonChild(s1, s2);

       // bufferedWriter.write(String.valueOf(result));
       // bufferedWriter.newLine();

       // bufferedWriter.close();
System.out.println(result);
        scanner.close();
    }
}
