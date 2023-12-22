package Windows.Web.Http

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpMethodStatics.ABI::class)
@Signature("{64d171f0-d99a-4153-8dc6-d68cc4cce317}")
@Guid("64d171f0d99a41538dc6d68cc4cce317")
@WinRTInterface("64d171f0d99a41538dc6d68cc4cce317")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMethodStatics.ByReference::class)
public interface IHttpMethodStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Delete(): HttpMethod?

  @InterfaceMethod(1)
  public fun get_Get(): HttpMethod?

  @InterfaceMethod(2)
  public fun get_Head(): HttpMethod?

  @InterfaceMethod(3)
  public fun get_Options(): HttpMethod?

  @InterfaceMethod(4)
  public fun get_Patch(): HttpMethod?

  @InterfaceMethod(5)
  public fun get_Post(): HttpMethod?

  @InterfaceMethod(6)
  public fun get_Put(): HttpMethod?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMethodStatics> {
    public override fun getValue() = ABI.makeIHttpMethodStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpMethodStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMethodStatics {
    public val __464840768_Ptr: Pointer?

    public val _464840768_VtblPtr: Pointer?
      get() = __464840768_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Delete(): HttpMethod? {
      val fnPtr = _464840768_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__464840768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Get(): HttpMethod? {
      val fnPtr = _464840768_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__464840768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Head(): HttpMethod? {
      val fnPtr = _464840768_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__464840768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Options(): HttpMethod? {
      val fnPtr = _464840768_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__464840768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Patch(): HttpMethod? {
      val fnPtr = _464840768_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__464840768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Post(): HttpMethod? {
      val fnPtr = _464840768_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__464840768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Put(): HttpMethod? {
      val fnPtr = _464840768_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__464840768_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMethodStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __464840768_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMethodStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64d171f0d99a41538dc6d68cc4cce317")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMethodStatics(ptr: Pointer?): WithDefault = IHttpMethodStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMethodStatics {
      val address = segment.toRawLongValue()
      return makeIHttpMethodStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpMethodStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__464840768_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMethodStatics): Array<IHttpMethodStatics?> =
        (elements as
        Array<IHttpMethodStatics?>).castToImpl<IHttpMethodStatics,IHttpMethodStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMethodStatics?> =
        arrayOfNulls<IHttpMethodStatics_Impl>(size) as Array<IHttpMethodStatics?>
  }
}
