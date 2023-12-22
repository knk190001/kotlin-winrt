package Windows.Storage.Streams

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

@ABIMarker(IContentTypeProvider.ABI::class)
@Signature("{97d098a5-3b99-4de9-88a5-e11d2f50c795}")
@Guid("97d098a53b994de988a5e11d2f50c795")
@WinRTInterface("97d098a53b994de988a5e11d2f50c795")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentTypeProvider.ByReference::class)
public interface IContentTypeProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContentType(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentTypeProvider> {
    public override fun getValue() = ABI.makeIContentTypeProvider(pointer.getPointer(0))

    public fun setValue(value: IContentTypeProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentTypeProvider {
    public val __412040816_Ptr: Pointer?

    public val _412040816_VtblPtr: Pointer?
      get() = __412040816_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContentType(): String? {
      val fnPtr = _412040816_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__412040816_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IContentTypeProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __412040816_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentTypeProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("97d098a53b994de988a5e11d2f50c795")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentTypeProvider(ptr: Pointer?): WithDefault = IContentTypeProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentTypeProvider {
      val address = segment.toRawLongValue()
      return makeIContentTypeProvider(Pointer(address))
    }

    public override fun toNative(obj: IContentTypeProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__412040816_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentTypeProvider): Array<IContentTypeProvider?> =
        (elements as
        Array<IContentTypeProvider?>).castToImpl<IContentTypeProvider,IContentTypeProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentTypeProvider?> =
        arrayOfNulls<IContentTypeProvider_Impl>(size) as Array<IContentTypeProvider?>
  }
}
