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

@ABIMarker(UsbInterruptOutEndpointDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbInterruptOutEndpointDescriptor;{cc9fed81-10ca-4533-952d-9e278341e80f})")
@WinRTByReference(brClass = UsbInterruptOutEndpointDescriptor.ByReference::class)
public class UsbInterruptOutEndpointDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbInterruptOutEndpointDescriptor.WithDefault, IWinRTObject {
  private val __2120861902_Interface: IUsbInterruptOutEndpointDescriptor.WithDefault by lazy {
    as_2120861902()
  }


  public override val __2120861902_Ptr: JNAPointer? by lazy {
    __2120861902_Interface.__2120861902_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2120861902_Interface)

  private fun as_2120861902(): IUsbInterruptOutEndpointDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbInterruptOutEndpointDescriptor.ABI.makeIUsbInterruptOutEndpointDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbInterruptOutEndpointDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbInterruptOutEndpointDescriptor.ABI.makeIUsbInterruptOutEndpointDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbInterruptOutEndpointDescriptor> {
    public override fun getValue() = UsbInterruptOutEndpointDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbInterruptOutEndpointDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbInterruptOutEndpointDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbInterruptOutEndpointDescriptor {
      val address = segment.toRawLongValue()
      return UsbInterruptOutEndpointDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbInterruptOutEndpointDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
