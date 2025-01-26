package dec_13_24;

interface MediaPlayer 
{
	public void play();
	public void stop();

}
//BLC interface of MediaPlayerSystem -> AdvancedmediaPlayer.java
 interface AdvancedmediaPlayer extends MediaPlayer 
{	
	public void pause();
}
class MusicPlayer implements AdvancedmediaPlayer 
{
	String title;
	
	public MusicPlayer(String title) {
		if(title.equals("") || title.equals(" ")) {
			System.err.println("Error: Title is not be empty string.");
			System.exit(0);
		}else {
			this.title = title;
		}
	}
	
	@Override
	public void play() {
		System.out.println("Playing Music: "+title);
	}

	@Override
	public void stop() {
		System.out.println("Stopping Music: "+title);
	}

	@Override
	public void pause() {
		System.out.println("Pausing Music: "+title);
	}

}
class VideoPlayer implements AdvancedmediaPlayer  
{
	String title;
	
	public VideoPlayer(String title) {
		if(title.equals("") || title.equals(" ")) {
			System.err.println("Error: Title is not be empty string.");
			System.exit(0);
		}else {
			this.title = title;
		}
	}
	
	@Override
	public void play() {
		System.out.println("Playing Video: "+title);
	}

	@Override
	public void stop() {
		System.out.println("Stopping Video: "+title);
	}

	@Override
	public void pause() {
		System.out.println("Pausing Video: "+title);
	}
}
public class MediaPlayerSystem 
{

	public static void main(String[] args) 
	{
		MusicPlayer music = new MusicPlayer("Life");
		music.play();
		music.pause();
		music.stop();
		
		System.out.println();
		
		VideoPlayer video = new VideoPlayer("Movie");
		video.play();
		video.pause();
		video.stop();
	}

}

/*
Song is Playing....
Playing song is Paused..
Playing song is Stopped..

Video is Playing....
Playing Video is Paused..
Playing Video is Stopped..
*/

/*
Playing Music: Life
Pausing Music: Life
Stopping Music: Life

Error: Title is not be empty string.
*/
