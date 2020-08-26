public class FindDay {
    public static void main(String[] args) {
        int day, month, year;

        day = Integer.parseInt(args[0]);
        month = Integer.parseInt(args[1]);
        year = Integer.parseInt(args[2]);

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + (31 * m0) / 12) % 7;

        String[] dayName = {"Sun", "Mon", "Tues", "Wed", "Thurs", "Fri", "Sat"};

        System.out.println("Day: "+dayName[d0]+"day");
    }
}