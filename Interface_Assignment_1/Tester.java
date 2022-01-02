package Interface_Assignment_1;

public class Tester {
    public static void main(String args[]){
		SmartPhone smartPhone = new SmartPhone("KrillinM20", "Nebula", "Saturn", "1.3", "5G");
        SmartPhone smartPhone1 = new SmartPhone("FriezaA8", "Quasar", "Gara", "EXRT.1", "4G");
        SmartPhone[] smortPhne = {smartPhone, smartPhone1};
        for(SmartPhone x : smortPhne){
		if(x.testCompatibility())
		    System.out.println("The mobile OS is compatible with the network generation!");
		else
		    System.out.println("The mobile OS is not compatible with the network generation!");	
    	}
	}
    
}