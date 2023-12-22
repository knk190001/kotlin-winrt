package Windows.Graphics.Printing.OptionDetails

import Windows.Graphics.Printing.IPrintTaskOptionsCore
import Windows.Graphics.Printing.IPrintTaskOptionsCoreUIConfiguration
import Windows.Graphics.Printing.PrintTaskOptions
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
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

@ABIMarker(PrintTaskOptionDetails.ABI::class)
@Signature("rc(Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails;{f5720af1-a89e-42a6-81af-f8e010b38a68})")
@WinRTByReference(brClass = PrintTaskOptionDetails.ByReference::class)
public class PrintTaskOptionDetails(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskOptionDetails.WithDefault, IPrintTaskOptionsCore.WithDefault,
    IPrintTaskOptionsCoreUIConfiguration.WithDefault, IPrintTaskOptionDetails2.WithDefault,
    IWinRTObject {
  private val __1596620408_Interface: IPrintTaskOptionDetails.WithDefault by lazy {
    as_1596620408()
  }


  private val __2092872985_Interface: IPrintTaskOptionsCore.WithDefault by lazy {
    as_2092872985()
  }


  private val __139203835_Interface: IPrintTaskOptionsCoreUIConfiguration.WithDefault by lazy {
    as_139203835()
  }


  private val __2044374854_Interface: IPrintTaskOptionDetails2.WithDefault by lazy {
    as_2044374854()
  }


  public override val __1596620408_Ptr: JNAPointer? by lazy {
    __1596620408_Interface.__1596620408_Ptr
  }


  public override val __2092872985_Ptr: JNAPointer? by lazy {
    __2092872985_Interface.__2092872985_Ptr
  }


  public override val __139203835_Ptr: JNAPointer? by lazy {
    __139203835_Interface.__139203835_Ptr
  }


  public override val __2044374854_Ptr: JNAPointer? by lazy {
    __2044374854_Interface.__2044374854_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1596620408_Interface, __2092872985_Interface, __139203835_Interface,
        __2044374854_Interface)

  private fun as_1596620408(): IPrintTaskOptionDetails.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptionDetails.ABI.makeIPrintTaskOptionDetails(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptionDetails>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptionDetails.ABI.makeIPrintTaskOptionDetails(ref.value))
  }

  private fun as_2092872985(): IPrintTaskOptionsCore.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptionsCore.ABI.makeIPrintTaskOptionsCore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptionsCore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptionsCore.ABI.makeIPrintTaskOptionsCore(ref.value))
  }

  private fun as_139203835(): IPrintTaskOptionsCoreUIConfiguration.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptionsCoreUIConfiguration.ABI.makeIPrintTaskOptionsCoreUIConfiguration(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptionsCoreUIConfiguration>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptionsCoreUIConfiguration.ABI.makeIPrintTaskOptionsCoreUIConfiguration(ref.value))
  }

  private fun as_2044374854(): IPrintTaskOptionDetails2.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptionDetails2.ABI.makeIPrintTaskOptionDetails2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptionDetails2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptionDetails2.ABI.makeIPrintTaskOptionDetails2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskOptionDetails> {
    public override fun getValue() = PrintTaskOptionDetails(pointer.getPointer(0))

    public fun setValue(value: PrintTaskOptionDetails): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskOptionDetails, MemoryAddress> {
    public val IPrintTaskOptionDetailsStatic_Instance: IPrintTaskOptionDetailsStatic by lazy {
      createIPrintTaskOptionDetailsStatic()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrintTaskOptionDetailsStatic(): IPrintTaskOptionDetailsStatic {
      val refiid = Guid.REFIID(IPrintTaskOptionDetailsStatic.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Graphics.Printing.OptionDetails.PrintTaskOptionDetails".toHandle(),refiid,interfacePtr)
      val result =
          IPrintTaskOptionDetailsStatic.ABI.makeIPrintTaskOptionDetailsStatic(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PrintTaskOptionDetails {
      val address = segment.toRawLongValue()
      return PrintTaskOptionDetails(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskOptionDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun GetFromPrintTaskOptions(printTaskOptions: PrintTaskOptions) =
        ABI.IPrintTaskOptionDetailsStatic_Instance.GetFromPrintTaskOptions(printTaskOptions)
  }
}
