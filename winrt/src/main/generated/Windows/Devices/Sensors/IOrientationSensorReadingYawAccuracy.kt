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

@ABIMarker(IOrientationSensorReadingYawAccuracy.ABI::class)
@Signature("{d1ac9824-3f5a-49a2-bc7b-1180bc38cd2b}")
@Guid("d1ac98243f5a49a2bc7b1180bc38cd2b")
@WinRTInterface("d1ac98243f5a49a2bc7b1180bc38cd2b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorReadingYawAccuracy.ByReference::class)
public interface IOrientationSensorReadingYawAccuracy : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_YawAccuracy(): MagnetometerAccuracy?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorReadingYawAccuracy> {
    public override fun getValue() =
        ABI.makeIOrientationSensorReadingYawAccuracy(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorReadingYawAccuracy_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorReadingYawAccuracy {
    public val __1120641082_Ptr: Pointer?

    public val _1120641082_VtblPtr: Pointer?
      get() = __1120641082_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_YawAccuracy(): MagnetometerAccuracy? {
      val fnPtr = _1120641082_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MagnetometerAccuracy>()
      val hr = fn.invokeHR(arrayOf(__1120641082_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MagnetometerAccuracy>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorReadingYawAccuracy_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1120641082_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorReadingYawAccuracy, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d1ac98243f5a49a2bc7b1180bc38cd2b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorReadingYawAccuracy(ptr: Pointer?): WithDefault =
        IOrientationSensorReadingYawAccuracy_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorReadingYawAccuracy {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorReadingYawAccuracy(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorReadingYawAccuracy): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1120641082_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorReadingYawAccuracy):
        Array<IOrientationSensorReadingYawAccuracy?> = (elements as
        Array<IOrientationSensorReadingYawAccuracy?>).castToImpl<IOrientationSensorReadingYawAccuracy,IOrientationSensorReadingYawAccuracy_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorReadingYawAccuracy?> =
        arrayOfNulls<IOrientationSensorReadingYawAccuracy_Impl>(size) as
        Array<IOrientationSensorReadingYawAccuracy?>
  }
}
