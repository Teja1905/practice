package studentwrite;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class FileData {
	public void save(Student std) {
		try {
			FileWriter fw = new FileWriter("D:\\check.txt",true);
			BufferedWriter Bw =new BufferedWriter(fw); 
			Bw.newLine();
			Bw.write(std.getId()+","+std.getMarks()+","+std.getName()+","+std.getQual());
			Bw.close();
			fw.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	//get by id
	
	public Student getbyid (int id) {
		Student std = null;
		try {
			FileReader fr = new FileReader("D:\\check.txt");
			BufferedReader br = new BufferedReader(fr);
			String str =br.readLine();
			while(str!=null) {
				String[] values=
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return std;	
	}

}
