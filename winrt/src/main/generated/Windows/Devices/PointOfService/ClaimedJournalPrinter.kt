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

@ABIMarker(ClaimedJournalPrinter.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedJournalPrinter;{67ea0630-517d-487f-9fdf-d2e0a0a264a5})")
@WinRTByReference(brClass = ClaimedJournalPrinter.ByReference::class)
public class ClaimedJournalPrinter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedJournalPrinter.WithDefault,
    ICommonClaimedPosPrinterStation.WithDefault, IWinRTObject {
  private val __1432139297_Interface: IClaimedJournalPrinter.WithDefault by lazy {
    as_1432139297()
  }


  private val __1383195011_Interface: ICommonClaimedPosPrinterStation.WithDefault by lazy {
    as_1383195011()
  }


  public override val __1432139297_Ptr: JNAPointer? by lazy {
    __1432139297_Interface.__1432139297_Ptr
  }


  public override val __1383195011_Ptr: JNAPointer? by lazy {
    __1383195011_Interface.__1383195011_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1432139297_Interface, __1383195011_Interface)

  private fun as_1432139297(): IClaimedJournalPrinter.WithDefault {
    if(pointer == NULL) {
      return(IClaimedJournalPrinter.ABI.makeIClaimedJournalPrinter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedJournalPrinter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedJournalPrinter.ABI.makeIClaimedJournalPrinter(ref.value))
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
      IByReference<ClaimedJournalPrinter> {
    public override fun getValue() = ClaimedJournalPrinter(pointer.getPointer(0))

    public fun setValue(value: ClaimedJournalPrinter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedJournalPrinter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedJournalPrinter {
      val address = segment.toRawLongValue()
      return ClaimedJournalPrinter(Pointer(address))
    }

    public override fun toNative(obj: ClaimedJournalPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
