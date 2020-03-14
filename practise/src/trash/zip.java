package trash;

import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zip {
	public static void main(String[] args) {
		try{
			FileInputStream fis = new FileInputStream("D:\\files\\b\\files.zip");
			ZipInputStream zis = new ZipInputStream(fis);
			ZipEntry entry = zis.getNextEntry();
			while(entry!=null) {
				System.out.println(entry.getName());
				entry =zis.getNextEntry();
			}
			zis.close();
			fis.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
