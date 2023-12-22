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

@ABIMarker(IOrientationSensorStatics2.ABI::class)
@Signature("{59da0d0b-d40a-4c71-9276-8a272a0a6619}")
@Guid("59da0d0bd40a4c7192768a272a0a6619")
@WinRTInterface("59da0d0bd40a4c7192768a272a0a6619")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorStatics2.ByReference::class)
public interface IOrientationSensorStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefaultForRelativeReadings(): OrientationSensor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorStatics2> {
    public override fun getValue() = ABI.makeIOrientationSensorStatics2(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorStatics2 {
    public val __829350805_Ptr: Pointer?

    public val _829350805_VtblPtr: Pointer?
      get() = __829350805_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefaultForRelativeReadings(): OrientationSensor? {
      val fnPtr = _829350805_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<OrientationSensor>()
      val hr = fn.invokeHR(arrayOf(__829350805_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<OrientationSensor>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __829350805_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("59da0d0bd40a4c7192768a272a0a6619")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorStatics2(ptr: Pointer?): WithDefault =
        IOrientationSensorStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorStatics2 {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorStatics2(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__829350805_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorStatics2):
        Array<IOrientationSensorStatics2?> = (elements as
        Array<IOrientationSensorStatics2?>).castToImpl<IOrientationSensorStatics2,IOrientationSensorStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorStatics2?> =
        arrayOfNulls<IOrientationSensorStatics2_Impl>(size) as Array<IOrientationSensorStatics2?>
  }
}
