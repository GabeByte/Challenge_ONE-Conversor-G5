package conversor;

import javax.swing.JOptionPane;

import Menu.Inicio;

public class Opciones {

	Inicio inicio = new Inicio();
	Convertir convertir = new Convertir();
	
	public void Monedas(double valor) {
	    Object moneyOptionObj = (JOptionPane.showInputDialog(null,
	            "¿Cómo quieres calcular tu dinero?",  "Monedas",
	            JOptionPane.PLAIN_MESSAGE, null, new Object[]
	                    {"Peso chileno a Dólar",
	                     "Peso chileno a Euro",
	                     "Peso chileno a Libras esterlinas",
	                     "Peso chileno a Yenes japonés",
	                     "Peso chileno a Wons surcoreano",
	                     "Dólar a Peso chileno",
	                     "Euro a Peso chileno",
	                     "Libra esterlina a Peso chileno",
	                     "Yenes japonés a Peso chileno",
	                     "Wons surcoreano a Peso chileno"}, 
	                    "Seleccion"));
	    if (moneyOptionObj != null) {
	        String moneyOption = moneyOptionObj.toString();
	        
	        switch (moneyOption) {
	            case "Peso chileno a Dólar": 
	                convertir.CLPtoOTHER(valor, Moneda.USD);
	                break;
	            case "Peso chileno a Euro": 
	                convertir.CLPtoOTHER(valor, Moneda.EUR);
	                break;
	            case "Peso chileno a Libras esterlinas": 
	                convertir.CLPtoOTHER(valor, Moneda.GBP);
	                break;
	            case "Peso chileno a Yenes japonés": 
	                convertir.CLPtoOTHER(valor, Moneda.JPY);
	                break;
	            case "Peso chileno a Wons surcoreano": 
	                convertir.CLPtoOTHER(valor, Moneda.KRW);
	                break;
	            case "Dólar a Peso chileno": 
	                convertir.OTHERtoCLP(valor, Moneda.USD);
	                break;
	            case "Euro a Peso chileno": 
	                convertir.OTHERtoCLP(valor, Moneda.EUR);
	                break;
	            case "Libra esterlina a Peso chileno": 
	                convertir.OTHERtoCLP(valor, Moneda.GBP);
	                break;
	            case "Yenes japonés a Peso chileno": 
	                convertir.OTHERtoCLP(valor, Moneda.JPY);
	                break;
	            case "Wons surcoreano a Peso chileno": 
	                convertir.OTHERtoCLP(valor, Moneda.KRW);
	                break;
	        }
	    } else {
			JOptionPane.showMessageDialog(null, "Operacion cancelada.");
			Inicio.exitMenu();
	    }
	}

	public void Temperatura(double valorTemp) {
		Object tempOptionObj = (JOptionPane.showInputDialog(null,
				"¿Cómo quieres calcular tu dinero?",  "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, new Object[]
						{"Celsius a Farenheit",
						 "Celsius a Kelvin",
						 "Farenheit a Celsius",
						 "Farenheit a Kelvin",
						 "Kelvin a Celsius",
						 "Kelvin a Farenheit"}, 
						"Seleccion"));
		if (tempOptionObj != null) {
	        String tempOption = tempOptionObj.toString();
	        
	        switch (tempOption) {
	        case "Celsius a Farenheit": 
                convertir.CtoF(valorTemp, Temperatura.Farenheit);
                break;
			case "Celsius a Kelvin": 
                convertir.CtoK(valorTemp, Temperatura.Kelvin);
				break;
			case "Farenheit a Celsius": 
                convertir.FtoC(valorTemp, Temperatura.Celsius);
				break;
			case "Farenheit a Kelvin": 
                convertir.FtoK(valorTemp, Temperatura.Kelvin);
				break;
			case "Kelvin a Celsius": 
                convertir.KtoC(valorTemp, Temperatura.Celsius);
				break;
			case "Kelvin a Farenheit": 
                convertir.KtoF(valorTemp, Temperatura.Farenheit);
				break;
			}
			
		}
    }
}