public class Bil {
    private Trailer trailer;
    private int vægt;

    public Bil(int vægt) {
        this.vægt = vægt;
    }

    public int totalVægt() {
        return vægt + trailer.getVægt();
    }

    public void setTrailer(Trailer trailer) {
        if(vægt + trailer.getVægt() >= 3501) {
            throw new IllegalArgumentException("Totalvægten er for høj. Traileren kan ikke kobles til bilen.");
        }
        this.trailer = trailer;
    }


    public static void main(String[] args) {
        Bil bil = new Bil(2500);

        try{
            bil.setTrailer(new Trailer(2500));
        } catch (IllegalArgumentException e ) {
            System.out.println(e.getMessage());
        }

        System.out.println(bil.totalVægt());


    }
}
