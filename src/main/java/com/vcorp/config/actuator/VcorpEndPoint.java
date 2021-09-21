package com.vcorp.config.actuator;

import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id="vcorpEndPoint")
public class VcorpEndPoint {
	
	 private Map<String, String> myUsers = new HashMap<String, String>();
	 
	 @ReadOperation
     public Map<String, String> features() {
         
         myUsers.put("FirstUser", "Pcj");
         myUsers.put("SecondUser", "Jha");
         return myUsers;
     }
      @WriteOperation
     public String writeOperation( String name) throws MalformedURLException{
         
        return name + " \t in HTTP POST method" ;
     }
      
    @DeleteOperation
    public String deleteOperation(){
        return "HTTP DELETE method";      }
	 
	 

}
