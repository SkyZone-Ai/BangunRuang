
package bangunruang_pson;


public class Bola extends BangunRuang{
    
    double r;
double volume(){
double volume = 4.0/3.0*3.14*r*r*r;
        System.out.println("volume bola: " + volume+"cm3");
        return volume;
}
}
