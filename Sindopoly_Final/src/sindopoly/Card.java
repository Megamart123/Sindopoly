/*THIS JAVA APPLICATION WAS CREATED BY DIMITRIS KOPSIDAS
AM:175008 EMAIL:jimkopsidas@hotmail.com DISCORD:Kops#6752*/

package sindopoly;

/*
 * @author JIM
 */
public class Card {
    private int id;
    private int cost;
    private int moveto;
    private String call;
    
    //CONSTRUCTOR
    public Card(int id,int cost,int moveto,String call){
        this.id=id;
        this.cost=cost;
        this.moveto=moveto;
        this.call=call;
    }
    
    //GETTERS
    public int getid(){
        return id;
    }
    public int getcost(){
        return cost;
    }
    public int getmoveto(){
        return moveto;
    }
    public String getcall(){
        return call;
    }
    
}
