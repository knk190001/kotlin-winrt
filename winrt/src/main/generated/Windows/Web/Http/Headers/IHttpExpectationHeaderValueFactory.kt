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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpExpectationHeaderValueFactory.ABI::class)
@Signature("{4ea275cb-d53e-4868-8856-1e21a5030dc0}")
@Guid("4ea275cbd53e486888561e21a5030dc0")
@WinRTInterface("4ea275cbd53e486888561e21a5030dc0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpExpectationHeaderValueFactory.ByReference::class)
public interface IHttpExpectationHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromName(name: String?): HttpExpectationHeaderValue?

  @InterfaceMethod(1)
  public fun CreateFromNameWithValue(name: String?, value: String?): HttpExpectationHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpExpectationHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpExpectationHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpExpectationHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpExpectationHeaderValueFactory {
    public val __1172044150_Ptr: Pointer?

    public val _1172044150_VtblPtr: Pointer?
      get() = __1172044150_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromName(name: String?): HttpExpectationHeaderValue? {
      val fnPtr = _1172044150_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpExpectationHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1172044150_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpExpectationHeaderValue>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNameWithValue(name: String?, value: String?):
        HttpExpectationHeaderValue? {
      val fnPtr = _1172044150_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpExpectationHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1172044150_Ptr, marshalToNative(name), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpExpectationHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpExpectationHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1172044150_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpExpectationHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ea275cbd53e486888561e21a5030dc0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpExpectationHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpExpectationHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpExpectationHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpExpectationHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpExpectationHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1172044150_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpExpectationHeaderValueFactory):
        Array<IHttpExpectationHeaderValueFactory?> = (elements as
        Array<IHttpExpectationHeaderValueFactory?>).castToImpl<IHttpExpectationHeaderValueFactory,IHttpExpectationHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpExpectationHeaderValueFactory?> =
        arrayOfNulls<IHttpExpectationHeaderValueFactory_Impl>(size) as
        Array<IHttpExpectationHeaderValueFactory?>
  }
}
