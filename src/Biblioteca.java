import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Livro> livros;

    public  Biblioteca(){
        livros = new ArrayList<Livro>();
        usuarios = new ArrayList<Usuario>();
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public ArrayList<Livro> getLivros() {
        return livros;
    }

    public void setLivros(ArrayList<Livro> livros) {
        this.livros = livros;
    }
    public void adicionarLivro (Livro livro){
        livros.add(livro);
        System.out.println("Livro adicionado:" + livro.getTitulo());
    }
    public void adicionarUsuario(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario cadastrado:" + usuario.getNome());
    }
    public Livro buscarLivro(String titulo){
        for (Livro livro: livros){
            if(livro.getTitulo().equals(titulo)){
                return livro;
            }
        }

        return null;
    }
    public Usuario buscarUsuario(String nome){
        for (Usuario usuario: usuarios){
            if (usuario.getNome().equals(nome)){
                return usuario;
            }
        }
        return null;
    }
}
