import java.text.SimpleDateFormat;
import java.util.Date;
import java.text.ParseException;

public class Tweet {
	private String userID;
	private Date date;
	private String tweet;

	public Tweet(String userID, String dateTime, String tweet) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
		try {
			this.date = sdf.parse(dateTime);
		} catch (ParseException e) {
			System.exit(0);
		}
		this.userID = userID;
		this.tweet = tweet;

	}

	public String getUserID() {
		return userID;
	}
	public Date getDate () {
		return date;
	}
	public String getTweet () {
		return tweet;
	}
	public boolean equals (Object other) {
		Tweet foo = (Tweet)other;
		if(foo.getTweet().equals(this.getTweet())) {
			return true;
		}else {
			return false;
		}
	}
	public String toString() {
		return userID + "\t" + date + "\t" + tweet;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
