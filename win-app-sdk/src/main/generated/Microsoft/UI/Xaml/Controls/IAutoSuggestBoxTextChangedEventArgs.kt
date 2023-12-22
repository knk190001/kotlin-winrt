package Microsoft.UI.Xaml.Controls

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAutoSuggestBoxTextChangedEventArgs.ABI::class)
@Signature("{d7191d84-e886-547f-a3e2-12f0e05b20fa}")
@Guid("d7191d84e886547fa3e212f0e05b20fa")
@WinRTInterface("d7191d84e886547fa3e212f0e05b20fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAutoSuggestBoxTextChangedEventArgs.ByReference::class)
public interface IAutoSuggestBoxTextChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reason(): AutoSuggestionBoxTextChangeReason?

  @InterfaceMethod(1)
  public fun put_Reason(value: AutoSuggestionBoxTextChangeReason?): Unit

  @InterfaceMethod(2)
  public fun CheckCurrent(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAutoSuggestBoxTextChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAutoSuggestBoxTextChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAutoSuggestBoxTextChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAutoSuggestBoxTextChangedEventArgs {
    public val __1658137965_Ptr: Pointer?

    public val _1658137965_VtblPtr: Pointer?
      get() = __1658137965_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reason(): AutoSuggestionBoxTextChangeReason? {
      val fnPtr = _1658137965_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AutoSuggestionBoxTextChangeReason>()
      val hr = fn.invokeHR(arrayOf(__1658137965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AutoSuggestionBoxTextChangeReason>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Reason(value: AutoSuggestionBoxTextChangeReason?): Unit {
      val fnPtr = _1658137965_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1658137965_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun CheckCurrent(): Boolean {
      val fnPtr = _1658137965_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1658137965_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAutoSuggestBoxTextChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1658137965_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAutoSuggestBoxTextChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7191d84e886547fa3e212f0e05b20fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAutoSuggestBoxTextChangedEventArgs(ptr: Pointer?): WithDefault =
        IAutoSuggestBoxTextChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAutoSuggestBoxTextChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAutoSuggestBoxTextChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAutoSuggestBoxTextChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1658137965_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAutoSuggestBoxTextChangedEventArgs):
        Array<IAutoSuggestBoxTextChangedEventArgs?> = (elements as
        Array<IAutoSuggestBoxTextChangedEventArgs?>).castToImpl<IAutoSuggestBoxTextChangedEventArgs,IAutoSuggestBoxTextChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAutoSuggestBoxTextChangedEventArgs?> =
        arrayOfNulls<IAutoSuggestBoxTextChangedEventArgs_Impl>(size) as
        Array<IAutoSuggestBoxTextChangedEventArgs?>
  }
}
