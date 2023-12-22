package Windows.Devices.Geolocation

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

@ABIMarker(IGeovisitMonitor.ABI::class)
@Signature("{80118aaf-5944-4591-83c1-396647f54f2c}")
@Guid("80118aaf5944459183c1396647f54f2c")
@WinRTInterface("80118aaf5944459183c1396647f54f2c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeovisitMonitor.ByReference::class)
public interface IGeovisitMonitor : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MonitoringScope(): VisitMonitoringScope?

  @InterfaceMethod(1)
  public fun Start(value: VisitMonitoringScope?): Unit

  @InterfaceMethod(2)
  public fun Stop(): Unit

  @InterfaceMethod(3)
  public fun add_VisitStateChanged(handler: TypedEventHandler<GeovisitMonitor?,
      GeovisitStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_VisitStateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeovisitMonitor> {
    public override fun getValue() = ABI.makeIGeovisitMonitor(pointer.getPointer(0))

    public fun setValue(value: IGeovisitMonitor_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeovisitMonitor {
    public val __447644161_Ptr: Pointer?

    public val _447644161_VtblPtr: Pointer?
      get() = __447644161_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MonitoringScope(): VisitMonitoringScope? {
      val fnPtr = _447644161_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VisitMonitoringScope>()
      val hr = fn.invokeHR(arrayOf(__447644161_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VisitMonitoringScope>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun Start(value: VisitMonitoringScope?): Unit {
      val fnPtr = _447644161_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__447644161_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun Stop(): Unit {
      val fnPtr = _447644161_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__447644161_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_VisitStateChanged(handler: TypedEventHandler<GeovisitMonitor?,
        GeovisitStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _447644161_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__447644161_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_VisitStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _447644161_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__447644161_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IGeovisitMonitor_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __447644161_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeovisitMonitor, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("80118aaf5944459183c1396647f54f2c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeovisitMonitor(ptr: Pointer?): WithDefault = IGeovisitMonitor_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeovisitMonitor {
      val address = segment.toRawLongValue()
      return makeIGeovisitMonitor(Pointer(address))
    }

    public override fun toNative(obj: IGeovisitMonitor): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__447644161_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeovisitMonitor): Array<IGeovisitMonitor?> = (elements as
        Array<IGeovisitMonitor?>).castToImpl<IGeovisitMonitor,IGeovisitMonitor_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeovisitMonitor?> =
        arrayOfNulls<IGeovisitMonitor_Impl>(size) as Array<IGeovisitMonitor?>
  }
}
