package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
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
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRouteManeuver.ABI::class)
@Signature("{ed5c17f0-a6ab-4d65-a086-fa8a7e340df2}")
@Guid("ed5c17f0a6ab4d65a086fa8a7e340df2")
@WinRTInterface("ed5c17f0a6ab4d65a086fa8a7e340df2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteManeuver.ByReference::class)
public interface IMapRouteManeuver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartingPoint(): Geopoint?

  @InterfaceMethod(1)
  public fun get_LengthInMeters(): Double

  @InterfaceMethod(2)
  public fun get_InstructionText(): String?

  @InterfaceMethod(3)
  public fun get_Kind(): MapRouteManeuverKind?

  @InterfaceMethod(4)
  public fun get_ExitNumber(): String?

  @InterfaceMethod(5)
  public fun get_ManeuverNotices(): MapManeuverNotices?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteManeuver> {
    public override fun getValue() = ABI.makeIMapRouteManeuver(pointer.getPointer(0))

    public fun setValue(value: IMapRouteManeuver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteManeuver {
    public val __1105241773_Ptr: Pointer?

    public val _1105241773_VtblPtr: Pointer?
      get() = __1105241773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartingPoint(): Geopoint? {
      val fnPtr = _1105241773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1105241773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LengthInMeters(): Double {
      val fnPtr = _1105241773_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1105241773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_InstructionText(): String? {
      val fnPtr = _1105241773_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1105241773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Kind(): MapRouteManeuverKind? {
      val fnPtr = _1105241773_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRouteManeuverKind>()
      val hr = fn.invokeHR(arrayOf(__1105241773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRouteManeuverKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ExitNumber(): String? {
      val fnPtr = _1105241773_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1105241773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ManeuverNotices(): MapManeuverNotices? {
      val fnPtr = _1105241773_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapManeuverNotices>()
      val hr = fn.invokeHR(arrayOf(__1105241773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapManeuverNotices>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteManeuver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1105241773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteManeuver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ed5c17f0a6ab4d65a086fa8a7e340df2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteManeuver(ptr: Pointer?): WithDefault = IMapRouteManeuver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteManeuver {
      val address = segment.toRawLongValue()
      return makeIMapRouteManeuver(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteManeuver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1105241773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteManeuver): Array<IMapRouteManeuver?> = (elements
        as Array<IMapRouteManeuver?>).castToImpl<IMapRouteManeuver,IMapRouteManeuver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteManeuver?> =
        arrayOfNulls<IMapRouteManeuver_Impl>(size) as Array<IMapRouteManeuver?>
  }
}
