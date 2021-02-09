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
	 * @param lG tamaño del lado grande
	 * @param lP tamaño del lado pequeño
	 */
	public Rectangulo_SVG(String tipoFigura, double lG, double lP) {
		super(tipoFigura);
		l1 = lG;
		l2 = lP;
	}

	/**
	 * Calcula el Área del Rectangulo
	 * 
	 * @return devuelve el area de rectangulo
	 */
	@Override
	public double area() {
		return l1 * l2;
	}
	
	/**
	 * Calcula el Perimetro del Rectángulo
	 * 
	 * @return devuelve el valor del perímetro
	 */
	@Override
	public double perimetro() {
		return (2 * l1) + (2 * l2);
	}

}
