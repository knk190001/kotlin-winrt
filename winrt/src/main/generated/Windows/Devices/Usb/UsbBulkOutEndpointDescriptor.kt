package Windows.Devices.Usb

import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(UsbBulkOutEndpointDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbBulkOutEndpointDescriptor;{2820847a-ffee-4f60-9be1-956cac3ecb65})")
@WinRTByReference(brClass = UsbBulkOutEndpointDescriptor.ByReference::class)
public class UsbBulkOutEndpointDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbBulkOutEndpointDescriptor.WithDefault, IWinRTObject {
  private val __1035998205_Interface: IUsbBulkOutEndpointDescriptor.WithDefault by lazy {
    as_1035998205()
  }


  public override val __1035998205_Ptr: JNAPointer? by lazy {
    __1035998205_Interface.__1035998205_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1035998205_Interface)

  private fun as_1035998205(): IUsbBulkOutEndpointDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbBulkOutEndpointDescriptor.ABI.makeIUsbBulkOutEndpointDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbBulkOutEndpointDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbBulkOutEndpointDescriptor.ABI.makeIUsbBulkOutEndpointDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbBulkOutEndpointDescriptor> {
    public override fun getValue() = UsbBulkOutEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbBulkOutEndpointDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbBulkOutEndpointDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbBulkOutEndpointDescriptor {
      val address = segment.toRawLongValue()
      return UsbBulkOutEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbBulkOutEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
