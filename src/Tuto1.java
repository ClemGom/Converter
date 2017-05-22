import java.util.Scanner;

class Tuto {
    private int temp;
    private double celsius;
    private double fahrenheit;
    private char reponse;
    private Scanner sc = new Scanner(System.in);
    private boolean crashed;

    private Tuto() {
        this.crashed = false;
        this.reponse = 'O';
    }

    public static void main(String args[]) {
        Tuto tuto1 = new Tuto();
        tuto1.converter();
    }

    private void converter() {
        do {
            System.out.println("Choisissez Le Mode De Conversion :\n1 - Celsius à Fahrenheit\n2 - Fahrenheit à Celsius ");

            try {
                temp = Integer.parseInt(sc.nextLine());
                crashed = temp != 1 && temp != 2;
            } catch (Exception e) {
                crashed = true;
            }
           if (temp == 1)
               celsiusto();
            if (temp == 2)
                fahrenheitto();
        } while (crashed);
    }
    private double celsiusto() {
          do {
              System.out.println("Température à convertir : ");

              try {
                  celsius = Integer.parseInt(sc.nextLine());
                  crashed = false;
              }catch (Exception e) {
                  crashed = true;
              }
          } while (crashed);
        System.out.println(String.format(" %d Celsius Font %d Fahrenheit",(int)celsius, (int)(9.0 / 5.0 * celsius + 32.0)));
        return 9 / 5 * celsius + 32;
    }
    private double fahrenheitto() {
        do {
            System.out.println("Température à convertir : ");

            try {
                fahrenheit = Integer.parseInt(sc.nextLine());
                crashed = false;
            }catch (Exception e) {
                crashed = true;
            }
        } while (crashed);
        System.out.println(String.format("Celsius : %d", (int)((fahrenheit - 32) * 5) / 9));
        return (((fahrenheit - 32) * 5) / 9); }
}