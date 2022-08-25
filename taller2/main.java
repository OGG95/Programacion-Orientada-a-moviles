package taller2;

public class main {
	public static void main (String[]args) {
		BDatos a=new Oracle();
		System.out.print("ORACLE\n");
		a.conectar();
		a.consultar();
		a.eliminar();
		a.insertar();
		System.out.print("POST\n");
		BDatos b=new Postgres();
		b.conectar();
		b.eliminar();
		b.consultar();
		b.insertar();
		System.out.print("SQL\n");
		BDatos c=new sql();
		c.conectar();
		c.consultar();
		c.eliminar();
		c.insertar();
	}
}
