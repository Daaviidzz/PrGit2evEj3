public class Empleado {

    void incrementarSueldo(int porcentajeincremento){
        this.sueldo += sueldo *(1+porcentajeincremento/100.0);
    }

    private String nombre;
    private int edad;
    private double sueldo;

}
