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

@ABIMarker(ClaimedReceiptPrinter.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ClaimedReceiptPrinter;{9ad27a74-dd61-4ee2-9837-5b5d72d538b9})")
@WinRTByReference(brClass = ClaimedReceiptPrinter.ByReference::class)
public class ClaimedReceiptPrinter(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IClaimedReceiptPrinter.WithDefault,
    ICommonClaimedPosPrinterStation.WithDefault, IWinRTObject {
  private val __2012566462_Interface: IClaimedReceiptPrinter.WithDefault by lazy {
    as_2012566462()
  }


  private val __1383195011_Interface: ICommonClaimedPosPrinterStation.WithDefault by lazy {
    as_1383195011()
  }


  public override val __2012566462_Ptr: JNAPointer? by lazy {
    __2012566462_Interface.__2012566462_Ptr
  }


  public override val __1383195011_Ptr: JNAPointer? by lazy {
    __1383195011_Interface.__1383195011_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2012566462_Interface, __1383195011_Interface)

  private fun as_2012566462(): IClaimedReceiptPrinter.WithDefault {
    if(pointer == NULL) {
      return(IClaimedReceiptPrinter.ABI.makeIClaimedReceiptPrinter(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IClaimedReceiptPrinter>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IClaimedReceiptPrinter.ABI.makeIClaimedReceiptPrinter(ref.value))
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
      IByReference<ClaimedReceiptPrinter> {
    public override fun getValue() = ClaimedReceiptPrinter(pointer.getPointer(0))

    public fun setValue(value: ClaimedReceiptPrinter): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ClaimedReceiptPrinter, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ClaimedReceiptPrinter {
      val address = segment.toRawLongValue()
      return ClaimedReceiptPrinter(Pointer(address))
    }

    public override fun toNative(obj: ClaimedReceiptPrinter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
