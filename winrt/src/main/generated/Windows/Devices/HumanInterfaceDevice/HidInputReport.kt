package Windows.Devices.HumanInterfaceDevice

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

@ABIMarker(HidInputReport.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidInputReport;{c35d0e50-f7e7-4e8d-b23e-cabbe56b90e9})")
@WinRTByReference(brClass = HidInputReport.ByReference::class)
public class HidInputReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidInputReport.WithDefault, IWinRTObject {
  private val __1640404646_Interface: IHidInputReport.WithDefault by lazy {
    as_1640404646()
  }


  public override val __1640404646_Ptr: JNAPointer? by lazy {
    __1640404646_Interface.__1640404646_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1640404646_Interface)

  private fun as_1640404646(): IHidInputReport.WithDefault {
    if(pointer == NULL) {
      return(IHidInputReport.ABI.makeIHidInputReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidInputReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidInputReport.ABI.makeIHidInputReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<HidInputReport>
      {
    public override fun getValue() = HidInputReport(pointer.getPointer(0))

    public fun setValue(value: HidInputReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidInputReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidInputReport {
      val address = segment.toRawLongValue()
      return HidInputReport(Pointer(address))
    }

    public override fun toNative(obj: HidInputReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
