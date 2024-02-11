package metodoFacade;

import viajeYHosperdaje.destinosAutobus;
import viajeYHosperdaje.hotel;

public class facade {
    private destinosAutobus destinoAutobus;
    private hotel hotelDisponible;
    
    public facade(){
        destinoAutobus = new destinosAutobus();
        hotelDisponible = new hotel();
    }
    
    public void buscar(String fechaSalida , String fechaRegreso,String origen,String destino){
        destinoAutobus.buscarDestino(fechaSalida , fechaRegreso , origen , destino);
        hotelDisponible.disponibilidadHotel(fechaRegreso,fechaRegreso, destino);
    }
}
