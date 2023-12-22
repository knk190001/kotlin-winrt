package Windows.Data.Xml.Dom

import Windows.Data.Xml.Dom.IXmlNode.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.handleToString
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.interop.makeByReferenceType
import com.github.knk190001.winrtbinding.runtime.interop.makeOutArray
import com.github.knk190001.winrtbinding.runtime.interop.makePrimitiveOutArray
import com.github.knk190001.winrtbinding.runtime.interop.marshalFromNative
import com.github.knk190001.winrtbinding.runtime.interop.marshalToNative
import com.github.knk190001.winrtbinding.runtime.invokeHR
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import com.sun.jna.ptr.PointerByReference
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXmlDocument.ABI::class)
@Signature("{f7f3a506-1e87-42d6-bcfb-b8c809fa5494}")
@Guid("f7f3a5061e8742d6bcfbb8c809fa5494")
@WinRTInterface("f7f3a5061e8742d6bcfbb8c809fa5494")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlDocument.ByReference::class)
public interface IXmlDocument : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_Doctype(): XmlDocumentType?

  @InterfaceMethod(1)
  public fun get_Implementation(): XmlDomImplementation?

  @InterfaceMethod(2)
  public fun get_DocumentElement(): XmlElement?

  @InterfaceMethod(3)
  public fun CreateElement(tagName: String?): XmlElement?

  @InterfaceMethod(4)
  public fun CreateDocumentFragment(): XmlDocumentFragment?

  @InterfaceMethod(5)
  public fun CreateTextNode(`data`: String?): XmlText?

  @InterfaceMethod(6)
  public fun CreateComment(`data`: String?): XmlComment?

  @InterfaceMethod(7)
  public fun CreateProcessingInstruction(target: String?, `data`: String?):
      XmlProcessingInstruction?

  @InterfaceMethod(8)
  public fun CreateAttribute(name: String?): XmlAttribute?

  @InterfaceMethod(9)
  public fun CreateEntityReference(name: String?): XmlEntityReference?

  @InterfaceMethod(10)
  public fun GetElementsByTagName(tagName: String?): XmlNodeList?

  @InterfaceMethod(11)
  public fun CreateCDataSection(`data`: String?): XmlCDataSection?

  @InterfaceMethod(12)
  public fun get_DocumentUri(): String?

  @InterfaceMethod(13)
  public fun CreateAttributeNS(namespaceUri: IUnknown?, qualifiedName: String?): XmlAttribute?

  @InterfaceMethod(14)
  public fun CreateElementNS(namespaceUri: IUnknown?, qualifiedName: String?): XmlElement?

  @InterfaceMethod(15)
  public fun GetElementById(elementId: String?): XmlElement?

  @InterfaceMethod(16)
  public fun ImportNode(node: IXmlNode?, deep: Boolean): IXmlNode?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXmlDocument> {
    public override fun getValue() = ABI.makeIXmlDocument(pointer.getPointer(0))

    public fun setValue(value: IXmlDocument_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlDocument, IXmlNode.WithDefault, IXmlNodeSelector.WithDefault,
      IXmlNodeSerializer.WithDefault {
    public val __869744261_Ptr: Pointer?

    public val _869744261_VtblPtr: Pointer?
      get() = __869744261_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Doctype(): XmlDocumentType? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocumentType>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocumentType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Implementation(): XmlDomImplementation? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDomImplementation>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDomImplementation>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DocumentElement(): XmlElement? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlElement>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateElement(tagName: String?): XmlElement? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlElement>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(tagName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateDocumentFragment(): XmlDocumentFragment? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocumentFragment>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocumentFragment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateTextNode(`data`: String?): XmlText? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlText>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlText>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateComment(`data`: String?): XmlComment? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlComment>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlComment>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateProcessingInstruction(target: String?, `data`: String?):
        XmlProcessingInstruction? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlProcessingInstruction>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(target), marshalToNative(data),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlProcessingInstruction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateAttribute(name: String?): XmlAttribute? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlAttribute>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlAttribute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun CreateEntityReference(name: String?): XmlEntityReference? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlEntityReference>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlEntityReference>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetElementsByTagName(tagName: String?): XmlNodeList? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNodeList>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(tagName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNodeList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun CreateCDataSection(`data`: String?): XmlCDataSection? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlCDataSection>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(data), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlCDataSection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_DocumentUri(): String? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun CreateAttributeNS(namespaceUri: IUnknown?, qualifiedName: String?):
        XmlAttribute? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlAttribute>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(namespaceUri),
          marshalToNative(qualifiedName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlAttribute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun CreateElementNS(namespaceUri: IUnknown?, qualifiedName: String?):
        XmlElement? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlElement>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(namespaceUri),
          marshalToNative(qualifiedName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun GetElementById(elementId: String?): XmlElement? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlElement>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(elementId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun ImportNode(node: IXmlNode?, deep: Boolean): IXmlNode? {
      val fnPtr = _869744261_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__869744261_Ptr, marshalToNative(node), deep, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }
  }

  public class IXmlDocument_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_869744261_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_869744261_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_869744261_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __869744261_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlDocument, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f7f3a5061e8742d6bcfbb8c809fa5494")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlDocument(ptr: Pointer?): WithDefault = IXmlDocument_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlDocument {
      val address = segment.toRawLongValue()
      return makeIXmlDocument(Pointer(address))
    }

    public override fun toNative(obj: IXmlDocument): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__869744261_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlDocument): Array<IXmlDocument?> = (elements as
        Array<IXmlDocument?>).castToImpl<IXmlDocument,IXmlDocument_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlDocument?> =
        arrayOfNulls<IXmlDocument_Impl>(size) as Array<IXmlDocument?>
  }
}
