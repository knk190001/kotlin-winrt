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

@ABIMarker(UsbBulkOutPipe.ABI::class)
@Signature("rc(Windows.Devices.Usb.UsbBulkOutPipe;{a8e9ee6e-0115-45aa-8b21-37b225bccee7})")
@WinRTByReference(brClass = UsbBulkOutPipe.ByReference::class)
public class UsbBulkOutPipe(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IUsbBulkOutPipe.WithDefault, IWinRTObject {
  private val __99946873_Interface: IUsbBulkOutPipe.WithDefault by lazy {
    as_99946873()
  }


  public override val __99946873_Ptr: JNAPointer? by lazy {
    __99946873_Interface.__99946873_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__99946873_Interface)

  private fun as_99946873(): IUsbBulkOutPipe.WithDefault {
    if(pointer == NULL) {
      return(IUsbBulkOutPipe.ABI.makeIUsbBulkOutPipe(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IUsbBulkOutPipe>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IUsbBulkOutPipe.ABI.makeIUsbBulkOutPipe(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<UsbBulkOutPipe>
      {
    public override fun getValue() = UsbBulkOutPipe(pointer.getPointer(0))

    public fun setValue(value: UsbBulkOutPipe): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<UsbBulkOutPipe, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): UsbBulkOutPipe {
      val address = segment.toRawLongValue()
      return UsbBulkOutPipe(Pointer(address))
    }

    public override fun toNative(obj: UsbBulkOutPipe): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
