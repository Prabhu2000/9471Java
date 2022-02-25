package collectionspringdemo5;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {
	 List addressList;
	   Set  addressSet;
	   Map  addressMap;
	   Properties addressProp;

	   // a setter method to set List
	   public void setAddressList(List addressList) {
	      this.addressList = addressList;
	   }
	   // a setter method to set Set
	   public void setAddressSet(Set addressSet) {
	      this.addressSet = addressSet;
	   }   
	   // a setter method to set Map
	   public void setAddressMap(Map addressMap) {
	      this.addressMap = addressMap;
	   }
	   // a setter method to set Property
	   public void setAddressProp(Properties addressProp) {
	      this.addressProp = addressProp;
	   }
	   	   public void displayinfo() {
		   System.out.println("List Elements :"  + addressList);
		   System.out.println("Set Elements :"  + addressSet);
		   System.out.println("Map Elements :"  + addressMap);
		   System.out.println("Property Elements :"  + addressProp);
		
	   }
}
