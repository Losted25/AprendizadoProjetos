package calculo;

public class Aluno  extends Pessoa{
	private int matricula, periodo;
	private String curso, professor;
	private float a1, a2, media;
	
	public void calcularMedia() {
	media = (a1 + a2)/2;
	if(media>=6) {
		System.out.println("Parabéns!! Você foi aprovado!! Aproveite as férias!");
		}else {
			System.out.println("Infelizmente você foi reprovado!! Se dedique mais no próximo período.");
		}
	}

	@Override
	public void procurarEmprego() {
			if(idade>=16&&trabalha==true) {
				System.out.println("Parabéns! "+ this.nome + " Você está empregado.");
			} else if(idade>=16&&trabalha==false) {
				System.out.println("Está na hora de procurar um emprego.");
			} else {
				System.out.println("Aproveite o tempo que você possui para estudar. Logo chegará a hora de procurar um emprego.");
			}
	
		}
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public int getPeriodo() {
		return periodo;
	}

	public void setPeriodo(int periodo) {
		this.periodo = periodo;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String getProfessor() {
		return professor;
	}

	public void setProfessor(String professor) {
		this.professor = professor;
	}

	public float getA1() {
		return a1;
	}

	public void setA1(float a1) {
		this.a1 = a1;
	}

	public float getA2() {
		return a2;
	}

	public void setA2(float a2) {
		this.a2 = a2;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}
}
