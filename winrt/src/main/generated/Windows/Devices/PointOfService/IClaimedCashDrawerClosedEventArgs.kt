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

@ABIMarker(IClaimedCashDrawerClosedEventArgs.ABI::class)
@Signature("{cc573f33-3f34-4c5c-baae-deadf16cd7fa}")
@Guid("cc573f333f344c5cbaaedeadf16cd7fa")
@WinRTInterface("cc573f333f344c5cbaaedeadf16cd7fa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedCashDrawerClosedEventArgs.ByReference::class)
public interface IClaimedCashDrawerClosedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedCashDrawerClosedEventArgs> {
    public override fun getValue() =
        ABI.makeIClaimedCashDrawerClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IClaimedCashDrawerClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedCashDrawerClosedEventArgs {
    public val __1700206229_Ptr: Pointer?

    public val _1700206229_VtblPtr: Pointer?
      get() = __1700206229_Ptr?.getPointer(0)
  }

  public class IClaimedCashDrawerClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1700206229_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedCashDrawerClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cc573f333f344c5cbaaedeadf16cd7fa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedCashDrawerClosedEventArgs(ptr: Pointer?): WithDefault =
        IClaimedCashDrawerClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedCashDrawerClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIClaimedCashDrawerClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IClaimedCashDrawerClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1700206229_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedCashDrawerClosedEventArgs):
        Array<IClaimedCashDrawerClosedEventArgs?> = (elements as
        Array<IClaimedCashDrawerClosedEventArgs?>).castToImpl<IClaimedCashDrawerClosedEventArgs,IClaimedCashDrawerClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedCashDrawerClosedEventArgs?> =
        arrayOfNulls<IClaimedCashDrawerClosedEventArgs_Impl>(size) as
        Array<IClaimedCashDrawerClosedEventArgs?>
  }
}
