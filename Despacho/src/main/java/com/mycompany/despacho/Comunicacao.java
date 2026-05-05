/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.despacho;

import java.sql.Time;
import java.util.Date;

/**
 *
 * @author aluno
 */
public class Comunicacao {

    private int identificadorComunicacao;
    private String tipo;
    private String mensagem;
    private Date Data;
    private Time Hora;
    private int remetente;
    private int destinatario;

    public int getidentificadorComunicacao() {
        return identificadorComunicacao;
    }

    public void setidentificadorComunicacao(int _identificadorComunicacao) {
        identificadorComunicacao = _identificadorComunicacao;
    }

    public String gettipo() {
        return tipo;
    }

    public void settipo(String _tipo) {
        tipo = _tipo;
    }

    public String getmensagem() {
        return mensagem;
    }

    public void setmensagem(String _mensagem) {
        mensagem = _mensagem;
    }

    public Date getdata() {
        return Data;
    }

    public void setdata(Date _data) {
        Data = _data;
    }

    public Time getHora() {
        return Hora;
    }

    public void setHora(Time _Hora) {
        Hora = _Hora;
    }

    public int getremetente() {
        return remetente;
    }

    public void setRemetente(int _remetente) {
        remetente = _remetente;
    }

    public int getdestinatario() {
        return destinatario;
    }

    public void setdestinatario(int _destinatario) {
        destinatario = _destinatario;
    }
}
