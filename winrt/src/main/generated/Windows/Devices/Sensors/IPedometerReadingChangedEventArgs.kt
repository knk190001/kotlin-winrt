package Windows.Devices.Sensors

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IPedometerReadingChangedEventArgs.ABI::class)
@Signature("{f855e47e-abbc-4456-86a8-25cf2b333742}")
@Guid("f855e47eabbc445686a825cf2b333742")
@WinRTInterface("f855e47eabbc445686a825cf2b333742")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPedometerReadingChangedEventArgs.ByReference::class)
public interface IPedometerReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): PedometerReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPedometerReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIPedometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPedometerReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPedometerReadingChangedEventArgs {
    public val __1406456402_Ptr: Pointer?

    public val _1406456402_VtblPtr: Pointer?
      get() = __1406456402_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): PedometerReading? {
      val fnPtr = _1406456402_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PedometerReading>()
      val hr = fn.invokeHR(arrayOf(__1406456402_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PedometerReading>(result.getValue())
      return resultValue
    }
  }

  public class IPedometerReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1406456402_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPedometerReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f855e47eabbc445686a825cf2b333742")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPedometerReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IPedometerReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPedometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPedometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPedometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1406456402_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPedometerReadingChangedEventArgs):
        Array<IPedometerReadingChangedEventArgs?> = (elements as
        Array<IPedometerReadingChangedEventArgs?>).castToImpl<IPedometerReadingChangedEventArgs,IPedometerReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPedometerReadingChangedEventArgs?> =
        arrayOfNulls<IPedometerReadingChangedEventArgs_Impl>(size) as
        Array<IPedometerReadingChangedEventArgs?>
  }
}
