package Windows.Networking.XboxLive

import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IXboxLiveQualityOfServiceMeasurement.ABI::class)
@Signature("{4d682bce-a5d6-47e6-a236-cfde5fbdf2ed}")
@Guid("4d682bcea5d647e6a236cfde5fbdf2ed")
@WinRTInterface("4d682bcea5d647e6a236cfde5fbdf2ed")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXboxLiveQualityOfServiceMeasurement.ByReference::class)
public interface IXboxLiveQualityOfServiceMeasurement : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun MeasureAsync(): IAsyncAction?

  @InterfaceMethod(1)
  public fun GetMetricResultsForDevice(deviceAddress: XboxLiveDeviceAddress?):
      IVectorView<XboxLiveQualityOfServiceMetricResult?>?

  @InterfaceMethod(2)
  public fun GetMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric?):
      IVectorView<XboxLiveQualityOfServiceMetricResult?>?

  @InterfaceMethod(3)
  public fun GetMetricResult(deviceAddress: XboxLiveDeviceAddress?,
      metric: XboxLiveQualityOfServiceMetric?): XboxLiveQualityOfServiceMetricResult?

  @InterfaceMethod(4)
  public fun GetPrivatePayloadResult(deviceAddress: XboxLiveDeviceAddress?):
      XboxLiveQualityOfServicePrivatePayloadResult?

  @InterfaceMethod(5)
  public fun get_Metrics(): IVector<XboxLiveQualityOfServiceMetric?>?

  @InterfaceMethod(6)
  public fun get_DeviceAddresses(): IVector<XboxLiveDeviceAddress?>?

  @InterfaceMethod(7)
  public fun get_ShouldRequestPrivatePayloads(): Boolean

  @InterfaceMethod(8)
  public fun put_ShouldRequestPrivatePayloads(value: Boolean): Unit

  @InterfaceMethod(9)
  public fun get_TimeoutInMilliseconds(): WinDef.UINT

  @InterfaceMethod(10)
  public fun put_TimeoutInMilliseconds(value: WinDef.UINT): Unit

  @InterfaceMethod(11)
  public fun get_NumberOfProbesToAttempt(): WinDef.UINT

  @InterfaceMethod(12)
  public fun put_NumberOfProbesToAttempt(value: WinDef.UINT): Unit

  @InterfaceMethod(13)
  public fun get_NumberOfResultsPending(): WinDef.UINT

  @InterfaceMethod(14)
  public fun get_MetricResults(): IVectorView<XboxLiveQualityOfServiceMetricResult?>?

  @InterfaceMethod(15)
  public fun get_PrivatePayloadResults():
      IVectorView<XboxLiveQualityOfServicePrivatePayloadResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXboxLiveQualityOfServiceMeasurement> {
    public override fun getValue() =
        ABI.makeIXboxLiveQualityOfServiceMeasurement(pointer.getPointer(0))

    public fun setValue(value: IXboxLiveQualityOfServiceMeasurement_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXboxLiveQualityOfServiceMeasurement {
    public val __2129307075_Ptr: Pointer?

    public val _2129307075_VtblPtr: Pointer?
      get() = __2129307075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun MeasureAsync(): IAsyncAction? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetMetricResultsForDevice(deviceAddress: XboxLiveDeviceAddress?):
        IVectorView<XboxLiveQualityOfServiceMetricResult?>? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<XboxLiveQualityOfServiceMetricResult?>>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr, marshalToNative(deviceAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<XboxLiveQualityOfServiceMetricResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetMetricResultsForMetric(metric: XboxLiveQualityOfServiceMetric?):
        IVectorView<XboxLiveQualityOfServiceMetricResult?>? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<XboxLiveQualityOfServiceMetricResult?>>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr, marshalToNative(metric), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<XboxLiveQualityOfServiceMetricResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetMetricResult(deviceAddress: XboxLiveDeviceAddress?,
        metric: XboxLiveQualityOfServiceMetric?): XboxLiveQualityOfServiceMetricResult? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveQualityOfServiceMetricResult>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr, marshalToNative(deviceAddress),
          marshalToNative(metric), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<XboxLiveQualityOfServiceMetricResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetPrivatePayloadResult(deviceAddress: XboxLiveDeviceAddress?):
        XboxLiveQualityOfServicePrivatePayloadResult? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<XboxLiveQualityOfServicePrivatePayloadResult>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr, marshalToNative(deviceAddress), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<XboxLiveQualityOfServicePrivatePayloadResult>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Metrics(): IVector<XboxLiveQualityOfServiceMetric?>? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<XboxLiveQualityOfServiceMetric?>>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVector<XboxLiveQualityOfServiceMetric?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DeviceAddresses(): IVector<XboxLiveDeviceAddress?>? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<XboxLiveDeviceAddress?>>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<XboxLiveDeviceAddress?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ShouldRequestPrivatePayloads(): Boolean {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_ShouldRequestPrivatePayloads(value: Boolean): Unit {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_TimeoutInMilliseconds(): WinDef.UINT {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_TimeoutInMilliseconds(value: WinDef.UINT): Unit {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun get_NumberOfProbesToAttempt(): WinDef.UINT {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(12)
    public override fun put_NumberOfProbesToAttempt(value: WinDef.UINT): Unit {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun get_NumberOfResultsPending(): WinDef.UINT {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(14)
    public override fun get_MetricResults(): IVectorView<XboxLiveQualityOfServiceMetricResult?>? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<XboxLiveQualityOfServiceMetricResult?>>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<XboxLiveQualityOfServiceMetricResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_PrivatePayloadResults():
        IVectorView<XboxLiveQualityOfServicePrivatePayloadResult?>? {
      val fnPtr = _2129307075_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<XboxLiveQualityOfServicePrivatePayloadResult?>>()
      val hr = fn.invokeHR(arrayOf(__2129307075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<XboxLiveQualityOfServicePrivatePayloadResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IXboxLiveQualityOfServiceMeasurement_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2129307075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXboxLiveQualityOfServiceMeasurement, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4d682bcea5d647e6a236cfde5fbdf2ed")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXboxLiveQualityOfServiceMeasurement(ptr: Pointer?): WithDefault =
        IXboxLiveQualityOfServiceMeasurement_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXboxLiveQualityOfServiceMeasurement {
      val address = segment.toRawLongValue()
      return makeIXboxLiveQualityOfServiceMeasurement(Pointer(address))
    }

    public override fun toNative(obj: IXboxLiveQualityOfServiceMeasurement): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2129307075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXboxLiveQualityOfServiceMeasurement):
        Array<IXboxLiveQualityOfServiceMeasurement?> = (elements as
        Array<IXboxLiveQualityOfServiceMeasurement?>).castToImpl<IXboxLiveQualityOfServiceMeasurement,IXboxLiveQualityOfServiceMeasurement_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXboxLiveQualityOfServiceMeasurement?> =
        arrayOfNulls<IXboxLiveQualityOfServiceMeasurement_Impl>(size) as
        Array<IXboxLiveQualityOfServiceMeasurement?>
  }
}
