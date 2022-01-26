package ss19_String_and_Regex.bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexNameClass {
    public static void regexNameClass() {
        Scanner scanner= new Scanner(System.in);
        System.out.println(" moi nhap ten lop");
        String name= scanner.nextLine();
        Pattern pattern=Pattern.compile("^(C|A|P).*[0-9]{4}.*(G| H| I| K| L| M)$");
        Matcher m=pattern.matcher(name);
        System.out.println(m.matches());


    }

    public static void main(String[] args) {
        regexNameClass();
    }
}
