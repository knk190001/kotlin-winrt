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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISearchPaneResultSuggestionChosenEventArgs.ABI::class)
@Signature("{c8316cc0-aed2-41e0-bce0-c26ca74f85ec}")
@Guid("c8316cc0aed241e0bce0c26ca74f85ec")
@WinRTInterface("c8316cc0aed241e0bce0c26ca74f85ec")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchPaneResultSuggestionChosenEventArgs.ByReference::class)
public interface ISearchPaneResultSuggestionChosenEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Tag(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchPaneResultSuggestionChosenEventArgs> {
    public override fun getValue() =
        ABI.makeISearchPaneResultSuggestionChosenEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchPaneResultSuggestionChosenEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchPaneResultSuggestionChosenEventArgs {
    public val __1350054365_Ptr: Pointer?

    public val _1350054365_VtblPtr: Pointer?
      get() = __1350054365_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Tag(): String? {
      val fnPtr = _1350054365_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1350054365_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ISearchPaneResultSuggestionChosenEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1350054365_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchPaneResultSuggestionChosenEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c8316cc0aed241e0bce0c26ca74f85ec")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchPaneResultSuggestionChosenEventArgs(ptr: Pointer?): WithDefault =
        ISearchPaneResultSuggestionChosenEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISearchPaneResultSuggestionChosenEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchPaneResultSuggestionChosenEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchPaneResultSuggestionChosenEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1350054365_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchPaneResultSuggestionChosenEventArgs):
        Array<ISearchPaneResultSuggestionChosenEventArgs?> = (elements as
        Array<ISearchPaneResultSuggestionChosenEventArgs?>).castToImpl<ISearchPaneResultSuggestionChosenEventArgs,ISearchPaneResultSuggestionChosenEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchPaneResultSuggestionChosenEventArgs?> =
        arrayOfNulls<ISearchPaneResultSuggestionChosenEventArgs_Impl>(size) as
        Array<ISearchPaneResultSuggestionChosenEventArgs?>
  }
}
