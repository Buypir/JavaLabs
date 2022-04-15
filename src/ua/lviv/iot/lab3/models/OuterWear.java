package ua.lviv.iot.lab3.models;

    public class OuterWear extends SportWear {
        private String sizeInLetters;
        private boolean isHasHood;
        private String season;

        public OuterWear(String name, int quantity, String origin, String color, double priceInUah, String sex,
                         String material, boolean isAdult, String brand, float percentageOfCotton, String sizeInLetters,
                         boolean isHasHood, String season) {
            super(name, quantity, origin, color, priceInUah, sex, material, isAdult, brand, percentageOfCotton);
            this.sizeInLetters = sizeInLetters;
            this.isHasHood = isHasHood;
            this.season = season;
        }

        public String getSizeInLetters() {
            return sizeInLetters;
        }

        public void setSizeInLetters(String sizeInLetters) {
            this.sizeInLetters = sizeInLetters;
        }

        public boolean isHasHood() {
            return isHasHood;
        }

        public void setHasHood(boolean hasHood) {
            isHasHood = hasHood;
        }

        public String getSeason() {
            return season;
        }

        public void setSeason(String season) {
            this.season = season;
        }
        @Override
        public String toString() {
            return  "[" +super.toString() +
                    "sizeInLetters:" + sizeInLetters +
                    ", isHasHood:" + isHasHood +
                    ", season:" + season + "";


        }
    }
