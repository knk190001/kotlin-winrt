package Windows.UI.ViewManagement

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

@ABIMarker(IUISettingsAutoHideScrollBarsChangedEventArgs.ABI::class)
@Signature("{87afd4b2-9146-5f02-8f6b-06d454174c0f}")
@Guid("87afd4b291465f028f6b06d454174c0f")
@WinRTInterface("87afd4b291465f028f6b06d454174c0f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettingsAutoHideScrollBarsChangedEventArgs.ByReference::class)
public interface IUISettingsAutoHideScrollBarsChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUISettingsAutoHideScrollBarsChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIUISettingsAutoHideScrollBarsChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUISettingsAutoHideScrollBarsChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettingsAutoHideScrollBarsChangedEventArgs {
    public val __419021654_Ptr: Pointer?

    public val _419021654_VtblPtr: Pointer?
      get() = __419021654_Ptr?.getPointer(0)
  }

  public class IUISettingsAutoHideScrollBarsChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __419021654_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettingsAutoHideScrollBarsChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("87afd4b291465f028f6b06d454174c0f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettingsAutoHideScrollBarsChangedEventArgs(ptr: Pointer?): WithDefault =
        IUISettingsAutoHideScrollBarsChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUISettingsAutoHideScrollBarsChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUISettingsAutoHideScrollBarsChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUISettingsAutoHideScrollBarsChangedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__419021654_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettingsAutoHideScrollBarsChangedEventArgs):
        Array<IUISettingsAutoHideScrollBarsChangedEventArgs?> = (elements as
        Array<IUISettingsAutoHideScrollBarsChangedEventArgs?>).castToImpl<IUISettingsAutoHideScrollBarsChangedEventArgs,IUISettingsAutoHideScrollBarsChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettingsAutoHideScrollBarsChangedEventArgs?> =
        arrayOfNulls<IUISettingsAutoHideScrollBarsChangedEventArgs_Impl>(size) as
        Array<IUISettingsAutoHideScrollBarsChangedEventArgs?>
  }
}
