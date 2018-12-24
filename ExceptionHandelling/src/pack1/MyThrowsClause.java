package pack1;

public class MyThrowsClause {
	public static void main(String[] args) {
		MyThrowsClause my=new MyThrowsClause();
		try {
			for(int i=1;i<=5;i++) {
				System.out.println(i);
				my.getJunk();
			}
		}catch(InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

	private void getJunk() throws InterruptedException {
		Thread.sleep(1000);
	}

}
