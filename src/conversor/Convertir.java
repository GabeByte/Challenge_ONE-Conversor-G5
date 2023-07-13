package conversor;

import javax.swing.JOptionPane;
import Menu.Inicio;

public class Convertir {
	
	Inicio inicio = new Inicio();
	
    public void CLPtoOTHER(double valor, Moneda moneda) {
        double valorConvertido = valor / moneda.getTasaConversion();
        convertido(valorConvertido, moneda);
    }

    public void OTHERtoCLP(double valor, Moneda moneda) {
        double valorConvertido = moneda.getTasaConversion() * valor;
        convertido(valorConvertido, Moneda.CLP);
    }
    
    

    public void CtoF(double valorTemp, Temperatura temperatura) {
        double valorConvertido = (valorTemp * 9/5) + 32;
        convertido(valorConvertido, temperatura);
    }

    public void CtoK(double valorTemp, Temperatura temperatura) {
        double valorConvertido = valorTemp + 273.15;
        convertido(valorConvertido, temperatura);
    }

    public void FtoC(double valorTemp, Temperatura temperatura) {
        double valorConvertido = (valorTemp - 32) * 5/9;
        convertido(valorConvertido, temperatura);
    }

    public void FtoK(double valorTemp, Temperatura temperatura) {
        double valorConvertido = ((valorTemp - 32) * 5/9) + 273.15;
        convertido(valorConvertido, temperatura);
    }

    public void KtoC(double valorTemp, Temperatura temperatura) {
        double valorConvertido = valorTemp - 273.15;
        convertido(valorConvertido, temperatura);
    }

    public void KtoF(double valorTemp, Temperatura temperatura) {
        double valorConvertido = ((valorTemp - 273.15) * 9/5) + 32;
        convertido(valorConvertido, temperatura);
    }
    
    private void convertido(double valorConvertido, Temperatura temperatura) {
        valorConvertido = Math.round(valorConvertido * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La conversión es de: " + valorConvertido + " " + temperatura.getNombre());
        Inicio.exitBack();
	}
    
    private void convertido(double valorConvertido, Moneda moneda) {
        valorConvertido = (double) Math.round(valorConvertido * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La conversión es de: " + valorConvertido + " " + moneda.getNombre());
        Inicio.exitBack();
		
	}

}
