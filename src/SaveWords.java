import java.util.Scanner;

public class SaveWords {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TextLogic textLogic = new TextLogic();
        String input;
        System.out.println("Hej och välkommen! Skriv in ord som du vill spara, skriv stop när du känner dig färdig!");
        while (!textLogic.getStop()) {
            input = sc.nextLine();
            textLogic.addLineCount();
            textLogic.addCharCount(input);
            textLogic.setLW(input);
            textLogic.ifStop(input);

        }
        System.out.println("Du har angett " + textLogic.getLineCount() + " olika rader," +
                "\n bestående av " + textLogic.getCharCount() + " tecken. " +
                "\n Ditt längsta ord var " + textLogic.getLW());


    }


}





