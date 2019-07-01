package commaseperate;

import java.io.FileWriter;
import java.io.IOException;

import com.opencsv.CSVWriter;

public class writing {

	public static void main(String[] args) throws IOException {
		
		
		String path="E:\\vinay\\GIT Repository\\latest\\latest\\src\\commaseperate\\value.csv";
		
		FileWriter fw=new FileWriter(path);
		
		
		CSVWriter wr=new CSVWriter(fw);
		
		
		String line1[]={"kumar@gmail.com","password1"};
		wr.writeNext(line1);
		
		String line2[]={"pandit@gmail.com","password2"};
		wr.writeNext(line2);
		
		wr.close();

	}

}
