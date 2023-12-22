package Windows.Data.Xml.Dom

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IXmlNodeSelector.ABI::class)
@Signature("{63dbba8b-d0db-4fe1-b745-f9433afdc25b}")
@Guid("63dbba8bd0db4fe1b745f9433afdc25b")
@WinRTInterface("63dbba8bd0db4fe1b745f9433afdc25b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXmlNodeSelector.ByReference::class)
public interface IXmlNodeSelector : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SelectSingleNode(xpath: String?): IXmlNode?

  @InterfaceMethod(1)
  public fun SelectNodes(xpath: String?): XmlNodeList?

  @InterfaceMethod(2)
  public fun SelectSingleNodeNS(xpath: String?, namespaces: IUnknown?): IXmlNode?

  @InterfaceMethod(3)
  public fun SelectNodesNS(xpath: String?, namespaces: IUnknown?): XmlNodeList?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXmlNodeSelector> {
    public override fun getValue() = ABI.makeIXmlNodeSelector(pointer.getPointer(0))

    public fun setValue(value: IXmlNodeSelector_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXmlNodeSelector {
    public val __1968462751_Ptr: Pointer?

    public val _1968462751_VtblPtr: Pointer?
      get() = __1968462751_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SelectSingleNode(xpath: String?): IXmlNode? {
      val fnPtr = _1968462751_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__1968462751_Ptr, marshalToNative(xpath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SelectNodes(xpath: String?): XmlNodeList? {
      val fnPtr = _1968462751_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNodeList>()
      val hr = fn.invokeHR(arrayOf(__1968462751_Ptr, marshalToNative(xpath), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNodeList>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun SelectSingleNodeNS(xpath: String?, namespaces: IUnknown?): IXmlNode? {
      val fnPtr = _1968462751_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IXmlNode>()
      val hr = fn.invokeHR(arrayOf(__1968462751_Ptr, marshalToNative(xpath),
          marshalToNative(namespaces), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IXmlNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun SelectNodesNS(xpath: String?, namespaces: IUnknown?): XmlNodeList? {
      val fnPtr = _1968462751_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XmlNodeList>()
      val hr = fn.invokeHR(arrayOf(__1968462751_Ptr, marshalToNative(xpath),
          marshalToNative(namespaces), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XmlNodeList>(result.getValue())
      return resultValue
    }
  }

  public class IXmlNodeSelector_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1968462751_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXmlNodeSelector, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("63dbba8bd0db4fe1b745f9433afdc25b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXmlNodeSelector(ptr: Pointer?): WithDefault = IXmlNodeSelector_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXmlNodeSelector {
      val address = segment.toRawLongValue()
      return makeIXmlNodeSelector(Pointer(address))
    }

    public override fun toNative(obj: IXmlNodeSelector): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1968462751_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXmlNodeSelector): Array<IXmlNodeSelector?> = (elements as
        Array<IXmlNodeSelector?>).castToImpl<IXmlNodeSelector,IXmlNodeSelector_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXmlNodeSelector?> =
        arrayOfNulls<IXmlNodeSelector_Impl>(size) as Array<IXmlNodeSelector?>
  }
}
