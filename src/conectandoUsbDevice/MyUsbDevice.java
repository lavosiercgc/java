package conectandoUsbDevice;

import org.usb4java.Device;
import org.usb4java.DeviceDescriptor;
import org.usb4java.DeviceList;
import org.usb4java.LibUsb;
import org.usb4java.LibUsbException;

public class MyUsbDevice{

public Device findDevice(short vendorId, short productId)
{
    // Read the USB device list
    DeviceList list = new DeviceList();
    int result = LibUsb.getDeviceList(null, list);
    if (result < 0) throw new LibUsbException("Unable to get device list", result);

    try
    {
        // Iterate over all devices and scan for the right one
        for (Device device: list)
        {
            DeviceDescriptor descriptor = new DeviceDescriptor();
            result = LibUsb.getDeviceDescriptor(device, descriptor);
            if (result != LibUsb.SUCCESS) throw new LibUsbException("Unable to read device descriptor", result);
           // if (descriptor.idVendor() == vendorId && descriptor.idProduct() == productId) return device;
        }
    }
    finally
    {
        // Ensure the allocated device list is freed
        LibUsb.freeDeviceList(list, false);
        System.out.println(list);
    }

    // Device not found
    return null;
}
}
