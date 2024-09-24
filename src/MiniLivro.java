public class MiniLivro extends Livro {

    public MiniLivro(Autor autor){
        super(autor);
    }

    @Override
    public boolean aplicarDescontoDe(double desconto) {
        return false;
    }

}
