class Passager {
    private int age;
    private double poid;
    public static final int DEFAULT_AGE = 50;
    public static final double DEFAULT_POID = 300;

    public Passager() {
        this.age = DEFAULT_AGE;
        this.poid = DEFAULT_POID;
    }

    public Passager(int age, double poid) {
        this.setAge(age);
        this.setPoid(poid);
    }

    public void setAge(int age) {
        if (!isValidAge(age))
            System.err.println("Age invalide : " + age);
        else
            this.age = age;
    }

    public void setPoid(double poid) {
        if (!isValidPoid(poid))
            System.err.println("Poid invalide : " + poid);
        else
            this.poid = poid;
    }

    public int getAge() {
        return this.age;
    }

    public double getPoid() {
        return this.poid;
    }

    static public boolean isValidAge(int age) {
        boolean isValid = age > 0;

        return isValid;
    }

    static public boolean isValidPoid(double poid) {
        boolean isValid = poid > 0;

        return isValid;
    }

    @Override
    public String toString() {
        return "Passager{poids=" + this.poid + ";age=" + this.age + "}";
    }
}