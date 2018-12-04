package cz.fkreporyje.database.Impl;

import cz.fkreporyje.dao.CarDao;
import cz.fkreporyje.database.CarDatabaseInterface;
import cz.fkreporyje.model.CarModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;

@Service
public class CarDatabaseImpl implements CarDatabaseInterface {


    @Autowired
    CarDao carDao;

    @Override
    public String readCarRecord() {
        String s;
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\databaze_aut\\databaze_aut.txt"));
            while((s=br.readLine())!=null){
                return(s);
            }}catch(IOException vy){
            System.out.println("Soubor nebyl nalezen"+vy);
        }
        return null;
    }

    public void StringToObj(){

    }




}


