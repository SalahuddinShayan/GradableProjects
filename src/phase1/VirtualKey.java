package phase1;

import java.io.*;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.*;

public class VirtualKey {

	static void InfiniteLoop() throws IOException  {
		File folder = new File("C:\\Users\\Alifa\\OneDrive\\Documents\\Practice projects");
		File[] listOfFiles = folder.listFiles();
		Scanner Sc = new Scanner(System.in);
		try {int u = 1;
		while(u==1) {
			System.out.println("Please select the oppration you want to perform"+"\r\n" 
					+ "1.To see the list of all files." +"\r\n" 
					+ "2.To perform oppretaion on a specific file." +"\r\n"
					+ "0.Exit." );
			int c = Sc.nextInt();

			if(c==1) {
				Arrays.sort(listOfFiles);
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
						String x = Sc.nextLine();
						System.out.println("Please, give the name of the you want to add :  ");
						String filename= Sc.nextLine();
						File file = new File("C:\\Users\\Alifa\\OneDrive\\Documents\\Practice projects\\"+ filename + ".txt");

						if (file.createNewFile()==true){
							System.out.println("File is created!");
						}else{
							System.out.println("File already exists.");
						}

					}
					else if(a==2) {
						System.out.println("Please, give the file name that you want to delete with right extension and right case order: ");
						String x = Sc.nextLine();
						String filename= Sc.nextLine();
						for (int i = 0; i < listOfFiles.length; i++) {
							String str = listOfFiles[i].getName();
							if (str.equals(filename)) {
								Files.deleteIfExists(Paths.get("C:\\Users\\Alifa\\OneDrive\\Documents\\Practice projects\\"+ filename + ".txt")); 
								System.out.println(filename + " file has been deleted.");
								break;
							}
							else if (i==listOfFiles.length-1) {
								System.out.println("Your file not found. Please, make sure you entered correct file name with the right extension.");
							}
						}
					}
					else if(a==3) {
						System.out.println("Please, give the file name that you want to find with right extension and right case order: ");
						String x = Sc.nextLine();
						String filename= Sc.nextLine();
						for (int i = 0; i < listOfFiles.length; i++) {
							String str = listOfFiles[i].getName();
							if (str.equals(filename)) {
								System.out.println("Your file has been found.");
								break;
							}
							else if (i==listOfFiles.length-1) {
								System.out.println("Your file not found. Please, make sure you entered correct file name with the right extension.");
							}
						}

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

		}
		catch(InputMismatchException e) {
			System.out.println("Please, Select a valit option ");
			InfiniteLoop();
		}

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Welcome to the Virtual Key program, created by Salahuddin Mohammad Shayan");
		InfiniteLoop();

	}}