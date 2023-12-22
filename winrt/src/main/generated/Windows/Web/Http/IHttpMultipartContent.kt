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

@ABIMarker(IHttpMultipartContent.ABI::class)
@Signature("{df916aff-9926-4ac9-aaf1-e0d04ef09bb9}")
@Guid("df916aff99264ac9aaf1e0d04ef09bb9")
@WinRTInterface("df916aff99264ac9aaf1e0d04ef09bb9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHttpMultipartContent.ByReference::class)
public interface IHttpMultipartContent : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Add(content: IHttpContent?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHttpMultipartContent> {
    public override fun getValue() = ABI.makeIHttpMultipartContent(pointer.getPointer(0))

    public fun setValue(value: IHttpMultipartContent_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHttpMultipartContent {
    public val __471226513_Ptr: Pointer?

    public val _471226513_VtblPtr: Pointer?
      get() = __471226513_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Add(content: IHttpContent?): Unit {
      val fnPtr = _471226513_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__471226513_Ptr, marshalToNative(content),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IHttpMultipartContent_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __471226513_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHttpMultipartContent, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df916aff99264ac9aaf1e0d04ef09bb9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHttpMultipartContent(ptr: Pointer?): WithDefault =
        IHttpMultipartContent_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHttpMultipartContent {
      val address = segment.toRawLongValue()
      return makeIHttpMultipartContent(Pointer(address))
    }

    public override fun toNative(obj: IHttpMultipartContent): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__471226513_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHttpMultipartContent): Array<IHttpMultipartContent?> =
        (elements as
        Array<IHttpMultipartContent?>).castToImpl<IHttpMultipartContent,IHttpMultipartContent_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHttpMultipartContent?> =
        arrayOfNulls<IHttpMultipartContent_Impl>(size) as Array<IHttpMultipartContent?>
  }
}
