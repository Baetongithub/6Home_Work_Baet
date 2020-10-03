package com.company;

public class Main {

    public static void main(String[] args) {
        Weapon weapon = new Weapon();
        weapon.setNameOfWeapon("Makarov");
        weapon.setTypeOfWeapon("Traumatic");
        Boss boss = new Boss();
        boss.setHealth(270);
        boss.setDamage(50);
        boss.setWeapon(weapon);

        System.out.println("Boss weapon name's " +
                boss.getWeapon().getNameOfWeapon() + ";\n" + "Boss weapon type's " +
                boss.getWeapon().getTypeOfWeapon() + ";\n" + "Boss health is "
                + boss.getHealth() + ";\n" + "Boss damage is " + boss.getDamage() + ";\n");
    
    }
}
