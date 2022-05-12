package nl.duo.tennis.builder;

public class Pan {

    private String merk;
    private boolean bakPan;

    public Pan() {

    }

    public String getMerk() {
        return merk;
    }

    public boolean isBakPan() {
        return bakPan;
    }

    public Pan(String merk, boolean bakPan) {
        this.merk = merk;
        this.bakPan = bakPan;
    }

    @Override
    public String toString() {
        return "Pan{" +
                "merk='" + merk + '\'' +
                ", bakPan=" + bakPan +
                '}';
    }
}
