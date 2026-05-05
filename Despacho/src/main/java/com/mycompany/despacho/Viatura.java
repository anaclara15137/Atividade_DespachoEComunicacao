/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.despacho;

/**
 *
 * @author conza
 */
public class Viatura {
    
    private int identificadorViatura;
    private String tipo;
    private String prefixo;
    private String placa;
    private int status;
    private String localizacaoAtualouUltimaLocalizacao;
    
    public int getidentificadorViatura() {
        return identificadorViatura;
    }
    public void setidentificadorViatura(String _identificarViatura) {
        identificadorViatura = _identificadorViatura;
    }
    public String gettipo () {
        return tipo;
    }
    public void settipo(String _tipo) {
        tipo = _tipo;
    }
    public String getprefixo() {
        return prefixo;
    }
    public void setprefixo(String _prefixo) {
       prefixo = _prefixo; 
    }
    public String getplaca() {
        return placa;
    }
    public void setplaca(String _placa) {
        placa = _placa;
    }
    public int getstatus() {
        return status;
    }
    public void setstatus(int _status){
        status = _status;
    }
     public String getlocalizacaoAtualouUltimaLocalizacao(String _localizacaoouUltimaLocalizacao) {
         return localizacaoAtualouUltimaLocalizacao;
     }
     public void setlocalizacacoAltualouUltimaLocalizacao(String _localizacaoAtualouUtilaLocalizacao) {
         localizacaoAtualouUltimaLocalizacao = _localizacaoAtualouUltimaLocalizacao;
     }
}
