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

@ABIMarker(IOrientationSensorReadingChangedEventArgs.ABI::class)
@Signature("{012c1186-c3ba-46bc-ae65-7a98996cbfb8}")
@Guid("012c1186c3ba46bcae657a98996cbfb8")
@WinRTInterface("012c1186c3ba46bcae657a98996cbfb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorReadingChangedEventArgs.ByReference::class)
public interface IOrientationSensorReadingChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Reading(): OrientationSensorReading?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorReadingChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIOrientationSensorReadingChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorReadingChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorReadingChangedEventArgs {
    public val __1484074543_Ptr: Pointer?

    public val _1484074543_VtblPtr: Pointer?
      get() = __1484074543_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Reading(): OrientationSensorReading? {
      val fnPtr = _1484074543_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OrientationSensorReading>()
      val hr = fn.invokeHR(arrayOf(__1484074543_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OrientationSensorReading>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorReadingChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1484074543_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorReadingChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("012c1186c3ba46bcae657a98996cbfb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorReadingChangedEventArgs(ptr: Pointer?): WithDefault =
        IOrientationSensorReadingChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IOrientationSensorReadingChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorReadingChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorReadingChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1484074543_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorReadingChangedEventArgs):
        Array<IOrientationSensorReadingChangedEventArgs?> = (elements as
        Array<IOrientationSensorReadingChangedEventArgs?>).castToImpl<IOrientationSensorReadingChangedEventArgs,IOrientationSensorReadingChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorReadingChangedEventArgs?> =
        arrayOfNulls<IOrientationSensorReadingChangedEventArgs_Impl>(size) as
        Array<IOrientationSensorReadingChangedEventArgs?>
  }
}
