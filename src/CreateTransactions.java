import java.io.*;
import java.util.*;
public class CreateTransactions {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number of items:");
		int n=sc.nextInt();
		sc.nextLine();
		System.out.print("enter file name:");
		String fname=sc.nextLine();
		FileWriter fw=new FileWriter(fname);
		Random r=new Random();
		for(int i=0;i<10000;i++) {
			String tr="";
			int noi=r.nextInt(n)+1;
			List<Integer> l=new ArrayList<>();
			for(int j=0;j<noi;j++) {
				int x=r.nextInt(n)+1;
				if(!l.contains(x)) {
					l.add(x);
				}
			}
			Collections.sort(l);
			for(int ix:l) {
				tr+="I"+ix+" ";
			}
			if(i<999)
				fw.write(tr+"\n");
			else 
				fw.write(tr);
		}
		System.out.println("transaction file is created");
		fw.close();
		sc.close();
	}
}
