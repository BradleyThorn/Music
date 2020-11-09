import java.util.*;

public class Playlist implements IComponent {

	public String playlistName;
	public ArrayList<IComponent> playlist = new ArrayList();

	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}

	
	public void play() {
		System.out.println("Now playing playlist " + playlistName);
		for (int x = 0; x < playlist.size(); x++)
		{
			System.out.println((x+1) + ". " + playlist.get(x).getName());
		}
		
	}

	@Override
	public void setPlaybackSpeed(float speed) {
		for (int x = 0; x < playlist.size(); x++){
			playlist.get(x).setPlaybackSpeed(speed);
		}
	}

	@Override
	public String getName() {
		return playlistName;
	}

  // Your code goes here!
	
	public void add(IComponent component)
	{
		playlist.add(component);
	}
	
	public void remove(IComponent component)
	{
		if(!playlist.contains(component))
		{
			System.out.println("That selection is not in the playlist, sorry");
		}
		else
		{
			playlist.remove(component);
		}
	}
}
