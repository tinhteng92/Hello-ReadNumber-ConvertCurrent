import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập số cần đọc (0 - 99): ");
        short number = input.nextShort();
        int units = number % 10;
        String readUnits = "";
        int dozens = (number % 100 - units);
        String readDozens;
        int hundreds = number - number % 100;
        String readHundreds;
        String readNumber;

        switch (units){
            case 1:
                readUnits = "one";
                break;
            case 2:
                readUnits = "two";
                break;
            case 3:
                readUnits = "three";
                break;
            case 4:
                readUnits = "four";
                break;
            case 5:
                readUnits = "five";
                break;
            case 6:
                readUnits = "six";
                break;
            case 7:
                readUnits = "seven";
                break;
            case 8:
                readUnits = "eight";
                break;
            case 9:
                readUnits = "nine";
                break;
        }
        switch (dozens){
            case 20:
                readDozens = "twenty";
                break;
            case 30:
                readDozens = "twenty";
                break;
            case 40:
                readDozens = "twenty";
                break;
            case 50:
                readDozens = "twenty";
                break;
            case 60:
                readDozens = "twenty";
                break;
            case 70:
                readDozens = "twenty";
                break;
            case 80:
                readDozens = "twenty";
                break;
            case 90:
                readDozens = "twenty";
                break;
            default:
                readDozens = "";
        }
        switch (hundreds){
            case 100:
                readHundreds = "One hundred";
                break;
            case 200:
                readHundreds = "Two hundred";
                break;
            case 300:
                readHundreds = "Three hundred";
                break;
            case 400:
                readHundreds = "Four hundred";
                break;
            case 500:
                readHundreds = "Five hundred";
                break;
            case 600:
                readHundreds = "Six hundred";
                break;
            case 700:
                readHundreds = "Seven hundred";
                break;
            case 800:
                readHundreds = "Eight hundred";
                break;
            case 900:
                readHundreds = "Nine hundred";
                break;
            default:
                readHundreds = "";
        }
        switch (number){
            case 10:
                readNumber = "ten";
                break;
            case 11:
                readNumber = "eleven";
                break;
            case 12:
                readNumber = "twelve";
                break;
            case 13:
                readNumber = "thirteen";
                break;
            case 14:
                readNumber = "fourteen";
                break;
            case 15:
                readNumber = "fifteen";
                break;
            case 16:
                readNumber = "sixteen";
                break;
            case 17:
                readNumber = "seventeen";
                break;
            case 18:
                readNumber = "eighteen";
                break;
            case 19:
                readNumber = "nineteen";
                break;
            default:
                readNumber = "";
        }
        if (number < 10){
            System.out.println("Number is read: " + readUnits);
        } else if (number <= 15){
            System.out.println("Number is read: " + readHundreds + "" + readDozens + "" +readNumber);
        }else{
            System.out.println("Number is read: " + readHundreds + " " + readDozens + " " + readUnits + " " + readNumber);
        }

    }
}
