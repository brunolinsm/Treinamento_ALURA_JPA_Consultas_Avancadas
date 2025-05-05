package br.com.alura.loja.modelo;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CategoriaId implements Serializable {  // Serializable is used to allow the object to be converted into a byte stream
    private static final long serialVersionUID = 1L; // This is used to ensure that the class can be serialized and deserialized correctly

    private String nome;
    private String tipo;

    public CategoriaId() {
    }

    public CategoriaId(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
