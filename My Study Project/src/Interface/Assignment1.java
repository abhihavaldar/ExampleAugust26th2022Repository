package Interface;

		interface Tata
		{
			void showCarName(String name);
		}
		interface Maruti
		{
			void displayCarName(String name);
		}
		interface Toyota
		{
			void brandName(String name);
		}
		interface Safari
		{
			void ModelName(String name);
		}
		class Cars implements Tata,Maruti,Toyota,Safari
		{
			public void showCarName(String name)
			{
				System.out.println(" Show Car name  :" +name);
			}
			public void displayCarName(String name)
			{
				System.out.println(" Dislay car name :"  +name);
			}
			public void  brandName(String name) 
			{
				System.out.println("Brand name is :" +name);
			}
			public void ModelName(String name)
			{
				System.out.println("Model name :" +name);
			}
		}


		public class Assignment1 {

			public static void main(String[] args) {
				 Cars o = new  Cars();
				 o.showCarName("PUNCH");
				 o.displayCarName("SWIFT");
				 o.brandName("Fortuner");
				 o.ModelName("GOLD edition");

			}

		}

	
		