package family_move.accordhk.com.familymove.special_activity;

/**
 * Created by Owner on 3/21/2017.
 */

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;

import family_move.accordhk.com.familymove.R;

public class youtube_activity extends YouTubeBaseActivity  {

    private static final int RECOVERY_REQUEST = 1;
    private YouTubePlayerView youTubeView;
    private YouTubePlayer.OnInitializedListener listener;
    String TAG  = "youtube_activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.youtube_player_view);

        youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_player_view);
        listener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                Log.i(TAG, "onInitializationSuccess: ");
//                youTubePlayer.loadVideo("https://www.youtube.com/watch?v=a4NT5iBFuZs");
                youTubePlayer.loadVideo("a4NT5iBFuZs");
            }

            @Override
            public void onInitializationFailure(Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubeView.initialize("AIzaSyD-sIA7u1yIC7Oc43OGBcsi4ft6SXBfi3E",listener);
            }
        });

    }


}