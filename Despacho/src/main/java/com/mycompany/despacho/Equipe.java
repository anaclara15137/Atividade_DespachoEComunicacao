/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.despacho;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author conza
 */
public class Equipe {

    private int identificadorEquipe;
    private List<Bombeiro> listaBombeiros = new ArrayList<Bombeiro>();

    public int getidentificadorEquipe() {
        return identificadorEquipe;
    }

    public void setidentificadorEquipe(int _identificadorEquipe) {
        identificadorEquipe = _identificadorEquipe;
    }

    public List<Bombeiro> getListaBombeiros() {
        return listaBombeiros;
    }

    public void setlistaBombeiros(List<Bombeiro>listaBombeiros) {
        this.listaBombeiros = listaBombeiros;
    }

}
    

