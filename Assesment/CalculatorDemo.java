import java.util.Scanner;
public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string value including numbers");
        String inputString  = sc.nextLine();

        CalculatorDemo calcultorDemo = new CalculatorDemo();
        int addition =  calcultorDemo.add(inputString);

        System.out.println("addition of numbers: " + addition);
    }
    public int add(String numbers)
    {
        int total = 0;
        String nums = numbers.replaceAll("[^0-9-]", "").trim();
        if(nums.length()>0)
        {
            try {
                for(int i = 0; i <nums.length(); i++)
                    {
                        if(nums.charAt(i)=='-')
                            throw new NumberFormatException("negatives not allowed "+nums.charAt(i)+""+nums.charAt(i+1));
                        else
                            total += Integer.parseInt(String.valueOf(nums.charAt(i)));
                    } 
                }catch (NumberFormatException e) {
                    e.printStackTrace();
                }
            return total;
        }
        return 0;
    }
}
