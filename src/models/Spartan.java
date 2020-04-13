package models;

public class Spartan extends Human {
    private int extraTolerance;

    public Spartan(String name, int age, int weight, int extraTolerance) {
        super(name, age, weight);
        this.extraTolerance = extraTolerance;
    }

    public int getExtraTolerance() { return extraTolerance; }

    public void setExtraTolerance(int extraTolerance) { this.extraTolerance = extraTolerance; }

    @Override
    public int urinate(int aux) {

        int ans = 0;
        if (aux > 1){
            ans = random(aux);
        }

        return ans;
    }

    @Override
    public int drink() {

        int aux = 15;

        int totalDrank = random(aux);


        if(getWeight()<50){
            totalDrank--;
        }else if(getWeight()>70){
            totalDrank++;
        }

        if(getAge()<18 || getAge()>75){
            totalDrank--;
        }else{
            totalDrank++;
        }

        if (totalDrank > 3){
            totalDrank = totalDrank-urinate(totalDrank-extraTolerance);
        }

        if (totalDrank<1)
            totalDrank++;


        return totalDrank;
    }
}
