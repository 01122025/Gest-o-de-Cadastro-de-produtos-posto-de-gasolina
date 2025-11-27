public class Variaveis {

    private  String status;
    private  int gasolina;
    private  int alcool;
    private  int disel;



    public String getStatus() {return status;}

    public void setStatus(String status) {this.status = status;}

    public int getGasolina() {return gasolina;}

    public void setGasolina(int gasolina) {this.gasolina = gasolina;}

    public int getAlcool() {return alcool;}

    public void setAlcool(int alcool) {this.alcool = alcool;}

    public int getDisel() {return disel;}

    public void setDisel(int disel) {this.disel = disel;}


    public  void contagemGasolina( int valor){

        //this.gasolina +=  valor;
        gasolina++;
    }

    public  void contagemAlcool( int valor){

        //this.alcool +=  valor;
        alcool++;
    }

    public  void contagemDisel( int valor){

        //this.disel +=  valor;
        disel++;
    }






}

