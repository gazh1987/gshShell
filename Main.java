package gshShell;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

    	Scanner scanner = new Scanner(System.in);
    	
        while (true) {
        	System.out.print("$ ");
        	String input = scanner.nextLine().trim();
        	if (input.isEmpty()) {
        		continue;
        	}
        	String[] parsed = input.split("\\s+");  // matches and splits on one or more consecutive whitespace characters
        	
        	switch (parsed[0]) {
        		case "exit":
        			return;
        		case "echo":
        			System.out.println(String.join(" ", Arrays.copyOfRange(parsed, 1, parsed.length)));
        			break;
        		case "type":
        			// Todo
        		default:
        			System.out.println(parsed[0] + ": command not found");
        	}
        }
	}
}
