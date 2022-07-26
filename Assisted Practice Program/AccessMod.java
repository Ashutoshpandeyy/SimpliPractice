class M{
	private int var_m_1;
	long var_m_2;
	protected float var_m_3;
	
	M(int var_m_1, long var_m_2, float var_m_3){
		this.var_m_1 = var_m_1;
		this.var_m_2 = var_m_2;
		this.var_m_3 = var_m_3;
	}
	public void display(){
		System.out.println("Class m: " + "Var1: " + this.var_m_1 + "Var2: " + this.var_m_2 + "Var3: " + this.var_m_3);
	}
}

class N{
	protected long var_n_1;
	public int var_n_2;
	double var_n_3;
	
	N(long var_n_1, int var_n_2, double var_n_3){
		this.var_n_1 = var_n_1;
		this.var_n_2 = var_n_2;
		this.var_n_3 = var_n_3;
	}
	public void display(){
		System.out.println("Class N: " + "Var1: " + this.var_n_1 + "Var2: " + this.var_n_2 + "Var3: " + this.var_n_3);
	}
}

class P{
	public void display_p(){
		N nobj = new N(1, 2, 3.0);
		M mobj = new M(5, 10, 5.75f);
		
		nobj.display();
		mobj.display();
	}
}
class X{
	private int var_x_1;
	long var_x_2;
	protected float var_x_3;
	public char ch;
	
	X(int var_x_1, long var_x_2, float var_x_3, char ch){
		this.var_x_1 = var_x_1;
		this.var_x_2 = var_x_2;
		this.var_x_3 = var_x_3;
		this.ch = ch;
	}
	public void display(){
		System.out.println("Class x: " + "Var1: " + this.var_x_1 + "Var2: " + this.var_x_2 + "Var3: " + this.var_x_3 + "character: " + this.ch);
	}
}

class Y{
	public void display_Y(){
		N nobj = new N(1, 2, 3.0);
		M mobj = new M(5, 10, 5.75f);
		X xobj = new X(1, 2, 5.85f, 'c');
		
		nobj.display();
		mobj.display();
		xobj.display();
	}	
}

class Z{
	public void display_z(){
		N nobj = new N(1, 2, 3.0);
		M mobj = new M(5, 10, 20.5f);
		X xobj = new X(1, 2, 3.0f, 'c');
		
		nobj.display();
		mobj.display();
		xobj.display();
	}
}

class Main {
	public static void main(String args[]) {
		Z zobj = new Z();
		zobj.display_z();
	}
}