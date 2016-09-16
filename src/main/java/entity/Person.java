package entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb1_person") // ændrer tabellens navn
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Person
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    
    String firstName;
    String lastName;
    @Column(name="phoneNumber")
    int age;
    int phone;
    
    @Temporal(TemporalType.DATE)
    private Date born;
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;
    @Temporal(TemporalType.TIME)
    private Date startTid;
    
    //@OneToOne(mappedBy = "person")
    //private Address air;
    
    @ManyToMany
    private List<Address> addresses = new ArrayList<>();

    public List<Address> getAddresses()
    {
        return addresses;
    }

    public void addAddresses(Address s)
    {
        this.addresses.add(s);
    }
    
    
    
    public Person()
    {
        
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getPhone()
    {
        return phone;
    }

    public void setPhone(int phone)
    {
        this.phone = phone;
    }

    public Date getBorn()
    {
        return born;
    }

    public void setBorn(Date born)
    {
        this.born = born;
    }

    public Date getCreationDate()
    {
        return creationDate;
    }

    public void setCreationDate(Date creationDate)
    {
        this.creationDate = creationDate;
    }

    public Date getStartTid()
    {
        return startTid;
    }

    public void setStartTid(Date startTid)
    {
        this.startTid = startTid;
    }
    
    public Person(String name, String lastname, int phoneNumber)
    {
        this.firstName= name; 
        this.lastName= lastname;
        this.phone = phoneNumber;
    }

    @Override
    public String toString()
    {
        return "Person{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName 
                + ", age=" + age + ", phone=" + phone + ", born=" + born + 
                ", creationDate=" + creationDate + ", startTid=" + startTid + '}';
    }
    
    
    
}
