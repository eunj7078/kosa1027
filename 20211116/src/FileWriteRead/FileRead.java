package FileWriteRead;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	//���ڿ� 
	public static void main(String[] args) throws IOException{
		FileReader fr = new FileReader("out.txt");
		BufferedReader br = new BufferedReader(fr);
		while(true) {
			String line = br.readLine(); //���κ��� �о� ��
			if(line == null) break;
			System.out.println(line);
		}

	}

}
