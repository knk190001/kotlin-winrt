package Windows.UI.Xaml.Controls

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

@ABIMarker(IHandwritingPanelClosedEventArgs.ABI::class)
@Signature("{4fb91c73-192d-4dd2-a1a2-80ed01125876}")
@Guid("4fb91c73192d4dd2a1a280ed01125876")
@WinRTInterface("4fb91c73192d4dd2a1a280ed01125876")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHandwritingPanelClosedEventArgs.ByReference::class)
public interface IHandwritingPanelClosedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHandwritingPanelClosedEventArgs> {
    public override fun getValue() = ABI.makeIHandwritingPanelClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IHandwritingPanelClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHandwritingPanelClosedEventArgs {
    public val __277376648_Ptr: Pointer?

    public val _277376648_VtblPtr: Pointer?
      get() = __277376648_Ptr?.getPointer(0)
  }

  public class IHandwritingPanelClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __277376648_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHandwritingPanelClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4fb91c73192d4dd2a1a280ed01125876")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHandwritingPanelClosedEventArgs(ptr: Pointer?): WithDefault =
        IHandwritingPanelClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHandwritingPanelClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIHandwritingPanelClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IHandwritingPanelClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__277376648_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHandwritingPanelClosedEventArgs):
        Array<IHandwritingPanelClosedEventArgs?> = (elements as
        Array<IHandwritingPanelClosedEventArgs?>).castToImpl<IHandwritingPanelClosedEventArgs,IHandwritingPanelClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHandwritingPanelClosedEventArgs?> =
        arrayOfNulls<IHandwritingPanelClosedEventArgs_Impl>(size) as
        Array<IHandwritingPanelClosedEventArgs?>
  }
}
