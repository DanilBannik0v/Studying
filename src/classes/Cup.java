package classes;

public class Cup {
    private int weight;

    public Cup() {
        this.weight = 0;
    }
    public void addRight(int n) {
        this.weight += n;
    }
    public void addLeft(int n) {
        this.weight += n;
    }
    public void getSituation(Cup leftCup, Cup rightCup) {
        System.out.println(leftCup.weight == rightCup.weight? "=": rightCup.weight > leftCup.weight? "R": "L");
    }
}
