import java.util.ArrayList;
import java.util.Random;
import java.util.Date;

public class BatalhaNaval {
	
	public static Random r = new Random(new Date().getTime());

	public static void main(String [] args) {
		ArrayList paraguay = new ArrayList();
		ArrayList brasil = new ArrayList();
		
		paraguay.add(new PortaAvioes(1500,"Assuncion",1000, 500,10));
		paraguay.add(new Cruzador(50,"Caboto",500, 200, 20));
		paraguay.add(new Cruzador(50,"Guarani",300, 150, 10));
		paraguay.add(new NavioMercante(10,"Cisplatina",1000,50));
		paraguay.add(new NavioMercante(10,"Simon Bolivar",500,10));

		brasil.add(new PortaAvioes(1000,"Getúlio D. Vargas",1000, 800,20));
		brasil.add(new Cruzador(60,"Pedro Teixeira",250, 200, 15));
		brasil.add(new Cruzador(70,"Duque de Caxias",350, 150, 30));
		brasil.add(new NavioMercante(10,"Floriano Peixoto",1000,10));
		brasil.add(new NavioMercante(10,"Pernambuco",500,50));
		System.out.println("\n*************************");
        System.out.println("*\tFrota Brasileira\t*");
		System.out.println("*************************");
		imprimeFrota(brasil);
		System.out.println("\n*************************");
        System.out.println("*\tFrota Paraguaia \t*");
		System.out.println("*************************");
		imprimeFrota(paraguay);
		BatalhaDoRiachuelo(brasil,paraguay,"Brasil", "Paraguai");
	}
	
	public static void BatalhaDoRiachuelo(ArrayList a, ArrayList b, String nomeA, String nomeB) {
		int cont = 0;
		double blindagem;
		boolean aTemNavioDeGuerra = false;
		boolean bTemNavioDeGuerra = false;

		while (a.size() > 0 || b.size() > 0) {
			aTemNavioDeGuerra = temNavioDeGuerra(a);
			bTemNavioDeGuerra = temNavioDeGuerra(b);

			if(!aTemNavioDeGuerra || !bTemNavioDeGuerra) {
				if(!aTemNavioDeGuerra && !bTemNavioDeGuerra){
					System.out.println("A batalha acabou sem lado vencedor");
					break;
				}
				if(!aTemNavioDeGuerra){
					System.out.println(nomeB+" venceu a batalha");
					break;
				}
				else{
					System.out.println(nomeA+" venceu a batalha");
					break;
				}
			}
			cont ++;
			Navio na = (Navio) a.get(r.nextInt(a.size()));
   	        Navio nb = (Navio) b.get(r.nextInt(b.size()));
   	        if(na instanceof NavioMercante && nb instanceof NavioMercante) {
   	        	a.remove(na);
   	        	a.remove(nb);
   	        	System.out.println(cont+") "+na.getNome() +" e "+ nb.getNome()+" afundaram");
   	        	continue;
   	        }
   	        if(na instanceof NavioMercante && nb instanceof NavioDeGuerra) {
   	        	System.out.println(cont+") Confronto entre o navio mercante \""+na.getNome()+"\" e o navio de guerra \""+nb.getNome()+"\"");
   	        	System.out.println("   O navio mercante \""+na.getNome()+"\" afundou");
   	        	a.remove(na);
   	        	continue;
   	        }
   	        if(nb instanceof NavioMercante && na instanceof NavioDeGuerra) {
				System.out.println(cont+") Confronto entre o navio mercante \""+nb.getNome()+"\" e o navio de guerra \""+na.getNome()+"\"");
				System.out.println("   O navio mercante \""+nb.getNome()+"\" afundou");
   	        	b.remove(nb);
   	        	continue;
   	        }

   	        if(na instanceof NavioDeGuerra && nb instanceof NavioDeGuerra) {
   	        	System.out.println(cont+") Batalha entre os navios de guerra \""+ na.getNome() +"\" e \""+nb.getNome()+"\"");
   	        	NavioDeGuerra ga = (NavioDeGuerra) na;
   	        	NavioDeGuerra gb = (NavioDeGuerra) nb;
   	        	blindagem = ga.getBlindagem()-gb.getAtaque();
   	        	ga.setBlindagem(blindagem);
   	        	blindagem = gb.getBlindagem()-ga.getAtaque();
   	        	gb.setBlindagem(blindagem);
   	        	if(ga.getBlindagem() < 0) {
					System.out.println("   \""+ga.getNome()+"\" afundou");
   	   	        	a.remove(na);
   	        	}
   	        	if(gb.getBlindagem() < 0) {
   	   	        	System.out.println("   \""+gb.getNome()+"\" afundou");
   	   	        	b.remove(nb);
   	        	}
   	        }
			if(a.size() == 0) {
				System.out.println("\n"+nomeB+" venceu a batalha");
				break;
			}
			if(b.size() == 0) {
				System.out.println("\n"+nomeA+" venceu a batalha");
				break;
			}
		}

	}
	public static boolean temNavioDeGuerra(ArrayList al) {
		boolean tem = false;
		for(int i=0; i<al.size();i++) {
	       Navio n = (Navio) al.get(i);
	       if(n instanceof NavioDeGuerra) {
	    	   tem = true;
	    	   break;
	       }
		}
		return tem;
	}
	public static void imprimeFrota(ArrayList al) {
		for(int i=0; i<al.size();i++) {
		   System.out.println("__________________________________");
		   Navio n = (Navio) al.get(i);
		   if(n instanceof NavioMercante) {
		      ((NavioMercante) n).carregamento(50);
			   if(i == al.size()-1){
				   System.out.println("__________________________________\n");
			   }
		      continue;
		   }
		   if(n instanceof PortaAvioes) {
		      ((PortaAvioes) n).exibirArmas();
			   if(i == al.size()-1){
				   System.out.println("__________________________________\n");
			   }
		      continue;
		   }
		   if(n instanceof Cruzador) {
		      ((Cruzador) n).exibirArmas();
			   if(i == al.size()-1){
				   System.out.println("__________________________________\n");
			   }
		   }
		}
	}

}
