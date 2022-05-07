package vehiculos;

import java.util.ArrayList;

public class Fabricante {
	private String nombre;
	private Pais pais;
	private int vendidos;
	public static ArrayList<Fabricante> fabricantes = new ArrayList<Fabricante>();
	
	public Fabricante(String nombre, Pais pais) {
		this.nombre = nombre;
		this.pais = pais;
		Fabricante.fabricantes.add(this);
	}
	
	public void vender() {
		vendidos++;
	}
	
	public static Fabricante fabricaMayorVentas() {
		Fabricante masVendedor = Fabricante.fabricantes.get(0);
		for (Fabricante fabrica:Fabricante.fabricantes) {
			if(fabrica.getVendidos() > masVendedor.getVendidos()) {
				masVendedor = fabrica;
			}
		}
		return masVendedor;
	}
	
	public void venderPais() {
		this.pais.vender();
	}
	
	public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public Pais getPais() {
    	return pais;
    }
    
    public void setPais(Pais pais) {
    	this.pais = pais;
    }
    
    public int getVendidos() {
    	return vendidos;
    }
    
    public void setVendidos(int vendidos) {
    	this.vendidos = vendidos;
    }
}
