package vho.setsolver;

public class SetCard {
    public enum COLOR {
        BLUE, GREEN, YELLOW;
    }

    public enum SHADING {
        LOWER, UPPER, SYMBOL
    }

    private COLOR color;
    private char symbol;
    private SHADING shading;
    private int number; 

    public SetCard(COLOR color, char symbol, int number) {
        this.color = color;
        int shadingVal = 0;
        switch(symbol) {
            case '@': shadingVal++;
            case 'A': shadingVal++;
            case 'a':
                this.symbol = 'a';
                break;
            case '$': shadingVal++;
            case 'S': shadingVal++;
            case 's':
                this.symbol = 's';
                break;
            case '#': shadingVal++;
            case 'H': shadingVal++;
            case 'h':
                this.symbol = 'h';
                break;
            default:
                throw new IllegalArgumentException("Invalid symbol: " + symbol);
        }
        this.shading = SHADING.values()[shadingVal];
        this.number = number;
    }

    public COLOR getColor() {
        return color;
    }

    public char getSymbol() {
        return symbol;
    }

    public SHADING getShading() {
        return shading;
    }

    public int getNumber() {
        return number;
    }

    public int diff(SetCard other) {
        int diff = 0;
        if (this.color != other.color) {
            diff++;
        }
        if (this.symbol != other.symbol) {
            diff++;
        }
        if (this.shading != other.shading) {
            diff++;
        }
        if (this.number != other.number) {
            diff++;
        }
        return diff;
    }

}
