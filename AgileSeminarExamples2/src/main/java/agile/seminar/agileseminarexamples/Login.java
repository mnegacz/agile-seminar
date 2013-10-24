/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agile.seminar.agileseminarexamples;

import java.util.TreeMap;

/**
 *
 * @author Bartosz Skuza
 */
public class Login {

    public static String CORRECTLY ="correctly";
    public static String INCORRECTLY ="incorrectly";
    private TreeMap<String, String> credentials = new TreeMap<String, String>();

    public void addCredential(String name, String password) {
        this.credentials.put(name, password);
    }

    public String checkCredential(String name, String password) {
        return (credentials.containsKey(name) && credentials.get(name).equals(password))?Login.CORRECTLY:Login.INCORRECTLY;
    }
}
