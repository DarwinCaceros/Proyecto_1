package Proyecto1;

public class ColaServicio {
//Para asignar el ticket
    public String asignado;
    public String cerrado;
    public String soporte;
    public String Endesarrollo;

    public ColaServicio(){
        this.asignado = asignado;
        this.cerrado = cerrado;
        this.Endesarrollo = Endesarrollo;
        this.soporte = soporte;
    }
    public String getAsignado(){return asignado;}
    public String getCerrado(){return cerrado;}
    public String getSoporte(){return soporte;}
    public String getEndesarrollo(){return Endesarrollo;};


    public void setAsignado(String asignado){ this.asignado = asignado;}
    public void setCerrado(String cerrado){ this.cerrado = cerrado;}
    public void setSoporte(String soporte){ this.soporte = soporte;}
    public void setEndesarrollo(String Endesarrollo){ this.Endesarrollo = Endesarrollo;}


  }

