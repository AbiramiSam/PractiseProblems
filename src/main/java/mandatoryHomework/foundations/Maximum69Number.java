/**
 * 
 */
package mandatoryHomework.foundations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

/**
 * @author abiramisa
 *
 */
public class Maximum69Number {
	@Test
	public void test() {
		System.out.println(findMaximum69Number(9669));
	}
	
	@Test
	public void test1() {
		System.out.println(findMaximum69Number(9996));
	}

	
	public int findMaximum69Number(int num) {
		String s=String.valueOf(num);
			int num1=0;
			char swap=0;
			
			char[] ch=s.toCharArray();
			List<Integer> alist=new ArrayList<Integer>();
					for(int i=0;i<ch.length;i++) {
						String sn="";
						swap=ch[i];
						if(ch[i]<'9') {
							ch[i]='9';
							for (Character chr : ch) {
								sn=sn+chr;
							}
							alist.add(Integer.parseInt(sn));
						}
						ch[i]=swap;
					}	
					num1=Collections.max(alist);
					System.out.println(num1);
				System.out.println("List"+alist);
				return num1;
		}

}
