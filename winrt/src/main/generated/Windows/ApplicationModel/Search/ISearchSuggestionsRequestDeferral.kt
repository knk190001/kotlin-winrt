package Windows.ApplicationModel.Search

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

@ABIMarker(ISearchSuggestionsRequestDeferral.ABI::class)
@Signature("{b71598a9-c065-456d-a845-1eccec5dc28b}")
@Guid("b71598a9c065456da8451eccec5dc28b")
@WinRTInterface("b71598a9c065456da8451eccec5dc28b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchSuggestionsRequestDeferral.ByReference::class)
public interface ISearchSuggestionsRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchSuggestionsRequestDeferral> {
    public override fun getValue() =
        ABI.makeISearchSuggestionsRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: ISearchSuggestionsRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchSuggestionsRequestDeferral {
    public val __379115434_Ptr: Pointer?

    public val _379115434_VtblPtr: Pointer?
      get() = __379115434_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _379115434_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__379115434_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISearchSuggestionsRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __379115434_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchSuggestionsRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b71598a9c065456da8451eccec5dc28b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchSuggestionsRequestDeferral(ptr: Pointer?): WithDefault =
        ISearchSuggestionsRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchSuggestionsRequestDeferral {
      val address = segment.toRawLongValue()
      return makeISearchSuggestionsRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: ISearchSuggestionsRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__379115434_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchSuggestionsRequestDeferral):
        Array<ISearchSuggestionsRequestDeferral?> = (elements as
        Array<ISearchSuggestionsRequestDeferral?>).castToImpl<ISearchSuggestionsRequestDeferral,ISearchSuggestionsRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchSuggestionsRequestDeferral?> =
        arrayOfNulls<ISearchSuggestionsRequestDeferral_Impl>(size) as
        Array<ISearchSuggestionsRequestDeferral?>
  }
}
