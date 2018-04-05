
public class Bookstyle extends Book{
	private String style;
	
	public Bookstyle(){
		super();
	}
	public Bookstyle(String string, String string2, int i, int j, String string3) {
		
	}
	public String getStyle(){
		return style;
	}
	@Override
	public String toString(){
		return super.toString()+"style: "+style;
	}

}
