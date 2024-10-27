package Iphone;

public class NavegadorInternet {

    private String url;
    private int aba;





    public void exibirPagina(String url){
        aba++;
        System.out.println("Abrindo a página: " + this.getUrl());
    }

    public void adicionaNovaAba(){
        aba++;
    }

    public void atualizarPagina(){
        exibirPagina(this.getUrl());
    }


    
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getAba() {
        return aba;
    }

    public void setAba(int aba) {
        this.aba = aba;
    }


    
}
