package ss16_IO_Text_File.thuc_hanh.thuc_hanh1;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("E:\\Codegym\\Modul2\\src\\ss16_IO_Text_File\\thuc_hanh\\thuc_hanh1\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("E:\\Codegym\\Modul2\\src\\ss16_IO_Text_File\\thuc_hanh\\thuc_hanh1\\result.txt", maxValue);
    }
}
