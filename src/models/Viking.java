package models;

import java.util.Random;

public class Viking extends Human {
    private int professionalDrinker;

    public Viking(String name, int age, int weight, int professionalDrinker) {
        super(name, age, weight);
        this.professionalDrinker = professionalDrinker;
    }

    public int getProfessionalDrinker() { return professionalDrinker; }

    public void setProfessionalDrinker(int professionalDrinker) { this.professionalDrinker = professionalDrinker; }



    @Override
    public int urinate(int aux) {

        int ans = random(aux);

        return ans;
    }

    @Override
    public int drink() {

        int aux = 15+professionalDrinker;

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
            totalDrank = totalDrank-urinate(totalDrank);
        }

        if (totalDrank<1)
                totalDrank++;

        return totalDrank;
    }
}
