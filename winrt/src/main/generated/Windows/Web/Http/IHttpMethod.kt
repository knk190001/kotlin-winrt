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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IHttpMethod.ABI::class)
@Signature("{728d4022-700d-4fe0-afa5-40299c58dbfd}")
@Guid("728d4022700d4fe0afa540299c58dbfd")
@WinRTInterface("728d4022700d4fe0afa540299c58dbfd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMethod.ByReference::class)
public interface IHttpMethod : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Method(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IHttpMethod> {
    public override fun getValue() = ABI.makeIHttpMethod(pointer.getPointer(0))

    public fun setValue(value: IHttpMethod_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMethod {
    public val __2035259461_Ptr: Pointer?

    public val _2035259461_VtblPtr: Pointer?
      get() = __2035259461_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Method(): String? {
      val fnPtr = _2035259461_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__2035259461_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMethod_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2035259461_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMethod, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("728d4022700d4fe0afa540299c58dbfd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMethod(ptr: Pointer?): WithDefault = IHttpMethod_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMethod {
      val address = segment.toRawLongValue()
      return makeIHttpMethod(Pointer(address))
    }

    public override fun toNative(obj: IHttpMethod): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2035259461_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMethod): Array<IHttpMethod?> = (elements as
        Array<IHttpMethod?>).castToImpl<IHttpMethod,IHttpMethod_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMethod?> =
        arrayOfNulls<IHttpMethod_Impl>(size) as Array<IHttpMethod?>
  }
}
