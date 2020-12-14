public class ChairFactory {
    VictorianChair createVictorianChair(){
        return new VictorianChair(10);
    };
    MagicChair createMagicChair(){
        return new MagicChair();
    };
    FunctionalChair createFunctionalChair(){
        return new FunctionalChair();
    };
}
