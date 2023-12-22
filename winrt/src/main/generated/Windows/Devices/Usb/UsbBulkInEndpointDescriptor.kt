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

@ABIMarker(UsbBulkInEndpointDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbBulkInEndpointDescriptor;{3c6e4846-06cf-42a9-9dc2-971c1b14b6e3})")
@WinRTByReference(brClass = UsbBulkInEndpointDescriptor.ByReference::class)
public class UsbBulkInEndpointDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbBulkInEndpointDescriptor.WithDefault, IWinRTObject {
  private val __302245470_Interface: IUsbBulkInEndpointDescriptor.WithDefault by lazy {
    as_302245470()
  }


  public override val __302245470_Ptr: JNAPointer? by lazy {
    __302245470_Interface.__302245470_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__302245470_Interface)

  private fun as_302245470(): IUsbBulkInEndpointDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbBulkInEndpointDescriptor.ABI.makeIUsbBulkInEndpointDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbBulkInEndpointDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbBulkInEndpointDescriptor.ABI.makeIUsbBulkInEndpointDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbBulkInEndpointDescriptor> {
    public override fun getValue() = UsbBulkInEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbBulkInEndpointDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbBulkInEndpointDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbBulkInEndpointDescriptor {
      val address = segment.toRawLongValue()
      return UsbBulkInEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbBulkInEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
