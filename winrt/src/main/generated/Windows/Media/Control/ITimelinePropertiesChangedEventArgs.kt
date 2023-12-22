package Windows.Media.Control

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

@ABIMarker(ITimelinePropertiesChangedEventArgs.ABI::class)
@Signature("{29033a2f-c923-5a77-bcaf-055ff415ad32}")
@Guid("29033a2fc9235a77bcaf055ff415ad32")
@WinRTInterface("29033a2fc9235a77bcaf055ff415ad32")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITimelinePropertiesChangedEventArgs.ByReference::class)
public interface ITimelinePropertiesChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITimelinePropertiesChangedEventArgs> {
    public override fun getValue() =
        ABI.makeITimelinePropertiesChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITimelinePropertiesChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITimelinePropertiesChangedEventArgs {
    public val __1434140440_Ptr: Pointer?

    public val _1434140440_VtblPtr: Pointer?
      get() = __1434140440_Ptr?.getPointer(0)
  }

  public class ITimelinePropertiesChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1434140440_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITimelinePropertiesChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29033a2fc9235a77bcaf055ff415ad32")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITimelinePropertiesChangedEventArgs(ptr: Pointer?): WithDefault =
        ITimelinePropertiesChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITimelinePropertiesChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeITimelinePropertiesChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITimelinePropertiesChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1434140440_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITimelinePropertiesChangedEventArgs):
        Array<ITimelinePropertiesChangedEventArgs?> = (elements as
        Array<ITimelinePropertiesChangedEventArgs?>).castToImpl<ITimelinePropertiesChangedEventArgs,ITimelinePropertiesChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITimelinePropertiesChangedEventArgs?> =
        arrayOfNulls<ITimelinePropertiesChangedEventArgs_Impl>(size) as
        Array<ITimelinePropertiesChangedEventArgs?>
  }
}
