class Change1
{
       void raj(String str1, String str2)
                   

     {
        
        str1= str1.replaceAll(" ",str2);
        System.out.println(str1);
    }
    
}
class Demo

{
	public static void main(String[] args)
     
     {

           String s1="hode maga hode maga";
		   String s2="ilove you";
		   new Change1().raj(s1,s2);
           


     }


}