import java.util.Scanner;
public class flames
{
    public static void main(String args[])
    {
        flames ob = new flames();
        Scanner sc=new Scanner(System.in);
        System.out.println("\n\t\t\tEnter a name");
        String n1=sc.next();
        
        System.out.println("\n\t\t\tEnter the partner name\n");
        String n2=sc.next();
        
        int tocut=ob.cancel(n1,n2);
        
        
        String f="FLAMES";
        
        while(f.length()!=1)
        {
            int cut=0;
            for(int k=1;k<=tocut;k++)
            {
                if(cut>=f.length())
                cut=0;
                
                ++cut;
                 
            }
            f=f.substring(0,cut-1)+f.substring(cut);
            f=f.trim();
           
        }
      
      switch(f){
          case "F":
          System.out.println("\n\t\t\tYou Got Friend ");
          break;
          
          case "L":
          System.out.println("\n\t\t\tYou Got Love");
          break;
          
          case "A":
          System.out.println("\n\t\t\tYou Got Affection");
          break;
          
          case "M":
          System.out.println("\n\t\t\tYou Got Marriage");
          break;
          
          case "E":
          System.out.println("\n\t\t\tYou Got Enemy");
          break;
          
          case "S":
          System.out.println("\n\t\t\tYou Got Sister");
          break;
    }
}
    int cancel(String n1,String n2)
    {
     int total=n1.length()+n2.length();
     int canc=0;
     for(int i=0;i<n1.length();i++)
     {
         for(int j=0;j<n2.length();j++)
         {
             if(n1.charAt(i)==n2.charAt(j))
             {
                 ++canc;
                 n2=n2.substring(0,j)+n2.substring(j+1,n2.length());
                 break;
                }
            }
        }
        int tocut=total-(canc*2);
        return tocut;
    }
}
