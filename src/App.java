import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        listarPessoas();
       }

    public static void listarPessoas(){

        System.out.println("Hello, World!");
        Pessoa[] pessoas = new Pessoa[5];
        pessoas[0] = new Pessoa(
       "aline",
       "118358419996",
       "19/05/2003",
       'F'
       );

    for (Pessoa pessoa : pessoas) {
        if (pessoa != null) {
           System.out.println(pessoa.getNome()); 
        }
    }
    }
}


