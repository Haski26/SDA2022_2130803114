

class Person  
     {  
 
    private String nmblk;  
     private String nmdpn;  
     private int umr;

     public Person(String blk, String dpn, int a)  
     {                               
     nmblk = blk;  
     nmdpn = dpn;  
     umr = a;  
     }  
     public void displayPerson()  
     {  
     System.out.print("   Last name: " + nmblk);  
     System.out.print(", First name: " + nmdpn);  
     System.out.println(", Age: " + umr);  
     } 
     public String getLast()           
        { return nmblk; }  }
     
  class ClassDataArray  
  {  
  private Person[] a;             
  private int elmbr; 

  public ClassDataArray(int max)    
  {  
  a = new Person[max];              
  elmbr = 0;                        
  }  
  public Person find(String crnm)  
  {                             
  int j;  
  for(j=0; j<elmbr; j++)            
     if( a[j].getLast().equals(crnm) )
     break;
     if(j == elmbr)                   
           return null; 
           else  
           return a[j]; 
  }
  public void insert(String blk, String dpn, int umr)  
  {  
  a[elmbr] = new Person(blk, dpn, umr);  
  elmbr++;                          
  }
  public boolean delete(String crnm)  
  { int j;  
    for(j=0; j<elmbr; j++)      
       if( a[j].getLast().equals(crnm) )  
          break;   
          if(j==elmbr)                      
          return false;  
       else                               
          {  
          for(int k=j; k<elmbr; k++)      
             a[k] = a[k+1];  
          elmbr--;                         
          return true;  
          }  
       } 
       public void displayA()             
       {  
       for(int j=0; j<elmbr; j++)    
          a[j].displayPerson();       
       } }

       class ClassDataApp  
       {  
       public static void main(String[] args)  
          {  
          int maxSize = 100;             // array size  
          ClassDataArray arr;            // reference to array  
          arr = new ClassDataArray(maxSize);  // create the array  
   
   
                                        // insert 10 items  
          arr.insert("Evans", "Patty", 24);  
          arr.insert("Smith", "Lorraine", 37);  
          arr.insert("Yee", "Tom", 43);  
          arr.insert("Adams", "Henry", 63);  
          arr.insert("Hashimoto", "Sato", 21);  
          arr.insert("Stimson", "Henry", 29);  
          arr.insert("Velasquez", "Jose", 72);  
          arr.insert("Lamarque", "Henry", 54);  
          arr.insert("Vang", "Minh", 22);  
          arr.insert("Creswell", "Lucinda", 18);  
      
          arr.displayA();                // display items  
      
          String searchKey = "Stimson";  // search for item  
          Person found;  
          found=arr.find(searchKey);  
          if(found != null)  
             {  
             System.out.print("Found ");  
             found.displayPerson();  
             }  
          else  
             System.out.println("Can't find " + searchKey);  
      
          System.out.println("Deleting Smith, Yee, and Creswell");  
          arr.delete("Smith");           // delete 3 items  
          arr.delete("Yee");  
          arr.delete("Creswell");  
      
          arr.displayA();                // display items again  
          }  // end main()  
   
       }

 



 

