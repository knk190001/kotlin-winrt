package Windows.Devices.Geolocation.Geofencing

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

@ABIMarker(IGeofenceMonitorStatics.ABI::class)
@Signature("{2dd32fcf-7e75-4899-ace3-2bd0a65cce06}")
@Guid("2dd32fcf7e754899ace32bd0a65cce06")
@WinRTInterface("2dd32fcf7e754899ace32bd0a65cce06")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeofenceMonitorStatics.ByReference::class)
public interface IGeofenceMonitorStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Current(): GeofenceMonitor?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeofenceMonitorStatics> {
    public override fun getValue() = ABI.makeIGeofenceMonitorStatics(pointer.getPointer(0))

    public fun setValue(value: IGeofenceMonitorStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeofenceMonitorStatics {
    public val __496893075_Ptr: Pointer?

    public val _496893075_VtblPtr: Pointer?
      get() = __496893075_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Current(): GeofenceMonitor? {
      val fnPtr = _496893075_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeofenceMonitor>()
      val hr = fn.invokeHR(arrayOf(__496893075_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeofenceMonitor>(result.getValue())
      return resultValue
    }
  }

  public class IGeofenceMonitorStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __496893075_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeofenceMonitorStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2dd32fcf7e754899ace32bd0a65cce06")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeofenceMonitorStatics(ptr: Pointer?): WithDefault =
        IGeofenceMonitorStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeofenceMonitorStatics {
      val address = segment.toRawLongValue()
      return makeIGeofenceMonitorStatics(Pointer(address))
    }

    public override fun toNative(obj: IGeofenceMonitorStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__496893075_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeofenceMonitorStatics): Array<IGeofenceMonitorStatics?>
        = (elements as
        Array<IGeofenceMonitorStatics?>).castToImpl<IGeofenceMonitorStatics,IGeofenceMonitorStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeofenceMonitorStatics?> =
        arrayOfNulls<IGeofenceMonitorStatics_Impl>(size) as Array<IGeofenceMonitorStatics?>
  }
}
