package top.suiyueran.test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class GrammarTest {

	public static void main(String[] args) throws IOException {
		test2();
	}

	public void test1() throws IOException {
		File file = new File("/opt/data/mysql_data/ad.data");
		boolean file2 = file.isFile();
		boolean exists = file.exists();
		System.out.println(exists);
		boolean createNewFile = file.createNewFile();
		System.out.println(createNewFile);
		System.out.println(file2);
	}
	public static void test2() throws IOException {
		LocalDateTime now1 = LocalDateTime.now();
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now1);
		System.out.println(now2);
	}
}
