public class CadastroGurilo {

    public String nome;
    public String seguro;
    public String cpf;
    public double valor;
    public String tiposangue;

    public CadastroGurilo( String nome ,String cpf, String seguro, double valor, String tiposangue ){
        this.nome = nome;
        this.cpf = cpf;
        this.seguro = seguro;
        this.tiposangue = tiposangue;
        this.valor = valor;
    }

    public String toString(){
        return nome + " CPF " + this.cpf +  " Seguro " + this.seguro + " Valor p/mês " + this.valor + " Tipo Sanguineo " + this.tiposangue;

    }

}
