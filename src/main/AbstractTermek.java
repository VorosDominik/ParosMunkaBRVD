
package main;

import java.util.UUID;

public abstract class AbstractTermek {
     private String cim; 
    private  UUID id;

    public AbstractTermek(String cim) {
        this.cim = cim;
         UUID randomUUID = UUID.randomUUID();
        this.id =  randomUUID;
        
        
    }

    @Override
    public String toString() {
        return "AbstractTermek{" + "cim=" + cim + ", id=" + id + '}';
    }
    
    
       
    
    
}
