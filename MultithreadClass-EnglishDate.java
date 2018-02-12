import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class englishDate {
       
    static String EnglishDay=" ";
      
    public static void main(String[] args) {
      
        Scanner scan = new Scanner(System.in);
        System.out.println("enter DATE DD-MM-YYYY ");
        String date=scan.next();
        String temp=date.charAt(0)+""+date.charAt(1);
        int day=Integer.parseInt(temp);
        temp=date.charAt(3)+""+date.charAt(4);
        int month=Integer.parseInt(temp);
        temp=date.charAt(6)+""+date.charAt(7)+""+date.charAt(8)+""+date.charAt(9);
        int year=Integer.parseInt(temp);
        
        if(day<32 && month<13 && year<2100){

            String part1=DayPrinter(day);
            String part2=MonthPrinter(month);
            String part3=YearPrinter(year);

            System.out.println(""+part1+" "+part2+" "+part3);
        
        }
        else
            System.out.println("Wrong format !");
    
    }

    static String DayPrinter(int tempdata){
        
         if(tempdata==200)
            return "Two Thousand";
        
        
         Map m=new HashMap();
        m.put(0,"");  
        m.put(1,"One");
        m.put(2,"Two");
        m.put(3,"Three");
        m.put(4,"Four"); 
        m.put(5,"Five");
        m.put(6,"Six");
        m.put(7,"Seven");
        m.put(8,"Eight");
        m.put(9,"Nine");
        m.put(10,"Ten"); 
        m.put(11,"Eleven");
        m.put(12,"Twelve");
        m.put(13,"Thirteen");
        m.put(14,"Fourteen"); 
        m.put(15,"Fifteen");
        m.put(16,"Sixteen");
        m.put(17,"Seventeen");
        m.put(18,"Eighteen");
        m.put(19,"Nineteen");
        
        
        
        Map n=new HashMap();
        
        n.put(2,"Twenty");
        n.put(3,"Thirty");
        n.put(4,"Fourty");
        n.put(5,"Fifty"); 
        n.put(6,"Sixty");
        n.put(7,"Seventy");
        n.put(8,"Eighty");
        n.put(9,"Ninety");
        
        
      
        int ones=0,tens=0;
        
         ones=tempdata%10;
         tens=tempdata/10;
         
                
                if(tens==0 ||tens==1){

                   EnglishDay=String.valueOf(m.get(tempdata));
                }
                else
                {
                    EnglishDay=String.valueOf(n.get(tens)+" "+m.get(ones));

                }
        
      return EnglishDay;  
        
    }

    static String MonthPrinter(int tempdata){
        
       
          Map month=new HashMap();
        month.put(1,"January");
        month.put(2,"February");
        month.put(3,"March");
        month.put(4,"April");
        month.put(5,"May"); 
        month.put(6,"June");
        month.put(7,"July");
        month.put(8,"August");
       month.put(9,"September");
        month.put(10,"October");
        month.put(11,"November");
        month.put(12,"December");
        
        
            int ones=0,tens=0;

             ones=tempdata%10;
             tens=tempdata/10;


            if(tens==0 ||tens==1){

               EnglishDay=String.valueOf(month.get(tempdata));
            }
        
       return EnglishDay;    
        
    }
    
    static String YearPrinter(int tempdata){
        
        Map n=new HashMap();
        
        int ones=tempdata%10;
        int tens=tempdata/10;
        ones=ones+(tens%10)*10;
       
       
        int hundreds=tens/10;
        
            if(hundreds<20)
            {
            String part1=DayPrinter(hundreds);
            String part2=DayPrinter(ones);

            return (part1+"-"+part2);
            }
            else{System.out.println("Executing");
                String part1=DayPrinter(hundreds*10);
            String part2=DayPrinter(ones);
        
        return (part1+" "+part2);
            
        }
            
        
        
       
    }
    
}
    
