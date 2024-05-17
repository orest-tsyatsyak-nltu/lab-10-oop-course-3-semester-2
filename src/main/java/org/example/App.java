package org.example;

public class App {

    private abstract static class Building {
        public void build() {
            buildFoundation();
            buildWalls();
            buildRoof();
            customize();
        }

        protected abstract void buildFoundation();
        protected abstract void buildWalls();
        protected abstract void buildRoof();
        // За допомогою цього методу можна опціонально додавати
        // мансарду(
        // перший раз таке слово побачив, це поверх у горішньому просторі, фасад якого повністю
        // або частково утворений поверхнею (поверхнями) похилого або ламаного даху :)
        // ),
        // балкон, гараж чи веранду
        protected void customize() {}
    }

    private static class TwoStoreyHouse extends Building {
        @Override
        protected void buildFoundation() {
            System.out.println("Building foundation for a two-storey house");
        }

        @Override
        protected void buildWalls() {
            System.out.println("Building walls for a two-storey house");
        }

        @Override
        protected void buildRoof() {
            System.out.println("Building roof for a two-storey house");
        }
    }

    private static class TwoStoreyHouseWithBalcony extends Building {
        @Override
        protected void buildFoundation() {
            System.out.println("Building foundation for a two-storey house with a balcony");
        }

        @Override
        protected void buildWalls() {
            System.out.println("Building walls for a two-storey house with a balcony");
        }

        @Override
        protected void buildRoof() {
            System.out.println("Building roof for a two-storey house with a balcony");
        }

        @Override
        protected void customize() {
            System.out.println("Adding an balcony to the house");
        }
    }

    public static void main(String[] args) {
        Building house1 = new TwoStoreyHouse();
        house1.build();

        System.out.println("-------------------");

        Building house2 = new TwoStoreyHouseWithBalcony();
        house2.build();
    }
}
