package Menu;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

import conversor.Opciones;

public class Inicio {

	public static void main(String[] args) {
		String inputMonedas = "0";
		double valorMonedas = 0;
		String inputTemp = "0";
		double valorTemp = 0;

		Opciones convertir = new Opciones();
		
		while (true) {
			
			String seleccion = (String) JOptionPane.showInputDialog(
					null,
					"¿Qué desea convertir?",
					"Menú - Conversor",
					JOptionPane.QUESTION_MESSAGE,
					new ImageIcon(),
					new Object[] { "Monedas", "Temperatura" }, null);
			
			if (seleccion == null) {
				exit();
			}
			
			
			switch (seleccion) {
			case "Monedas": {
			    do {
			        inputMonedas = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");

			        if (inputMonedas == null) {
			            JOptionPane.showMessageDialog(null, "Operación cancelada.");
			            exitMenu();
			        } else if (inputMonedas.isEmpty()) {
			            JOptionPane.showMessageDialog(null, "Debe especificar un número.");
			        } else {
			            try {
			                valorMonedas = Double.parseDouble(inputMonedas);
			                if (valorMonedas <= 0) {
			                    JOptionPane.showMessageDialog(null, "Los números no pueden ser menores o iguales a 0");
			                    inputMonedas = "";
			                }
			            } catch (NumberFormatException e) {
			                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico válido.");
			                inputMonedas = "";
			            }
			        }
			    } while (inputMonedas == null || inputMonedas.isEmpty());
			    convertir.Monedas(valorMonedas);
			}

			case "Temperatura":
				do {
					inputTemp = JOptionPane.showInputDialog(null, "Ingrese el valor a convertir");
					
					if (inputTemp == null) {
						JOptionPane.showMessageDialog(null, "Operacion cancelada.");
						exitMenu();
					} else if (inputTemp.isEmpty()) {
						JOptionPane.showMessageDialog(null, "Debe de especificar un número.");
					} else {
						try {
							valorTemp = Double.parseDouble(inputTemp); 
							//Agregar if si no deseo n negativos
						} catch (NumberFormatException e) {
			                JOptionPane.showMessageDialog(null, "Debe ingresar un valor numérico válido.");
			                inputTemp = "";
						}
					}
				} while (inputTemp == null || inputTemp.isEmpty());
				convertir.Temperatura(valorTemp);			
			}
		}
	}
	public static void exit(){
        Object[] options = {"No", "Si"};
        int x = JOptionPane.showOptionDialog(null, "¿Desea Salir?",
                "SALIR",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, new ImageIcon(), options, options[1]);
		if(x == 0) {
		 main(null);
		}else System.exit(0);
    }
	public static void exitMenu(){
        Object[] options = {"No", "Si"};
        int x = JOptionPane.showOptionDialog(null, "¿Volver al Menú?",
                "SALIR",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, new ImageIcon(), options, options[1]);
		if(x == 1) {
		 main(null);
		}else System.exit(0);
    }
	public static void exitBack(){
        Object[] options = {"Salir", "Si"};
        int x = JOptionPane.showOptionDialog(null, "¿Desea hacer otra operación?",
                "SALIR",
                JOptionPane.DEFAULT_OPTION, JOptionPane.ERROR_MESSAGE, new ImageIcon(), options, options[1]);
		if(x == 1) {
		 main(null);
		}else System.exit(0);
    }
	
}
