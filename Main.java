import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bun venit!");
        ArrayList<Utilizator> users = new ArrayList<Utilizator>();
        ArrayList<Pagina> pages = new ArrayList<Pagina>();

        Utilizator dummy = new Utilizator();
        Utilizator pe1 = new Utilizator("@anastasia_boanchis", "tasoboanchis@gmail.com", "Anastasia Boanchis",
                "in a relationship");
        Utilizator pe2 = new Utilizator("@.codin_pop", "13codinpop@gmail.com", "Codin Pavel Pop", "in a relationship");
        Utilizator pe3 = new Utilizator("@mihai.rotariu", "rotariumihai@gmail.com", "Mihai Andrei Rotariu", "single");
        Utilizator adm1 = new Utilizator("@contactFRF", "contact@frf.ro", "Marius Balan", "casatorit");
        Utilizator adm2 = new Utilizator("@contactUNICEF", "contact@unicef.ro", "Aleksander Ceferin", "single");
        Pagina pa1 = new Pagina("Echipa Nationala de Fotbal a Romaniei", "Sport", "Despre fotbal in Romania", adm1);
        Pagina pa2 = new Pagina("UNICEF, Filiala Cluj-Napoca", "oameni", "Protejăm lucrurile importante", adm2);
        Pagina pa3 = new Pagina("Guvernul Romaniei", "politica", "Cinste si Onoare", dummy);

        users.add(pe1);
        users.add(pe2);
        users.add(pe3);
        pages.add(pa1);
        pages.add(pa2);
        users.add(adm1);
        users.add(adm2);
        Service.addFriendInter(pe1, pe2);
        Service.addFriendInter(pe1, pe3);
        Service.addFriendInter(pe2, pe3);
        pe1.follow(pa2);
        pe1.follow(pa1);
        pe1.follow(pa3);
        pe2.follow(pa2);
        pe2.follow(pa3);
        pe2.follow(pa1);

        ///HUD
        Scanner scan = new Scanner(System.in);
        String cmd;
        System.out.println("Programul a inceput executia!");
        do{
            System.out.println("Tastează -h pentru ajutor sau comanda ta în promptul de dedesubt");
            System.out.print("> ");
            cmd = scan.nextLine();
            if(cmd.equals("-h")){
                Service.mesajeHUD();
            }
            if(cmd.equals("1")){
                 /**
                 * Pentru un utilizator anume (la alegere), afisati toti prietenii
                 * care au statutul de 'single'
                 */
                System.out.println("Cerinta 1:///////////////////////////");
                System.out.println("Acest program va rula pentru Utilizatorul pe1: Anastasia Boanchis");
                pe1.getFriendsWithGivenStatus("single");
            }
            if(cmd.equals("2")){
                /**
                 * Utilizatorul da dislike la paginile care au domeniul de activitate
                 * politica sau economie
                 */
                System.out.println("Cerinta 2:///////////////////////////");
                System.out.println("Acest program va rula pentru Utilizatorul pe1: Anastasia Boanchis");
                pe1.unfollowPagesWithGivenActivityDomain("politica");
                pe1.unfollowPagesWithGivenActivityDomain("economie");
                pe1.showInfoAboutUser();
            }
            if(cmd.equals("3")){
                /**
                 * Utilizatorul ii adauga ca prieteni pe toti administratorii paginilor
                 * pe care le urmareste (la care a dat like). Afisati lista de prieteni
                 * dupa aceasta actiune
                 */
                System.out.println("Cerinta 3:///////////////////////////");
                System.out.println("Acest program va rula pentru Utilizatorul pe2: Codin Pavel Pop");
                pe2.showListOfFriends();
                Service.puneTeBineCuAdminii(pe2, pages);
                pe2.showListOfFriends();
            }
            if(cmd.equals("4")){
                System.out.println("Scrieti numele utilizatorului dorit, respectand literele mari si mici, precum si spatiile intocmai. E.g. Popescu Ion");
                System.out.println("Type abort daca doriti sa renuntati");
                System.out.print("> ");
                String expectedText = new String();
                expectedText = scan.nextLine();
                int ok = 0;
                if(!expectedText.equals("abort"))
                    for(Utilizator i: users) {
                        if (expectedText.equals(i.getNumeComplet())) {
                            ok = 1;
                            i.showInfoAboutUser();
                        }
                    }
                else ok = 1;
                if(ok == 0)
                    System.out.println("Numele introdus a fost scris greșit sau nu există între utilizatorii introduși");
            }
            if(cmd.equals("5")){
                System.out.println(pages);
            }
        }while(!cmd.equals("stop") && !cmd.equals("crapa"));
        System.out.println("Program terminat cu succes");
    }
}