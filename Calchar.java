public class Calchar {
    public static void main(String[] args) {
        String name ="rahul kumar";
        int  length=name.length();
        int count=0;
        for(int i=0; i<name.length();i++){
        if(name.charAt(i)!=' '){
            count++;
        }
        }
        
        System.out.println(name + "=" +count);
       
    }
}
