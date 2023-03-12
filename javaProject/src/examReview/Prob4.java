package examReview;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashSet;

public class Prob4 {

	public static void main(String[] args) {
		Product[] prodList = {
				new Product("NT450R5E-K24S",500000,"삼성전자"),
				new Product("15UD340-LX2CK",400000,"LG전자"),
				new Product("G2-K3T32AV",600000,"HP") };
		HashSet<Product> product_hs = makeHashSet(prodList, 500000);
		makeFile(product_hs);
		readFile();
		
	}

	
	private static HashSet<Product> makeHashSet(Product[] prodList, int price) {
		//구현하시오...return값 수정하기 
		// 특정 금액 이상의 상품만 선택하여 HashSet에 저장하여 리턴하는 (50만원 이상)
		
		HashSet<Product> plist = new HashSet<>(); // HashSet<Product>이 리턴 타입이니까 new해서 만들어준 것.
		
		// 여러번 해야 하니까 반복문
		for(Product pro : prodList) {
			if(pro.getPrice() >= price) // 매개값으로 들어오는 price(여기선 50만원)보다 큰 경우에만 넣어줘야 하니까 if문을 쓴다.
			plist.add(pro);
			System.out.println(pro);
		}
		
		return plist;
	}


	private static void makeFile(HashSet<Product> resultList)  {
		//구현하시오.
		try(
				FileOutputStream fos = new FileOutputStream("aa.dat"); // ()안에 싸는 이유가 뭐라고?? 예외 배울 때 했다는데 기억이 안남.
				ObjectOutputStream oos = new ObjectOutputStream(fos);  // => 괄호 안에 싸면 괄호 안에 있는게 다 끝나면 자동으로 닫힌대. (뭐가 자동으로 닫히는..?)
				
				) { 
			for(Product pro : resultList) {
				oos.writeObject(pro);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		 
		
		
	}
	private static void readFile()  {
		//구현하시오.
		System.out.println("---readFile 파트---");
		try(
				FileInputStream fis = new FileInputStream("aa.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);
				) {
			
			while(true) {
				try {
				Object obj = ois.readObject();
				if(obj instanceof Product pro) {
					System.out.println(pro);
				}
				}catch(EOFException e) {
					
				}
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
	}

}


class Product implements Serializable{
	private String model_name;
	private int price;
	private String company;
	
	
	public Product(String model_name, int price, String company) {
		super();
		this.model_name = model_name;
		this.price = price;
		this.company = company;
	}


	public String getModel_name() {
		return model_name;
	}


	public void setModel_name(String model_name) {
		this.model_name = model_name;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getCompany() {
		return company;
	}


	public void setCompany(String company) {
		this.company = company;
	}


	@Override
	public String toString() {
		return "Product [model_name=" + model_name + ", price=" + price
				+ ", company=" + company + "]";
	}
	
	

}