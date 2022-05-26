package phase1;

import java.io.File;
import java.util.Scanner;

public class VirtualKey {
	public static void main(String[] args) {
	Scanner Sc = new Scanner(System.in);
	System.out.println("Welcome to the Calculator");
	int u = 1;
	while(u==1) {
		System.out.println("Please select the oppration you want to perform"+"\r\n" 
			+ "1.To see the list of all files." +"\r\n" 
			+ "2.To perform oppretaion on a specific file." +"\r\n"
			+ "0.Exit." );
		int c = Sc.nextInt();
	  if(c==1) {
		  File folder = new File("C:\\Users\\Alifa\\OneDrive\\Documents\\Practice projects");
		  File[] listOfFiles = folder.listFiles();
		  for (int i = 0; i < listOfFiles.length; i++) {
		  System.out.println(listOfFiles[i].getName());
	  }}
	  else if(c==2) {
		  while(u==1) {
				System.out.println("Please select the oppration you want to perform"+"\r\n" 
					+ "1.To add a file" +"\r\n" 
					+ "2.To Delete a file." +"\r\n"
					+ "3.To search a specific file."+"\r\n"
					+ "0.To go back to main context." );
				int a = Sc.nextInt();
				if(a==1) {
					
				}
				else if(a==2) {
					
				}
				else if(a==3) {
					
				}
				else if(a==0) {
					break;
				}
				else {
					System.out.println("Please select a valid option");
				}
	  }}
	  else if(c==0) {
		  System.out.println("The program is closed.");
			break;
	  }
	  else {
			System.out.println("Please select a valid option");
		}

}
}}