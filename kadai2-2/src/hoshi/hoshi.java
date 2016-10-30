package hoshi;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class hoshi {
	public static void main (String args[]){
		int i1 = 0;
		int i2 = 0;
		int j = 0;
		int cnt = 0;
		String hoshi = "";
		boolean err = false;
		String chk = "";

		System.out.print("表示する行数を入力してください：");

		while (err == false){
			try{
				InputStreamReader isr = new InputStreamReader(System.in);
				BufferedReader br = new BufferedReader(isr);
				chk = br.readLine();

                //jは入力用
				j = Integer.parseInt(chk) ;
				err = true;

			}catch(Exception e){
				err = false;
				System.out.println("数値を入力してください");
				System.out.print("表示する行数を入力してください：");
			}
		}
		for(; i1 <= j -1 ;){

			for(; i2 < j * 2 -1 -i1;){

				if(cnt >= i1){
					hoshi = hoshi + "☆";
				}
				else{
					hoshi = hoshi + "　";
				}

				cnt++;
				i2++;
			}

			System.out.println(hoshi);
			i2 = 0;
			hoshi = "";
			cnt = 0 ;
			i1++;
		}

	}




}
