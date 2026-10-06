package edu.ifmt.cobrancaifmt.model;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Titulo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String descricao;
    private Date dataVencimento;
    private BigDecimal valor;
    private StatusTitulo status;

    public Long getCodigo() {
    return codigo;
}

public void setCodigo(Long codigo) {
    this.codigo = codigo;
}

public String getDescricao() {
    return descricao;
}

public void setDescricao(String descricao) {
    this.descricao = descricao;
}

public Date getDataVencimento() {
    return dataVencimento;
}

public void setDataVencimento(Date dataVencimento) {
    this.dataVencimento = dataVencimento;
}

public BigDecimal getValor() {
    return valor;
}

public void setValor(BigDecimal valor) {
    this.valor = valor;
}

public StatusTitulo getStatus() {
    return status;
}

public void setStatus(StatusTitulo status) {
    this.status = status;
}

@Override
public boolean equals(Object obj) {
    if (this == obj) {
        return true;
    }

    if (obj == null || getClass() != obj.getClass()) {
        return false;
    }

    Titulo titulo = (Titulo) obj;

    return codigo != null && codigo.equals(titulo.codigo);
}

@Override
public int hashCode() {
    return codigo != null ? codigo.hashCode() : 0;
}
}