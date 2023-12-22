package Windows.Graphics.Printing

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

@ABIMarker(PrintTaskOptions.ABI::class)
@Signature("rc(Windows.Graphics.Printing.PrintTaskOptions;{1bdbb474-4ed1-41eb-be3c-72d18ed67337})")
@WinRTByReference(brClass = PrintTaskOptions.ByReference::class)
public class PrintTaskOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPrintTaskOptionsCore.WithDefault,
    IPrintTaskOptionsCoreProperties.WithDefault, IPrintTaskOptionsCoreUIConfiguration.WithDefault,
    IPrintTaskOptions.WithDefault, IPrintTaskOptions2.WithDefault, IWinRTObject {
  private val __2092872985_Interface: IPrintTaskOptionsCore.WithDefault by lazy {
    as_2092872985()
  }


  private val __609648774_Interface: IPrintTaskOptionsCoreProperties.WithDefault by lazy {
    as_609648774()
  }


  private val __139203835_Interface: IPrintTaskOptionsCoreUIConfiguration.WithDefault by lazy {
    as_139203835()
  }


  private val __253560024_Interface: IPrintTaskOptions.WithDefault by lazy {
    as_253560024()
  }


  private val __729573898_Interface: IPrintTaskOptions2.WithDefault by lazy {
    as_729573898()
  }


  public override val __2092872985_Ptr: JNAPointer? by lazy {
    __2092872985_Interface.__2092872985_Ptr
  }


  public override val __609648774_Ptr: JNAPointer? by lazy {
    __609648774_Interface.__609648774_Ptr
  }


  public override val __139203835_Ptr: JNAPointer? by lazy {
    __139203835_Interface.__139203835_Ptr
  }


  public override val __253560024_Ptr: JNAPointer? by lazy {
    __253560024_Interface.__253560024_Ptr
  }


  public override val __729573898_Ptr: JNAPointer? by lazy {
    __729573898_Interface.__729573898_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__2092872985_Interface, __609648774_Interface, __139203835_Interface,
        __253560024_Interface, __729573898_Interface)

  private fun as_2092872985(): IPrintTaskOptionsCore.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptionsCore.ABI.makeIPrintTaskOptionsCore(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptionsCore>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptionsCore.ABI.makeIPrintTaskOptionsCore(ref.value))
  }

  private fun as_609648774(): IPrintTaskOptionsCoreProperties.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptionsCoreProperties.ABI.makeIPrintTaskOptionsCoreProperties(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptionsCoreProperties>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptionsCoreProperties.ABI.makeIPrintTaskOptionsCoreProperties(ref.value))
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

  private fun as_253560024(): IPrintTaskOptions.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptions.ABI.makeIPrintTaskOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptions.ABI.makeIPrintTaskOptions(ref.value))
  }

  private fun as_729573898(): IPrintTaskOptions2.WithDefault {
    if(pointer == NULL) {
      return(IPrintTaskOptions2.ABI.makeIPrintTaskOptions2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintTaskOptions2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintTaskOptions2.ABI.makeIPrintTaskOptions2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PrintTaskOptions> {
    public override fun getValue() = PrintTaskOptions(pointer.getPointer(0))

    public fun setValue(value: PrintTaskOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintTaskOptions, MemoryAddress> {
    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public override fun fromNative(segment: MemoryAddress): PrintTaskOptions {
      val address = segment.toRawLongValue()
      return PrintTaskOptions(Pointer(address))
    }

    public override fun toNative(obj: PrintTaskOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
