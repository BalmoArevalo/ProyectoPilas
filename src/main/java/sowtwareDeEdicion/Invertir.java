/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sowtwareDeEdicion;

import java.awt.Color;

/**
 *
 * @author Emerson Arevalo
 */
public class Invertir implements FiltroDeImagen{
    @Override
    public Color colorResultado(Color entrada) {
        int r = entrada.getRed();
        int g = entrada.getGreen();
        int b = entrada.getBlue();
        int a = entrada.getAlpha();
        return new Color(255 - r, 255 - g, 255 - b, a);
    }
    
}
