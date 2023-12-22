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

@ABIMarker(UsbDeviceDescriptor.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbDeviceDescriptor;{1f48d1f6-ba97-4322-b92c-b5b189216588})")
@WinRTByReference(brClass = UsbDeviceDescriptor.ByReference::class)
public class UsbDeviceDescriptor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbDeviceDescriptor.WithDefault, IWinRTObject {
  private val __29141672_Interface: IUsbDeviceDescriptor.WithDefault by lazy {
    as_29141672()
  }


  public override val __29141672_Ptr: JNAPointer? by lazy {
    __29141672_Interface.__29141672_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__29141672_Interface)

  private fun as_29141672(): IUsbDeviceDescriptor.WithDefault {
    if(pointer == NULL) {
      return(IUsbDeviceDescriptor.ABI.makeIUsbDeviceDescriptor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbDeviceDescriptor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbDeviceDescriptor.ABI.makeIUsbDeviceDescriptor(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbDeviceDescriptor> {
    public override fun getValue() = UsbDeviceDescriptor(pointer.getPointer(0))

    public fun setValue(value: UsbDeviceDescriptor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbDeviceDescriptor, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbDeviceDescriptor {
      val address = segment.toRawLongValue()
      return UsbDeviceDescriptor(Pointer(address))
    }

    public override fun toNative(obj: UsbDeviceDescriptor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
