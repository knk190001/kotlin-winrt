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

@ABIMarker(IUISettingsAnimationsEnabledChangedEventArgs.ABI::class)
@Signature("{0c7b4b3d-2ea1-533e-894d-415bc5243c29}")
@Guid("0c7b4b3d2ea1533e894d415bc5243c29")
@WinRTInterface("0c7b4b3d2ea1533e894d415bc5243c29")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettingsAnimationsEnabledChangedEventArgs.ByReference::class)
public interface IUISettingsAnimationsEnabledChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUISettingsAnimationsEnabledChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIUISettingsAnimationsEnabledChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUISettingsAnimationsEnabledChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettingsAnimationsEnabledChangedEventArgs {
    public val __1190500500_Ptr: Pointer?

    public val _1190500500_VtblPtr: Pointer?
      get() = __1190500500_Ptr?.getPointer(0)
  }

  public class IUISettingsAnimationsEnabledChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1190500500_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettingsAnimationsEnabledChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0c7b4b3d2ea1533e894d415bc5243c29")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettingsAnimationsEnabledChangedEventArgs(ptr: Pointer?): WithDefault =
        IUISettingsAnimationsEnabledChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUISettingsAnimationsEnabledChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUISettingsAnimationsEnabledChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUISettingsAnimationsEnabledChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1190500500_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettingsAnimationsEnabledChangedEventArgs):
        Array<IUISettingsAnimationsEnabledChangedEventArgs?> = (elements as
        Array<IUISettingsAnimationsEnabledChangedEventArgs?>).castToImpl<IUISettingsAnimationsEnabledChangedEventArgs,IUISettingsAnimationsEnabledChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettingsAnimationsEnabledChangedEventArgs?> =
        arrayOfNulls<IUISettingsAnimationsEnabledChangedEventArgs_Impl>(size) as
        Array<IUISettingsAnimationsEnabledChangedEventArgs?>
  }
}
