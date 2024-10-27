package Iphone;

public class AparelhoTelefonico {

    private String ligar;
    private int numero;
    private Boolean atender, tocando;



    public void ligar(String numero){
        System.out.println("Realizando chamada ao número: " + this.getNumero());
    }

    public void atender(){
        if (tocando){
            atender = true;
        }
    }

    public void recusar(){
        if (tocando){
            atender = false;
        }
    }

    public void iniciarCorreioVoz(){
        System.out.println("Acessando correio de Voz.");
    }




    public String getLigar() {
        return ligar;
    }
    public void setLigar(String ligar) {
        this.ligar = ligar;
    }
    public Boolean getAtender() {
        return atender;
    }
    public void setAtender(Boolean atender) {
        this.atender = atender;
    }
    public Boolean getTocando() {
        return tocando;
    }
    public void setTocando(Boolean tocando) {
        this.tocando = tocando;
    }
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    

    
}
