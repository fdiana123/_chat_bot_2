import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            while(true) {

                System.out.println("Vēlies turpināt? (Jā/ Nē):");
                String cont = scan.next();

                if(cont.equals("Nē")) {
                    break;
                }

                System.out.println("Káds ir tavs mīļākais ēdiens? ");
                String usr_op = scan.next();


                if(usr_op.equals("Plovs")) {
                    System.out.println("Forši, tas arī ir mans mīļālais ēdiens! " );
                } else if (usr_op.equals("Pasta")) {
                    System.out.println("Piedod, mēs nevaram būt draugi! " );
                } else if (usr_op.equals("Viss!")) {
                    System.out.println("Vai tu esi normāls? ");
                } else if (usr_op.equals("Pica")) {
                    System.out.println("Man arī garšo pica!" );
                } else {
                    System.out.println("Piedod, nepazīstu tādu ēdienu, Kas tas ir?");
                }
            }
        }

        }

