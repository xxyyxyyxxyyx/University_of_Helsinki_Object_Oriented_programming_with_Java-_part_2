/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/**
 *
 * @author user
 */
public class VehicleRegister {
    private HashMap<RegistrationPlate,String> owners = new HashMap<RegistrationPlate,String>();
    
    public boolean add(RegistrationPlate plate, String owner){
        if(owners.get(plate) != null) return false;
        owners.put(plate, owner);
        return true;
    }
    
    public String get(RegistrationPlate plate){
        return owners.get(plate);
    }
    
    public boolean delete(RegistrationPlate plate){
        if(owners.get(plate) == null) return false;
        owners.remove(plate);
        return true;
    }
    
    public void printRegistrationPlates(){
        Set<RegistrationPlate> plates = owners.keySet();
        for(RegistrationPlate plate: plates){
            System.out.println(plate);
        }
    }
    
    public void printOwners(){
       Collection<String> allOwners = owners.values();
       Set<String> ownersSet = new HashSet<String>(allOwners);
       for(String owner : ownersSet){
           System.out.println(owner);
       }
    }
}
