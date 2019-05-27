public class WaterBottle {

    private int volume;

    public WaterBottle(){
        this.volume = 100;
    }

    public int Drink(){
        return this.volume -= 10;
    }

    public int Empty(){
        this.volume = 0;
        return this.volume;
    }

    public int Fill(){
        this.volume = 100;
        return this.volume;
    }

}
