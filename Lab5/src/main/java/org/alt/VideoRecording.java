package org.alt;

public class VideoRecording extends Recording{
    double frameRate;

    public double getFrameRate() {
        return this.frameRate;
    }

    public VideoRecording(){
        super(null,null,0);
        frameRate = 60.0;
    }
    public VideoRecording(String artist, String recordingName, int durationInSeconds, double frameRate){
        super(artist,recordingName,durationInSeconds);
        if (frameRate > 0 && frameRate <= 1){
            this.frameRate = frameRate;
        } else {
            this.frameRate = 60.0;
        }
    }

    @Override
    public String toString() {
        return (super.toString() + "[VIDEO | framerate: " + this.frameRate + " fps]");
    }
}
