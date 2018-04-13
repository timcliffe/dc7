package org.launchcode.models;

import javax.persistence.Entity;

@Entity
public class Resource {

    private int id;

    private String name;

    private int quantity;

    public Resource(int id, String name, int quantity) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public class Oil extends Resource {
        private int productionBonus = 200;
        private String type = "Strategic";

        public Oil(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }

    }

    public class Iron extends Resource {
        private int productionBonus = 150;
        private String type = "Strategic";

        public Iron(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

    public class Coal extends Resource {
        private int productionBonus = 150;
        private String type = "Strategic";

        public Coal(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

    public class Aluminum extends Resource {
        private int productionBonus = 125;
        private String type = "Strategic";

        public Aluminum(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

    public class Timber extends Resource {
        private int productionBonus = 100;
        private String type = "Strategic";

        public Timber(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

    public class Helium extends Resource {
        private int productionBonus = 125;
        private String type = "Commercial";

        public Helium(int id, String name, int quantity, int productionBonus) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
        }
    }

    public class Opium extends Resource {
        private int productionBonus = 75;
        private String type = "Commercial";

        public Opium(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

    public class luxuryMinerals extends Resource {
        private int productionBonus = 75;
        private String type = "Commercial";

        public luxuryMinerals(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

    public class cashCrops extends Resource {
        private int productionBonus = 75;
        private String type = "Commercial";

        public cashCrops(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

    public class Food extends Resource {
        private int productionBonus = 50;
        private String type = "Commercial";

        public Food(int id, String name, int quantity, int productionBonus, String type) {
            super(id, name, quantity);
            this.productionBonus = productionBonus;
            this.type = type;
        }
    }

}
