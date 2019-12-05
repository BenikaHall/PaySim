package org.paysim.actors;

public class Merchant extends SuperActor {
    private static final String MERCHANT_IDENTIFIER = "M";

    public Merchant(String name) {
        super(MERCHANT_IDENTIFIER + name);
    }

    @Override
    public Type getType() {
        return Type.MERCHANT;
    }
}