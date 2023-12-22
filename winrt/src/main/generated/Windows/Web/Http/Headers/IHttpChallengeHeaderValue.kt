package Windows.Web.Http.Headers

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IHttpChallengeHeaderValue.ABI::class)
@Signature("{393361af-0f7d-4820-9fdd-a2b956eeaeab}")
@Guid("393361af0f7d48209fdda2b956eeaeab")
@WinRTInterface("393361af0f7d48209fdda2b956eeaeab")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpChallengeHeaderValue.ByReference::class)
public interface IHttpChallengeHeaderValue : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Parameters(): IVector<HttpNameValueHeaderValue?>?

  @InterfaceMethod(1)
  public fun get_Scheme(): String?

  @InterfaceMethod(2)
  public fun get_Token(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpChallengeHeaderValue> {
    public override fun getValue() = ABI.makeIHttpChallengeHeaderValue(pointer.getPointer(0))

    public fun setValue(value: IHttpChallengeHeaderValue_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpChallengeHeaderValue {
    public val __755741549_Ptr: Pointer?

    public val _755741549_VtblPtr: Pointer?
      get() = __755741549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Parameters(): IVector<HttpNameValueHeaderValue?>? {
      val fnPtr = _755741549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<HttpNameValueHeaderValue?>>()
      val hr = fn.invokeHR(arrayOf(__755741549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<HttpNameValueHeaderValue?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Scheme(): String? {
      val fnPtr = _755741549_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__755741549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Token(): String? {
      val fnPtr = _755741549_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__755741549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHttpChallengeHeaderValue_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __755741549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpChallengeHeaderValue, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("393361af0f7d48209fdda2b956eeaeab")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpChallengeHeaderValue(ptr: Pointer?): WithDefault =
        IHttpChallengeHeaderValue_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpChallengeHeaderValue {
      val address = segment.toRawLongValue()
      return makeIHttpChallengeHeaderValue(Pointer(address))
    }

    public override fun toNative(obj: IHttpChallengeHeaderValue): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__755741549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpChallengeHeaderValue):
        Array<IHttpChallengeHeaderValue?> = (elements as
        Array<IHttpChallengeHeaderValue?>).castToImpl<IHttpChallengeHeaderValue,IHttpChallengeHeaderValue_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpChallengeHeaderValue?> =
        arrayOfNulls<IHttpChallengeHeaderValue_Impl>(size) as Array<IHttpChallengeHeaderValue?>
  }
}
