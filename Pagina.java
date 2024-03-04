public class Pagina {
    private String nume;
    private String activityDomain;//sport, educatie, beauty, stiri etc;
    private String description;
    private Utilizator admin;
    private int likes = 0;

    public Pagina(String nume, String activityDomain, String description, Utilizator admin) {
        this.nume = nume;
        this.activityDomain = activityDomain;
        this.description = description;
        this.admin = admin;
    }
    public void newFollower(){
        likes++;
    }
    public void lostAnFollower(){
        if(likes > 0)
            likes--;
    }
    public String getNume() {
        return nume;
    }


    public String getActivityDomain() {
        return activityDomain;
    }

    public Utilizator getAdmin() {
        return admin;
    }

    @Override
    public String toString() {
        return "Pagina{" +
                "nume='" + nume + '\'' + "\n"+
                ", domeniu de activiate='" + activityDomain + '\'' +"\n"+
                ", description='" + description + '\'' +"\n"+
                ", admin=" + admin.getNumeComplet() +"\n"+
                ", likes=" + likes +
                '}'+"\n";
    }

}
