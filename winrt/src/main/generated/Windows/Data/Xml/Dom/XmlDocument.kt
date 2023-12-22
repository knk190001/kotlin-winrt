package Windows.Data.Xml.Dom

import Windows.Foundation.Uri
import Windows.Storage.IStorageFile
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface
import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
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

@ABIMarker(XmlDocument.ABI::class)
@Signature("rc(Windows.Data.Xml.Dom.XmlDocument;{f7f3a506-1e87-42d6-bcfb-b8c809fa5494})")
@WinRTByReference(brClass = XmlDocument.ByReference::class)
public class XmlDocument(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXmlDocument.WithDefault, IXmlNode.WithDefault,
    IXmlNodeSerializer.WithDefault, IXmlNodeSelector.WithDefault, IXmlDocumentIO.WithDefault,
    IXmlDocumentIO2.WithDefault, IWinRTObject {
  private val __869744261_Interface: IXmlDocument.WithDefault by lazy {
    as_869744261()
  }


  private val __306630242_Interface: IXmlNode.WithDefault by lazy {
    as_306630242()
  }


  private val __849932908_Interface: IXmlNodeSerializer.WithDefault by lazy {
    as_849932908()
  }


  private val __1968462751_Interface: IXmlNodeSelector.WithDefault by lazy {
    as_1968462751()
  }


  private val __1694390241_Interface: IXmlDocumentIO.WithDefault by lazy {
    as_1694390241()
  }


  private val __986489969_Interface: IXmlDocumentIO2.WithDefault by lazy {
    as_986489969()
  }


  public override val __869744261_Ptr: JNAPointer? by lazy {
    __869744261_Interface.__869744261_Ptr
  }


  public override val __306630242_Ptr: JNAPointer? by lazy {
    __306630242_Interface.__306630242_Ptr
  }


  public override val __849932908_Ptr: JNAPointer? by lazy {
    __849932908_Interface.__849932908_Ptr
  }


  public override val __1968462751_Ptr: JNAPointer? by lazy {
    __1968462751_Interface.__1968462751_Ptr
  }


  public override val __1694390241_Ptr: JNAPointer? by lazy {
    __1694390241_Interface.__1694390241_Ptr
  }


  public override val __986489969_Ptr: JNAPointer? by lazy {
    __986489969_Interface.__986489969_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__869744261_Interface, __306630242_Interface, __849932908_Interface,
        __1968462751_Interface, __1694390241_Interface, __986489969_Interface)

  public constructor() : this(ABI.activate())

  private fun as_869744261(): IXmlDocument.WithDefault {
    if(pointer == NULL) {
      return(IXmlDocument.ABI.makeIXmlDocument(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlDocument>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlDocument.ABI.makeIXmlDocument(ref.value))
  }

  private fun as_306630242(): IXmlNode.WithDefault {
    if(pointer == NULL) {
      return(IXmlNode.ABI.makeIXmlNode(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlNode>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNode.ABI.makeIXmlNode(ref.value))
  }

  private fun as_849932908(): IXmlNodeSerializer.WithDefault {
    if(pointer == NULL) {
      return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlNodeSerializer>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSerializer.ABI.makeIXmlNodeSerializer(ref.value))
  }

  private fun as_1968462751(): IXmlNodeSelector.WithDefault {
    if(pointer == NULL) {
      return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlNodeSelector>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlNodeSelector.ABI.makeIXmlNodeSelector(ref.value))
  }

  private fun as_1694390241(): IXmlDocumentIO.WithDefault {
    if(pointer == NULL) {
      return(IXmlDocumentIO.ABI.makeIXmlDocumentIO(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlDocumentIO>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlDocumentIO.ABI.makeIXmlDocumentIO(ref.value))
  }

  private fun as_986489969(): IXmlDocumentIO2.WithDefault {
    if(pointer == NULL) {
      return(IXmlDocumentIO2.ABI.makeIXmlDocumentIO2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXmlDocumentIO2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXmlDocumentIO2.ABI.makeIXmlDocumentIO2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XmlDocument> {
    public override fun getValue() = XmlDocument(pointer.getPointer(0))

    public fun setValue(value: XmlDocument): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XmlDocument, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public val IXmlDocumentStatics_Instance: IXmlDocumentStatics by lazy {
      createIXmlDocumentStatics()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr = INSTANCE.RoGetActivationFactory("Windows.Data.Xml.Dom.XmlDocument".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public fun createIXmlDocumentStatics(): IXmlDocumentStatics {
      val refiid = Guid.REFIID(IXmlDocumentStatics.ABI.IID)
      val interfacePtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Xml.Dom.XmlDocument".toHandle(),refiid,interfacePtr)
      val result = IXmlDocumentStatics.ABI.makeIXmlDocumentStatics(interfacePtr.value)
      return result
    }

    public override fun fromNative(segment: MemoryAddress): XmlDocument {
      val address = segment.toRawLongValue()
      return XmlDocument(Pointer(address))
    }

    public override fun toNative(obj: XmlDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }

  public companion object {
    public fun LoadFromUriAsync(uri: Uri) = ABI.IXmlDocumentStatics_Instance.LoadFromUriAsync(uri)

    public fun LoadFromUriAsync(uri: Uri, loadSettings: XmlLoadSettings) =
        ABI.IXmlDocumentStatics_Instance.LoadFromUriAsync(uri, loadSettings)

    public fun LoadFromFileAsync(`file`: IStorageFile) =
        ABI.IXmlDocumentStatics_Instance.LoadFromFileAsync(file)

    public fun LoadFromFileAsync(`file`: IStorageFile, loadSettings: XmlLoadSettings) =
        ABI.IXmlDocumentStatics_Instance.LoadFromFileAsync(file, loadSettings)
  }
}
