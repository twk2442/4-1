import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;


public class lotto {
   
    public static void main(String[] args) {
  
    	int numbers [] = new int [6] ;
    	int max =45;
    	int min = 1;
    	
        for(int i=0; i<numbers.length;i++){
        	numbers[i]= (int)(Math.random()*((max-min)+1))+1;
       	
        	for(int j=0; j<i; j++) {  // 중복제거 
        			if(numbers[i] == numbers[j]) {
        				i--; 	// 랜덤숫자 다시 뽑기 
        			}
        	}	
        }
        Arrays.sort(numbers);
        System.out.println("로또 추천 번호(정렬):" + Arrays.toString(numbers));
        
    }
}



//로또 추출 프로그램 
/*문제 1. 숫자 한줄로 안 나오고 1개씩 다른줄로 나옴 
   sol:  println -> printf 함수로 바꿈,   
   1-1   1번해결하자 추가문제 발생  숫자 한줄만들고 공백출력했으나 마지막에  %문자가 출력되는 버그 발생 (vsc 애서만 발생 !!)
   2. 숫자 오름차순으로 정렬 하고 싶음 
   sol: Arrays.sort(배열)	Array 클래스 메소사용 ,Arrays.toString(array)는 배열원소 출력
   3.로또 추첨시 동일숫자 나오는 버그 발견
   sol: for (j; j<i ;J++)문 이용 i-- 로 되돌림  !! j<i 라는 제한을통해 첨부터 끝까지중복원속 검사가능 
     */