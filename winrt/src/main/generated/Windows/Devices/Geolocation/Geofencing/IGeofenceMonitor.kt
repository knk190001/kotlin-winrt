package Windows.Devices.Geolocation.Geofencing

import Windows.Devices.Geolocation.Geoposition
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGeofenceMonitor.ABI::class)
@Signature("{4c0f5f78-1c1f-4621-bbbd-833b92247226}")
@Guid("4c0f5f781c1f4621bbbd833b92247226")
@WinRTInterface("4c0f5f781c1f4621bbbd833b92247226")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeofenceMonitor.ByReference::class)
public interface IGeofenceMonitor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): GeofenceMonitorStatus?

  @InterfaceMethod(1)
  public fun get_Geofences(): IVector<Geofence?>?

  @InterfaceMethod(2)
  public fun get_LastKnownGeoposition(): Geoposition?

  @InterfaceMethod(3)
  public fun add_GeofenceStateChanged(eventHandler: TypedEventHandler<GeofenceMonitor?,
      IUnknown?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_GeofenceStateChanged(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun ReadReports(): IVectorView<GeofenceStateChangeReport?>?

  @InterfaceMethod(6)
  public fun add_StatusChanged(eventHandler: TypedEventHandler<GeofenceMonitor?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeofenceMonitor> {
    public override fun getValue() = ABI.makeIGeofenceMonitor(pointer.getPointer(0))

    public fun setValue(value: IGeofenceMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeofenceMonitor {
    public val __1666853586_Ptr: Pointer?

    public val _1666853586_VtblPtr: Pointer?
      get() = __1666853586_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): GeofenceMonitorStatus? {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeofenceMonitorStatus>()
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeofenceMonitorStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Geofences(): IVector<Geofence?>? {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Geofence?>>()
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Geofence?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LastKnownGeoposition(): Geoposition? {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geoposition>()
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geoposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_GeofenceStateChanged(eventHandler: TypedEventHandler<GeofenceMonitor?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_GeofenceStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun ReadReports(): IVectorView<GeofenceStateChangeReport?>? {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GeofenceStateChangeReport?>>()
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<GeofenceStateChangeReport?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun add_StatusChanged(eventHandler: TypedEventHandler<GeofenceMonitor?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr, marshalToNative(eventHandler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1666853586_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1666853586_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGeofenceMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1666853586_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeofenceMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4c0f5f781c1f4621bbbd833b92247226")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeofenceMonitor(ptr: Pointer?): WithDefault = IGeofenceMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeofenceMonitor {
      val address = segment.toRawLongValue()
      return makeIGeofenceMonitor(Pointer(address))
    }

    public override fun toNative(obj: IGeofenceMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1666853586_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeofenceMonitor): Array<IGeofenceMonitor?> = (elements as
        Array<IGeofenceMonitor?>).castToImpl<IGeofenceMonitor,IGeofenceMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeofenceMonitor?> =
        arrayOfNulls<IGeofenceMonitor_Impl>(size) as Array<IGeofenceMonitor?>
  }
}
