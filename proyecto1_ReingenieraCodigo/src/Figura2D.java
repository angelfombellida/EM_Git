import java.awt.Color;


public class Figura2D {

	public int centroX;
	public int centroY;
	public Color colorBorde;
	public Color colorRelleno;

	public Figura2D() {
		super();
	}

	public void setCentro(int x, int y) {
		this.centroX = x;	this.centroY = y;
	}

	public int[] getCentro() {
	    int[] centro = new int[2];
		centro[0]= this.centroX;
		centro[1]= this.centroY;
		return centro;
	}

	public Color getBorde() {
		return this.colorBorde;
	}

	public Color getRelleno() {
		return this.colorRelleno;
	}

	public boolean tieneRelleno() {
		return (this.colorRelleno!=null);
	}

	public double distancia(Rectangulo r) {
		int[] centro = r.getCentro();
		return Math.sqrt(((this.centroX-centro[0]) * (this.centroX-centro[0])) + ((this.centroY-centro[1]) * (this.centroY-centro[1])) );
	}

	public Color mezclaColor(Circulo c) {
	Color resultado = null;
	int rojo, verde, azul;
	if (this.tieneRelleno() & c.tieneRelleno()){	
	rojo = ((this.colorRelleno.getRed() +  c.getRelleno().getRed()) < 255) ? (this.colorRelleno.getRed() +  c.getRelleno().getRed()) : 255; 
	verde = ((this.colorRelleno.getGreen() +  c.getRelleno().getGreen()) < 255) ? (this.colorRelleno.getGreen() +  c.getRelleno().getGreen()) : 255; 
	azul = ((this.colorRelleno.getBlue() +  c.getRelleno().getBlue()) < 255) ? (this.colorRelleno.getBlue() +  c.getRelleno().getBlue()) : 255; 
	resultado = new Color(rojo, verde, azul);
	}
	return resultado;
	}

	public Color mezclaColor(Rectangulo r) {
	Color resultado = null;
	int rojo, verde, azul;
	if (this.tieneRelleno() & r.tieneRelleno()){	
	rojo = ((this.colorRelleno.getRed() +  r.getRelleno().getRed()) < 255) ? (this.colorRelleno.getRed() +  r.getRelleno().getRed()) : 255; 
	verde = ((this.colorRelleno.getGreen() +  r.getRelleno().getGreen()) < 255) ? (this.colorRelleno.getGreen() +  r.getRelleno().getGreen()) : 255; 
	azul = ((this.colorRelleno.getBlue() +  r.getRelleno().getBlue()) < 255) ? (this.colorRelleno.getBlue() +  r.getRelleno().getBlue()) : 255; 
	resultado = new Color(rojo, verde, azul);
	}
	return resultado;
	}

}