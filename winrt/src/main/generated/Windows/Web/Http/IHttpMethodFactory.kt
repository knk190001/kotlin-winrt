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

@ABIMarker(IHttpMethodFactory.ABI::class)
@Signature("{3c51d10d-36d7-40f8-a86d-e759caf2f83f}")
@Guid("3c51d10d36d740f8a86de759caf2f83f")
@WinRTInterface("3c51d10d36d740f8a86de759caf2f83f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMethodFactory.ByReference::class)
public interface IHttpMethodFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(method: String?): HttpMethod?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMethodFactory> {
    public override fun getValue() = ABI.makeIHttpMethodFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpMethodFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMethodFactory {
    public val __340412677_Ptr: Pointer?

    public val _340412677_VtblPtr: Pointer?
      get() = __340412677_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(method: String?): HttpMethod? {
      val fnPtr = _340412677_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMethod>()
      val hr = fn.invokeHR(arrayOf(__340412677_Ptr, marshalToNative(method), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMethod>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMethodFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __340412677_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMethodFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c51d10d36d740f8a86de759caf2f83f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMethodFactory(ptr: Pointer?): WithDefault = IHttpMethodFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMethodFactory {
      val address = segment.toRawLongValue()
      return makeIHttpMethodFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpMethodFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__340412677_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMethodFactory): Array<IHttpMethodFactory?> =
        (elements as
        Array<IHttpMethodFactory?>).castToImpl<IHttpMethodFactory,IHttpMethodFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMethodFactory?> =
        arrayOfNulls<IHttpMethodFactory_Impl>(size) as Array<IHttpMethodFactory?>
  }
}
