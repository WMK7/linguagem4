import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import javax.faces.event.ActionEvent;
@ManagedBean(name = "ct")
@SessionScoped
public class Bean implements Serializable {

    public Bean() {
    }//builder - constuctor
    
    private String visor;
    private double n1;
    private double n2;
    private double res;
    private String op;
    
    public void bt07(ActionEvent a){
        if(getVisor().equals("0")||getOp()== null)
            setVisor("7");
        else if(!getVisor().equals("0")|| getOp()== null){
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="7";
        setVisor(prov);
        }else if(!getVisor().equals("0") || getOp()== null){
            setVisor("7");
        }
    }//bt07
    
    public void btIgual(ActionEvent a){
        setN2(Double.parseDouble(getVisor()));
        switch(getOp()){
            case "+":
                setVisor(String.valueOf(getN1()+String.valueOf(getN2())));
                break;
           
        }
            
    }//btIgual
    
      public void bt08(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("8");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="8";
        setVisor(prov);
        }//bt08
    }
      
      public void bt09(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("9");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="9";
        setVisor(prov);
        }//bt09
    }
      
      public void bt04(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("4");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="4";
        setVisor(prov);
        }//bt04
    }
      
      public void bt05(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("5");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="5";
        setVisor(prov);
        }//bt05
    }
      
      public void bt06(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("6");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="6";
        setVisor(prov);
        }//bt06
    }
      
      public void bt01(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("1");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="1";
        setVisor(prov);
        }//bt01
    }
      public void bt02(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("2");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="2";
        setVisor(prov);
        }//bt02
    }
      
      public void bt03(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("3");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="3";
        setVisor(prov);
        }//bt03
    }
      public void bt00(ActionEvent a){
        if(getVisor().equals("0"))
            setVisor("0");
        else{
            //armazenar prosisoriamente, o valor atual no visor
            String prov = getVisor();
        prov +="0";
        setVisor(prov);
        }//bt00
    }
      public void btlimpa(ActionEvent a){
          setVisor("0");
          setN1(0);
          setN2(0);
          setRes(0);
          setOp("");
      }
      
       public void btSoma(ActionEvent a){
       setOp("+");
       setN1(Double.parseDouble(getVisor()));
       setVisor("0");
      }
       public void btMenos(ActionEvent a){
       setOp("-");
       setN1(Double.parseDouble(getVisor()));
       setVisor("0");
      }
       public void btMult(ActionEvent a){
       setOp("X");
       setN1(Double.parseDouble(getVisor()));
       setVisor("0");
      }
       public void btDiv(ActionEvent a){
       setOp("/");
       setN1(Double.parseDouble(getVisor()));
       setVisor("0");
      }
       public void btRes(ActionEvent a){
          
       }
      ///////////////////////////logica
    
//////////////////////////////GET & SET
    public String getVisor() {
        return visor;
    }

    public void setVisor(String visor) {
        this.visor = visor;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }
    
    
    
}//clas
