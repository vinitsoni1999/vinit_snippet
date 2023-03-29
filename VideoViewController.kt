VideoView videoView = findViewById(R.id.video_view);
MediaController mediaController = new MediaController(this);
mediaController.setAnchorView(videoView);
videoView.setMediaController(mediaController);
videoView.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.video_file));
