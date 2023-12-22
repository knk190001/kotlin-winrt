package Windows.UI.Xaml.Controls

import Windows.System.VirtualKeyModifiers
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

@ABIMarker(ISearchBoxResultSuggestionChosenEventArgs.ABI::class)
@Signature("{18918c23-e4c3-4662-a03b-d054ffd0f905}")
@Guid("18918c23e4c34662a03bd054ffd0f905")
@WinRTInterface("18918c23e4c34662a03bd054ffd0f905")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISearchBoxResultSuggestionChosenEventArgs.ByReference::class)
public interface ISearchBoxResultSuggestionChosenEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Tag(): String?

  @InterfaceMethod(1)
  public fun get_KeyModifiers(): VirtualKeyModifiers?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISearchBoxResultSuggestionChosenEventArgs> {
    public override fun getValue() =
        ABI.makeISearchBoxResultSuggestionChosenEventArgs(pointer.getPointer(0))

    public fun setValue(value: ISearchBoxResultSuggestionChosenEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISearchBoxResultSuggestionChosenEventArgs {
    public val __834299805_Ptr: Pointer?

    public val _834299805_VtblPtr: Pointer?
      get() = __834299805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Tag(): String? {
      val fnPtr = _834299805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__834299805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyModifiers(): VirtualKeyModifiers? {
      val fnPtr = _834299805_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VirtualKeyModifiers>()
      val hr = fn.invokeHR(arrayOf(__834299805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VirtualKeyModifiers>(result.getValue())
      return resultValue
    }
  }

  public class ISearchBoxResultSuggestionChosenEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __834299805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISearchBoxResultSuggestionChosenEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18918c23e4c34662a03bd054ffd0f905")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISearchBoxResultSuggestionChosenEventArgs(ptr: Pointer?): WithDefault =
        ISearchBoxResultSuggestionChosenEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ISearchBoxResultSuggestionChosenEventArgs {
      val address = segment.toRawLongValue()
      return makeISearchBoxResultSuggestionChosenEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ISearchBoxResultSuggestionChosenEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__834299805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISearchBoxResultSuggestionChosenEventArgs):
        Array<ISearchBoxResultSuggestionChosenEventArgs?> = (elements as
        Array<ISearchBoxResultSuggestionChosenEventArgs?>).castToImpl<ISearchBoxResultSuggestionChosenEventArgs,ISearchBoxResultSuggestionChosenEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISearchBoxResultSuggestionChosenEventArgs?> =
        arrayOfNulls<ISearchBoxResultSuggestionChosenEventArgs_Impl>(size) as
        Array<ISearchBoxResultSuggestionChosenEventArgs?>
  }
}
