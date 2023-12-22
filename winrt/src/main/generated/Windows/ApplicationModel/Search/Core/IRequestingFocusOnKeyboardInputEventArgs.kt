package Windows.ApplicationModel.Search.Core

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRequestingFocusOnKeyboardInputEventArgs.ABI::class)
@Signature("{a1195f27-b1a7-41a2-879d-6a68687e5985}")
@Guid("a1195f27b1a741a2879d6a68687e5985")
@WinRTInterface("a1195f27b1a741a2879d6a68687e5985")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRequestingFocusOnKeyboardInputEventArgs.ByReference::class)
public interface IRequestingFocusOnKeyboardInputEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRequestingFocusOnKeyboardInputEventArgs> {
    public override fun getValue() =
        ABI.makeIRequestingFocusOnKeyboardInputEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRequestingFocusOnKeyboardInputEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRequestingFocusOnKeyboardInputEventArgs {
    public val __1111171818_Ptr: Pointer?

    public val _1111171818_VtblPtr: Pointer?
      get() = __1111171818_Ptr?.getPointer(0)
  }

  public class IRequestingFocusOnKeyboardInputEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111171818_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRequestingFocusOnKeyboardInputEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a1195f27b1a741a2879d6a68687e5985")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRequestingFocusOnKeyboardInputEventArgs(ptr: Pointer?): WithDefault =
        IRequestingFocusOnKeyboardInputEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRequestingFocusOnKeyboardInputEventArgs {
      val address = segment.toRawLongValue()
      return makeIRequestingFocusOnKeyboardInputEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRequestingFocusOnKeyboardInputEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111171818_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRequestingFocusOnKeyboardInputEventArgs):
        Array<IRequestingFocusOnKeyboardInputEventArgs?> = (elements as
        Array<IRequestingFocusOnKeyboardInputEventArgs?>).castToImpl<IRequestingFocusOnKeyboardInputEventArgs,IRequestingFocusOnKeyboardInputEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRequestingFocusOnKeyboardInputEventArgs?> =
        arrayOfNulls<IRequestingFocusOnKeyboardInputEventArgs_Impl>(size) as
        Array<IRequestingFocusOnKeyboardInputEventArgs?>
  }
}
