package Iphone;

public class ReprodutorMusical {

    private String nomeMusica;
    private boolean tocando;

    public void tocar(){
        if (!tocando){
            System.out.println("Iniciando reprodução!");
            tocando = true;
        }
    }

    public void pausar(){
        if (tocando){
            System.out.println("Pausado!");
            tocando = false;
        }

    }

    public void selecionarMusica(String nomeMusica){
        System.out.println("Tocando a música: " + this.getNomeMusica());
    }



    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }



    
}
