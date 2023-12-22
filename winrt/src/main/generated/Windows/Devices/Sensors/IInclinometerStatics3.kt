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

@ABIMarker(IInclinometerStatics3.ABI::class)
@Signature("{bd9a4280-b91a-4829-9392-abc0b6bdf2b4}")
@Guid("bd9a4280b91a48299392abc0b6bdf2b4")
@WinRTInterface("bd9a4280b91a48299392abc0b6bdf2b4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInclinometerStatics3.ByReference::class)
public interface IInclinometerStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(sensorReadingtype: SensorReadingType?): Inclinometer?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInclinometerStatics3> {
    public override fun getValue() = ABI.makeIInclinometerStatics3(pointer.getPointer(0))

    public fun setValue(value: IInclinometerStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInclinometerStatics3 {
    public val __1043050567_Ptr: Pointer?

    public val _1043050567_VtblPtr: Pointer?
      get() = __1043050567_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(sensorReadingtype: SensorReadingType?): Inclinometer? {
      val fnPtr = _1043050567_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Inclinometer>()
      val hr = fn.invokeHR(arrayOf(__1043050567_Ptr, marshalToNative(sensorReadingtype), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Inclinometer>(result.getValue())
      return resultValue
    }
  }

  public class IInclinometerStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1043050567_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInclinometerStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bd9a4280b91a48299392abc0b6bdf2b4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInclinometerStatics3(ptr: Pointer?): WithDefault =
        IInclinometerStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInclinometerStatics3 {
      val address = segment.toRawLongValue()
      return makeIInclinometerStatics3(Pointer(address))
    }

    public override fun toNative(obj: IInclinometerStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1043050567_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInclinometerStatics3): Array<IInclinometerStatics3?> =
        (elements as
        Array<IInclinometerStatics3?>).castToImpl<IInclinometerStatics3,IInclinometerStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInclinometerStatics3?> =
        arrayOfNulls<IInclinometerStatics3_Impl>(size) as Array<IInclinometerStatics3?>
  }
}
