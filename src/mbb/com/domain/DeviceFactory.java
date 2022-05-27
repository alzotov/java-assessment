package mbb.com.domain;

//singleton
public class DeviceFactory{
  private DeviceFactory(){}
  private DeviceFactory instanse;
  public DeviceFactory getInstanse(){
    if (instanse==null){
      instanse = new DeviceFactory();
      return instanse;
    }
  };
  public Device getDevice(String deviceType){
    //simplification here to reduce code amount
    Device device = new Device(deviceType){
      public void doDeviceFunction(){
        System.out.println("This is immitattion of unique "+this.deviceType+"'s functionality")
      }
    }
    return device;
  }
    
}
