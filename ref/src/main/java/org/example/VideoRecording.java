package org.example;

public class VideoRecording extends Recording {
	private final double FRAMERATE;
	
	VideoRecording(){
		super();
		this.FRAMERATE = 0.0;
	}
	
		// Parametrized constructor
	VideoRecording(String artist, String recordingName, int durationInSeconds, double framerate){
		// Check if inputs are legit...
		if (artist != null && recordingName != null && durationInSeconds > 0 && framerate > 0.0){
			// ...if yes, use them to set instance variables / attributes / fields
			this.artist = artist;
			this.recordingName = recordingName;
			this.durationInSeconds = durationInSeconds;
			this.FRAMERATE = framerate;
		} else {
			// ...if no, do what the non-parametrized constructor does
			this.artist = "Unknown";
			this.recordingName = "Unknown";
			this.durationInSeconds = 0;
			this.FRAMERATE = 0.0;
		}
	}

	
	public double getFramerate(){
		return this.FRAMERATE;
	}
	
	@Override
	public String toString(){
		return super.toString() + " [VIDEO | framerate: " + this.FRAMERATE + " fps]";
	}

}