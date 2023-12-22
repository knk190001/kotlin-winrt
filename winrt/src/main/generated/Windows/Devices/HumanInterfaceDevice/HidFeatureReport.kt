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

@ABIMarker(HidFeatureReport.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidFeatureReport;{841d9b79-5ae5-46e3-82ef-1fec5c8942f4})")
@WinRTByReference(brClass = HidFeatureReport.ByReference::class)
public class HidFeatureReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidFeatureReport.WithDefault, IWinRTObject {
  private val __1464957230_Interface: IHidFeatureReport.WithDefault by lazy {
    as_1464957230()
  }


  public override val __1464957230_Ptr: JNAPointer? by lazy {
    __1464957230_Interface.__1464957230_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1464957230_Interface)

  private fun as_1464957230(): IHidFeatureReport.WithDefault {
    if(pointer == NULL) {
      return(IHidFeatureReport.ABI.makeIHidFeatureReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidFeatureReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidFeatureReport.ABI.makeIHidFeatureReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HidFeatureReport> {
    public override fun getValue() = HidFeatureReport(pointer.getPointer(0))

    public fun setValue(value: HidFeatureReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidFeatureReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidFeatureReport {
      val address = segment.toRawLongValue()
      return HidFeatureReport(Pointer(address))
    }

    public override fun toNative(obj: HidFeatureReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
