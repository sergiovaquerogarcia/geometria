/**
 * @author Sergio Vaquero Garcia
 * @version 1.2
 */
public class Rectangulo_SVG extends FiguraGeometrica_SVG {
	private double l1;
	private double l2;
	
	/**
	 * Constructor de la clase
	 * 
	 * @param tipoFigura indica que es un rectangulo
	 * @param lG tama�o del lado grande
	 * @param lP tama�o del lado peque�o
	 */
	public Rectangulo_SVG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el �rea del Rectangulo
	 * 
	 * @return devuelve el area de rectangulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el Perimetro del Rect�ngulo
	 * 
	 * @return devuelve el valor del per�metro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
