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

@ABIMarker(UsbBulkInPipe.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbBulkInPipe;{f01d2d3b-4548-4d50-b326-d82cdabe1220})")
@WinRTByReference(brClass = UsbBulkInPipe.ByReference::class)
public class UsbBulkInPipe(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbBulkInPipe.WithDefault, IWinRTObject {
  private val __1895698088_Interface: IUsbBulkInPipe.WithDefault by lazy {
    as_1895698088()
  }


  public override val __1895698088_Ptr: JNAPointer? by lazy {
    __1895698088_Interface.__1895698088_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1895698088_Interface)

  private fun as_1895698088(): IUsbBulkInPipe.WithDefault {
    if(pointer == NULL) {
      return(IUsbBulkInPipe.ABI.makeIUsbBulkInPipe(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbBulkInPipe>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbBulkInPipe.ABI.makeIUsbBulkInPipe(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UsbBulkInPipe>
      {
    public override fun getValue() = UsbBulkInPipe(pointer.getPointer(0))

    public fun setValue(value: UsbBulkInPipe): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbBulkInPipe, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbBulkInPipe {
      val address = segment.toRawLongValue()
      return UsbBulkInPipe(Pointer(address))
    }

    public override fun toNative(obj: UsbBulkInPipe): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
