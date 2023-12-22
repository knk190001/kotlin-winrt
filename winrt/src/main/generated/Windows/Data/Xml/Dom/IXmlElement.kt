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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXmlElement.ABI::class)
@Signature("{2dfb8a1f-6b10-4ef8-9f83-efcce8faec37}")
@Guid("2dfb8a1f6b104ef89f83efcce8faec37")
@WinRTInterface("2dfb8a1f6b104ef89f83efcce8faec37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlElement.ByReference::class)
public interface IXmlElement : NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
    IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_TagName(): String?

  @InterfaceMethod(1)
  public fun GetAttribute(attributeName: String?): String?

  @InterfaceMethod(2)
  public fun SetAttribute(attributeName: String?, attributeValue: String?): Unit

  @InterfaceMethod(3)
  public fun RemoveAttribute(attributeName: String?): Unit

  @InterfaceMethod(4)
  public fun GetAttributeNode(attributeName: String?): XmlAttribute?

  @InterfaceMethod(5)
  public fun SetAttributeNode(newAttribute: XmlAttribute?): XmlAttribute?

  @InterfaceMethod(6)
  public fun RemoveAttributeNode(attributeNode: XmlAttribute?): XmlAttribute?

  @InterfaceMethod(7)
  public fun GetElementsByTagName(tagName: String?): XmlNodeList?

  @InterfaceMethod(8)
  public fun SetAttributeNS(
    namespaceUri: IUnknown?,
    qualifiedName: String?,
    value: String?
  ): Unit

  @InterfaceMethod(9)
  public fun GetAttributeNS(namespaceUri: IUnknown?, localName: String?): String?

  @InterfaceMethod(10)
  public fun RemoveAttributeNS(namespaceUri: IUnknown?, localName: String?): Unit

  @InterfaceMethod(11)
  public fun SetAttributeNodeNS(newAttribute: XmlAttribute?): XmlAttribute?

  @InterfaceMethod(12)
  public fun GetAttributeNodeNS(namespaceUri: IUnknown?, localName: String?): XmlAttribute?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXmlElement> {
    public override fun getValue() = ABI.makeIXmlElement(pointer.getPointer(0))

    public fun setValue(value: IXmlElement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlElement, IXmlNode.WithDefault, IXmlNodeSelector.WithDefault,
      IXmlNodeSerializer.WithDefault {
    public val __56122724_Ptr: Pointer?

    public val _56122724_VtblPtr: Pointer?
      get() = __56122724_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TagName(): String? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetAttribute(attributeName: String?): String? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(attributeName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SetAttribute(attributeName: String?, attributeValue: String?): Unit {
      val fnPtr = _56122724_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(attributeName),
          marshalToNative(attributeValue),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun RemoveAttribute(attributeName: String?): Unit {
      val fnPtr = _56122724_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(attributeName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun GetAttributeNode(attributeName: String?): XmlAttribute? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlAttribute>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(attributeName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlAttribute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SetAttributeNode(newAttribute: XmlAttribute?): XmlAttribute? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlAttribute>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(newAttribute), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlAttribute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun RemoveAttributeNode(attributeNode: XmlAttribute?): XmlAttribute? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlAttribute>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(attributeNode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlAttribute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetElementsByTagName(tagName: String?): XmlNodeList? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNodeList>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(tagName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNodeList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetAttributeNS(
      namespaceUri: IUnknown?,
      qualifiedName: String?,
      value: String?
    ): Unit {
      val fnPtr = _56122724_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(namespaceUri),
          marshalToNative(qualifiedName), marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun GetAttributeNS(namespaceUri: IUnknown?, localName: String?): String? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(namespaceUri),
          marshalToNative(localName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun RemoveAttributeNS(namespaceUri: IUnknown?, localName: String?): Unit {
      val fnPtr = _56122724_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(namespaceUri),
          marshalToNative(localName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun SetAttributeNodeNS(newAttribute: XmlAttribute?): XmlAttribute? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlAttribute>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(newAttribute), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlAttribute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetAttributeNodeNS(namespaceUri: IUnknown?, localName: String?):
        XmlAttribute? {
      val fnPtr = _56122724_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlAttribute>()
      val hr = fn.invokeHR(arrayOf(__56122724_Ptr, marshalToNative(namespaceUri),
          marshalToNative(localName), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlAttribute>(result.getValue())
      return resultValue
    }
  }

  public class IXmlElement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNode, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __306630242_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_56122724_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSelector.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_56122724_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_56122724_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __56122724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlElement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2dfb8a1f6b104ef89f83efcce8faec37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlElement(ptr: Pointer?): WithDefault = IXmlElement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlElement {
      val address = segment.toRawLongValue()
      return makeIXmlElement(Pointer(address))
    }

    public override fun toNative(obj: IXmlElement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__56122724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlElement): Array<IXmlElement?> = (elements as
        Array<IXmlElement?>).castToImpl<IXmlElement,IXmlElement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlElement?> =
        arrayOfNulls<IXmlElement_Impl>(size) as Array<IXmlElement?>
  }
}
