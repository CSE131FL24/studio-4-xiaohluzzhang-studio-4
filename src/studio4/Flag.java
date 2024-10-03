package studio4;

import java.util.Scanner;

import javax.swing.JFileChooser;

import java.awt.Color;
import java.io.File;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
	
	StdDraw.setPenColor(Color.blue); 
	StdDraw.filledRectangle (0.5, 0.5, 0.3, 0.2);
	
	StdDraw.setPenColor(Color.pink);
	double [] x = {0.5, 0.45, 0.55};
	double [] y = {0.7, 0.5, 0.5};
	StdDraw.filledPolygon(x,y);
	double [] a = {0.25, 0.45, 0.5};
	double [] b = {0.5, 0.45, 0.55};
	StdDraw.filledPolygon(a,b);
	
	
	double [] c = {0.3, 0.45, 0.5};
	double [] d = {0.3, 0.45, 0.4};
	StdDraw.filledPolygon(c,d);
	
	double [] e = {0.5, 0.55, 0.7};
	double [] f = {0.4, 0.45, 0.3};
	StdDraw.filledPolygon(e,f);
	
	
	double [] g = {0.55, 0.5, 0.75};
	double [] h = {0.45, 0.55, 0.5};
	StdDraw.filledPolygon(g,h);
	double [] i = {0.45, 0.45, 0.5, 0.55, 0.55};
	double [] j = {0.5, 0.45, 0.4, 0.45, 0.5};
	StdDraw.filledPolygon(i, j);
	
	
	
	
	
	
	
		
	}
}