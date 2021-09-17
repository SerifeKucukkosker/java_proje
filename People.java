public class People {
    private int id;
    private String name;

    public People(){
        
    }

    public People(int ID,String name){
        this.id = ID;
        this.name = name;
    }

   public String show(){
       return String.format("ID: %s, Name: %s", id,name);
   }

}
