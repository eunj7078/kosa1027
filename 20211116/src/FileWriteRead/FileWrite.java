package FileWriteRead;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	//byte로 저장
	public static void main(String[] args) throws IOException{
		FileOutputStream output = new FileOutputStream("out.txt");
		output.write("1번째 입니다.".getBytes());
		output.write("2번째 입니다.".getBytes());
		for(int i = 1 ; i <= 10 ; i++) {
			String data = i + "번째입니다.\n";
			output.write(data.getBytes());
			System.out.println(data);
		}
		output.close();
	}

}
