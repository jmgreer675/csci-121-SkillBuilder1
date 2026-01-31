import java.util.Scanner;

/**
 * Skill Builder 0
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\"");
        String name = input.nextLine();
        System.out.println("Enter a floating-point number:");
        double spice = input.nextDouble();
        double calculation = (4.0/3.0)* Math.pow(2, Math.sqrt(5)/Math.pow(spice, 3));
        System.out.printf("Well " + name + ", the spice value resulted in %.4f\n", calculation);
        double intValue = (int)(calculation * 100) / 100.0;
        System.out.println("And the converted value is " + intValue);

    }

    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        int wallHeight = input.nextInt();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        int wallWidth = input.nextInt();

        int wallArea = wallWidth * wallHeight;
        System.out.println("Wall area: " + wallArea + " square feet");

        double paintNeeded = wallArea / squareFeetPerGallons;
        System.out.printf("Paint needed: %.2f gallons\n", paintNeeded);

        int cansNeeded = (int) Math.ceil(paintNeeded / gallonsPerCan);
        System.out.println("Cans needed: " + cansNeeded + " can(s)");

    }
}
