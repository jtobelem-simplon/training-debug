package debug.films;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MesNotes {
	
	private static List<Integer> notes; // tricky static
	
	public MesNotes() {
	}
	
	public int getNote(int i) {
		return notes.get(i);
	}
	
	@SuppressWarnings("static-access")
	public void readLine(String line) {
		List<Integer> notes = Arrays.asList(line.split(" "))
				.stream()
				.map(Integer::valueOf)
				.collect(Collectors.toList());
		
		this.notes = notes;
	}
	

}
