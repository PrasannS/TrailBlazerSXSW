package stringcheesedevs.android.apps.com.trailblazer.GeneratedModel.Buzzangle;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SongStreams {

    @SerializedName("ondemand_audio")
    @Expose
    private OndemandAudio ondemandAudio;
    @SerializedName("ondemand_video")
    @Expose
    private OndemandVideo ondemandVideo;
    @SerializedName("programmed_streams")
    @Expose
    private ProgrammedStreams programmedStreams;

    public OndemandAudio getOndemandAudio() {
        return ondemandAudio;
    }

    public void setOndemandAudio(OndemandAudio ondemandAudio) {
        this.ondemandAudio = ondemandAudio;
    }

    public OndemandVideo getOndemandVideo() {
        return ondemandVideo;
    }

    public void setOndemandVideo(OndemandVideo ondemandVideo) {
        this.ondemandVideo = ondemandVideo;
    }

    public ProgrammedStreams getProgrammedStreams() {
        return programmedStreams;
    }

    public void setProgrammedStreams(ProgrammedStreams programmedStreams) {
        this.programmedStreams = programmedStreams;
    }

}