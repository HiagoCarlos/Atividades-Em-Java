import java.util.ArrayList;
import java.util.List;

class Pessoa {
    private String nome;
    private String telefone;
    private String endereco;
    private String cpf;

    public Pessoa(String nome, String telefone, String endereco, String cpf) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.cpf = cpf;
    }

    // Getters para acessar os atributos privados
    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCPF() {
        return cpf;
    }
}

public class App {
    public static void main(String[] args) {
        // Criar uma lista de pessoas com números de 1 a 20
        List<Pessoa> pessoas = new ArrayList<>();
        // Adicionar informações das pessoas
        pessoas.add(new Pessoa("Hiago", "(99)99999-9999", "76551", "000.000.000-00"));
        pessoas.add(new Pessoa("Ana", "(88)88888-8888", "12345", "111.111.111-11"));
        pessoas.add(new Pessoa("Pedro", "(77)77777-7777", "67890", "222.222.222-22"));
        pessoas.add(new Pessoa("Maria", "(66)66666-6666", "13579", "333.333.333-33"));
        pessoas.add(new Pessoa("João", "(55)55555-5555", "24680", "444.444.444-44"));
        pessoas.add(new Pessoa("Larissa", "(44)44444-4444", "98765", "555.555.555-55"));
        pessoas.add(new Pessoa("Carlos", "(33)33333-3333", "11223", "666.666.666-66"));
        pessoas.add(new Pessoa("Julia", "(22)22222-2222", "33445", "777.777.777-77"));
        pessoas.add(new Pessoa("Lucas", "(11)11111-1111", "55667", "888.888.888-88"));
        pessoas.add(new Pessoa("Fernanda", "(00)00000-0000", "77889", "999.999.999-99"));
        pessoas.add(new Pessoa("Gabriel", "(11)22222-3333", "12345", "101.101.101-10"));
        pessoas.add(new Pessoa("Mariana", "(22)33333-4444", "23456", "202.202.202-20"));
        pessoas.add(new Pessoa("Rafael", "(33)44444-5555", "34567", "303.303.303-30"));
        pessoas.add(new Pessoa("Amanda", "(44)55555-6666", "45678", "404.404.404-40"));
        pessoas.add(new Pessoa("Mateus", "(55)66666-7777", "56789", "505.505.505-50"));
        pessoas.add(new Pessoa("Sophia", "(66)77777-8888", "67890", "606.606.606-60"));
        pessoas.add(new Pessoa("Leonardo", "(77)88888-9999", "78901", "707.707.707-70"));
        pessoas.add(new Pessoa("Beatriz", "(88)99999-0000", "89012", "808.808.808-80"));
        pessoas.add(new Pessoa("Vinicius", "(99)00000-1111", "90123", "909.909.909-90"));
         pessoas.add(new Pessoa("Silva", "(99)22222-2222", "2222", "000.000.000-02"));
       

        int m = 17; // O número escolhido para eliminar

        // Encontrar a pessoa sobrevivente
        Pessoa pessoaSobrevivente = encontrarSobrevivente(new ArrayList<>(pessoas), m);

        System.out.println("A pessoa sobrevivente é: " + pessoaSobrevivente.getNome());
        System.out.println("Informações da pessoa sobrevivente:");
        System.out.println("Nome: " + pessoaSobrevivente.getNome());
        System.out.println("Telefone: " + pessoaSobrevivente.getTelefone());
        System.out.println("Endereço: " + pessoaSobrevivente.getEndereco());
        System.out.println("CPF: " + pessoaSobrevivente.getCPF());
    }

    // Função para encontrar a pessoa sobrevivente
    public static Pessoa encontrarSobrevivente(List<Pessoa> pessoas, int m) {
        int indice = 0;
        while (pessoas.size() > 1) {
            indice = (indice + m - 1) % pessoas.size();
            pessoas.remove(indice);
        }
        return pessoas.get(0);
    }
}
