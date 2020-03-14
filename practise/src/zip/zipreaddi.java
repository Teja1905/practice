package zip;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class zipreaddi {
	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("D:\\files\\b\\files.zip");
			ZipInputStream zis = new ZipInputStream(fis);
			ZipEntry entry = zis.getNextEntry();
			while(entry!=null) {
			System.out.println(entry.getName());
			FileOutputStream fos = new FileOutputStream("D:\\files\\b\\unzip"+entry.getName());
			int by=	zis.read();
			while(by!=-1) {
				fos.write(by);
				by=zis.read();
			}
			entry=zis.getNextEntry();
			}
			zis.close();
			fis.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
