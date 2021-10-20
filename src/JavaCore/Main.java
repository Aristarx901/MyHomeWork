package JavaCore;

public class Main {
    public static void main(String[] args){
        Nix nixCompetitor = new Nix("Генадий", "Зеленый", 5);
        nixCompetitor.setSwimmingSpeed(1);
        Lox loxCompetitor = new Lox("Борис", "Коричневый", 15);
        loxCompetitor.setSwimmingSpeed(4);
        Wolf wolfCompetitor = new Wolf("Владимир", "Серый", 3);
        wolfCompetitor.setSwimmingSpeed(3);
        Greydwarf greydwarfCompetitor = new Greydwarf("Виталик", "Древесный", 200);
        greydwarfCompetitor.setSwimmingSpeed(2);

        Pool[] pools = {new Pool(15)};
        Road[] roads = {new Road(50)};
        Track[] tracks = {new Track(200)};


        for (Pool pool : pools) {
            System.out.println("Бассейн");
            pool.getTimeToOvercomePool(nixCompetitor);
            pool.getTimeToOvercomePool(loxCompetitor);
            pool.getTimeToOvercomePool(wolfCompetitor);
            pool.getTimeToOvercomePool(greydwarfCompetitor);
        }
        for (Road road : roads) {
            System.out.println("Дорога");
            road.getTimeToOvercomePool(nixCompetitor);
            road.getTimeToOvercomePool(loxCompetitor);
            road.getTimeToOvercomePool(wolfCompetitor);
            road.getTimeToOvercomePool(greydwarfCompetitor);
        }
        for (Track track : tracks) {
            System.out.println("Трасса");
            track.getTimeToOvercomePool(nixCompetitor);
            track.getTimeToOvercomePool(loxCompetitor);
            track.getTimeToOvercomePool(wolfCompetitor);
            track.getTimeToOvercomePool(greydwarfCompetitor);
        }
    }
}
