package ejercicios;

public class Descuento {
private double descuento;
private double totalcompra;

public Descuento(double descuentoParam, double totalcompraParam){
	this.descuento=descuentoParam;
	this.totalcompra=totalcompraParam;
}

public double getDescuento() {
	return descuento;
}

public void setDescuento(double descuento) {
	this.descuento = descuento;
}

public double getTotalcompra() {
	return totalcompra;
}

public void setTotalcompra(double totalcompra) {
	this.totalcompra = totalcompra;
}

public double getTotal(){
	double total=totalcompra-totalcompra*descuento;
	return total;
}
}
