package cinemaM;

public class theater {

	public int tid ;
	public String[] showtime;
	public int[] avaliable_seat;
	public String[][] seat;
	
	public theater (int tid) {
		this.tid = tid;
		this.showtime = new String[3];
		this.showtime[0] = "10.30-12.30";
		this.showtime[1] = "12.35-15.30";
		this.showtime[2] = "15.35-18.00";
		this.avaliable_seat = new int[3];
		this.avaliable_seat[0] = 35;
		this.avaliable_seat[1] = 35;
		this.avaliable_seat[2] = 35;
		
		this.seat = new String[3][35];
		for(int i=0;i<3;i++) {
			for(int j=0;j<35;j++) {
				seat[i][j] = "false";
			}
		}
	}
	
	public void booking(int seat_no,int showtime) {
		seat[showtime][seat_no] = "true";
	}
	
	public void cancel(int seat_no,int showtime) {
		seat[showtime][seat_no] = "false";
	}
	
	public int avaliable_seat(int showtime) {
		return this.avaliable_seat(showtime);
	}
	
	public boolean isSeat_Avalible(int showtime,int seat_no) {
		if (seat[showtime][seat_no] == "false") {
			return true;
		}else {
			return false;
		}
	}
	
}
