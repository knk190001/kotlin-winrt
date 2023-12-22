package Windows.Web

import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Uri
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IUriToStreamResolver.ABI::class)
@Signature("{b0aba86a-9aeb-4d3a-9590-003e3ca7e290}")
@Guid("b0aba86a9aeb4d3a9590003e3ca7e290")
@WinRTInterface("b0aba86a9aeb4d3a9590003e3ca7e290")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUriToStreamResolver.ByReference::class)
public interface IUriToStreamResolver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun UriToStreamAsync(uri: Uri?): IAsyncOperation<IInputStream?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUriToStreamResolver> {
    public override fun getValue() = ABI.makeIUriToStreamResolver(pointer.getPointer(0))

    public fun setValue(value: IUriToStreamResolver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUriToStreamResolver {
    public val __1179824083_Ptr: Pointer?

    public val _1179824083_VtblPtr: Pointer?
      get() = __1179824083_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun UriToStreamAsync(uri: Uri?): IAsyncOperation<IInputStream?>? {
      val fnPtr = _1179824083_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IInputStream?>>()
      val hr = fn.invokeHR(arrayOf(__1179824083_Ptr, marshalToNative(uri), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IInputStream?>>(result.getValue())
      return resultValue
    }
  }

  public class IUriToStreamResolver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1179824083_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUriToStreamResolver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0aba86a9aeb4d3a9590003e3ca7e290")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUriToStreamResolver(ptr: Pointer?): WithDefault = IUriToStreamResolver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUriToStreamResolver {
      val address = segment.toRawLongValue()
      return makeIUriToStreamResolver(Pointer(address))
    }

    public override fun toNative(obj: IUriToStreamResolver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1179824083_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUriToStreamResolver): Array<IUriToStreamResolver?> =
        (elements as
        Array<IUriToStreamResolver?>).castToImpl<IUriToStreamResolver,IUriToStreamResolver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUriToStreamResolver?> =
        arrayOfNulls<IUriToStreamResolver_Impl>(size) as Array<IUriToStreamResolver?>
  }
}
