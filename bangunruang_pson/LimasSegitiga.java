
package bangunruang_pson;


public class LimasSegitiga extends BangunRuang{
      int la,t;
   double volume(){
   double volume = 1.0/3.0*la*t;
       System.out.println("Volume limas:"+volume+"cm3");
       return volume;
}
}
