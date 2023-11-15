package MoneyExchange;

class Riels {
    private double amount;

    public Riels(double amount) {
        this.amount = amount;
    }

    public double toDollar() {
        return amount / 4000.0;
    }

    public double toThaiBaht() {
        return amount / 30.0;
    }
}

class Dollars {
    private double amount;

    public Dollars(double amount) {
        this.amount = amount;
    }

    public double toRiels() {
        return amount * 4000.0;
    }

    public double toThaiBaht() {
        return amount * 30.0;
    }
}

class ThaiBaht {
    private double amount;

    public ThaiBaht(double amount) {
        this.amount = amount;
    }

    public double toRiels() {
        return amount * 30.0;
    }
}



