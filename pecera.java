public double getCapacidadLitros() {
	return capacidadLitros;
}

public String get gettipoAgua() {
	return tipoAgua;
}

public String getPezHabitante() {
	return pezHabitante;
}

public void setPezHabitante(String pezHabitante) {
    if (pezHabitante != null) {
	pezHabitante = pezHabitante;
	System.out.println(pezHabitante + "Ha sido asignado a la pecera");
    } else {
	pezHabitante = null;
	System.out.println("El habitante ha sido eliminado de la pecera";
    }

    public void imprimirEstado() {
        System.out.println("Capacidad (litros): " + capacidadLitros);
        System.out.println("Tipo de agua: " + tipoAgua);
        System.out.println("Pez habitante: " + (pezHabitante != null ? pezHabitante : "Ninguno"));
    }
}
