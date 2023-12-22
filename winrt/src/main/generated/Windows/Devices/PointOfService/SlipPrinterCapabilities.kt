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

@ABIMarker(SlipPrinterCapabilities.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.SlipPrinterCapabilities;{99b16399-488c-4157-8ac2-9f57f708d3db})")
@WinRTByReference(brClass = SlipPrinterCapabilities.ByReference::class)
public class SlipPrinterCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), ISlipPrinterCapabilities.WithDefault, ISlipPrinterCapabilities2.WithDefault,
    ICommonReceiptSlipCapabilities.WithDefault, ICommonPosPrintStationCapabilities.WithDefault,
    IWinRTObject {
  private val __1735159185_Interface: ISlipPrinterCapabilities.WithDefault by lazy {
    as_1735159185()
  }


  private val __2044640063_Interface: ISlipPrinterCapabilities2.WithDefault by lazy {
    as_2044640063()
  }


  private val __2007833020_Interface: ICommonReceiptSlipCapabilities.WithDefault by lazy {
    as_2007833020()
  }


  private val __1582834329_Interface: ICommonPosPrintStationCapabilities.WithDefault by lazy {
    as_1582834329()
  }


  public override val __1735159185_Ptr: JNAPointer? by lazy {
    __1735159185_Interface.__1735159185_Ptr
  }


  public override val __2044640063_Ptr: JNAPointer? by lazy {
    __2044640063_Interface.__2044640063_Ptr
  }


  public override val __2007833020_Ptr: JNAPointer? by lazy {
    __2007833020_Interface.__2007833020_Ptr
  }


  public override val __1582834329_Ptr: JNAPointer? by lazy {
    __1582834329_Interface.__1582834329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1735159185_Interface, __2044640063_Interface, __2007833020_Interface,
        __1582834329_Interface)

  private fun as_1735159185(): ISlipPrinterCapabilities.WithDefault {
    if(pointer == NULL) {
      return(ISlipPrinterCapabilities.ABI.makeISlipPrinterCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISlipPrinterCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISlipPrinterCapabilities.ABI.makeISlipPrinterCapabilities(ref.value))
  }

  private fun as_2044640063(): ISlipPrinterCapabilities2.WithDefault {
    if(pointer == NULL) {
      return(ISlipPrinterCapabilities2.ABI.makeISlipPrinterCapabilities2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ISlipPrinterCapabilities2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ISlipPrinterCapabilities2.ABI.makeISlipPrinterCapabilities2(ref.value))
  }

  private fun as_2007833020(): ICommonReceiptSlipCapabilities.WithDefault {
    if(pointer == NULL) {
      return(ICommonReceiptSlipCapabilities.ABI.makeICommonReceiptSlipCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommonReceiptSlipCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommonReceiptSlipCapabilities.ABI.makeICommonReceiptSlipCapabilities(ref.value))
  }

  private fun as_1582834329(): ICommonPosPrintStationCapabilities.WithDefault {
    if(pointer == NULL) {
      return(ICommonPosPrintStationCapabilities.ABI.makeICommonPosPrintStationCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<ICommonPosPrintStationCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(ICommonPosPrintStationCapabilities.ABI.makeICommonPosPrintStationCapabilities(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<SlipPrinterCapabilities> {
    public override fun getValue() = SlipPrinterCapabilities(pointer.getPointer(0))

    public fun setValue(value: SlipPrinterCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<SlipPrinterCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): SlipPrinterCapabilities {
      val address = segment.toRawLongValue()
      return SlipPrinterCapabilities(Pointer(address))
    }

    public override fun toNative(obj: SlipPrinterCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
