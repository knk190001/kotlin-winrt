package Windows.UI.Xaml.Printing

import Windows.UI.Xaml.DependencyObject
import Windows.UI.Xaml.Printing.IPrintDocumentFactory.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
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
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PrintDocument.ABI::class)
@Signature("rc(Windows.UI.Xaml.Printing.PrintDocument;{e44327c3-a999-485b-b1d8-72dc517821e6})")
@WinRTByReference(brClass = PrintDocument.ByReference::class)
public open class PrintDocument(
  ptr: JNAPointer? = NULL
) : DependencyObject(ptr), IPrintDocument.WithDefault, IWinRTObject {
  private val __563196565_Interface: IPrintDocument.WithDefault by lazy {
    as_563196565()
  }


  public override val __563196565_Ptr: JNAPointer? by lazy {
    __563196565_Interface.__563196565_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__563196565_Interface)

  public constructor() : this(ABI.activate())

  private fun as_563196565(): IPrintDocument.WithDefault {
    if(pointer == NULL) {
      return(IPrintDocument.ABI.makeIPrintDocument(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPrintDocument>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPrintDocument.ABI.makeIPrintDocument(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PrintDocument>
      {
    public override fun getValue() = PrintDocument(pointer.getPointer(0))

    public fun setValue(value: PrintDocument): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PrintDocument, MemoryAddress> {
    public val IPrintDocumentStatics_Instance: IPrintDocumentStatics by lazy {
      createIPrintDocumentStatics()
    }


    public val IPrintDocumentFactory_Instance: IPrintDocumentFactory by lazy {
      createIPrintDocumentFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPrintDocumentStatics(): IPrintDocumentStatics {
      val refiid = Guid.REFIID(IPrintDocumentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Printing.PrintDocument".toHandle(),refiid,interfacePtr)
      val result = IPrintDocumentStatics.ABI.makeIPrintDocumentStatics(interfacePtr.value)
      return result
    }

    public fun createIPrintDocumentFactory(): IPrintDocumentFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Xaml.Printing.PrintDocument".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IPrintDocumentFactory.ABI.makeIPrintDocumentFactory(factoryActivatorPtr.value))
    }

    public fun activate(): JNAPointer? = IPrintDocumentFactory_Instance.CreateInstance(null,
        null)?.pointer

    public override fun fromNative(segment: MemoryAddress): PrintDocument {
      val address = segment.toRawLongValue()
      return PrintDocument(Pointer(address))
    }

    public override fun toNative(obj: PrintDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun get_DocumentSourceProperty() =
        ABI.IPrintDocumentStatics_Instance.get_DocumentSourceProperty()
  }
}
