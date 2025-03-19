public class Empresa {
    public static void main(String[] args) {
        Empleado e1= new Empleado();
        System.out.println(e1);
        Departamento d1= new Departamento("Departamento 1");
        d1.anadir(e1);
        System.out.println(d1);
    }
}