package model.vo;

import java.util.Arrays;
import java.util.Date;

// 상영일정 vo
public class H_Schedule {
	private int schedule_UID;	// 상영일정고유번호(PK)
	private Date schedule_date;	// 상영일자
	private String movie_title;	// 영화제목(FK)
	private int[][] seats = new int[4][4];
	
	public H_Schedule() {}
	
	public H_Schedule(int schedule_UID, Date schedule_date, String movie_title) {
		this.schedule_UID = schedule_UID;
		this.schedule_date = schedule_date;
		this.movie_title = movie_title;
	}
	
	public H_Schedule(int schedule_UID, Date schedule_date, String movie_title, int[][] seats) {
		super();
		this.schedule_UID = schedule_UID;
		this.schedule_date = schedule_date;
		this.movie_title = movie_title;
		this.seats = seats;
	}

	public int getSchedule_UID() {
		return schedule_UID;
	}

	public void setSchedule_UID(int schedule_UID) {
		this.schedule_UID = schedule_UID;
	}

	public Date getSchedule_date() {
		return schedule_date;
	}

	public void setSchedule_date(Date schedule_date) {
		this.schedule_date = schedule_date;
	}

	public String getMovie_title() {
		return movie_title;
	}

	public void setMovie_title(String movie_title) {
		this.movie_title = movie_title;
	}

	public int[][] getSeats() {
		return seats;
	}

	public void setSeats(int[][] seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "H_Schedule [schedule_UID=" + schedule_UID + ", schedule_date=" + schedule_date + ", movie_title="
				+ movie_title + ", seats=" + Arrays.toString(seats) + "]";
	}

		
	
}
