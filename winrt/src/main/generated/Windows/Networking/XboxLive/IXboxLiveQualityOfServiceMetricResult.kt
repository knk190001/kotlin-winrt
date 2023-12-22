package Windows.Networking.XboxLive

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IXboxLiveQualityOfServiceMetricResult.ABI::class)
@Signature("{aeec53d1-3561-4782-b0cf-d3ae29d9fa87}")
@Guid("aeec53d135614782b0cfd3ae29d9fa87")
@WinRTInterface("aeec53d135614782b0cfd3ae29d9fa87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveQualityOfServiceMetricResult.ByReference::class)
public interface IXboxLiveQualityOfServiceMetricResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): XboxLiveQualityOfServiceMeasurementStatus?

  @InterfaceMethod(1)
  public fun get_DeviceAddress(): XboxLiveDeviceAddress?

  @InterfaceMethod(2)
  public fun get_Metric(): XboxLiveQualityOfServiceMetric?

  @InterfaceMethod(3)
  public fun get_Value(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveQualityOfServiceMetricResult> {
    public override fun getValue() =
        ABI.makeIXboxLiveQualityOfServiceMetricResult(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveQualityOfServiceMetricResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveQualityOfServiceMetricResult {
    public val __759751482_Ptr: Pointer?

    public val _759751482_VtblPtr: Pointer?
      get() = __759751482_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): XboxLiveQualityOfServiceMeasurementStatus? {
      val fnPtr = _759751482_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveQualityOfServiceMeasurementStatus>()
      val hr = fn.invokeHR(arrayOf(__759751482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<XboxLiveQualityOfServiceMeasurementStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DeviceAddress(): XboxLiveDeviceAddress? {
      val fnPtr = _759751482_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveDeviceAddress>()
      val hr = fn.invokeHR(arrayOf(__759751482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveDeviceAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Metric(): XboxLiveQualityOfServiceMetric? {
      val fnPtr = _759751482_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveQualityOfServiceMetric>()
      val hr = fn.invokeHR(arrayOf(__759751482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveQualityOfServiceMetric>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Value(): WinDef.ULONG {
      val fnPtr = _759751482_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__759751482_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IXboxLiveQualityOfServiceMetricResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __759751482_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveQualityOfServiceMetricResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aeec53d135614782b0cfd3ae29d9fa87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveQualityOfServiceMetricResult(ptr: Pointer?): WithDefault =
        IXboxLiveQualityOfServiceMetricResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXboxLiveQualityOfServiceMetricResult {
      val address = segment.toRawLongValue()
      return makeIXboxLiveQualityOfServiceMetricResult(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveQualityOfServiceMetricResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__759751482_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveQualityOfServiceMetricResult):
        Array<IXboxLiveQualityOfServiceMetricResult?> = (elements as
        Array<IXboxLiveQualityOfServiceMetricResult?>).castToImpl<IXboxLiveQualityOfServiceMetricResult,IXboxLiveQualityOfServiceMetricResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveQualityOfServiceMetricResult?> =
        arrayOfNulls<IXboxLiveQualityOfServiceMetricResult_Impl>(size) as
        Array<IXboxLiveQualityOfServiceMetricResult?>
  }
}
