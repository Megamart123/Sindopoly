/*THIS JAVA APPLICATION WAS CREATED BY DIMITRIS KOPSIDAS
AM:175008 EMAIL:jimkopsidas@hotmail.com DISCORD:Kops#6752*/

package sindopoly;

/*
 * @author JIM
 */
public class Tile {
    
    private String name;
    private int pos;//the property's position on the board
    private int houseprice;//cost of upgrading
    private int costtobuy,cost0,cost1,cost2,cost3,cost4,costhotel;//the amount the opponent has to pay the owner when they land on the property
    private int owner;//starts with -1 and when it is bought changes to either 0|1|2|3|4|5
    private int colorteam;//represents color teams.None=0,Brown=1,cyan=2,purple=3,4=orange,5=red,yellow=6,green=7,blue=8
    private boolean colordouble=false;
    private int upgrades=0;//ranges from 0-5 where 0=no houses and 5=hotel
    private int brother,sister;//the other Tiles in the colorteam.All properties have a brother but not all have a sister

    //CONSTRUCTOR
    public Tile(String name,int pos,int houseprice,int costtobuy,int cost0,int cost1,int cost2,int cost3,int cost4,int costhotel,int owner,int colorteam,int brother,int sister){
        this.name=name;
        this.pos=pos;
        this.houseprice=houseprice;
        this.costtobuy=costtobuy;
        this.cost0=cost0;
        this.cost1=cost1;
        this.cost2=cost2;
        this.cost3=cost3;
        this.cost4=cost4;
        this.costhotel=costhotel;
        this.colorteam=colorteam;
        this.brother=brother;
        this.sister=sister;
        this.owner=owner;
    }
    
    
    
   
    
    //SETTERS
    public void setname(String name){
        this.name=name;
    }
    public void setpos(int pos){
        this.pos=pos;
    }
    public void setowner(int owner){
        this.owner=owner;
    }
    public void setcolorteam(int colorteam){
        this.colorteam=colorteam;
    }    
    public void setupgrades(int upgrades){
        this.upgrades=upgrades;
    }
    //GETTERS
    public String getname(){
        return name;
    }
    public int getpos(){
        return pos;
    }
    public int gethouseprice(){
        return houseprice;
    }
    
    public int getcost0(){
        return cost0;
    }
    public int getcost1(){
        return cost1;
    }
    public int getcost2(){
        return cost2;
    }
    public int getcost3(){
        return cost3;
    }
    public int getcost4(){
        return cost4;
    }
    public int getcosthotel(){
        return costhotel;
    }
    public int getowner(){
        return owner;
    }
    public int getcolorteam(){
        return colorteam;
    }
    public int getupgrades(){
        return upgrades;
    }
    public int getbrother(){
        return brother;
    }
    public int getsister(){
        return sister;
    }
    public int getcosttobuy(){
        return costtobuy;
    }
}
