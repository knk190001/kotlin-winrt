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

@ABIMarker(ISearchPaneSuggestionsRequestDeferral.ABI::class)
@Signature("{a0d009f7-8748-4ee2-ad44-afa6be997c51}")
@Guid("a0d009f787484ee2ad44afa6be997c51")
@WinRTInterface("a0d009f787484ee2ad44afa6be997c51")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneSuggestionsRequestDeferral.ByReference::class)
public interface ISearchPaneSuggestionsRequestDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneSuggestionsRequestDeferral> {
    public override fun getValue() =
        ABI.makeISearchPaneSuggestionsRequestDeferral(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneSuggestionsRequestDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneSuggestionsRequestDeferral {
    public val __493358514_Ptr: Pointer?

    public val _493358514_VtblPtr: Pointer?
      get() = __493358514_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _493358514_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__493358514_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISearchPaneSuggestionsRequestDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __493358514_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneSuggestionsRequestDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a0d009f787484ee2ad44afa6be997c51")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneSuggestionsRequestDeferral(ptr: Pointer?): WithDefault =
        ISearchPaneSuggestionsRequestDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISearchPaneSuggestionsRequestDeferral {
      val address = segment.toRawLongValue()
      return makeISearchPaneSuggestionsRequestDeferral(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneSuggestionsRequestDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__493358514_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneSuggestionsRequestDeferral):
        Array<ISearchPaneSuggestionsRequestDeferral?> = (elements as
        Array<ISearchPaneSuggestionsRequestDeferral?>).castToImpl<ISearchPaneSuggestionsRequestDeferral,ISearchPaneSuggestionsRequestDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneSuggestionsRequestDeferral?> =
        arrayOfNulls<ISearchPaneSuggestionsRequestDeferral_Impl>(size) as
        Array<ISearchPaneSuggestionsRequestDeferral?>
  }
}
