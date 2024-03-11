package pres;
import dao.IDao;
import metier.IMetier;
import metier.MetierImpl;
import javax.swing.*;
import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        //DaoImpl dao =new DaoImpl();
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class cDao=Class.forName(daoClassName);
        IDao dao=(IDao) cDao.newInstance();// new DoaImpl()
        // MetierImpl metier= new MetierImpl(); //statique

        String metierClassname =scanner.nextLine();
        Class cMetier = Class.forName(metierClassname);
        IMetier metier =(IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);

        //metier.setDao(dao);
        //Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        //setDao.invoke(metier,dao); //injection des dependances

        System.out.println("Res"+metier.calcul());


    }
}