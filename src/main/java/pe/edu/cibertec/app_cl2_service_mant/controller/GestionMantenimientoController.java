package pe.edu.cibertec.app_cl2_service_mant.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_cl2_service_mant.remoteservices.ServiceCarClient;
import pe.edu.cibertec.app_cl2_service_mant.remoteservices.ServiceUsersClient;

@RequiredArgsConstructor
@RestController
public class GestionMantenimientoController {
    private final ServiceUsersClient serviceUsersClient;
    private final ServiceCarClient serviceCarClient;

    @GetMapping("/mant")
    public String obtenerMant(){
        return "Respuesta del servicio REGISTRAR NUEVO EVENTO DE MANTENIMIENTO";
    }

    @GetMapping("/historial-mant")
    public String HistorialMant(){
        return "Respuesta del servicio OBTENER HISTORIAL DE MANTENIMIENTO";
    }

    @GetMapping("/newuser")
    public String registrarUsuarios(){
        return serviceUsersClient.registrarUsuarios();
    }

    @GetMapping("/obtenerUser")
    public String obtenerUsuarios(){
        return serviceUsersClient.obtenerUsuarios();
    }

    @GetMapping("/newcar")
    public String registrarCarros(){
        return serviceCarClient.registrarCarros();
    }

    @GetMapping("/obtenerCar")
    public String obtenerCarros(){
        return serviceCarClient.obtenerCarros();
    }

}
