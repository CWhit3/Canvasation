/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author christian_white
 */
public abstract class Shape {
    public abstract void draw(Graphics g, Point drawAt, int size);
}