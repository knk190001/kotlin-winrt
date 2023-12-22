package Windows.Data.Xml.Xsl

import Windows.Data.Xml.Dom.IXmlNode
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

@ABIMarker(IXsltProcessor.ABI::class)
@Signature("{7b64703f-550c-48c6-a90f-93a5b964518f}")
@Guid("7b64703f550c48c6a90f93a5b964518f")
@WinRTInterface("7b64703f550c48c6a90f93a5b964518f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXsltProcessor.ByReference::class)
public interface IXsltProcessor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TransformToString(inputNode: IXmlNode?): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IXsltProcessor>
      {
    public override fun getValue() = ABI.makeIXsltProcessor(pointer.getPointer(0))

    public fun setValue(value: IXsltProcessor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXsltProcessor {
    public val __1374457785_Ptr: Pointer?

    public val _1374457785_VtblPtr: Pointer?
      get() = __1374457785_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TransformToString(inputNode: IXmlNode?): String? {
      val fnPtr = _1374457785_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1374457785_Ptr, marshalToNative(inputNode), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IXsltProcessor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1374457785_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXsltProcessor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7b64703f550c48c6a90f93a5b964518f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXsltProcessor(ptr: Pointer?): WithDefault = IXsltProcessor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXsltProcessor {
      val address = segment.toRawLongValue()
      return makeIXsltProcessor(Pointer(address))
    }

    public override fun toNative(obj: IXsltProcessor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1374457785_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXsltProcessor): Array<IXsltProcessor?> = (elements as
        Array<IXsltProcessor?>).castToImpl<IXsltProcessor,IXsltProcessor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXsltProcessor?> =
        arrayOfNulls<IXsltProcessor_Impl>(size) as Array<IXsltProcessor?>
  }
}
