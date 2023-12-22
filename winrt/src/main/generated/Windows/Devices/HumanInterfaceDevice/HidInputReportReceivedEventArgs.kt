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

@ABIMarker(HidInputReportReceivedEventArgs.ABI::class)
@Signature("rc(Windows.Devices.HumanInterfaceDevice.HidInputReportReceivedEventArgs;{7059c5cb-59b2-4dc2-985c-0adc6136fa2d})")
@WinRTByReference(brClass = HidInputReportReceivedEventArgs.ByReference::class)
public class HidInputReportReceivedEventArgs(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IHidInputReportReceivedEventArgs.WithDefault, IWinRTObject {
  private val __1228187568_Interface: IHidInputReportReceivedEventArgs.WithDefault by lazy {
    as_1228187568()
  }


  public override val __1228187568_Ptr: JNAPointer? by lazy {
    __1228187568_Interface.__1228187568_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1228187568_Interface)

  private fun as_1228187568(): IHidInputReportReceivedEventArgs.WithDefault {
    if(pointer == NULL) {
      return(IHidInputReportReceivedEventArgs.ABI.makeIHidInputReportReceivedEventArgs(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IHidInputReportReceivedEventArgs>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IHidInputReportReceivedEventArgs.ABI.makeIHidInputReportReceivedEventArgs(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<HidInputReportReceivedEventArgs> {
    public override fun getValue() = HidInputReportReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: HidInputReportReceivedEventArgs): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<HidInputReportReceivedEventArgs, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): HidInputReportReceivedEventArgs {
      val address = segment.toRawLongValue()
      return HidInputReportReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: HidInputReportReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
