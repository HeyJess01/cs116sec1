package org.example;

public class AudioRecording extends Recording {
	private final double BITRATE;
	
	AudioRecording(){
		super();
		this.BITRATE = 0.0;
	}
	
		// Parametrized constructor
	AudioRecording(String artist, String recordingName, int durationInSeconds, double bitrate){
		// Check if inputs are legit...
		if (artist != null && recordingName != null && durationInSeconds > 0 && bitrate > 0.0){
			// ...if yes, use them to set instance variables / attributes / fields
			this.artist = artist;
			this.recordingName = recordingName;
			this.durationInSeconds = durationInSeconds;
			this.BITRATE = bitrate;
		} else {
			// ...if no, do what the non-parametrized constructor does
			this.artist = "Unknown";
			this.recordingName = "Unknown";
			this.durationInSeconds = 0;
			this.BITRATE = 0.0;
		}
	}

	public double getBitrate(){
		return this.BITRATE;
	}
	
	@Override
	public String toString(){
		return super.toString() + " [AUDIO | bitrate: " + this.BITRATE + " kbps]";
	}

}