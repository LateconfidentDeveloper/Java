public class Song {
    public Song(String name) {
    }

    public void setNextSong(Song nextSong) {
    }

    public boolean isRepeatingPlaylist() {
        throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        Song first = new Song("Hello");
        Song second = new Song("Eye of the tiger");

        first.setNextSong(second);
        second.setNextSong(first);

        System.out.println(first.isRepeatingPlaylist());
    }
}