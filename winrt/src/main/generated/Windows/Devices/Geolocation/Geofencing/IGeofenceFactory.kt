package Windows.Devices.Geolocation.Geofencing

import Windows.Devices.Geolocation.IGeoshape
import Windows.Foundation.DateTime
import Windows.Foundation.TimeSpan
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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeofenceFactory.ABI::class)
@Signature("{841f624b-325f-4b90-bca7-2b8022a93796}")
@Guid("841f624b325f4b90bca72b8022a93796")
@WinRTInterface("841f624b325f4b90bca72b8022a93796")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeofenceFactory.ByReference::class)
public interface IGeofenceFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(id: String?, geoshape: IGeoshape?): Geofence?

  @InterfaceMethod(1)
  public fun CreateWithMonitorStates(
    id: String?,
    geoshape: IGeoshape?,
    monitoredStates: MonitoredGeofenceStates?,
    singleUse: Boolean
  ): Geofence?

  @InterfaceMethod(2)
  public fun CreateWithMonitorStatesAndDwellTime(
    id: String?,
    geoshape: IGeoshape?,
    monitoredStates: MonitoredGeofenceStates?,
    singleUse: Boolean,
    dwellTime: TimeSpan?
  ): Geofence?

  @InterfaceMethod(3)
  public fun CreateWithMonitorStatesDwellTimeStartTimeAndDuration(
    id: String?,
    geoshape: IGeoshape?,
    monitoredStates: MonitoredGeofenceStates?,
    singleUse: Boolean,
    dwellTime: TimeSpan?,
    startTime: DateTime?,
    duration: TimeSpan?
  ): Geofence?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeofenceFactory> {
    public override fun getValue() = ABI.makeIGeofenceFactory(pointer.getPointer(0))

    public fun setValue(value: IGeofenceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeofenceFactory {
    public val __661348734_Ptr: Pointer?

    public val _661348734_VtblPtr: Pointer?
      get() = __661348734_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(id: String?, geoshape: IGeoshape?): Geofence? {
      val fnPtr = _661348734_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geofence>()
      val hr = fn.invokeHR(arrayOf(__661348734_Ptr, marshalToNative(id), marshalToNative(geoshape),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geofence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithMonitorStates(
      id: String?,
      geoshape: IGeoshape?,
      monitoredStates: MonitoredGeofenceStates?,
      singleUse: Boolean
    ): Geofence? {
      val fnPtr = _661348734_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geofence>()
      val hr = fn.invokeHR(arrayOf(__661348734_Ptr, marshalToNative(id), marshalToNative(geoshape),
          marshalToNative(monitoredStates), singleUse, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geofence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithMonitorStatesAndDwellTime(
      id: String?,
      geoshape: IGeoshape?,
      monitoredStates: MonitoredGeofenceStates?,
      singleUse: Boolean,
      dwellTime: TimeSpan?
    ): Geofence? {
      val fnPtr = _661348734_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geofence>()
      val hr = fn.invokeHR(arrayOf(__661348734_Ptr, marshalToNative(id), marshalToNative(geoshape),
          marshalToNative(monitoredStates), singleUse, marshalToNative(dwellTime), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geofence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateWithMonitorStatesDwellTimeStartTimeAndDuration(
      id: String?,
      geoshape: IGeoshape?,
      monitoredStates: MonitoredGeofenceStates?,
      singleUse: Boolean,
      dwellTime: TimeSpan?,
      startTime: DateTime?,
      duration: TimeSpan?
    ): Geofence? {
      val fnPtr = _661348734_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geofence>()
      val hr = fn.invokeHR(arrayOf(__661348734_Ptr, marshalToNative(id), marshalToNative(geoshape),
          marshalToNative(monitoredStates), singleUse, marshalToNative(dwellTime),
          marshalToNative(startTime), marshalToNative(duration), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geofence>(result.getValue())
      return resultValue
    }
  }

  public class IGeofenceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __661348734_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeofenceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("841f624b325f4b90bca72b8022a93796")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeofenceFactory(ptr: Pointer?): WithDefault = IGeofenceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeofenceFactory {
      val address = segment.toRawLongValue()
      return makeIGeofenceFactory(Pointer(address))
    }

    public override fun toNative(obj: IGeofenceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__661348734_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeofenceFactory): Array<IGeofenceFactory?> = (elements as
        Array<IGeofenceFactory?>).castToImpl<IGeofenceFactory,IGeofenceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeofenceFactory?> =
        arrayOfNulls<IGeofenceFactory_Impl>(size) as Array<IGeofenceFactory?>
  }
}
