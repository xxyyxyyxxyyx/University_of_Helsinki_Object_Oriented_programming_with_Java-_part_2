
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Contacts {
    private Map<String, Person> nameContacts;
    private Map<Set<String>, Person> phoneContacts;
    private Map<String,Person> addressContacts;
    private List<Person> contacts;
    
    public Contacts(){
        this.contacts = new ArrayList<Person>();
        this.nameContacts = new HashMap<String,Person>();
        this.phoneContacts = new HashMap<Set<String>,Person>();
        this.addressContacts = new HashMap<String,Person>();
    }
    
    public void addContact(Person person){
        this.contacts.add(person);
        this.nameContacts.put(person.getName(), person);
        this.phoneContacts.put(person.getNumbers(), person);
        this.addressContacts.put(person.getAddress(), person);
    }
    
    public boolean containsPersonByName(String name){
        for(Person person: contacts){
            if(person.getName().equals(name)){
                return true;
            }
           
        }
        return false;
    }
    
    public void addNumber(String name, String number){
        for(Person person:contacts){
            if(person.getName().equals(name)){
                person.addNumber(number);
                this.phoneContacts.put(person.getNumbers(), person);
        }
    }
    }
    
    public void addAddress(String name, String street, String city){
        for(Person person: contacts){
            if(person.getName().equals(name)){
                person.addAddress(street, city);
                this.addressContacts.put(person.getAddress(), person);
            }
        }
    }
    
    public String getNameBasedOnNumber(String number){
        for(Person person:contacts){
        Set<String> numbersOfContact = person.getNumbers();
        for(String numbers: numbersOfContact){
             if(numbers.equals(number)){
                 return " "+person.getName();
             }
        }
        }
        return " not found";
    }
    
    public String getNumberBasedOnName(String name){
        return nameContacts.get(name).getNumbers().toString().replace("[", "")
                                                  .replace(", ", "\n")
                                                  .replace("]", "");
    }
    
    public Person getPersonalInformation(String name){
        return nameContacts.get(name);
    }
    
    public void removePerson(String name){
        Person toBeRemoved = new Person("");
        for(Person person:contacts){
            if(person.getName().equals(name)){
                toBeRemoved = person;
            }
        }
        
        this.nameContacts.remove(toBeRemoved);
        this.phoneContacts.remove(toBeRemoved);
        this.addressContacts.remove(toBeRemoved);
        this.contacts.remove(toBeRemoved);
                
    }
    
    public void filteredListing(String keyword){
        Collection<Person> newList = new ArrayList<Person>();
        Collections.sort(contacts);
        for(Person person:contacts){
            if(keyword.isEmpty() || person.getAddress().contains(keyword) || person.getName().contains(keyword)){
            newList.add(person);
            }
        }
        if(newList.isEmpty()){
            System.out.println("not found");
        }
        else{
            for(Person person: newList){
                System.out.println(person.getName());
                System.out.println(person);
            }
        }
    }

}
