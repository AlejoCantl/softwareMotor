/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package SerialCommunication;

import jssc.SerialPortEventListener;

/**
 *
 * @author ALEJO
 */
public interface Provider {
        void Connect(String port, int baudRate, SerialPortEventListener listener);
        String Read();
        void Send(String data);
        void Disconnect();
}
