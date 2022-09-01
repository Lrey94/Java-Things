public class Main {
    public static void main(String[] args) {
        calcFeetAndInchesToCentimetres(100);
    }
    public static double calcFeetAndInchesToCentimetres(double feet, double inches){
        if (feet >= 0 && inches >= 0 && inches <= 12){
            double FeetToInches = feet * 12;
            double InchesToCalculate = FeetToInches + inches;
            double InchesToCentimetres = InchesToCalculate * 2.54;
            return InchesToCentimetres;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimetres(double inches){
        if (inches < 0){
            return -1;
        }

        double InchesToFeet = inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to "
        + remainingInches + " feet and " + remainingInches + " inches");
        return calcFeetAndInchesToCentimetres(remainingInches, inches);
    }
}