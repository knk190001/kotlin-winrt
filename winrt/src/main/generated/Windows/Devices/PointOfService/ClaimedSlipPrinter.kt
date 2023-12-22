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

@ABIMarker(ClaimedSlipPrinter.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedSlipPrinter;{bd5deff2-af90-4e8a-b77b-e3ae9ca63a7f})")
@WinRTByReference(brClass = ClaimedSlipPrinter.ByReference::class)
public class ClaimedSlipPrinter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedSlipPrinter.WithDefault, ICommonClaimedPosPrinterStation.WithDefault,
    IWinRTObject {
  private val __1154729154_Interface: IClaimedSlipPrinter.WithDefault by lazy {
    as_1154729154()
  }


  private val __1383195011_Interface: ICommonClaimedPosPrinterStation.WithDefault by lazy {
    as_1383195011()
  }


  public override val __1154729154_Ptr: JNAPointer? by lazy {
    __1154729154_Interface.__1154729154_Ptr
  }


  public override val __1383195011_Ptr: JNAPointer? by lazy {
    __1383195011_Interface.__1383195011_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1154729154_Interface, __1383195011_Interface)

  private fun as_1154729154(): IClaimedSlipPrinter.WithDefault {
    if(pointer == NULL) {
      return(IClaimedSlipPrinter.ABI.makeIClaimedSlipPrinter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedSlipPrinter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedSlipPrinter.ABI.makeIClaimedSlipPrinter(ref.value))
  }

  private fun as_1383195011(): ICommonClaimedPosPrinterStation.WithDefault {
    if(pointer == NULL) {
      return(ICommonClaimedPosPrinterStation.ABI.makeICommonClaimedPosPrinterStation(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommonClaimedPosPrinterStation>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommonClaimedPosPrinterStation.ABI.makeICommonClaimedPosPrinterStation(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ClaimedSlipPrinter> {
    public override fun getValue() = ClaimedSlipPrinter(pointer.getPointer(0))

    public fun setValue(value: ClaimedSlipPrinter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedSlipPrinter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedSlipPrinter {
      val address = segment.toRawLongValue()
      return ClaimedSlipPrinter(Pointer(address))
    }

    public override fun toNative(obj: ClaimedSlipPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
