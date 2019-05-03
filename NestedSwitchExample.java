class NestedSwitchExample
{
	public static void main(String args[])
	{
      char branch='A';
	 int collegeYear=1;
	 switch(collegeYear)
	 {
	   case 1: 
	         switch(branch)
	              {
	              	case 'A':
	              System.out.println("ENGLISH,MATH,SCIENCE");
	              break;
                  }
	     break;
	     case 2:
	         switch(branch)
	          {
	            case 'C':
	                   System.out.println("operating System,Java ,Data Structure");
	                   break;
	            case 'E':
	                  System.out.println("Micro processor,Logic Switching theory");
	                    break;
	            case 'M':
	                   System.out.println("Drawing,Manufacturing Machine");
	                   break;
                }
                break;
         case 3:
              switch(branch)
               { 
              case 'C':  
                        System.out.println("Computer Organization, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Fundamentals of Logic Design, Microelectronics");  
                        break;  
                    case 'M':  
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");  
                        break;  
                }  
                break;  
            case 4:  
                switch( branch )   
                {  
                    case 'C':  
                        System.out.println("Data Communication and Networks, MultiMedia");  
                        break;  
                    case 'E':  
                        System.out.println("Embedded System, Image Processing");  
                        break;  
                    case 'M':  
                        System.out.println("Production Technology, Thermal Engineering");  
                        break;  
                }  
                break;  
        }  
    }      
}

	  
	 
	
