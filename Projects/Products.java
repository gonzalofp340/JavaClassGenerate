public class Products {
	private int id;
	private String name;
	private String description;
	private int type_id;
	private boolean active;

	public Products() {
		/* Constructor de la clase Products. */
	}

	public void setId(int id){
		this.id= id;
	}
	public void setName(String name){
		this.name= name;
	}
	public void setDescription(String description){
		this.description= description;
	}
	public void setType_id(int type_id){
		this.type_id= type_id;
	}
	public void setActive(boolean active){
		this.active= active;
	}

	public int getId(){
		return this.id;
	}
	public String getName(){
		return this.name;
	}
	public String getDescription(){
		return this.description;
	}
	public int getType_id(){
		return this.type_id;
	}
	public boolean getActive(){
		return this.active;
	}

}