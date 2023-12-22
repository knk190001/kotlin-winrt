package Windows.Devices.Printers

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

@ABIMarker(IppPrintDevice.ABI::class)
@Signature("rc(Windows.Devices.Printers.IppPrintDevice;{d748ac56-76f3-5dc6-afd4-c2a8686b9359})")
@WinRTByReference(brClass = IppPrintDevice.ByReference::class)
public class IppPrintDevice(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IIppPrintDevice.WithDefault, IWinRTObject {
  private val __86898062_Interface: IIppPrintDevice.WithDefault by lazy {
    as_86898062()
  }


  public override val __86898062_Ptr: JNAPointer? by lazy {
    __86898062_Interface.__86898062_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__86898062_Interface)

  private fun as_86898062(): IIppPrintDevice.WithDefault {
    if(pointer == NULL) {
      return(IIppPrintDevice.ABI.makeIIppPrintDevice(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IIppPrintDevice>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IIppPrintDevice.ABI.makeIIppPrintDevice(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IppPrintDevice>
      {
    public override fun getValue() = IppPrintDevice(pointer.getPointer(0))

    public fun setValue(value: IppPrintDevice): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<IppPrintDevice, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): IppPrintDevice {
      val address = segment.toRawLongValue()
      return IppPrintDevice(Pointer(address))
    }

    public override fun toNative(obj: IppPrintDevice): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
