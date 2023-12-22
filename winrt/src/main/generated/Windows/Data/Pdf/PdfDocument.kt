package Windows.Data.Pdf

import Windows.Storage.IStorageFile
import Windows.Storage.Streams.IRandomAccessStream
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
import kotlin.String
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(PdfDocument.ABI::class)
@Signature("rc(Windows.Data.Pdf.PdfDocument;{ac7ebedd-80fa-4089-846e-81b77ff5a86c})")
@WinRTByReference(brClass = PdfDocument.ByReference::class)
public class PdfDocument(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPdfDocument.WithDefault, IWinRTObject {
  private val __1581191555_Interface: IPdfDocument.WithDefault by lazy {
    as_1581191555()
  }


  public override val __1581191555_Ptr: JNAPointer? by lazy {
    __1581191555_Interface.__1581191555_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1581191555_Interface)

  private fun as_1581191555(): IPdfDocument.WithDefault {
    if(pointer == NULL) {
      return(IPdfDocument.ABI.makeIPdfDocument(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPdfDocument>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPdfDocument.ABI.makeIPdfDocument(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<PdfDocument> {
    public override fun getValue() = PdfDocument(pointer.getPointer(0))

    public fun setValue(value: PdfDocument): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PdfDocument, MemoryAddress> {
    public val IPdfDocumentStatics_Instance: IPdfDocumentStatics by lazy {
      createIPdfDocumentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIPdfDocumentStatics(): IPdfDocumentStatics {
      val refiid = Guid.REFIID(IPdfDocumentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Pdf.PdfDocument".toHandle(),refiid,interfacePtr)
      val result = IPdfDocumentStatics.ABI.makeIPdfDocumentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): PdfDocument {
      val address = segment.toRawLongValue()
      return PdfDocument(Pointer(address))
    }

    public override fun toNative(obj: PdfDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LoadFromFileAsync(`file`: IStorageFile) =
        ABI.IPdfDocumentStatics_Instance.LoadFromFileAsync(file)

    public fun LoadFromFileAsync(`file`: IStorageFile, password: String) =
        ABI.IPdfDocumentStatics_Instance.LoadFromFileAsync(file, password)

    public fun LoadFromStreamAsync(inputStream: IRandomAccessStream) =
        ABI.IPdfDocumentStatics_Instance.LoadFromStreamAsync(inputStream)

    public fun LoadFromStreamAsync(inputStream: IRandomAccessStream, password: String) =
        ABI.IPdfDocumentStatics_Instance.LoadFromStreamAsync(inputStream, password)
  }
}
