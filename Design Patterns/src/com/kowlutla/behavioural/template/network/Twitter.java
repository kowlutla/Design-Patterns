package com.kowlutla.behavioural.template.network;

//Twitter.java: Concrete social network
public class Twitter extends Network {

	public Twitter(String username, String password) {
		this.username = username;
		this.password = password;
	}

	@Override
	public boolean login(String username, String password) {

		System.out.println("\nChecking user's credentials");
		System.out.println("Username: " + username);
		System.out.print("Password: ");
		for (int i = 0; i < password.length(); i++) {
			System.out.print("*");
		}
		System.out.println();
		simulateNetworkLatency();
		System.out.println("Login Success to Twitter");
		return true;
	}

	@Override
	public boolean sendData(byte[] data) {

		System.out.println("Message: " + new String(data) + " was posted on Twitter");
		return true;
	}

	@Override
	public void logout() {
		System.out.println("User " + username + " logged out from Twitter");
	}

	private void simulateNetworkLatency() {
		try {
			int i = 0;
			System.out.println();
			while (i < 10) {
				System.out.print(".");
				Thread.sleep(500);
				i++;
			}
			System.out.println();
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}

}
