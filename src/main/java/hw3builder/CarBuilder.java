package hw3builder;

import hw3builder.Picture;

import java.util.List;

class Main3 {
    public static void main(String[] args) {

        // создание без сетеров и в любой последовательности
        // через методы внутреннего класса
        Exterior exterior = new Exterior.Builder()
                .setChromMoldings(true)
                .setId(1l)
                .setColor("Blue")
                .setWheelSize(18l)
                .setWheelDesign("Bright")
                .setGrillDesign("Luxury")
                .build();
        System.out.println(exterior.getColor());
        System.out.println(exterior.getGrillDesign());
        System.out.println(exterior.getWheelDesign());

    }
}

class Exterior {

    private final Long id;
    private final String color;
    private final boolean chromMoldings;
    private final boolean tintedWindows;
    private final String wheelDesign;
    private final Long wheelSize;
    private final String grillDesign;
    private final List<Picture> picturelist;

    public List<Picture> getPicturelist() {
        return picturelist;
    }

    public Long getId() {
        return id;
    }

    public String getColor() {
        return color;
    }

    public boolean isChromMoldings() {
        return chromMoldings;
    }

    public boolean isTintedWindows() {
        return tintedWindows;
    }

    public String getWheelDesign() {
        return wheelDesign;
    }

    public Long getWheelSize() {
        return wheelSize;
    }

    public String getGrillDesign() {
        return grillDesign;
    }

    public Exterior(
            Long id,
            String color,
            boolean chromMoldings,
            boolean tintedWindows,
            String wheelDesign,
            Long wheellSize,
            String grillDesign,
            List<Picture> picturelist) {

        this.id = id;
        this.color = color;
        this.chromMoldings = chromMoldings;
        this.tintedWindows = tintedWindows;
        this.wheelDesign = wheelDesign;
        this.wheelSize = wheellSize;
        this.grillDesign = grillDesign;
        this.picturelist = picturelist;
    }


    public static class Builder {
        private Long id;
        private String color;
        private boolean chromMoldings;
        private boolean tintedWindows;
        private String wheelDesign;
        private Long wheelSize;
        private String grillDesign;
        private List<Picture> picturelist;

        public Builder setId(Long id) {
            this.id = id;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setChromMoldings(boolean chromMoldings) {
            this.chromMoldings = chromMoldings;
            return this;
        }

        public Builder setTintedWindows(boolean tintedWindows) {
            this.tintedWindows = tintedWindows;
            return this;
        }

        public Builder setWheelDesign(String wheelDesign) {
            this.wheelDesign = wheelDesign;
            return this;
        }

        public Builder setWheelSize(Long wheelSize) {
            this.wheelSize = wheelSize;
            return this;
        }

        public Builder setGrillDesign(String grillDesign) {
            this.grillDesign = grillDesign;
            return this;
        }

        public Builder setPicturelist(List<Picture> picturelist) {
            this.picturelist = picturelist;
            return this;
        }

        public Exterior build() {
            return new Exterior(id,
                    color,
                    chromMoldings,
                    tintedWindows,
                    wheelDesign,
                    wheelSize,
                    grillDesign,
                    picturelist
            );
        }
    }
}