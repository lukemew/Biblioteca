public class LivroFisico extends Livro {


    public LivroFisico(Autor autor){
        super(autor);
    }

    public double getTaxaDeImpressao() {
        return this.getValor() * 0.05;
    }

    @Override
    public boolean aplicarDescontoDe(double porcentagem){
        if(porcentagem > 0.3) {
            return false;
        } else {
            double desconto = getValor() * porcentagem;
            setValor(getValor() - desconto);
            System.out.println("Desconto aplicado no LivroFisico");
            return true;
        }
    }

}
