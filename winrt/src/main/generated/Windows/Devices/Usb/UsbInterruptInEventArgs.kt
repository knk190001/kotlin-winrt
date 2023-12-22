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

@ABIMarker(UsbInterruptInEventArgs.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbInterruptInEventArgs;{b7b04092-1418-4936-8209-299cf5605583})")
@WinRTByReference(brClass = UsbInterruptInEventArgs.ByReference::class)
public class UsbInterruptInEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbInterruptInEventArgs.WithDefault, IWinRTObject {
  private val __222688430_Interface: IUsbInterruptInEventArgs.WithDefault by lazy {
    as_222688430()
  }


  public override val __222688430_Ptr: JNAPointer? by lazy {
    __222688430_Interface.__222688430_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__222688430_Interface)

  private fun as_222688430(): IUsbInterruptInEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IUsbInterruptInEventArgs.ABI.makeIUsbInterruptInEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbInterruptInEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbInterruptInEventArgs.ABI.makeIUsbInterruptInEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbInterruptInEventArgs> {
    public override fun getValue() = UsbInterruptInEventArgs(pointer.getPointer(0))

    public fun setValue(value: UsbInterruptInEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbInterruptInEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbInterruptInEventArgs {
      val address = segment.toRawLongValue()
      return UsbInterruptInEventArgs(Pointer(address))
    }

    public override fun toNative(obj: UsbInterruptInEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
