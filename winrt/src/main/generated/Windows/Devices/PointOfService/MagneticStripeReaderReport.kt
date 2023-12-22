package Windows.Devices.PointOfService

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

@ABIMarker(MagneticStripeReaderReport.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.MagneticStripeReaderReport;{6a5b6047-99b0-4188-bef1-eddf79f78fe6})")
@WinRTByReference(brClass = MagneticStripeReaderReport.ByReference::class)
public class MagneticStripeReaderReport(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IMagneticStripeReaderReport.WithDefault, IWinRTObject {
  private val __360977479_Interface: IMagneticStripeReaderReport.WithDefault by lazy {
    as_360977479()
  }


  public override val __360977479_Ptr: JNAPointer? by lazy {
    __360977479_Interface.__360977479_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__360977479_Interface)

  private fun as_360977479(): IMagneticStripeReaderReport.WithDefault {
    if(pointer == NULL) {
      return(IMagneticStripeReaderReport.ABI.makeIMagneticStripeReaderReport(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IMagneticStripeReaderReport>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IMagneticStripeReaderReport.ABI.makeIMagneticStripeReaderReport(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<MagneticStripeReaderReport> {
    public override fun getValue() = MagneticStripeReaderReport(pointer.getPointer(0))

    public fun setValue(value: MagneticStripeReaderReport): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<MagneticStripeReaderReport, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): MagneticStripeReaderReport {
      val address = segment.toRawLongValue()
      return MagneticStripeReaderReport(Pointer(address))
    }

    public override fun toNative(obj: MagneticStripeReaderReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
