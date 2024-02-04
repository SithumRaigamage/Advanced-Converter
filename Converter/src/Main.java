import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. cm to inches");
            System.out.println("2. kg to lbs");
            System.out.println("3. Celsius to Fahrenheit");
            System.out.println("4. mm to inches");
            System.out.println("5. meters to feet");
            System.out.println("6. km to miles");
            System.out.println("7. cm to feet");
            System.out.println("8. grams to ounces");
            System.out.println("9. inches to feet");
            System.out.println("10. liters to gallons");
            System.out.println("11. pounds to ounces");
            System.out.println("12. mph to kph");
            System.out.println("13. acres to square feet");
            System.out.println("14. radians to degrees");
            System.out.println("15. hp to kw");
            System.out.println("16. meters to yards");
            System.out.println("17. mL to cups");
            System.out.println("18. inches to cm");
            System.out.println("19. lbs to kg");
            System.out.println("20. Fahrenheit to Celsius");
            System.out.println("21. inches to mm");
            System.out.println("22. Feet to Meters");
            System.out.println("23. miles to km");
            System.out.println("24. feet to cm");
            System.out.println("25. ounces to grams");
            System.out.println("26. feet to inches");
            System.out.println("27. gallons to liters");
            System.out.println("28. ounces to pounds");
            System.out.println("29. kph to mph");
            System.out.println("30. square feet to acres");
            System.out.println("31. degrees to radians");
            System.out.println("32. kw to hp");
            System.out.println("33. yards to meters");
            System.out.println("34. cups to mL");
            System.out.println("35. Exit");
            System.out.println("");
            System.out.print("Enter choice u want :");
            int choice = scanner.nextInt();


            double value;

            System.out.print("Enter the value to convert: ");
            value = scanner.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Converted value: " + cmToInches(value) + " inches");
                    System.out.println(" ");
                    break;
                case 2:
                    System.out.println("Converted value: " + kgToLbs(value) + " lbs");
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Converted value: " + celsiusToFahrenheit(value) + " Fahrenheit");
                    System.out.println(" ");
                    break;
                case 4:
                    System.out.println("Converted value: " + mmToInches(value) + " inches");
                    System.out.println(" ");
                    break;
                case 5:
                    System.out.println("Converted value: " + metersToFeet(value) + " feet");
                    System.out.println(" ");
                    break;
                case 6:
                    System.out.println("Converted value: " + kmToMiles(value) + " miles");
                    System.out.println(" ");
                    break;
                case 7:
                    System.out.println("Converted value: " + cmToFeet(value) + " feet");
                    System.out.println(" ");
                    break;
                case 8:
                    System.out.println("Converted value: " + gramsToOunces(value) + " ounces");
                    System.out.println(" ");
                    break;
                case 9:
                    System.out.println("Converted value: " + inchesToFeet(value) + " feet");
                    System.out.println(" ");
                    break;
                case 10:
                    System.out.println("Converted value: " + litersToGallons(value) + " gallons");
                    System.out.println(" ");
                    break;
                case 11:
                    System.out.println("Converted value: " + poundsToOunces(value) + " ounces");
                    System.out.println(" ");
                    break;
                case 12:
                    System.out.println("Converted value: " + mphToKph(value) + " kph");
                    System.out.println(" ");
                    break;
                case 13:
                    System.out.println("Converted value: " + acresToSquareFeet(value) + " square feet");
                    System.out.println(" ");
                    break;
                case 14:
                    System.out.println("Converted value: " + radiansToDegrees(value) + " degrees");
                    System.out.println(" ");
                    break;
                case 15:
                    System.out.println("Converted value: " + hpToKw(value) + " kW");
                    System.out.println(" ");
                    break;
                case 16:
                    System.out.println("Converted value: " + metersToYards(value) + " yards");
                    System.out.println(" ");
                    break;
                case 17:
                    System.out.println("Converted value: " + mLToCups(value) + " cups");
                    System.out.println(" ");
                    break;
                case 18:
                    System.out.println("Converted value: " + inchesToCm(value) + " cm");
                    System.out.println(" ");
                    break;
                case 19:
                    System.out.println("Converted value: " + lbsToKg(value) + " kg");
                    System.out.println(" ");
                    break;
                case 20:
                    System.out.println("Converted value: " + fahrenheitToCelsius(value) + " Celsius");
                    System.out.println(" ");
                    break;
                case 21:
                    System.out.println("Converted value: " + inchesToMm(value) + " mm");
                    System.out.println(" ");
                    break;
                case 22:
                    System.out.println("Converted value: " + feetToMeters(value) + " meters");
                    System.out.println(" ");
                    break;
                case 23:
                    System.out.println("Converted value: " + milesToKm(value) + " km");
                    System.out.println(" ");
                    break;
                case 24:
                    System.out.println("Converted value: " + feetToCm(value) + " cm");
                    System.out.println(" ");
                    break;
                case 25:
                    System.out.println("Converted value: " + ouncesToGrams(value) + " grams");
                    System.out.println(" ");
                    break;
                case 26:
                    System.out.println("Converted value: " + feetToInches(value) + " inches");
                    System.out.println(" ");
                    break;
                case 27:
                    System.out.println("Converted value: " + gallonsToLiters(value) + " liters");
                    System.out.println(" ");
                    break;
                case 28:
                    System.out.println("Converted value: " + ouncesToPounds(value) + " pounds");
                    System.out.println(" ");
                    break;
                case 29:
                    System.out.println("Converted value: " + kphToMph(value) + " mph");
                    System.out.println(" ");
                    break;
                case 30:
                    System.out.println("Converted value: " + squareFeetToAcres(value) + " acres");
                    System.out.println(" ");
                    break;
                case 31:
                    System.out.println("Converted value: " + degreesToRadians(value) + " radians");
                    System.out.println(" ");
                    break;
                case 32:
                    System.out.println("Converted value: " + kwToHp(value) + " hp");
                    System.out.println(" ");
                    break;
                case 33:
                    System.out.println("Converted value: " + yardsToMeters(value) + " meters");
                    System.out.println(" ");
                    break;
                case 34:
                    System.out.println("Converted value: " + cupsToMl(value) + " mL");
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    // Conversion functions
    public static double cmToInches(double cm) {
        return cm / 2.54;
    }

    public static double kgToLbs(double kg) {
        return kg * 2.20462;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double mmToInches(double mm) {
        return mm / 25.4;
    }

    public static double metersToFeet(double meters) {
        return meters * 3.28084;
    }

    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    public static double cmToFeet(double cm) {
        return cm / 30.48;
    }

    public static double gramsToOunces(double grams) {
        return grams * 0.035274;
    }

    public static double inchesToFeet(double inches) {
        return inches / 12;
    }

    public static double litersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static double poundsToOunces(double pounds) {
        return pounds * 16;
    }

    public static double mphToKph(double mph) {
        return mph * 1.60934;
    }

    public static double acresToSquareFeet(double acres) {
        return acres * 43560;
    }

    public static double radiansToDegrees(double radians) {
        return radians * 180 / Math.PI;
    }

    public static double hpToKw(double hp) {
        return hp * 0.7457;
    }

    public static double metersToYards(double meters) {
        return meters * 1.09361;
    }

    public static double mLToCups(double mL) {
        return mL * 0.00422675;
    }

    public static double inchesToCm(double inches) {
        return inches * 2.54;
    }

    public static double lbsToKg(double lbs) {
        return lbs * 0.453592;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static double inchesToMm(double inches) {
        return inches * 25.4;
    }

    public static double feetToMeters(double feet) {
        return feet * 0.3048;
    }

    public static double milesToKm(double miles) {
        return miles * 1.60934;
    }

    public static double feetToCm(double feet) {
        return feet * 30.48;
    }

    public static double ouncesToGrams(double ounces) {
        return ounces * 28.3495;
    }

    public static double feetToInches(double feet) {
        return feet * 12;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    public static double ouncesToPounds(double ounces) {
        return ounces / 16;
    }

    public static double kphToMph(double kph) {
        return kph / 1.60934;
    }

    public static double squareFeetToAcres(double squareFeet) {
        return squareFeet / 43560;
    }

    public static double degreesToRadians(double degrees) {
        return degrees * Math.PI / 180;
    }

    public static double kwToHp(double kw) {
        return kw / 0.7457;
    }

    public static double yardsToMeters(double yards) {
        return yards * 0.9144;
    }

    public static double cupsToMl(double cups) {
        return cups * 236.588;
    }
}
