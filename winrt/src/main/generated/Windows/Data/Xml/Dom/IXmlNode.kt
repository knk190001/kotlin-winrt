package Windows.Data.Xml.Dom

import Windows.Data.Xml.Dom.IXmlNodeSelector.ABI.IID
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

@ABIMarker(IXmlNode.ABI::class)
@Signature("{1c741d59-2122-47d5-a856-83f3d4214875}")
@Guid("1c741d59212247d5a85683f3d4214875")
@WinRTInterface("1c741d59212247d5a85683f3d4214875")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlNode.ByReference::class)
public interface IXmlNode : NativeMapped, IWinRTInterface, IXmlNodeSelector, IXmlNodeSerializer {
  @InterfaceMethod(0)
  public fun get_NodeValue(): IUnknown?

  @InterfaceMethod(1)
  public fun put_NodeValue(value: IUnknown?): Unit

  @InterfaceMethod(2)
  public fun get_NodeType(): NodeType?

  @InterfaceMethod(3)
  public fun get_NodeName(): String?

  @InterfaceMethod(4)
  public fun get_ParentNode(): IXmlNode?

  @InterfaceMethod(5)
  public fun get_ChildNodes(): XmlNodeList?

  @InterfaceMethod(6)
  public fun get_FirstChild(): IXmlNode?

  @InterfaceMethod(7)
  public fun get_LastChild(): IXmlNode?

  @InterfaceMethod(8)
  public fun get_PreviousSibling(): IXmlNode?

  @InterfaceMethod(9)
  public fun get_NextSibling(): IXmlNode?

  @InterfaceMethod(10)
  public fun get_Attributes(): XmlNamedNodeMap?

  @InterfaceMethod(11)
  public fun HasChildNodes(): Boolean

  @InterfaceMethod(12)
  public fun get_OwnerDocument(): XmlDocument?

  @InterfaceMethod(13)
  public fun InsertBefore(newChild: IXmlNode?, referenceChild: IXmlNode?): IXmlNode?

  @InterfaceMethod(14)
  public fun ReplaceChild(newChild: IXmlNode?, referenceChild: IXmlNode?): IXmlNode?

  @InterfaceMethod(15)
  public fun RemoveChild(childNode: IXmlNode?): IXmlNode?

  @InterfaceMethod(16)
  public fun AppendChild(newChild: IXmlNode?): IXmlNode?

  @InterfaceMethod(17)
  public fun CloneNode(deep: Boolean): IXmlNode?

  @InterfaceMethod(18)
  public fun get_NamespaceUri(): IUnknown?

  @InterfaceMethod(19)
  public fun get_LocalName(): IUnknown?

  @InterfaceMethod(20)
  public fun get_Prefix(): IUnknown?

  @InterfaceMethod(21)
  public fun Normalize(): Unit

  @InterfaceMethod(22)
  public fun put_Prefix(value: IUnknown?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXmlNode> {
    public override fun getValue() = ABI.makeIXmlNode(pointer.getPointer(0))

    public fun setValue(value: IXmlNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlNode, IXmlNodeSelector.WithDefault,
      IXmlNodeSerializer.WithDefault {
    public val __306630242_Ptr: Pointer?

    public val _306630242_VtblPtr: Pointer?
      get() = __306630242_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NodeValue(): IUnknown? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NodeValue(value: IUnknown?): Unit {
      val fnPtr = _306630242_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NodeType(): NodeType? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NodeType>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NodeType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_NodeName(): String? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ParentNode(): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ChildNodes(): XmlNodeList? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNodeList>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNodeList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_FirstChild(): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_LastChild(): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_PreviousSibling(): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_NextSibling(): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Attributes(): XmlNamedNodeMap? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNamedNodeMap>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNamedNodeMap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun HasChildNodes(): Boolean {
      val fnPtr = _306630242_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun get_OwnerDocument(): XmlDocument? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun InsertBefore(newChild: IXmlNode?, referenceChild: IXmlNode?): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, marshalToNative(newChild),
          marshalToNative(referenceChild), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun ReplaceChild(newChild: IXmlNode?, referenceChild: IXmlNode?): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, marshalToNative(newChild),
          marshalToNative(referenceChild), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun RemoveChild(childNode: IXmlNode?): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, marshalToNative(childNode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun AppendChild(newChild: IXmlNode?): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, marshalToNative(newChild), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun CloneNode(deep: Boolean): IXmlNode? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, deep, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(18)
    public override fun get_NamespaceUri(): IUnknown? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun get_LocalName(): IUnknown? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(20)
    public override fun get_Prefix(): IUnknown? {
      val fnPtr = _306630242_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun Normalize(): Unit {
      val fnPtr = _306630242_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun put_Prefix(value: IUnknown?): Unit {
      val fnPtr = _306630242_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__306630242_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IXmlNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IXmlNodeSelector,
      IXmlNodeSerializer {
    public override val __1968462751_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_306630242_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __849932908_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IXmlNodeSerializer.ABI.IID)
      val result = PointerByReference()
      IUnknownVtbl(_306630242_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __306630242_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1c741d59212247d5a85683f3d4214875")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlNode(ptr: Pointer?): WithDefault = IXmlNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlNode {
      val address = segment.toRawLongValue()
      return makeIXmlNode(Pointer(address))
    }

    public override fun toNative(obj: IXmlNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__306630242_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNode): Array<IXmlNode?> = (elements as
        Array<IXmlNode?>).castToImpl<IXmlNode,IXmlNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNode?> = arrayOfNulls<IXmlNode_Impl>(size) as
        Array<IXmlNode?>
  }
}
