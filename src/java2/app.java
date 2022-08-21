package java2;

public class app {
	 
	public static void main(String[] args) {
		 
		    	Equipe equipe1200 = new Equipe();
		    	Equipe equipeHornda = new Equipe();
		    	Equipe equipeXJ = new Equipe();
		    	equipe1200.m1 = new Moto(new Motor1200());
		    	equipe1200.m2 = new Moto(new Motor1200());
		    	equipe1200.p1 = new Piloto ("Fabio Quartararo");
		    	equipe1200.p2 = new Piloto ("Franco Morbidelli");
		        equipe1200.mecanicos.add(new Mecanico() );
		        
		        equipeXJ.m1= new Moto(new MotorXj());
		        equipeXJ.m2= new Moto(new MotorXj());
		        equipeXJ.p1=new Piloto("Maverick Viñales");
		        equipeXJ.p1=new Piloto("Takaaki Nakagami");
		        equipeXJ.mecanicos.add(new Mecanico ());
		        
		        equipeHornda.m1=new Moto(new MotorHonda() );
		        equipeHornda.m2=new Moto(new MotorHonda() );
		        equipeHornda.p1=new Piloto("Brad Binder");
		        equipeHornda.p2=new Piloto("Darryn Binder");
		        equipeHornda.mecanicos.add(new Mecanico());
		        
		        
		        
		        System.out.print(equipe1200.m1.roda());
		         System.out.print(equipeXJ.m1.roda());
		         System.out.print(equipeHornda.m1.roda());
				System.out.print(equipe1200.m2.roda());
				System.out.print(equipeXJ.m2.roda());
				 System.out.print(equipeHornda.m2.roda());
}
}