/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalhoparte1.model;

import java.util.ArrayList;

/**
 *
 * @author Hélio
 */
public class Identifier {
    private String name;
    private ArrayList<Integer> lines;

    public Identifier(String name) {
        this.name = name;
        this.lines = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Identifier)) {
            return false;
        }
        final Identifier other = (Identifier) obj;
        return this.getName().equals(other.getName());
    }

    public String getName() {
        return name;
    }
    
    public ArrayList<Integer> getLines() {
        return lines;
    }
    
    public void addLine(Integer line) {
        this.lines.add(line);
    }
   
    public void setNome(String name) {
        this.name = name;
    }
}
