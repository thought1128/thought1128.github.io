package kmw;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;


public class Record {
	public static void main(String[] args) {
		String name="제발";
		//name=user.next();
		int score=10;
		try {
		    OutputStream record = new FileOutputStream("C:/Users/admin/Desktop/"+name+".txt");
		    String str =score+"";
		    byte[] by=str.getBytes();
		    record.write(by);
				
		} catch (Exception e) {
	            e.getStackTrace();
		}
        try{
        //파일 객체 생성
        File file = new File("C:/Users/admin/Desktop/"+name+".txt");
         //입력 스트림 생성
         FileReader file_reader = new FileReader(file);
         int cur = 0;
         while((cur = file_reader.read()) != -1){

        	System.out.print(cur);
         }
         file_reader.close();
        }catch (FileNotFoundException e) {
            e.getStackTrace();
        }catch(IOException e){
            e.getStackTrace();
        }
	}

}

