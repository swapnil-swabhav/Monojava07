package com.techlabs.files;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadingDemo {

	public static void main(String[] args) {


		try {
			FileReader fileInputStream=new FileReader("D:\\My Batches\\Monocept May 2024\\Assignments\\06-streams-app\\src\\com\\techlabs\\files\\demo.txt");
			int ch;
			FileWriter fileWriter=new FileWriter("D:\\\\My Batches\\\\Monocept May 2024\\\\Assignments\\\\06-streams-app\\\\src\\\\com\\\\techlabs\\\\files\\\\demo2.txt");
			while((ch=fileInputStream.read())!=-1)
			{

                 fileWriter.write(ch);
			}
			
			System.out.println("File copied successfully");
			fileInputStream.close();
			fileWriter.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
