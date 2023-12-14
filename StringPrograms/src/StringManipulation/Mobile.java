package StringManipulation;

public class Mobile {
	
        
	    private String modelName;
	    private int ram;
	    private int Storage;
        private int price;
        
        
	    public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		public int getStorage() {
			return Storage;
		}

		public void setStorage(int storage) {
			Storage = storage;
		}

		public String getModelName() {
	        return modelName;
	    }

	    public void setModelName(String modelName) {
	        this.modelName = modelName;
	    }

	    public int getRam() {
	        return ram;
	    }
	    public void setRam(int ram) {
	        this.ram = ram;
	    }

	    public static void main(String[] args) {
	        Mobile mobile = new Mobile();
	        mobile.setModelName("one plus nord 3 5g");
	        mobile.setRam(8);
	        mobile.setStorage(128);
	        mobile.setPrice(39999);

	        System.out.println( mobile.getModelName());
	        System.out.println( mobile.getRam() );
	        System.out.println(mobile.getStorage());
	    }

		
	}


