package DocGhiFile;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class DocFile {
    public static void main(String[] args) {
        String pathFile = "D://Study//ReJavaBasic//src//DocGhiFile//KetQuaGhi.txt";
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(new FileInputStream(pathFile), "UTF8"))) {
            String str;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
