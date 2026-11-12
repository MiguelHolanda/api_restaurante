package seduc.dest1.restaurantes.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Restaurante {

    @Id
    private String nome;
    private String endereco;
    private String telefone;
    private String tipo;
    private int faixa_preco;
    private String url;
    private String descricao;

    public Restaurante() {
    }

    public Restaurante(String nome, String endereco,
                       String telefone, String tipo, int faixa_preco, String url, String descricao) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.tipo = tipo;
        this.faixa_preco = faixa_preco;
        this.url = url;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getFaixa_preco() {
        return faixa_preco;
    }

    public void setFaixa_preco(int faixa_preco) {
        this.faixa_preco = faixa_preco;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
