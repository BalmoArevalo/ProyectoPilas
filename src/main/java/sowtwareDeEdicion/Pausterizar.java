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
public class Pausterizar implements FiltroDeImagen{
     @Override
    public Color colorResultado(Color entrada) {
        int r = entrada.getRed();
        int g = entrada.getGreen();
        int b = entrada.getBlue();
        int a = entrada.getAlpha();
        return new Color(
                (int) ((255 / 7f) * Math.round(7 * r / 255f)),
                (int) ((255 / 7f) * Math.round(7 * g / 255f)),
                (int) ((255 / 7f) * Math.round(7 * b / 255f)),
                a
        );
    }

}
