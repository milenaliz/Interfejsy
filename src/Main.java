public class Main {

    public static void main(String[] args) {
	TV tv = new TV();
	tv.wlaczUrzadzenia();
	tv.wylaczUrzadzenia();
	Radio radio = new Radio();
	radio.wlaczUrzadzenia();
	radio.wylaczUrzadzenia();
	Kot kot = new Kot();
	kot.dajGlos(5);
	Pies pies = new Pies();
	pies.dajGlos(2);
    }
}
