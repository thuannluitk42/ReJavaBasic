package DuLieuSoTrongJava;

import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Text {
//	private String text;
//
//	public Text(String text) {
//		this.text = text;
//	}

    public static int calculateSumOfNumbers(String input) {
        // Sử dụng biểu thức chính quy để tìm tất cả các số trong chuỗi
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(input);

        int sum = 0;

        // Duyệt qua tất cả các số tìm thấy và cộng chúng lại
        while (matcher.find()) {
            String numberStr = matcher.group();
            System.out.println("Text.calculateSumOfNumbers() ---->" +numberStr);
            int number = Integer.parseInt(numberStr);
            sum += number;
        }

        return sum;
    }

	public static void main(String[] args) {
        String input = "abc123nd7gg89";
        int sum = calculateSumOfNumbers(input);
        System.out.println("Tổng = " + sum);
	}

}
