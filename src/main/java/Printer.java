public class Printer {

    private int sheetsOfPaperLeft;
    private int tonerVolume;

    public Printer (int sheetsOfPaperLeft, int tonerVolume){
        this.sheetsOfPaperLeft = sheetsOfPaperLeft;
        this.tonerVolume = tonerVolume;
    }

    public int Print(int pages, int copies){
        if (this.sheetsOfPaperLeft >= (pages * copies)) {
            this.sheetsOfPaperLeft -= (pages * copies);
            this.tonerVolume -= (pages * copies);
            return this.sheetsOfPaperLeft;
            // How to return more than one value?
        } else {
            return 0;
            // How to return error message here?
        }
    }
}
