import java.util.Scanner;

public class Mowing {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the length");
        int block_length = keyboard.nextInt();
        System.out.println("Please enter the width");
        int block_width = keyboard.nextInt();
        int block_area = block_length * block_width;

        System.out.println("What is the house length");
        int house_length = keyboard.nextInt();
        System.out.println("What is the house width");
        int house_width = keyboard.nextInt();
        int house_area = house_length * house_width;
        int mowing_area = block_area - house_area;
        int mowing_time = (mowing_area / 2);
        System.out.println(mowing_time);
    }
}
