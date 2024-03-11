package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao =new DaoImpl();//Instantiation statique
        MetierImpl metier= new MetierImpl(dao);//injection via le constructeur
        //metier.setDao(dao);//injection de dependence
        System.out.println(metier.calcul());
    }
}
