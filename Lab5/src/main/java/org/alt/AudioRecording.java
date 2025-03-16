package org.alt;

public class AudioRecording extends Recording{
    double bitrate;

    public double getBitrate() {
        return bitrate;
    }

    AudioRecording(String artist, String name, int durationInSeconds, double bitrate) {
        super(artist, name, durationInSeconds);
        if (bitrate > 0 && bitrate <= 1){
            this.bitrate = bitrate;
        }
    }

    @Override
    public String toString() {
        return (super.toString()) + "[AUDIO | bitrate: " + bitrate + " kbps]";
    }
}
