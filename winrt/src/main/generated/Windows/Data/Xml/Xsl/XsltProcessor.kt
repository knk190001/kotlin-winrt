package Windows.Data.Xml.Xsl

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Data.Xml.Xsl.IXsltProcessorFactory.ABI.IID
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

@ABIMarker(XsltProcessor.ABI::class)
@Signature("rc(Windows.Data.Xml.Xsl.XsltProcessor;{7b64703f-550c-48c6-a90f-93a5b964518f})")
@WinRTByReference(brClass = XsltProcessor.ByReference::class)
public class XsltProcessor(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IXsltProcessor.WithDefault, IXsltProcessor2.WithDefault, IWinRTObject {
  private val __1374457785_Interface: IXsltProcessor.WithDefault by lazy {
    as_1374457785()
  }


  private val __341481675_Interface: IXsltProcessor2.WithDefault by lazy {
    as_341481675()
  }


  public override val __1374457785_Ptr: JNAPointer? by lazy {
    __1374457785_Interface.__1374457785_Ptr
  }


  public override val __341481675_Ptr: JNAPointer? by lazy {
    __341481675_Interface.__341481675_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1374457785_Interface, __341481675_Interface)

  public constructor(document: XmlDocument) : this(ABI.activate(document))

  private fun as_1374457785(): IXsltProcessor.WithDefault {
    if(pointer == NULL) {
      return(IXsltProcessor.ABI.makeIXsltProcessor(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXsltProcessor>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXsltProcessor.ABI.makeIXsltProcessor(ref.value))
  }

  private fun as_341481675(): IXsltProcessor2.WithDefault {
    if(pointer == NULL) {
      return(IXsltProcessor2.ABI.makeIXsltProcessor2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IXsltProcessor2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IXsltProcessor2.ABI.makeIXsltProcessor2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<XsltProcessor>
      {
    public override fun getValue() = XsltProcessor(pointer.getPointer(0))

    public fun setValue(value: XsltProcessor): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<XsltProcessor, MemoryAddress> {
    public val IXsltProcessorFactory_Instance: IXsltProcessorFactory by lazy {
      createIXsltProcessorFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createIXsltProcessorFactory(): IXsltProcessorFactory {
      val refiid = Guid.REFIID(IID)
      val factoryActivatorPtr = PointerByReference()
      val hr =
          INSTANCE.RoGetActivationFactory("Windows.Data.Xml.Xsl.XsltProcessor".toHandle(),refiid,factoryActivatorPtr)
      checkHR(hr)
      return(IXsltProcessorFactory.ABI.makeIXsltProcessorFactory(factoryActivatorPtr.value))
    }

    public fun activate(document: XmlDocument): JNAPointer? =
        IXsltProcessorFactory_Instance.CreateInstance(document)?.pointer

    public override fun fromNative(segment: MemoryAddress): XsltProcessor {
      val address = segment.toRawLongValue()
      return XsltProcessor(Pointer(address))
    }

    public override fun toNative(obj: XsltProcessor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
