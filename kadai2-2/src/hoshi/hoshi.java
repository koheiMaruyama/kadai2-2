package hoshi;

public class hoshi {
	public static void main (String args[]){
		int i1 = 0;
		int i2 = 0;
		int j = 0;
		int cnt = 0;
		String hoshi = "";

//		jは入力用
		j = 6 ;

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
