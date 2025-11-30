package decoratorWithStrategy;

import strategy.*;

public class PaymentSelector {
    public static PaymentStrategy selectPayment(IFurniture furniture) {
        boolean isWooden = false;
        boolean isPainted = false;

        while (furniture instanceof FurnitureDecorator) {
            if (furniture instanceof MaterialDecorator) {
                Material material = ((MaterialDecorator) furniture).getMaterial();
                if (material == Material.WOOD) {
                    isWooden = true;
                }
            }

            if (furniture instanceof PaintDecorator) {
                isPainted = true;
            }

            furniture = ((FurnitureDecorator) furniture).furniture;
        }

        // Decision rules
        if (isWooden && isPainted) {
            return new PayPalPayment();
        }

        //not painted but wooden
        if (isWooden) {
            return new CryptoPayment();
        }

        //all others
        return new CreditCardPayment();
    }
}

