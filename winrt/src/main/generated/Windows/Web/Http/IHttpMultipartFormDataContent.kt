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

@ABIMarker(IHttpMultipartFormDataContent.ABI::class)
@Signature("{64d337e2-e967-4624-b6d1-cf74604a4a42}")
@Guid("64d337e2e9674624b6d1cf74604a4a42")
@WinRTInterface("64d337e2e9674624b6d1cf74604a4a42")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMultipartFormDataContent.ByReference::class)
public interface IHttpMultipartFormDataContent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Add(content: IHttpContent?): Unit

  @InterfaceMethod(1)
  public fun Add(content: IHttpContent?, name: String?): Unit

  @InterfaceMethod(2)
  public fun Add(
    content: IHttpContent?,
    name: String?,
    fileName: String?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMultipartFormDataContent> {
    public override fun getValue() = ABI.makeIHttpMultipartFormDataContent(pointer.getPointer(0))

    public fun setValue(value: IHttpMultipartFormDataContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMultipartFormDataContent {
    public val __399511075_Ptr: Pointer?

    public val _399511075_VtblPtr: Pointer?
      get() = __399511075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Add(content: IHttpContent?): Unit {
      val fnPtr = _399511075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__399511075_Ptr, marshalToNative(content),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Add(content: IHttpContent?, name: String?): Unit {
      val fnPtr = _399511075_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__399511075_Ptr, marshalToNative(content),
          marshalToNative(name),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Add(
      content: IHttpContent?,
      name: String?,
      fileName: String?
    ): Unit {
      val fnPtr = _399511075_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__399511075_Ptr, marshalToNative(content), marshalToNative(name),
          marshalToNative(fileName),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpMultipartFormDataContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __399511075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMultipartFormDataContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("64d337e2e9674624b6d1cf74604a4a42")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMultipartFormDataContent(ptr: Pointer?): WithDefault =
        IHttpMultipartFormDataContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMultipartFormDataContent {
      val address = segment.toRawLongValue()
      return makeIHttpMultipartFormDataContent(Pointer(address))
    }

    public override fun toNative(obj: IHttpMultipartFormDataContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__399511075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMultipartFormDataContent):
        Array<IHttpMultipartFormDataContent?> = (elements as
        Array<IHttpMultipartFormDataContent?>).castToImpl<IHttpMultipartFormDataContent,IHttpMultipartFormDataContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMultipartFormDataContent?> =
        arrayOfNulls<IHttpMultipartFormDataContent_Impl>(size) as
        Array<IHttpMultipartFormDataContent?>
  }
}
