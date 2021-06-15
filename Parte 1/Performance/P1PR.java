package Performance;

public class P1PR {
	private double a,b,c,d,e,f,g,h,i,j,k,l,mes;
	private int ano, dia;
	
	public P1PR(int ano) {
		super();
		this.ano = ano;
	}
	
	public void calcular() {
		a 	= ano%19;
	    b 	= Math.floor(ano/100);
	    c 	= ano%100;
	    d 	= Math.floor(b/4);
	    e	= b%4;
	    f 	= Math.floor((b+8)/25);
	    g 	= Math.floor((b-f+1)/3);
	    h 	= (19*a+b-d-g+15)%30;
	    i 	= Math.floor(c/4);
	    j 	= c%4;
	    k 	= (32+2*e+2*i-h-j)%7;
	    l 	= Math.floor((a+11*h+22*k)/451);
	    mes = Math.floor((h+k-7*l+114)/31);
	    dia = (int)(((h+k-7*l+114)%31)+1);
	   
	    if(mes == 3) {
	    	System.out.println("Neste ano, a pascoa sera em " + dia + " de MARCO");
	    }else System.out.println("Neste ano, a pascoa sera em " + dia + " de ABRIL");
	}
}
