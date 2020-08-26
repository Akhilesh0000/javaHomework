public class NoOfDays {
    public static void main(String[] args) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};   
        int month = Integer.parseInt(args[0]) - 1;
        System.out.println("There are " + daysInMonths[month]);
    }
}