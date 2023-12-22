package Windows.Web.Http

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IKeyValuePair
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

@ABIMarker(IHttpFormUrlEncodedContentFactory.ABI::class)
@Signature("{43f0138c-2f73-4302-b5f3-eae9238a5e01}")
@Guid("43f0138c2f734302b5f3eae9238a5e01")
@WinRTInterface("43f0138c2f734302b5f3eae9238a5e01")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpFormUrlEncodedContentFactory.ByReference::class)
public interface IHttpFormUrlEncodedContentFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(content: IIterable<IKeyValuePair<String?, String?>?>?):
      HttpFormUrlEncodedContent?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpFormUrlEncodedContentFactory> {
    public override fun getValue() =
        ABI.makeIHttpFormUrlEncodedContentFactory(pointer.getPointer(0))

    public fun setValue(value: IHttpFormUrlEncodedContentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpFormUrlEncodedContentFactory {
    public val __906245608_Ptr: Pointer?

    public val _906245608_VtblPtr: Pointer?
      get() = __906245608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(content: IIterable<IKeyValuePair<String?, String?>?>?):
        HttpFormUrlEncodedContent? {
      val fnPtr = _906245608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<HttpFormUrlEncodedContent>()
      val hr = fn.invokeHR(arrayOf(__906245608_Ptr, marshalToNative(content), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<HttpFormUrlEncodedContent>(result.getValue())
      return resultValue
    }
  }

  public class IHttpFormUrlEncodedContentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __906245608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpFormUrlEncodedContentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("43f0138c2f734302b5f3eae9238a5e01")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpFormUrlEncodedContentFactory(ptr: Pointer?): WithDefault =
        IHttpFormUrlEncodedContentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpFormUrlEncodedContentFactory {
      val address = segment.toRawLongValue()
      return makeIHttpFormUrlEncodedContentFactory(Pointer(address))
    }

    public override fun toNative(obj: IHttpFormUrlEncodedContentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__906245608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpFormUrlEncodedContentFactory):
        Array<IHttpFormUrlEncodedContentFactory?> = (elements as
        Array<IHttpFormUrlEncodedContentFactory?>).castToImpl<IHttpFormUrlEncodedContentFactory,IHttpFormUrlEncodedContentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpFormUrlEncodedContentFactory?> =
        arrayOfNulls<IHttpFormUrlEncodedContentFactory_Impl>(size) as
        Array<IHttpFormUrlEncodedContentFactory?>
  }
}
