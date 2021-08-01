//encapsulation method 01
package encapsulation;

public class Customer {
    private String name;
    private String address;
    private int contect;
    private  String nic;

    public Customer(){//default constructor , no arg constructor

    }

    Customer(String name,String address,int contect,String nic){//full ars constructor
        this.name = name;
        this.address = address;
        this.contect = contect;
        this.nic = nic;
    }

    public void setName(String name){//setter
        this.name = name;
    }

    public void setAddress(String address){//setter
        this.address = address;
    }

    public void setContect(int contect){//setter
        this.contect = contect;
    }

    public void setNic(String nic){//setter
        this.nic = nic;
    }

    public String getName(){//getters
        return name;
    }

    public String getAddress(){//getters
        return address;
    }
    public int getcontect(){//getters
        return contect;
    }
    public String getNic(){//getters
        return nic;
    }

}
