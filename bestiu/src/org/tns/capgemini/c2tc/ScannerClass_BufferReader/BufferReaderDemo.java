package org.tns.capgemini.c2tc.ScannerClass_BufferReader;
import java.io.BufferedReader;
import java.io.FileReader; 
import java.io.IOException;
public class BufferReaderDemo {

	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\ADMIN\\git\\bestiu\\bestiu\\src\\ArrayDemo"));
		String data="";
		while((data=br.readLine())!=null) 
			{
			System.out.println(data);
			}
		br.close();

	}

}
