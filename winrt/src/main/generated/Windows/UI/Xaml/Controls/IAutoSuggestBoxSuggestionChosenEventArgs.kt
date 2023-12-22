package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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

@ABIMarker(IAutoSuggestBoxSuggestionChosenEventArgs.ABI::class)
@Signature("{396f7254-1ed5-4bc5-a060-655530bca6ba}")
@Guid("396f72541ed54bc5a060655530bca6ba")
@WinRTInterface("396f72541ed54bc5a060655530bca6ba")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxSuggestionChosenEventArgs.ByReference::class)
public interface IAutoSuggestBoxSuggestionChosenEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SelectedItem(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxSuggestionChosenEventArgs> {
    public override fun getValue() =
        ABI.makeIAutoSuggestBoxSuggestionChosenEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxSuggestionChosenEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxSuggestionChosenEventArgs {
    public val __393588463_Ptr: Pointer?

    public val _393588463_VtblPtr: Pointer?
      get() = __393588463_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SelectedItem(): IUnknown? {
      val fnPtr = _393588463_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__393588463_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IAutoSuggestBoxSuggestionChosenEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __393588463_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxSuggestionChosenEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("396f72541ed54bc5a060655530bca6ba")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxSuggestionChosenEventArgs(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxSuggestionChosenEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IAutoSuggestBoxSuggestionChosenEventArgs {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxSuggestionChosenEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxSuggestionChosenEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__393588463_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxSuggestionChosenEventArgs):
        Array<IAutoSuggestBoxSuggestionChosenEventArgs?> = (elements as
        Array<IAutoSuggestBoxSuggestionChosenEventArgs?>).castToImpl<IAutoSuggestBoxSuggestionChosenEventArgs,IAutoSuggestBoxSuggestionChosenEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxSuggestionChosenEventArgs?> =
        arrayOfNulls<IAutoSuggestBoxSuggestionChosenEventArgs_Impl>(size) as
        Array<IAutoSuggestBoxSuggestionChosenEventArgs?>
  }
}
