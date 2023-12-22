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

@ABIMarker(IClaimedPosPrinterClosedEventArgs.ABI::class)
@Signature("{e2b7a27b-4d40-471d-92ed-63375b18c788}")
@Guid("e2b7a27b4d40471d92ed63375b18c788")
@WinRTInterface("e2b7a27b4d40471d92ed63375b18c788")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedPosPrinterClosedEventArgs.ByReference::class)
public interface IClaimedPosPrinterClosedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedPosPrinterClosedEventArgs> {
    public override fun getValue() =
        ABI.makeIClaimedPosPrinterClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IClaimedPosPrinterClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedPosPrinterClosedEventArgs {
    public val __1083832311_Ptr: Pointer?

    public val _1083832311_VtblPtr: Pointer?
      get() = __1083832311_Ptr?.getPointer(0)
  }

  public class IClaimedPosPrinterClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1083832311_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedPosPrinterClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e2b7a27b4d40471d92ed63375b18c788")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedPosPrinterClosedEventArgs(ptr: Pointer?): WithDefault =
        IClaimedPosPrinterClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedPosPrinterClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIClaimedPosPrinterClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IClaimedPosPrinterClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1083832311_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedPosPrinterClosedEventArgs):
        Array<IClaimedPosPrinterClosedEventArgs?> = (elements as
        Array<IClaimedPosPrinterClosedEventArgs?>).castToImpl<IClaimedPosPrinterClosedEventArgs,IClaimedPosPrinterClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedPosPrinterClosedEventArgs?> =
        arrayOfNulls<IClaimedPosPrinterClosedEventArgs_Impl>(size) as
        Array<IClaimedPosPrinterClosedEventArgs?>
  }
}
