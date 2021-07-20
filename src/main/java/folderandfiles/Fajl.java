package folderandfiles;

public class Fajl extends FFClass{
    
    private int size;
    private EkstenzijaFajla ekstenzijaFajla;

    public Fajl() {
    }

    @Override
    public double getSize() {
        return size;
    }

    public EkstenzijaFajla getEkstenzijaFajla() {
        return ekstenzijaFajla;
    }
    
    public Fajl(int size, EkstenzijaFajla ekstenzijaFajla) {
        this.size = size;
        this.ekstenzijaFajla = ekstenzijaFajla;
    }   

    @Override
    public boolean search(String txt) {
        return name.toLowerCase().contains(txt.toLowerCase());
    }
}
