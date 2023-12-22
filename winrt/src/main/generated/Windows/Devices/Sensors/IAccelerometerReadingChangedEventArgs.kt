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

@ABIMarker(IAccelerometerReadingChangedEventArgs.ABI::class)
@Signature("{0095c65b-b6ac-475a-9f44-8b32d35a3f25}")
@Guid("0095c65bb6ac475a9f448b32d35a3f25")
@WinRTInterface("0095c65bb6ac475a9f448b32d35a3f25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccelerometerReadingChangedEventArgs.ByReference::class)
public interface IAccelerometerReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): AccelerometerReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccelerometerReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIAccelerometerReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAccelerometerReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccelerometerReadingChangedEventArgs {
    public val __151591028_Ptr: Pointer?

    public val _151591028_VtblPtr: Pointer?
      get() = __151591028_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): AccelerometerReading? {
      val fnPtr = _151591028_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AccelerometerReading>()
      val hr = fn.invokeHR(arrayOf(__151591028_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AccelerometerReading>(result.getValue())
      return resultValue
    }
  }

  public class IAccelerometerReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __151591028_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccelerometerReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0095c65bb6ac475a9f448b32d35a3f25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccelerometerReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IAccelerometerReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccelerometerReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAccelerometerReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAccelerometerReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__151591028_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccelerometerReadingChangedEventArgs):
        Array<IAccelerometerReadingChangedEventArgs?> = (elements as
        Array<IAccelerometerReadingChangedEventArgs?>).castToImpl<IAccelerometerReadingChangedEventArgs,IAccelerometerReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccelerometerReadingChangedEventArgs?> =
        arrayOfNulls<IAccelerometerReadingChangedEventArgs_Impl>(size) as
        Array<IAccelerometerReadingChangedEventArgs?>
  }
}
