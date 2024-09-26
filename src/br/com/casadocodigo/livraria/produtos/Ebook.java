package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional {

    private String watermark;

    public Ebook(Autor autor){
        super(autor);
    }

    public Ebook() {

    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    public String getWatermark(){
        return this.watermark;
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem) {
        if(porcentagem > 0.15){
            return false;
        } else {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            System.out.println("Desconto aplicado no Ebook");
            return true;
        }
    }
}
