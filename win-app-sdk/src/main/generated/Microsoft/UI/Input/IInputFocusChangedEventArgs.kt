package Microsoft.UI.Input

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

@ABIMarker(IInputFocusChangedEventArgs.ABI::class)
@Signature("{d85b1b7a-045d-5a1b-9966-ebc0b3d47567}")
@Guid("d85b1b7a045d5a1b9966ebc0b3d47567")
@WinRTInterface("d85b1b7a045d5a1b9966ebc0b3d47567")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputFocusChangedEventArgs.ByReference::class)
public interface IInputFocusChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputFocusChangedEventArgs> {
    public override fun getValue() = ABI.makeIInputFocusChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInputFocusChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputFocusChangedEventArgs {
    public val __732457418_Ptr: Pointer?

    public val _732457418_VtblPtr: Pointer?
      get() = __732457418_Ptr?.getPointer(0)
  }

  public class IInputFocusChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __732457418_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputFocusChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d85b1b7a045d5a1b9966ebc0b3d47567")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputFocusChangedEventArgs(ptr: Pointer?): WithDefault =
        IInputFocusChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInputFocusChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInputFocusChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInputFocusChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__732457418_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputFocusChangedEventArgs):
        Array<IInputFocusChangedEventArgs?> = (elements as
        Array<IInputFocusChangedEventArgs?>).castToImpl<IInputFocusChangedEventArgs,IInputFocusChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInputFocusChangedEventArgs?> =
        arrayOfNulls<IInputFocusChangedEventArgs_Impl>(size) as Array<IInputFocusChangedEventArgs?>
  }
}
