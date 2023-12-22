package Windows.Devices.Sensors

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.IReference
import Windows.Foundation.TimeSpan
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IOrientationSensorReading2.ABI::class)
@Signature("{00576e5f-49f8-4c05-9e07-24fac79408c3}")
@Guid("00576e5f49f84c059e0724fac79408c3")
@WinRTInterface("00576e5f49f84c059e0724fac79408c3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IOrientationSensorReading2.ByReference::class)
public interface IOrientationSensorReading2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PerformanceCount(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IOrientationSensorReading2> {
    public override fun getValue() = ABI.makeIOrientationSensorReading2(pointer.getPointer(0))

    public fun setValue(value: IOrientationSensorReading2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IOrientationSensorReading2 {
    public val __1280386692_Ptr: Pointer?

    public val _1280386692_VtblPtr: Pointer?
      get() = __1280386692_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PerformanceCount(): IReference<TimeSpan?>? {
      val fnPtr = _1280386692_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__1280386692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _1280386692_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__1280386692_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class IOrientationSensorReading2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1280386692_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IOrientationSensorReading2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("00576e5f49f84c059e0724fac79408c3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIOrientationSensorReading2(ptr: Pointer?): WithDefault =
        IOrientationSensorReading2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IOrientationSensorReading2 {
      val address = segment.toRawLongValue()
      return makeIOrientationSensorReading2(Pointer(address))
    }

    public override fun toNative(obj: IOrientationSensorReading2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1280386692_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IOrientationSensorReading2):
        Array<IOrientationSensorReading2?> = (elements as
        Array<IOrientationSensorReading2?>).castToImpl<IOrientationSensorReading2,IOrientationSensorReading2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IOrientationSensorReading2?> =
        arrayOfNulls<IOrientationSensorReading2_Impl>(size) as Array<IOrientationSensorReading2?>
  }
}
