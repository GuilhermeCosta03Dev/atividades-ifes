import java.util.Scanner;
public class Tarefa4String {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura do losango: ");
        int num = scanner.nextInt();
        String los = genLosango(num);
        System.out.println(los);
        scanner.close();
    }

    public static String genLosango(int num){
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String los = "";

        for (int i = 1 ; i<=num ; i++) {
            for (int j = 0 ; j<num ; j++) {
                los += abc.charAt(j);
            }
        }
        return los;
    }
}
