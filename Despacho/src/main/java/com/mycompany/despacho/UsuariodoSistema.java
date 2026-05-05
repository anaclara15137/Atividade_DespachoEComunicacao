/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.despacho;

/**
 *
 * @author conza
 */
public class UsuariodoSistema {
    
    private int identificadorUsuario;
    private String login;
    private String senha;
    private String perfil;
    
    public int getidentificadorUsuario() {
        return identificadorUsuario;
    }
    public void setidentificadorUsuario(int _identificadorUsuario) {
        identificadorUsuario = _identificadorUsuario;
    }
    public String getlogin() {
        return login;
    }
    public void setlogin(String _login) {
        login =_login;
    }
    public String getsenha () {
        return senha;
    }
    public void setsenha(String _senha) {
        senha =_senha;
    }
    public String getperfil() {
        return perfil;
    }
    public void setperfil(String _perfil ) {
        perfil = _perfil;
    }
}
