
    import java.util.Scanner;

    public class DoiTien {
        public static void main(String[] args) {
            String type;
            double result;
            Scanner input = new Scanner(System.in);
            System.out.println("Bạn muốn quy đổi loại tiền sang: ");
            type = input.nextLine();
            double amount;
            Scanner input2 = new Scanner(System.in);
            System.out.println("Nhập số tiền: ");
            amount = input2.nextDouble();

            if (type.equals("vnd")) {
                result = amount * 23000;
            } else if (type.equals("usd")) {
                result = amount / 23000;
            } else {
                result = 0;
            }
            System.out.println("Số tiền quy đổi sang " + type + " là: " + result);
        }
    }

