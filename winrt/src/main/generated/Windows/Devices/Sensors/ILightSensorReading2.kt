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

@ABIMarker(ILightSensorReading2.ABI::class)
@Signature("{b7512185-44a3-44c9-8190-9ef6de0a8a74}")
@Guid("b751218544a344c981909ef6de0a8a74")
@WinRTInterface("b751218544a344c981909ef6de0a8a74")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILightSensorReading2.ByReference::class)
public interface ILightSensorReading2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PerformanceCount(): IReference<TimeSpan?>?

  @InterfaceMethod(1)
  public fun get_Properties(): IMapView<String?, IUnknown?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILightSensorReading2> {
    public override fun getValue() = ABI.makeILightSensorReading2(pointer.getPointer(0))

    public fun setValue(value: ILightSensorReading2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILightSensorReading2 {
    public val __574197174_Ptr: Pointer?

    public val _574197174_VtblPtr: Pointer?
      get() = __574197174_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PerformanceCount(): IReference<TimeSpan?>? {
      val fnPtr = _574197174_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<TimeSpan?>>()
      val hr = fn.invokeHR(arrayOf(__574197174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<TimeSpan?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Properties(): IMapView<String?, IUnknown?>? {
      val fnPtr = _574197174_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMapView<String?, IUnknown?>>()
      val hr = fn.invokeHR(arrayOf(__574197174_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMapView<String?, IUnknown?>>(result.getValue())
      return resultValue
    }
  }

  public class ILightSensorReading2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __574197174_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILightSensorReading2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b751218544a344c981909ef6de0a8a74")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILightSensorReading2(ptr: Pointer?): WithDefault = ILightSensorReading2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILightSensorReading2 {
      val address = segment.toRawLongValue()
      return makeILightSensorReading2(Pointer(address))
    }

    public override fun toNative(obj: ILightSensorReading2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__574197174_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILightSensorReading2): Array<ILightSensorReading2?> =
        (elements as
        Array<ILightSensorReading2?>).castToImpl<ILightSensorReading2,ILightSensorReading2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILightSensorReading2?> =
        arrayOfNulls<ILightSensorReading2_Impl>(size) as Array<ILightSensorReading2?>
  }
}
