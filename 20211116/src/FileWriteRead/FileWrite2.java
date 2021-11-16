package FileWriteRead;

import java.io.FileWriter;
import java.io.IOException;

public class FileWrite2 {

	public static void main(String[] args) throws IOException{
		FileWriter fw = new FileWriter("out1.txt", true); //true = append 추가
		for(int i = 11; i<=20;i++) {
			fw.write(i+"번째 입니다. \n");
		}
		fw.close();

	}

}
