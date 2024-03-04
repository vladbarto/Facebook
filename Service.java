import jdk.jshell.execution.Util;

import java.util.ArrayList;

public class Service {
    public static void addFriendInter(Utilizator adderFriend, Utilizator addedFriend){
        adderFriend.addFriend(addedFriend);
        addedFriend.addFriend(adderFriend);
    }
    public static void puneTeBineCuAdminii(Utilizator u, ArrayList<Pagina> lp)//lp-lista pagini
    {
        for(int i = 0; i < lp.size(); i++) {

            if( u.isFollowingThisPage(lp.get(i)) == true )
                addFriendInter(u, lp.get(i).getAdmin());
        }
    }
    public static void mesajeHUD(){
        System.out.println("\t1. Afiseaza, pentru un user, prietenii cu statutul single; type 1");
        System.out.println("\t2. Sterge, pentru un user, paginile cu domeniu de activitate Politica sau Economie; type 2");
        System.out.println("\t3. Adauga, pentru un user, ca prieteni adminii paginilor pe care le urmareste; type 3");
        System.out.println("\t4. Arata informatii despre un anumit utilizator; type 4");
        System.out.println("\t5. Arata informatii despre o toate paginile; type 5");
        System.out.println("\t6. Opreste executia programului; type stop");
    }
}