/*THIS JAVA APPLICATION WAS CREATED BY DIMITRIS KOPSIDAS
AM:175008 EMAIL:jimkopsidas@hotmail.com DISCORD:Kops#6752*/

package sindopoly;

/*
 * @author JIM
 */
public class Player {
    private int id;
    private String name;
    private int money;
    private int position;
    private boolean hasmoney=true;
    
    //CONSTRUCTOR
    public Player(int id,String name,int money,int position){
        this.id=id;
        this.name=name;
        this.money=money;
        this.position=position;
    }
    
    
    
    
    
    
    
    
    
    
    //SETTERS
    public void setname(String name){
        this.name=name;
    }
    public void setmoney(int money){
        this.money=money;
    }
    public void setposition(int position){
        this.position=position;
    }
    public void sethasmoney(boolean hasmoney){
        this.hasmoney=hasmoney;
    }
    
    
    
    
    //GETTERS
    public String getname(){
        return name;
    }
    public int getmoney(){
        return money;
    }
    public int getposition(){
        return position;
    }
    public boolean gethasmoney(){
        return hasmoney;
    }
    public int getid(){
        return id;
    }
}
