public class Avion {
    
    private Passager[] sieges;

    private int nbPassager; 

    //  Constructeurs

    public Avion(){
        
    }

    //  Getter & Setter
    
    public void addPassager(int age, double poid) {
        sieges[nbPassager] = new Passager(age, poid);
    }
    public void removePassager(int i) {
        if  (i < nbPassager) {
          siege
        }
    }
}