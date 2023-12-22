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

@ABIMarker(ReceiptPrinterCapabilities.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.ReceiptPrinterCapabilities;{b8f0b58f-51a8-43fc-9bd5-8de272a6415b})")
@WinRTByReference(brClass = ReceiptPrinterCapabilities.ByReference::class)
public class ReceiptPrinterCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IReceiptPrinterCapabilities.WithDefault,
    IReceiptPrinterCapabilities2.WithDefault, ICommonReceiptSlipCapabilities.WithDefault,
    ICommonPosPrintStationCapabilities.WithDefault, IWinRTObject {
  private val __902185463_Interface: IReceiptPrinterCapabilities.WithDefault by lazy {
    as_902185463()
  }


  private val __2097021669_Interface: IReceiptPrinterCapabilities2.WithDefault by lazy {
    as_2097021669()
  }


  private val __2007833020_Interface: ICommonReceiptSlipCapabilities.WithDefault by lazy {
    as_2007833020()
  }


  private val __1582834329_Interface: ICommonPosPrintStationCapabilities.WithDefault by lazy {
    as_1582834329()
  }


  public override val __902185463_Ptr: JNAPointer? by lazy {
    __902185463_Interface.__902185463_Ptr
  }


  public override val __2097021669_Ptr: JNAPointer? by lazy {
    __2097021669_Interface.__2097021669_Ptr
  }


  public override val __2007833020_Ptr: JNAPointer? by lazy {
    __2007833020_Interface.__2007833020_Ptr
  }


  public override val __1582834329_Ptr: JNAPointer? by lazy {
    __1582834329_Interface.__1582834329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__902185463_Interface, __2097021669_Interface, __2007833020_Interface,
        __1582834329_Interface)

  private fun as_902185463(): IReceiptPrinterCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IReceiptPrinterCapabilities.ABI.makeIReceiptPrinterCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReceiptPrinterCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReceiptPrinterCapabilities.ABI.makeIReceiptPrinterCapabilities(ref.value))
  }

  private fun as_2097021669(): IReceiptPrinterCapabilities2.WithDefault {
    if(pointer == NULL) {
      return(IReceiptPrinterCapabilities2.ABI.makeIReceiptPrinterCapabilities2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IReceiptPrinterCapabilities2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IReceiptPrinterCapabilities2.ABI.makeIReceiptPrinterCapabilities2(ref.value))
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
      IByReference<ReceiptPrinterCapabilities> {
    public override fun getValue() = ReceiptPrinterCapabilities(pointer.getPointer(0))

    public fun setValue(value: ReceiptPrinterCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ReceiptPrinterCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): ReceiptPrinterCapabilities {
      val address = segment.toRawLongValue()
      return ReceiptPrinterCapabilities(Pointer(address))
    }

    public override fun toNative(obj: ReceiptPrinterCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
