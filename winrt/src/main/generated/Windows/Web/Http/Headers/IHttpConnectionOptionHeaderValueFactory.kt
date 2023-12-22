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

@ABIMarker(IHttpConnectionOptionHeaderValueFactory.ABI::class)
@Signature("{d93ccc1e-0b7d-4c3f-a58d-a2a1bdeabc0a}")
@Guid("d93ccc1e0b7d4c3fa58da2a1bdeabc0a")
@WinRTInterface("d93ccc1e0b7d4c3fa58da2a1bdeabc0a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpConnectionOptionHeaderValueFactory.ByReference::class)
public interface IHttpConnectionOptionHeaderValueFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(token: String?): HttpConnectionOptionHeaderValue?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpConnectionOptionHeaderValueFactory> {
    public override fun getValue() =
        ABI.makeIHttpConnectionOptionHeaderValueFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpConnectionOptionHeaderValueFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpConnectionOptionHeaderValueFactory {
    public val __1650836421_Ptr: Pointer?

    public val _1650836421_VtblPtr: Pointer?
      get() = __1650836421_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(token: String?): HttpConnectionOptionHeaderValue? {
      val fnPtr = _1650836421_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpConnectionOptionHeaderValue>()
      val hr = fn.invokeHR(arrayOf(__1650836421_Ptr, marshalToNative(token), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpConnectionOptionHeaderValue>(result.getValue())
      return resultValue
    }
  }

  public class IHttpConnectionOptionHeaderValueFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1650836421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpConnectionOptionHeaderValueFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d93ccc1e0b7d4c3fa58da2a1bdeabc0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpConnectionOptionHeaderValueFactory(ptr: Pointer?): WithDefault =
        IHttpConnectionOptionHeaderValueFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IHttpConnectionOptionHeaderValueFactory {
      val address = segment.toRawLongValue()
      return makeIHttpConnectionOptionHeaderValueFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpConnectionOptionHeaderValueFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1650836421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpConnectionOptionHeaderValueFactory):
        Array<IHttpConnectionOptionHeaderValueFactory?> = (elements as
        Array<IHttpConnectionOptionHeaderValueFactory?>).castToImpl<IHttpConnectionOptionHeaderValueFactory,IHttpConnectionOptionHeaderValueFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpConnectionOptionHeaderValueFactory?> =
        arrayOfNulls<IHttpConnectionOptionHeaderValueFactory_Impl>(size) as
        Array<IHttpConnectionOptionHeaderValueFactory?>
  }
}
