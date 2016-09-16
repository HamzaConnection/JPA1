/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

/**
 *
 * @author hamzalaroussi
 */
@Entity
public class Address
{
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    
    private String street;
    private String city;
    private Person person;
    
    @ManyToMany(mappedBy = "addresses")
    private List<Person> persons;
    
    public Address()
    {
        
    }
    
    public Address(String street, String city)
    {
        this.street = street;
        this.city = city;
    }
    
}
