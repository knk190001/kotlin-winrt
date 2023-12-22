package Microsoft.UI.Xaml.Controls

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutoSuggestBoxQuerySubmittedEventArgs.ABI::class)
@Signature("{26da5de4-57a6-57bf-acc9-aac599c0b22b}")
@Guid("26da5de457a657bfacc9aac599c0b22b")
@WinRTInterface("26da5de457a657bfacc9aac599c0b22b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxQuerySubmittedEventArgs.ByReference::class)
public interface IAutoSuggestBoxQuerySubmittedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_QueryText(): String?

  @InterfaceMethod(1)
  public fun get_ChosenSuggestion(): IUnknown?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxQuerySubmittedEventArgs> {
    public override fun getValue() =
        ABI.makeIAutoSuggestBoxQuerySubmittedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxQuerySubmittedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxQuerySubmittedEventArgs {
    public val __1523709497_Ptr: Pointer?

    public val _1523709497_VtblPtr: Pointer?
      get() = __1523709497_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_QueryText(): String? {
      val fnPtr = _1523709497_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1523709497_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChosenSuggestion(): IUnknown? {
      val fnPtr = _1523709497_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IUnknown>()
      val hr = fn.invokeHR(arrayOf(__1523709497_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IUnknown>(result.getValue())
      return resultValue
    }
  }

  public class IAutoSuggestBoxQuerySubmittedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1523709497_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxQuerySubmittedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("26da5de457a657bfacc9aac599c0b22b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxQuerySubmittedEventArgs(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxQuerySubmittedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxQuerySubmittedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxQuerySubmittedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxQuerySubmittedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1523709497_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxQuerySubmittedEventArgs):
        Array<IAutoSuggestBoxQuerySubmittedEventArgs?> = (elements as
        Array<IAutoSuggestBoxQuerySubmittedEventArgs?>).castToImpl<IAutoSuggestBoxQuerySubmittedEventArgs,IAutoSuggestBoxQuerySubmittedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxQuerySubmittedEventArgs?> =
        arrayOfNulls<IAutoSuggestBoxQuerySubmittedEventArgs_Impl>(size) as
        Array<IAutoSuggestBoxQuerySubmittedEventArgs?>
  }
}
