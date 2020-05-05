public final class Software extends Product{
    private String programmer;
    private String platform; // linux, mac, or pc
    private String os;

    @Override
    public boolean equals(Object obj) {
        System.out.println("I modified equals() for the Software subclass");
        return super.equals(obj);

    }
    public String getProgrammer() {
        return programmer;
    }

    public void setProgrammer(String programmer) {
        this.programmer = programmer;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}
