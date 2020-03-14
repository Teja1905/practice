package trash;

import java.io.FileInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zipppppp {
	public static void main(String[] args) {
	try {
	FileInputStream fis = new FileInputStream("D:\\fuvk.zip");
	ZipInputStream zis = new ZipInputStream(fis);
	ZipEntry entry =zis.getNextEntry();
	while(entry!=null) {
		System.out.println(entry.getName());
		entry=zis.getNextEntry();
	}
	fis.close();
	zis.close();
		
	}catch (Exception e) {
		e.printStackTrace();
	}
	}

}
