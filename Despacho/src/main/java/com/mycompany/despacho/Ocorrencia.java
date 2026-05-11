/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.despacho;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Ocorrencia {

  private int identificadorOcorrencia;
  private String tipo;
  private Date data;
  private Time hora; 
  private String local;
  private String descricao;
  private int status;
  private int sinistro;
  private int prioridade;
  
    public int getidentificadorOcorrencia() {
        return identificadorOcorrencia;
    }

    public void setidentificadorOcorrencia(int _identificadorOcorrencia) {
        identificadorOcorrencia = _identificadorOcorrencia;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String _tipo) {
        tipo = _tipo;
    }

    public Date getdata() {
        return data;
    }

    public void setdata(Date _data) {
        data = _data;
    }
    
    public Time gethora() {
        return hora;
    }
    
    public void sethora(Time _hora) {
        hora = _hora;
    }
    
    public String getlocal() {
        return local;
    }

    public void setlocal(String _local) {
        local = _local;
    }

    public String getdescricao() {
        return descricao;
    }

    public void setdescricao(String _descricao) {
        descricao = _descricao;
    }

    public int getstatus() {
        return status;
    }

    public void setstatus(int _status) {
        status = _status;
    }

    public int getsinistro() {
        return sinistro;
    }

    public void setsnistro(int _sinistro) {
        sinistro = _sinistro;
    }

    public int getprioridade() {
        return prioridade;
    }

    public void setprioridade(int _prioridade) {
        prioridade = _prioridade;
    }
}
