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

@ABIMarker(IInputActivationListenerActivationChangedEventArgs.ABI::class)
@Signature("{7978526b-00b6-5303-8f7d-55bef36da786}")
@Guid("7978526b00b653038f7d55bef36da786")
@WinRTInterface("7978526b00b653038f7d55bef36da786")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInputActivationListenerActivationChangedEventArgs.ByReference::class)
public interface IInputActivationListenerActivationChangedEventArgs : NativeMapped, IWinRTInterface
    {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInputActivationListenerActivationChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIInputActivationListenerActivationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IInputActivationListenerActivationChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInputActivationListenerActivationChangedEventArgs {
    public val __219253652_Ptr: Pointer?

    public val _219253652_VtblPtr: Pointer?
      get() = __219253652_Ptr?.getPointer(0)
  }

  public class IInputActivationListenerActivationChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __219253652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInputActivationListenerActivationChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7978526b00b653038f7d55bef36da786")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInputActivationListenerActivationChangedEventArgs(ptr: Pointer?): WithDefault =
        IInputActivationListenerActivationChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IInputActivationListenerActivationChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIInputActivationListenerActivationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IInputActivationListenerActivationChangedEventArgs):
        MemoryAddress = MemoryAddress.ofLong(Pointer.nativeValue((obj as
        WithDefault).__219253652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInputActivationListenerActivationChangedEventArgs):
        Array<IInputActivationListenerActivationChangedEventArgs?> = (elements as
        Array<IInputActivationListenerActivationChangedEventArgs?>).castToImpl<IInputActivationListenerActivationChangedEventArgs,IInputActivationListenerActivationChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int):
        Array<IInputActivationListenerActivationChangedEventArgs?> =
        arrayOfNulls<IInputActivationListenerActivationChangedEventArgs_Impl>(size) as
        Array<IInputActivationListenerActivationChangedEventArgs?>
  }
}
