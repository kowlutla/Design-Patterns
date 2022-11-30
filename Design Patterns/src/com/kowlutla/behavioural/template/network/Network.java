package com.kowlutla.behavioural.template.network;

// Base social network class
public abstract class Network {

	String username;
	String password;

	public Network() {
	}

	/**
	 * Publish the data to whatever network.
	 */
	public boolean post(String message) {

		// Authenticate before posting. Every network uses a different
		// authentication method.
		if (login(this.username, this.password)) {
			// Send the post data.
			boolean result = sendData(message.getBytes());

			logout();
			return result;
		}
		return false;
	}

	public abstract boolean login(String username, String password);

	public abstract boolean sendData(byte[] data);

	public abstract void logout();

}
