package practise;

public class Marksper {
	//method definition
	double tel;
	double hin;
	double eng;
	double mat;
	double sci;
	double soc;
	double perc;
	double marks() {
		double totalmarks=tel+hin+eng+mat+sci+soc;
		double result=totalmarks*perc/600;
		return result;
}
	//method definition

}
