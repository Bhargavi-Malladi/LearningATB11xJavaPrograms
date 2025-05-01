package ex_01_Java_Basic;

public enum Lab_057_EnumCont {
    youtube("https://youtube.com"),
    google("https://google.com"),
    facebook("https://facebook.com");

    private String url;

    Lab_057_EnumCont(String url) {
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
