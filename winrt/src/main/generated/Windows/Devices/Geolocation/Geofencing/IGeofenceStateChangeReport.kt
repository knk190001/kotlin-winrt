package Windows.Devices.Geolocation.Geofencing

import Windows.Devices.Geolocation.Geoposition
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

@ABIMarker(IGeofenceStateChangeReport.ABI::class)
@Signature("{9a243c18-2464-4c89-be05-b3ffff5babc5}")
@Guid("9a243c1824644c89be05b3ffff5babc5")
@WinRTInterface("9a243c1824644c89be05b3ffff5babc5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeofenceStateChangeReport.ByReference::class)
public interface IGeofenceStateChangeReport : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NewState(): GeofenceState?

  @InterfaceMethod(1)
  public fun get_Geofence(): Geofence?

  @InterfaceMethod(2)
  public fun get_Geoposition(): Geoposition?

  @InterfaceMethod(3)
  public fun get_RemovalReason(): GeofenceRemovalReason?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeofenceStateChangeReport> {
    public override fun getValue() = ABI.makeIGeofenceStateChangeReport(pointer.getPointer(0))

    public fun setValue(value: IGeofenceStateChangeReport_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeofenceStateChangeReport {
    public val __130642003_Ptr: Pointer?

    public val _130642003_VtblPtr: Pointer?
      get() = __130642003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NewState(): GeofenceState? {
      val fnPtr = _130642003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeofenceState>()
      val hr = fn.invokeHR(arrayOf(__130642003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeofenceState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Geofence(): Geofence? {
      val fnPtr = _130642003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geofence>()
      val hr = fn.invokeHR(arrayOf(__130642003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geofence>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Geoposition(): Geoposition? {
      val fnPtr = _130642003_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geoposition>()
      val hr = fn.invokeHR(arrayOf(__130642003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geoposition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_RemovalReason(): GeofenceRemovalReason? {
      val fnPtr = _130642003_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeofenceRemovalReason>()
      val hr = fn.invokeHR(arrayOf(__130642003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeofenceRemovalReason>(result.getValue())
      return resultValue
    }
  }

  public class IGeofenceStateChangeReport_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __130642003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeofenceStateChangeReport, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9a243c1824644c89be05b3ffff5babc5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeofenceStateChangeReport(ptr: Pointer?): WithDefault =
        IGeofenceStateChangeReport_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeofenceStateChangeReport {
      val address = segment.toRawLongValue()
      return makeIGeofenceStateChangeReport(Pointer(address))
    }

    public override fun toNative(obj: IGeofenceStateChangeReport): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__130642003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeofenceStateChangeReport):
        Array<IGeofenceStateChangeReport?> = (elements as
        Array<IGeofenceStateChangeReport?>).castToImpl<IGeofenceStateChangeReport,IGeofenceStateChangeReport_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeofenceStateChangeReport?> =
        arrayOfNulls<IGeofenceStateChangeReport_Impl>(size) as Array<IGeofenceStateChangeReport?>
  }
}
