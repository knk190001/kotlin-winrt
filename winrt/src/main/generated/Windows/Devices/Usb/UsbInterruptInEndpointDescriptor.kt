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

@ABIMarker(UsbInterruptInEndpointDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbInterruptInEndpointDescriptor;{c0528967-c911-4c3a-86b2-419c2da89039})")
@WinRTByReference(brClass = UsbInterruptInEndpointDescriptor.ByReference::class)
public class UsbInterruptInEndpointDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbInterruptInEndpointDescriptor.WithDefault, IWinRTObject {
  private val __200411273_Interface: IUsbInterruptInEndpointDescriptor.WithDefault by lazy {
    as_200411273()
  }


  public override val __200411273_Ptr: JNAPointer? by lazy {
    __200411273_Interface.__200411273_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__200411273_Interface)

  private fun as_200411273(): IUsbInterruptInEndpointDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbInterruptInEndpointDescriptor.ABI.makeIUsbInterruptInEndpointDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbInterruptInEndpointDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbInterruptInEndpointDescriptor.ABI.makeIUsbInterruptInEndpointDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbInterruptInEndpointDescriptor> {
    public override fun getValue() = UsbInterruptInEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbInterruptInEndpointDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbInterruptInEndpointDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbInterruptInEndpointDescriptor {
      val address = segment.toRawLongValue()
      return UsbInterruptInEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbInterruptInEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
