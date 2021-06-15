package p3E01;

public class Pessoa {

		private int idPessoa;
		private String nomePessoa;
		private double alturaPessoa;
		
		public Pessoa() {
			super();
		}

		public Pessoa(int idPessoa, String nomePessoa, double alturaPessoa) {
			super();
			this.idPessoa = idPessoa;
			this.nomePessoa = nomePessoa;
			this.alturaPessoa = alturaPessoa;
		}
		
		public int getIdPessoa() {
			return idPessoa;
		}
		public void setIdPessoa(int idPessoa) {
			this.idPessoa = idPessoa;
		}
		public String getNomePessoa() {
			return nomePessoa;
		}
		public void setNomePessoa(String nomePessoa) {
			this.nomePessoa = nomePessoa;
		}
		public double getAlturaPessoa() {
			return alturaPessoa;
		}
		public void setAlturaPessoa(double alturaPessoa) {
			this.alturaPessoa = alturaPessoa;
		}
		
		public static double mediaAltura(Pessoa[] pessoas) {
			double soma=0;
			for(int i=0; i<pessoas.length;i++) {
				soma += pessoas[i].getAlturaPessoa();
			}
			double mediaAltura = soma/pessoas.length;
			return mediaAltura;
		}
}
