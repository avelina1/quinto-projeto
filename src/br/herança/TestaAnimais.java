package br.herança;

public class TestaAnimais {

	public static void main(String[] args) {
		Animal ani = new Animal();
		Cachorro cach = new Cachorro();
		Cavalo cav = new Cavalo();
		Preguiça preg = new Preguiça();
		
		cach.setNome("boika");
		cach.setIdade(3);
		cach.setSom("huaauuu");
		cach.setCorrer("correndo");
		
		System.out.println("nome: " + cach.getNome());
		System.out.println("idade" + cach.getIdade());
		System.out.println("son" + cach.getSom());
		System.out.println("correr" + cach.getCorrer());
		
		cav.setNome("mimi");
		cav.setIdade(6);
		cav.setSom("hummmm");
		cav.setCorrer("correndo");
		
		System.out.println("nome: " + cav.getNome());
		System.out.println("idade" + cav.getIdade());
		System.out.println("son:" + cav.getSom());
		System.out.println("correr:" + cav.getCorrer());
		
		preg.setNome("sono");
		preg.setIdade(16);
		preg.setSom("hooooo");
		preg.setSubirEmArvore("subir");
		
		System.out.println("nome: " + preg.getNome());
		System.out.println("idade: " + preg.getIdade());
		System.out.println("som: " + preg.getSom());
		System.out.println("subir em arvore " + preg.getSubirEmArvore());
		
		 
		
		


	}

}
