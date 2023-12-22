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

@ABIMarker(IGeofence.ABI::class)
@Signature("{9c090823-edb8-47e0-8245-5bf61d321f2d}")
@Guid("9c090823edb847e082455bf61d321f2d")
@WinRTInterface("9c090823edb847e082455bf61d321f2d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeofence.ByReference::class)
public interface IGeofence : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartTime(): DateTime?

  @InterfaceMethod(1)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(2)
  public fun get_DwellTime(): TimeSpan?

  @InterfaceMethod(3)
  public fun get_Id(): String?

  @InterfaceMethod(4)
  public fun get_MonitoredStates(): MonitoredGeofenceStates?

  @InterfaceMethod(5)
  public fun get_Geoshape(): IGeoshape?

  @InterfaceMethod(6)
  public fun get_SingleUse(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeofence> {
    public override fun getValue() = ABI.makeIGeofence(pointer.getPointer(0))

    public fun setValue(value: IGeofence_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeofence {
    public val __863094120_Ptr: Pointer?

    public val _863094120_VtblPtr: Pointer?
      get() = __863094120_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartTime(): DateTime? {
      val fnPtr = _863094120_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__863094120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _863094120_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__863094120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DwellTime(): TimeSpan? {
      val fnPtr = _863094120_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__863094120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Id(): String? {
      val fnPtr = _863094120_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__863094120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MonitoredStates(): MonitoredGeofenceStates? {
      val fnPtr = _863094120_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MonitoredGeofenceStates>()
      val hr = fn.invokeHR(arrayOf(__863094120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MonitoredGeofenceStates>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Geoshape(): IGeoshape? {
      val fnPtr = _863094120_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IGeoshape>()
      val hr = fn.invokeHR(arrayOf(__863094120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IGeoshape>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_SingleUse(): Boolean {
      val fnPtr = _863094120_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__863094120_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGeofence_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __863094120_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeofence, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c090823edb847e082455bf61d321f2d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeofence(ptr: Pointer?): WithDefault = IGeofence_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeofence {
      val address = segment.toRawLongValue()
      return makeIGeofence(Pointer(address))
    }

    public override fun toNative(obj: IGeofence): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__863094120_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeofence): Array<IGeofence?> = (elements as
        Array<IGeofence?>).castToImpl<IGeofence,IGeofence_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeofence?> = arrayOfNulls<IGeofence_Impl>(size)
        as Array<IGeofence?>
  }
}
