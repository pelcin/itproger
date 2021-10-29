class Airplane {

    private String model;
    private int range, age;
    private float speed;

    class Wing {
        private float weight;

        public void setWeight (float weight) {
            this.weight = weight;
        }

        public void getWeight () {
            System.out.print("Вес крыла - " + this.weight);
        }
    }

    Wing wing = new Wing();
}
