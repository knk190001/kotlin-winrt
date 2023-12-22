package Windows.Devices.PointOfService

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

@ABIMarker(IClaimedLineDisplayClosedEventArgs.ABI::class)
@Signature("{f915f364-d3d5-4f10-b511-90939edfacd8}")
@Guid("f915f364d3d54f10b51190939edfacd8")
@WinRTInterface("f915f364d3d54f10b51190939edfacd8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedLineDisplayClosedEventArgs.ByReference::class)
public interface IClaimedLineDisplayClosedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedLineDisplayClosedEventArgs> {
    public override fun getValue() =
        ABI.makeIClaimedLineDisplayClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IClaimedLineDisplayClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedLineDisplayClosedEventArgs {
    public val __1724194169_Ptr: Pointer?

    public val _1724194169_VtblPtr: Pointer?
      get() = __1724194169_Ptr?.getPointer(0)
  }

  public class IClaimedLineDisplayClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1724194169_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedLineDisplayClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f915f364d3d54f10b51190939edfacd8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedLineDisplayClosedEventArgs(ptr: Pointer?): WithDefault =
        IClaimedLineDisplayClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedLineDisplayClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIClaimedLineDisplayClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IClaimedLineDisplayClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1724194169_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedLineDisplayClosedEventArgs):
        Array<IClaimedLineDisplayClosedEventArgs?> = (elements as
        Array<IClaimedLineDisplayClosedEventArgs?>).castToImpl<IClaimedLineDisplayClosedEventArgs,IClaimedLineDisplayClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedLineDisplayClosedEventArgs?> =
        arrayOfNulls<IClaimedLineDisplayClosedEventArgs_Impl>(size) as
        Array<IClaimedLineDisplayClosedEventArgs?>
  }
}
