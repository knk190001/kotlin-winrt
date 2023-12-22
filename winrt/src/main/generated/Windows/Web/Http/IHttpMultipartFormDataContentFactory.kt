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

@ABIMarker(IHttpMultipartFormDataContentFactory.ABI::class)
@Signature("{a04d7311-5017-4622-93a8-49b24a4fcbfc}")
@Guid("a04d73115017462293a849b24a4fcbfc")
@WinRTInterface("a04d73115017462293a849b24a4fcbfc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMultipartFormDataContentFactory.ByReference::class)
public interface IHttpMultipartFormDataContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWithBoundary(boundary: String?): HttpMultipartFormDataContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMultipartFormDataContentFactory> {
    public override fun getValue() =
        ABI.makeIHttpMultipartFormDataContentFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpMultipartFormDataContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMultipartFormDataContentFactory {
    public val __613490023_Ptr: Pointer?

    public val _613490023_VtblPtr: Pointer?
      get() = __613490023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWithBoundary(boundary: String?): HttpMultipartFormDataContent? {
      val fnPtr = _613490023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpMultipartFormDataContent>()
      val hr = fn.invokeHR(arrayOf(__613490023_Ptr, marshalToNative(boundary), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpMultipartFormDataContent>(result.getValue())
      return resultValue
    }
  }

  public class IHttpMultipartFormDataContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __613490023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMultipartFormDataContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a04d73115017462293a849b24a4fcbfc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMultipartFormDataContentFactory(ptr: Pointer?): WithDefault =
        IHttpMultipartFormDataContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMultipartFormDataContentFactory {
      val address = segment.toRawLongValue()
      return makeIHttpMultipartFormDataContentFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpMultipartFormDataContentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__613490023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMultipartFormDataContentFactory):
        Array<IHttpMultipartFormDataContentFactory?> = (elements as
        Array<IHttpMultipartFormDataContentFactory?>).castToImpl<IHttpMultipartFormDataContentFactory,IHttpMultipartFormDataContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMultipartFormDataContentFactory?> =
        arrayOfNulls<IHttpMultipartFormDataContentFactory_Impl>(size) as
        Array<IHttpMultipartFormDataContentFactory?>
  }
}
