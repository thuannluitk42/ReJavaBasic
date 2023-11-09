package DocGhiFile;

import java.io.FileOutputStream;
import java.io.IOException;

public class GhiFile {
    public static void main(String[] args) {
        try {
            String pathFile = "D://Study//ReJavaBasic//src//DocGhiFile//KetQuaGhi.txt";
            String data = "Nội dung bạn muốn ghi vào tệp tin.";
            FileOutputStream fileOutputStream = new FileOutputStream(pathFile);
            fileOutputStream.write(data.getBytes());
            fileOutputStream.close();
            System.out.println("Đã ghi vào tệp tin thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
