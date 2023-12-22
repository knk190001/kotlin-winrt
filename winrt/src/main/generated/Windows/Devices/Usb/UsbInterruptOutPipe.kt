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

@ABIMarker(UsbInterruptOutPipe.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbInterruptOutPipe;{e984c8a9-aaf9-49d0-b96c-f661ab4a7f95})")
@WinRTByReference(brClass = UsbInterruptOutPipe.ByReference::class)
public class UsbInterruptOutPipe(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbInterruptOutPipe.WithDefault, IWinRTObject {
  private val __2078694788_Interface: IUsbInterruptOutPipe.WithDefault by lazy {
    as_2078694788()
  }


  public override val __2078694788_Ptr: JNAPointer? by lazy {
    __2078694788_Interface.__2078694788_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2078694788_Interface)

  private fun as_2078694788(): IUsbInterruptOutPipe.WithDefault {
    if(pointer == NULL) {
      return(IUsbInterruptOutPipe.ABI.makeIUsbInterruptOutPipe(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbInterruptOutPipe>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbInterruptOutPipe.ABI.makeIUsbInterruptOutPipe(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<UsbInterruptOutPipe> {
    public override fun getValue() = UsbInterruptOutPipe(pointer.getPointer(0))

    public fun setValue(value: UsbInterruptOutPipe): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbInterruptOutPipe, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbInterruptOutPipe {
      val address = segment.toRawLongValue()
      return UsbInterruptOutPipe(Pointer(address))
    }

    public override fun toNative(obj: UsbInterruptOutPipe): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
