package course.filterinputstreamdemo;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class CustomInputStreamDriver {
	public static void main(String[] args) throws IOException {
		File file = new File("./test.txt");
		try (InputStream in = new LowerCaseInputStream(new BufferedInputStream(new FileInputStream(file)))) {
			int c;
			while ((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
		}
	}
}
