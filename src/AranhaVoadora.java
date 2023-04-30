import java.util.Scanner;

public class AranhaVoadora implements Voador{

    private String nomearanha;
    private boolean soltandoteia;

    Scanner sc = new Scanner(System.in);

    public AranhaVoadora(){
        nomearanha = sc.nextLine();
        soltandoteia = false;

    }
    public void soltarteia(){
        System.out.println("Solta teia aranha");
        soltandoteia = true;
    }

    @Override
    public double voar() {
        return 0;
    }

    @Override
    public void planar() {

    }

    @Override
    public boolean pousar() {
        return false;
    }
}
