package Windows.Web.Syndication

import Windows.Data.Xml.Dom.XmlDocument
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Uri
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
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

@ABIMarker(ISyndicationNode.ABI::class)
@Signature("{753cef78-51f8-45c0-a9f5-f1719dec3fb2}")
@Guid("753cef7851f845c0a9f5f1719dec3fb2")
@WinRTInterface("753cef7851f845c0a9f5f1719dec3fb2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISyndicationNode.ByReference::class)
public interface ISyndicationNode : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NodeName(): String?

  @InterfaceMethod(1)
  public fun put_NodeName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_NodeNamespace(): String?

  @InterfaceMethod(3)
  public fun put_NodeNamespace(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_NodeValue(): String?

  @InterfaceMethod(5)
  public fun put_NodeValue(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_Language(): String?

  @InterfaceMethod(7)
  public fun put_Language(value: String?): Unit

  @InterfaceMethod(8)
  public fun get_BaseUri(): Uri?

  @InterfaceMethod(9)
  public fun put_BaseUri(value: Uri?): Unit

  @InterfaceMethod(10)
  public fun get_AttributeExtensions(): IVector<SyndicationAttribute?>?

  @InterfaceMethod(11)
  public fun get_ElementExtensions(): IVector<ISyndicationNode?>?

  @InterfaceMethod(12)
  public fun GetXmlDocument(format: SyndicationFormat?): XmlDocument?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISyndicationNode> {
    public override fun getValue() = ABI.makeISyndicationNode(pointer.getPointer(0))

    public fun setValue(value: ISyndicationNode_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISyndicationNode {
    public val __1576492622_Ptr: Pointer?

    public val _1576492622_VtblPtr: Pointer?
      get() = __1576492622_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NodeName(): String? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_NodeName(value: String?): Unit {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_NodeNamespace(): String? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_NodeNamespace(value: String?): Unit {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_NodeValue(): String? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_NodeValue(value: String?): Unit {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Language(): String? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Language(value: String?): Unit {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_BaseUri(): Uri? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Uri>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Uri>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_BaseUri(value: Uri?): Unit {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_AttributeExtensions(): IVector<SyndicationAttribute?>? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<SyndicationAttribute?>>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<SyndicationAttribute?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_ElementExtensions(): IVector<ISyndicationNode?>? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<ISyndicationNode?>>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<ISyndicationNode?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun GetXmlDocument(format: SyndicationFormat?): XmlDocument? {
      val fnPtr = _1576492622_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlDocument>()
      val hr = fn.invokeHR(arrayOf(__1576492622_Ptr, marshalToNative(format), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlDocument>(result.getValue())
      return resultValue
    }
  }

  public class ISyndicationNode_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1576492622_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISyndicationNode, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("753cef7851f845c0a9f5f1719dec3fb2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISyndicationNode(ptr: Pointer?): WithDefault = ISyndicationNode_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISyndicationNode {
      val address = segment.toRawLongValue()
      return makeISyndicationNode(Pointer(address))
    }

    public override fun toNative(obj: ISyndicationNode): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1576492622_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISyndicationNode): Array<ISyndicationNode?> = (elements as
        Array<ISyndicationNode?>).castToImpl<ISyndicationNode,ISyndicationNode_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISyndicationNode?> =
        arrayOfNulls<ISyndicationNode_Impl>(size) as Array<ISyndicationNode?>
  }
}
