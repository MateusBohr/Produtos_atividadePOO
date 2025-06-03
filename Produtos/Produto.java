public class Produto {
    protected String descricao;
    protected int ano;
    protected String armazem;

    public Produto(String descricao, int ano, String armazem){
        this.descricao = descricao;
        this.armazem = armazem;
        this.ano = ano;
    }

    public void exibirInfo(){
        System.out.println("Seu produto é um:"+descricao+" de ano:"+ano+"e está no armazém: "+armazem);
    }
}
//Aqui é criada a classe pai Produto com um construtor e um metodo básico que só mostram informações