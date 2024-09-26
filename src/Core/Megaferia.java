/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Core;

import java.util.ArrayList;

/**
 *
 * @author jbarreno
 */
public class Megaferia {

    private ArrayList<Stand> stands;
    private ArrayList<Editorial> editoriales;

    public Megaferia() {
        this.stands = new ArrayList<>();
        this.editoriales = new ArrayList<>();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" + ")";
    }

    public ArrayList<Stand> getStand() {
        return stands;
    }

    public ArrayList<Editorial> getEditorial() {
        return editoriales;
    }

    public void createStand(float precio) {
        this.stands.add(new Stand(precio));
    }

    public void verifyStands() {
        for (Stand stand : stands) {
            System.out.println(stand+"->"+stand.getEditoriales());
        }
    }

    public boolean addEditorial(Editorial editorial) {
        if (!this.editoriales.contains(editorial)) {
            this.editoriales.add(editorial);
            return true;
        }
        return false;
    }

    public void assignStandEditorial(ArrayList<Integer> standsIds, ArrayList<Editorial> editoriales) {
        for (Editorial editorial : editoriales) {
            this.addEditorial(editorial);
            for (Integer standId : standsIds) {
                Stand stand = this.getStandById(standId);
                if (stand != null) {
                    editorial.addStand(stand);
                    stand.addEditorial(editorial);
                }
            }
        }
    }

    private Stand getStandById(int standId) {
        for (Stand stand : this.stands) {
            if (stand.getId() == standId) {
                return stand;
            }
        }
        return null;
    }
}
