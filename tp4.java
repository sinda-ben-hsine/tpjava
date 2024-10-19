import java.util.Scanner;

public class MaDate {
    private int jours;
    private int mois;
    private int annee;

    public MaDate(int jours, int mois, int annee) {
        this.jours = jours;
        this.mois = mois;
        this.annee = annee;
    }

    public MaDate(int a) {
        this.jours = 1;
        this.mois = 1;
        this.annee = a;

    }

    public String tostring() {
        return jours + "/" + mois + "/" + annee;
    }

    public void affiche() {
        System.out.println(this.tostring());
    }

    public int getjours() {
        return jours;
    }

    public int getmois() {
        return mois;
    }

    public int getannee() {
        return annee;
    }

    public void setjours(int j) {
        this.jours = j;

    }

    public void setmois(int m) {
        this.mois = m;
    }

    public void setannee(int a) {
        this.annee = a;
    }

public void ajouterUnJour() {
	this.jours++;
	if((this.mois==1 || this.mois==3 || this.mois==5 || this.mois==7 || this.mois==8 || this.mois==10) || this.mois==12) && this.jours==31){
		this.jours=1;
		this.mois+=1;
	}
	else if((this.mois==2)&& this.jours==28 ) {
		this.jours=1;
		this.mois=3;
	}
	else {
		this.jours=1;
		this.mois+=1;
	}
}

    public void ajouterPluseursJours(int n) {
        for (int i = 0; i < n; i++) {
            ajouterUnJour();
        }

    }

    public void ajouterUnMois() {
        this.mois++;
        if (this.mois == 12) {
            this.mois = 1;
            ajouterUnAn();
        }
    }

    public void ajouterUnAn() {
        this.annee++;
    }

public static void main(String[] args) {
    MaDate date1=new MaDate(26,01,2004);
    MaDate date2=new MaDate(05,0,2008);
    MaDate date3=new MaDate(18,19,2007);
    date1.setjours(12);
    date2.setmois(6);
    System.out.println("Date 1"+ date1);
    System.out.println("Date 2" + date2);
    System.out.println("Date 3 " + date3);
    Scanner scanner=new java.util.Scanner(System.in);
    System.out.println("choisis une operation");
    System.out.println("1 ajout un jour ");
    System.out.println("2 ajout plusieurs jours ");
    System.out.println("3 ajout un mois ");
    System.out.println("4 ajout une annee ");
    int choix=scanner.nextInt();
    switch (choix){
    case1:
    	date1.ajouterUnJour();
    System.out.println("New Date 1:"+date1);
    break;
    case2:
    	System.out.println("Enter le nombres des jours:");
    int days = scanner.nextInt();
    date1.ajouterPluseursJours(days);
    System.out.println("New Date 1:"+date1);
    break;
    case3:
    	date1.ajouterUnMois();
    System.out.println("New Date 1:"+date1);
    break;
    case4:
    	date1.ajouterUnAn();
    System.out.println("New Date 1:"+date1);
    break;
    default:
        System.out.println("Invalid choice.");}
    	scanner.close();
    
    }
}
