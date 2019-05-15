class Stereo implements Audio {
    public void play() {
        System.out.println("ステレオを再生します。");
    }
    public void stop() {
        System.out.println("ステレオを停止します。");
    }
}

class MP3 implements Audio {
    public void play() {
        System.out.println("MP3を再生します。");
    }
    public void stop() {
        System.out.println("MP3を停止します。");
    }
}


class UseAudio {
    public static void main(String[] args) {
        Stereo s = new Stereo();
        s.play();
        s.stop();

        MP3 mp = new MP3();
        mp.play();
        mp.stop();

        Audio a = new Stereo();
        a.play();
        a.stop();
    }
}
