public class GreatCircle {
    public static void main(String[] args) {
        
        double x1, y1, x2, y2;
        x1 = Math.toRadians(Double.parseDouble(args[0]));
        y1 = Math.toRadians(Double.parseDouble(args[1]));
        x2 = Math.toRadians(Double.parseDouble(args[2]));
        y2 = Math.toRadians(Double.parseDouble(args[3]));
        
        Double greatCircleDistance;

        greatCircleDistance = Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2);
        greatCircleDistance = 60 * Math.acos(greatCircleDistance);

        System.out.println("Great Distance: "+greatCircleDistance+" NM");
    }
}