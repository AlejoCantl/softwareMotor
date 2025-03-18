/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SerialCommunication;
import com.panamahitek.ArduinoException;
import com.panamahitek.PanamaHitek_Arduino;
import java.util.logging.Level;
import java.util.logging.Logger;
import jssc.SerialPortEventListener;
import jssc.SerialPortException;
import jssc.SerialPortEvent;
/**
 *
 * @author ALEJO
 */
public class ConnectionSerial implements Provider{
    PanamaHitek_Arduino arduino = new PanamaHitek_Arduino();
    
    
    @Override
    public void Connect(String port, int baudRate, SerialPortEventListener listener) {
        try {
            arduino.arduinoRXTX(port, baudRate, listener); // Configura la conexión serie
            System.out.println("Conexión establecida en " + port + " a " + baudRate + " baudios.");
        } catch (ArduinoException e) {
            System.out.println("Error al conectar: " + e.getMessage());
        }
    }

    @Override
    public String Read() {
    StringBuilder messages = new StringBuilder();
    try {
        while (arduino.isMessageAvailable()) {  // Lee mientras haya mensajes
            String msg = arduino.printMessage();
            if (msg != null && !msg.trim().isEmpty()) {
                messages.append(msg);
            }
        }
    } catch (SerialPortException | ArduinoException ex) {
        System.out.println("Error al leer datos: " + ex.getMessage());
    }
    
    return messages.toString();  // Devuelve todos los mensajes recibidos
}

    @Override
    public void Send(String Data) {
    try {
        arduino.sendData(Data+"\n");
        System.out.println("Datos enviados: " + Data);
    } catch (ArduinoException | SerialPortException ex) {
        Logger.getLogger(ConnectionSerial.class.getName()).log(Level.SEVERE, "❌ Error al enviar datos", ex);
    }
}

    @Override
    public void Disconnect() {
    try {
        arduino.killArduinoConnection();
        System.out.println("Conexión cerrada correctamente.");
    } catch (ArduinoException ex) {
        System.out.println("Error al cerrar la conexión: " + ex.getMessage());
    }
    }
    
}
