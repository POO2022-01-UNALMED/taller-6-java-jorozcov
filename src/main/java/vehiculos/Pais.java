package vehiculos;

import java.util.ArrayList;

public class Pais {
	private String nombre;
	private int vendidos;
	public static ArrayList<Pais> paises = new ArrayList<Pais>(); 
	
	public Pais(String nombre) {
		this.nombre = nombre;
		paises.add(this);
	}
	
	public void vender() {
    	vendidos++;
    }
	
	public static Pais paisMasVendedor() {
		Pais masVendedor = Pais.paises.get(0);
		for (Pais pais:Pais.paises) {
			if(pais.getVendidos() > masVendedor.getVendidos()) {
				masVendedor = pais;
			}
		}
		return masVendedor;
	}
	
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getVendidos() {
    	return vendidos;
    }
    
    public void setVendidos(int vendidos) {
    	this.vendidos = vendidos;
    }

}
