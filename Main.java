package gshShell;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	
        while (true) {
        	System.out.print("$ ");
        	String input = scanner.nextLine();
        	String[] parsed = input.split(" ");
        	
        	switch (parsed[0]) {
        		case "exit":
        			return;
        		case "echo":
        			System.out.println(String.join(" ", Arrays.copyOfRange(parsed, 1, parsed.length)));
        			break;
        		default:
        			System.out.println(input + ": command not found");
        	}
        }
	}
}
