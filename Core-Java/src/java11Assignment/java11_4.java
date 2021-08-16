package java11Assignment;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class java11_4 {

	public static void main(String[] args) {
		try {
			String data= Files.readString(Path.of("D:\\Assignments\\Core-Java\\src\\java11Assignment\\Java11Assignments_StudentList.txt"));
			data.replace("\n", "");
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
