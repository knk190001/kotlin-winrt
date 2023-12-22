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

@ABIMarker(IUISettingsMessageDurationChangedEventArgs.ABI::class)
@Signature("{338aad52-4a5d-5b59-8002-d930f608fd6e}")
@Guid("338aad524a5d5b598002d930f608fd6e")
@WinRTInterface("338aad524a5d5b598002d930f608fd6e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUISettingsMessageDurationChangedEventArgs.ByReference::class)
public interface IUISettingsMessageDurationChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUISettingsMessageDurationChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIUISettingsMessageDurationChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IUISettingsMessageDurationChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUISettingsMessageDurationChangedEventArgs {
    public val __1939910421_Ptr: Pointer?

    public val _1939910421_VtblPtr: Pointer?
      get() = __1939910421_Ptr?.getPointer(0)
  }

  public class IUISettingsMessageDurationChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939910421_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUISettingsMessageDurationChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("338aad524a5d5b598002d930f608fd6e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUISettingsMessageDurationChangedEventArgs(ptr: Pointer?): WithDefault =
        IUISettingsMessageDurationChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IUISettingsMessageDurationChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIUISettingsMessageDurationChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IUISettingsMessageDurationChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939910421_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUISettingsMessageDurationChangedEventArgs):
        Array<IUISettingsMessageDurationChangedEventArgs?> = (elements as
        Array<IUISettingsMessageDurationChangedEventArgs?>).castToImpl<IUISettingsMessageDurationChangedEventArgs,IUISettingsMessageDurationChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUISettingsMessageDurationChangedEventArgs?> =
        arrayOfNulls<IUISettingsMessageDurationChangedEventArgs_Impl>(size) as
        Array<IUISettingsMessageDurationChangedEventArgs?>
  }
}
