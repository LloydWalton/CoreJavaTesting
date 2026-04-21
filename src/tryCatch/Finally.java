package tryCatch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Finally {

	public static void main(String[] args) throws IOException {
System.out.println("Enter a number");
		
InputStreamReader in=new InputStreamReader(System.in);
BufferedReader bf=new BufferedReader(in);
		
		try
		{
			int i=Integer.parseInt(bf.readLine());
			System.out.println(i);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			bf.close();
		}

	}

}
