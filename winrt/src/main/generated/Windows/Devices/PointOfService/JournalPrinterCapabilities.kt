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

@ABIMarker(JournalPrinterCapabilities.ABI::class)
@Signature("rc(Windows.Devices.PointOfService.JournalPrinterCapabilities;{3b5ccc43-e047-4463-bb58-17b5ba1d8056})")
@WinRTByReference(brClass = JournalPrinterCapabilities.ByReference::class)
public class JournalPrinterCapabilities(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IJournalPrinterCapabilities.WithDefault,
    IJournalPrinterCapabilities2.WithDefault, ICommonPosPrintStationCapabilities.WithDefault,
    IWinRTObject {
  private val __1947668120_Interface: IJournalPrinterCapabilities.WithDefault by lazy {
    as_1947668120()
  }


  private val __248169626_Interface: IJournalPrinterCapabilities2.WithDefault by lazy {
    as_248169626()
  }


  private val __1582834329_Interface: ICommonPosPrintStationCapabilities.WithDefault by lazy {
    as_1582834329()
  }


  public override val __1947668120_Ptr: JNAPointer? by lazy {
    __1947668120_Interface.__1947668120_Ptr
  }


  public override val __248169626_Ptr: JNAPointer? by lazy {
    __248169626_Interface.__248169626_Ptr
  }


  public override val __1582834329_Ptr: JNAPointer? by lazy {
    __1582834329_Interface.__1582834329_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1947668120_Interface, __248169626_Interface, __1582834329_Interface)

  private fun as_1947668120(): IJournalPrinterCapabilities.WithDefault {
    if(pointer == NULL) {
      return(IJournalPrinterCapabilities.ABI.makeIJournalPrinterCapabilities(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJournalPrinterCapabilities>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJournalPrinterCapabilities.ABI.makeIJournalPrinterCapabilities(ref.value))
  }

  private fun as_248169626(): IJournalPrinterCapabilities2.WithDefault {
    if(pointer == NULL) {
      return(IJournalPrinterCapabilities2.ABI.makeIJournalPrinterCapabilities2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IJournalPrinterCapabilities2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IJournalPrinterCapabilities2.ABI.makeIJournalPrinterCapabilities2(ref.value))
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
      IByReference<JournalPrinterCapabilities> {
    public override fun getValue() = JournalPrinterCapabilities(pointer.getPointer(0))

    public fun setValue(value: JournalPrinterCapabilities): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<JournalPrinterCapabilities, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): JournalPrinterCapabilities {
      val address = segment.toRawLongValue()
      return JournalPrinterCapabilities(Pointer(address))
    }

    public override fun toNative(obj: JournalPrinterCapabilities): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
