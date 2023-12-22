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

@ABIMarker(IClaimedBarcodeScannerClosedEventArgs.ABI::class)
@Signature("{cf7d5489-a22c-4c65-a901-88d77d833954}")
@Guid("cf7d5489a22c4c65a90188d77d833954")
@WinRTInterface("cf7d5489a22c4c65a90188d77d833954")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClaimedBarcodeScannerClosedEventArgs.ByReference::class)
public interface IClaimedBarcodeScannerClosedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClaimedBarcodeScannerClosedEventArgs> {
    public override fun getValue() =
        ABI.makeIClaimedBarcodeScannerClosedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IClaimedBarcodeScannerClosedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClaimedBarcodeScannerClosedEventArgs {
    public val __193036079_Ptr: Pointer?

    public val _193036079_VtblPtr: Pointer?
      get() = __193036079_Ptr?.getPointer(0)
  }

  public class IClaimedBarcodeScannerClosedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __193036079_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClaimedBarcodeScannerClosedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cf7d5489a22c4c65a90188d77d833954")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClaimedBarcodeScannerClosedEventArgs(ptr: Pointer?): WithDefault =
        IClaimedBarcodeScannerClosedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClaimedBarcodeScannerClosedEventArgs {
      val address = segment.toRawLongValue()
      return makeIClaimedBarcodeScannerClosedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IClaimedBarcodeScannerClosedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__193036079_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClaimedBarcodeScannerClosedEventArgs):
        Array<IClaimedBarcodeScannerClosedEventArgs?> = (elements as
        Array<IClaimedBarcodeScannerClosedEventArgs?>).castToImpl<IClaimedBarcodeScannerClosedEventArgs,IClaimedBarcodeScannerClosedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClaimedBarcodeScannerClosedEventArgs?> =
        arrayOfNulls<IClaimedBarcodeScannerClosedEventArgs_Impl>(size) as
        Array<IClaimedBarcodeScannerClosedEventArgs?>
  }
}
