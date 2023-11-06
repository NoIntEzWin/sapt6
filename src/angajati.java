import java.util.Scanner;

public class angajati {

    public String Name;
    public String Email;
    public int HourRate;
    public int Capacity;
    public int FreeDays;
    public int DailyIncome;
    public int MonthlyIncome;

    public static void main(String[] args) {
        Scanner NAme = new Scanner(System.in);
        System.out.println("Enter username");

        String Nume = NAme.nextLine();
        System.out.println("Username is: " + Nume);

        Scanner EMail = new Scanner(System.in);
        System.out.println("Enter email");

        String  Email = EMail.nextLine();
        System.out.printls("Email is: " + Email);

        Scanner HR = new Scanner(System.in);
        System.out.println("Hour Rate:");

        String  HourR = HR.nextLine();
        System.out.printls("Hour rate is: " + HourR);


    }

    public angajati()
    {

    }

}

