package cinemaM;

public class main {
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		flims[] flims = new flims[3];
		theater[] theater = new theater[2];
		
		flims[0] = new flims();
		flims[0].flimID = 0;
		flims[0].Name = "Avenger Infinity War";
		flims[0].Director = "Rouso";
		flims[1] = new flims();
		flims[1].flimID = 1;
		flims[1].Name = "Deadpool";
		flims[1].Director = "test";
		theater[0] = new theater(1);
		theater[1] = new theater(2);
		movielist_ui ui = new movielist_ui(flims,theater);
		ui.setVisible(true);

	}
	
	
}
