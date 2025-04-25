
package app.entity;

import java.io.*;
import jakarta.persistence.*;
import java.util.*;
import jakarta.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;
import cronapi.swagger.CronappSwagger;



import cronapp.framework.core.persistence.*;

/**
* Classe que representa a tabela PET
* @generated
*/
@jakarta.persistence.Entity
@jakarta.persistence.Table(name = "\"PET\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Pet")
@CronappTable(role=CronappTableRole.CLASS)
public class Pet implements Serializable {
    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @CronappColumn(attributeType="STRING", label="Id", defaultValue = "UUID.randomUUID().toString().toUpperCase()")
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Nome")
    @Column(name = "nome", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String nome;


    /**
    * @generated
    */
    @CronappColumn(attributeType="INTEGER", label="Idade")
    @Column(name = "idade", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.Integer idade;


    /**
    * @generated
    */
    @CronappColumn(attributeType="STRING", label="Raca")
    @Column(name = "raca", nullable = true, unique = false, insertable=true, updatable=true)
        
        private java.lang.String raca;


    /**
    * Construtor
    * @generated
    */
    public Pet(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    public java.lang.String getId() {
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Pet setId(java.lang.String id) {
        this.id = id;
        return this;
    }
    /**
    * Obtém nome
    * return nome
    * @generated
    */
    public java.lang.String getNome() {
        return this.nome;
    }

    /**
    * Define nome
    * @param nome nome
    * @generated
    */
    public Pet setNome(java.lang.String nome) {
        this.nome = nome;
        return this;
    }
    /**
    * Obtém idade
    * return idade
    * @generated
    */
    public java.lang.Integer getIdade() {
        return this.idade;
    }

    /**
    * Define idade
    * @param idade idade
    * @generated
    */
    public Pet setIdade(java.lang.Integer idade) {
        this.idade = idade;
        return this;
    }
    /**
    * Obtém raca
    * return raca
    * @generated
    */
    public java.lang.String getRaca() {
        return this.raca;
    }

    /**
    * Define raca
    * @param raca raca
    * @generated
    */
    public Pet setRaca(java.lang.String raca) {
        this.raca = raca;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Pet object = (Pet)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}
