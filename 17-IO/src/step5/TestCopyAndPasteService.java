package step5;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestCopyAndPasteService {
public static void main(String[] args) {
	String copyFilePath="C:\\kosta224\\iotest2\\lunch\\menu.txt";
	String pasteFilePath="C:\\kosta224\\iotest3\\dinner\\복사본-menu.txt";
	FileService service = new FileService(copyFilePath, pasteFilePath);
	//System.out.println("ok");
	
		try {
			service.copyAndPaste();
			System.out.println("복붙완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
}
}
