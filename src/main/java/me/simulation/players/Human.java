package me.simulation.players;


public class Human extends Champion {
    public Human(String race, int level, int hp, int strength, int range, int luck, boolean has_shield, boolean has_sword, int x_index, int y_index){
        this.race = race;
        this.level = level;
        this.hp = hp;
        this.strength = strength;
        this.range = range;
        this.luck = luck;
        this.has_shield = has_shield;
        this.has_sword = has_sword;
        this.x_index = x_index;
        this.y_index = y_index;
    }
}
