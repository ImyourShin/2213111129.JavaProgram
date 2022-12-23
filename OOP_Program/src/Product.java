
public class Product {
private String id;
private int unit;
private double price;


public void setID(String ID) {
	id = ID;
}
public String getID() {
	return id;
}
public void setUnit(int UNIT) {
	unit = UNIT;
}
public int getUnit() {
	return unit;
}
public void setPrice(double PRICE) {
	price = PRICE;
}
public double getPrice() {
	return price;
}
public double calculate() {
	return price*unit;
	
}
public String checkStock(int unit) {
	if(unit < 5) {
		return "LOW";
	}
	else if (unit >= 5 && unit <50 ) {
		return "NORMAL";
	}
	else if (unit>=50) {
		return "HIGH";
	}
	else {
		return "";
	}
}
	
	
}
