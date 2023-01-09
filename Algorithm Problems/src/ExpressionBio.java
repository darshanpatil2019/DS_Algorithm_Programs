import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ExpressionBio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bio = "Hello <<name>>, We have your full name as <<full name>> in our system. \n"
                + " * your contact number is 91-xxxxxxxxxx. Please,let us know in case of any clarification Thank you BridgeLabz \n"
                + " * 01/01/2016";

        System.out.println(bio);

        System.out.println("Enter your first name");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name");
        String lastName = sc.nextLine();

        String FullName = firstName + " " + lastName;
        System.out.println("Your full name is " + FullName);

        Pattern r = Pattern.compile("[a-zA-Z]+");

        if (Pattern.matches("[a-zA-z]+", firstName)) {
            bio = bio.replaceAll("<<name>>", firstName);
            bio = bio.replaceAll("<<full name>>", FullName);
        }

        System.out.println("Enter the mobile number");
        String mobileNo = sc.next();

        if (Pattern.matches("[789][0-9]{9}", mobileNo)) {
            bio = bio.replaceAll("x{10}", mobileNo);
        }

        System.out.println("Enter the date");
        String date = sc.next();

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("DD/MM/YYYY");
        LocalDate now = LocalDate.now();

        String day = "";

        System.out.println(day = dtf.format(now));

        if (Pattern.matches("^[0-3][0-9]/[0-3][0-9]/(?:[0-9][0-9])?[0-9][0-9]$", day)) {
            bio = bio.replaceAll("01/01/2016", day);
        }
        System.out.println(bio);

    }
}
