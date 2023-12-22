package Windows.Web.Http.Filters

import Windows.System.User
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

@ABIMarker(IHttpBaseProtocolFilterStatics.ABI::class)
@Signature("{6d4dee0c-e908-494e-b5a3-1263c9b8242a}")
@Guid("6d4dee0ce908494eb5a31263c9b8242a")
@WinRTInterface("6d4dee0ce908494eb5a31263c9b8242a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpBaseProtocolFilterStatics.ByReference::class)
public interface IHttpBaseProtocolFilterStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForUser(user: User?): HttpBaseProtocolFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpBaseProtocolFilterStatics> {
    public override fun getValue() = ABI.makeIHttpBaseProtocolFilterStatics(pointer.getPointer(0))

    public fun setValue(value: IHttpBaseProtocolFilterStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpBaseProtocolFilterStatics {
    public val __215737491_Ptr: Pointer?

    public val _215737491_VtblPtr: Pointer?
      get() = __215737491_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForUser(user: User?): HttpBaseProtocolFilter? {
      val fnPtr = _215737491_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpBaseProtocolFilter>()
      val hr = fn.invokeHR(arrayOf(__215737491_Ptr, marshalToNative(user), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpBaseProtocolFilter>(result.getValue())
      return resultValue
    }
  }

  public class IHttpBaseProtocolFilterStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __215737491_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpBaseProtocolFilterStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6d4dee0ce908494eb5a31263c9b8242a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpBaseProtocolFilterStatics(ptr: Pointer?): WithDefault =
        IHttpBaseProtocolFilterStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpBaseProtocolFilterStatics {
      val address = segment.toRawLongValue()
      return makeIHttpBaseProtocolFilterStatics(Pointer(address))
    }

    public override fun toNative(obj: IHttpBaseProtocolFilterStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__215737491_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpBaseProtocolFilterStatics):
        Array<IHttpBaseProtocolFilterStatics?> = (elements as
        Array<IHttpBaseProtocolFilterStatics?>).castToImpl<IHttpBaseProtocolFilterStatics,IHttpBaseProtocolFilterStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpBaseProtocolFilterStatics?> =
        arrayOfNulls<IHttpBaseProtocolFilterStatics_Impl>(size) as
        Array<IHttpBaseProtocolFilterStatics?>
  }
}
