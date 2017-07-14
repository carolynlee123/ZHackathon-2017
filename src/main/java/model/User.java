package model;

public class User {
	
	private String id;
	private String paypalAuthToken;
	private String slackId;

	public String getPaypalAuthToken() {
		return paypalAuthToken;
	}
	public void setPaypalAuthToken(String paypalAuthToken) {
		this.paypalAuthToken = paypalAuthToken;
	}
	public String getSlackId() {
		return slackId;
	}
	public void setSlackId(String slackId) {
		this.slackId = slackId;
	}
	
}
