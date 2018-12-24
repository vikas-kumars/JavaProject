package pack1;

import java.net.MalformedURLException;
import java.net.URL;

public class MyMultipleCatchBlocks {

	public static void main(String[] args) {
		MyMultipleCatchBlocks my=new MyMultipleCatchBlocks();
		my.execute(1);
		my.execute(2);
	}

	private void execute(int i) {
		try {
			if(i==1) {
				getIntValue("7u");
			}else {
				getUrlObj("www.junksite.com");
			}
		}catch (MalformedURLException mue){
            System.out.println("Inside MalformedURLException... "+mue.getMessage());
        }catch (NumberFormatException nfe){
            System.out.println("Inside NumberFormatException... "+nfe.getMessage());
        } catch (Exception ex){
            System.out.println("Inside Exception... "+ex.getMessage());
        }
		
	}

	private URL getUrlObj(String urlStr) throws MalformedURLException {
		return new URL(urlStr);
	}

	private int getIntValue(String num) {
		return Integer.parseInt(num);
	}

}
