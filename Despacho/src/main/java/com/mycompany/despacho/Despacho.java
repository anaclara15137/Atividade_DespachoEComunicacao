/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.despacho;

import java.util.Date;

/**
 *
 * @author aluno
 */
public class Despacho {
    
    private int identificadorDespacho;
    private Date dataDespacho;
    private String horaDespacho;
    private String status;
    private int ocorrencia;

    public int getidentificadorDespacho() {
        return identificadorDespacho;
    }

    public void setidentificadorDespacho(int _identificadorDespacho) {
        identificadorDespacho = _identificadorDespacho;
    }

    public Date getdataDespacho() {
        return dataDespacho;
    }

    public void setdataDespacho(Date _dataDespacho) {
        dataDespacho = _dataDespacho;
    }

    public String gethoraDespacho() {
        return horaDespacho;
    }

    public void horaDespachp(String _horaDespacho) {
        horaDespacho = _horaDespacho;
    }

    public String getstatus() {
        return status;
    }

    public void setstatus(String _status) {
        status = _status;
    }

    public int getocorrencia() {
        return ocorrencia;
    }

    public void setocorrencia(int _ocorrencia) {
        ocorrencia = _ocorrencia;
    }
}
