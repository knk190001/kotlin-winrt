package Windows.Web.Http.Headers

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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpConnectionOptionHeaderValueStatics.ABI::class)
@Signature("{aaa75d37-a946-4b1f-85af-48b68b3c50bd}")
@Guid("aaa75d37a9464b1f85af48b68b3c50bd")
@WinRTInterface("aaa75d37a9464b1f85af48b68b3c50bd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpConnectionOptionHeaderValueStatics.ByReference::class)
public interface IHttpConnectionOptionHeaderValueStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Parse(input: String?): HttpConnectionOptionHeaderValue?

  @InterfaceMethod(1)
  public fun TryParse(input: String?,
      connectionOptionHeaderValue: Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue.ByReference?):
      Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpConnectionOptionHeaderValueStatics> {
    public override fun getValue() =
        ABI.makeIHttpConnectionOptionHeaderValueStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpConnectionOptionHeaderValueStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpConnectionOptionHeaderValueStatics {
    public val __845582976_Ptr: Pointer?

    public val _845582976_VtblPtr: Pointer?
      get() = __845582976_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Parse(input: String?): HttpConnectionOptionHeaderValue? {
      val fnPtr = _845582976_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpConnectionOptionHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__845582976_Ptr, marshalToNative(input), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpConnectionOptionHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun TryParse(input: String?,
        connectionOptionHeaderValue: Windows.Web.Http.Headers.HttpConnectionOptionHeaderValue.ByReference?):
        Boolean {
      val fnPtr = _845582976_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__845582976_Ptr, marshalToNative(input),
          marshalToNative(connectionOptionHeaderValue), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IHttpConnectionOptionHeaderValueStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __845582976_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpConnectionOptionHeaderValueStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aaa75d37a9464b1f85af48b68b3c50bd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpConnectionOptionHeaderValueStatics(ptr: Pointer?): WithDefault =
        IHttpConnectionOptionHeaderValueStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpConnectionOptionHeaderValueStatics {
      val address = segment.toRawLongValue()
      return makeIHttpConnectionOptionHeaderValueStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpConnectionOptionHeaderValueStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__845582976_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpConnectionOptionHeaderValueStatics):
        Array<IHttpConnectionOptionHeaderValueStatics?> = (elements as
        Array<IHttpConnectionOptionHeaderValueStatics?>).castToImpl<IHttpConnectionOptionHeaderValueStatics,IHttpConnectionOptionHeaderValueStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpConnectionOptionHeaderValueStatics?> =
        arrayOfNulls<IHttpConnectionOptionHeaderValueStatics_Impl>(size) as
        Array<IHttpConnectionOptionHeaderValueStatics?>
  }
}
