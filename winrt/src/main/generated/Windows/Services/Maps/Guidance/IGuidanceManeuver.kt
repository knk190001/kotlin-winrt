package Windows.Services.Maps.Guidance

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceManeuver.ABI::class)
@Signature("{fc09326c-ecc9-4928-a2a1-7232b99b94a1}")
@Guid("fc09326cecc94928a2a17232b99b94a1")
@WinRTInterface("fc09326cecc94928a2a17232b99b94a1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceManeuver.ByReference::class)
public interface IGuidanceManeuver : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_StartLocation(): Geopoint?

  @InterfaceMethod(1)
  public fun get_DistanceFromRouteStart(): Int

  @InterfaceMethod(2)
  public fun get_DistanceFromPreviousManeuver(): Int

  @InterfaceMethod(3)
  public fun get_DepartureRoadName(): String?

  @InterfaceMethod(4)
  public fun get_NextRoadName(): String?

  @InterfaceMethod(5)
  public fun get_DepartureShortRoadName(): String?

  @InterfaceMethod(6)
  public fun get_NextShortRoadName(): String?

  @InterfaceMethod(7)
  public fun get_Kind(): GuidanceManeuverKind?

  @InterfaceMethod(8)
  public fun get_StartAngle(): Int

  @InterfaceMethod(9)
  public fun get_EndAngle(): Int

  @InterfaceMethod(10)
  public fun get_RoadSignpost(): GuidanceRoadSignpost?

  @InterfaceMethod(11)
  public fun get_InstructionText(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceManeuver> {
    public override fun getValue() = ABI.makeIGuidanceManeuver(pointer.getPointer(0))

    public fun setValue(value: IGuidanceManeuver_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceManeuver {
    public val __1691285424_Ptr: Pointer?

    public val _1691285424_VtblPtr: Pointer?
      get() = __1691285424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_StartLocation(): Geopoint? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DistanceFromRouteStart(): Int {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_DistanceFromPreviousManeuver(): Int {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_DepartureRoadName(): String? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_NextRoadName(): String? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_DepartureShortRoadName(): String? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_NextShortRoadName(): String? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Kind(): GuidanceManeuverKind? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceManeuverKind>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceManeuverKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_StartAngle(): Int {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun get_EndAngle(): Int {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun get_RoadSignpost(): GuidanceRoadSignpost? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceRoadSignpost>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceRoadSignpost>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_InstructionText(): String? {
      val fnPtr = _1691285424_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1691285424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceManeuver_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1691285424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceManeuver, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fc09326cecc94928a2a17232b99b94a1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceManeuver(ptr: Pointer?): WithDefault = IGuidanceManeuver_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceManeuver {
      val address = segment.toRawLongValue()
      return makeIGuidanceManeuver(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceManeuver): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1691285424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceManeuver): Array<IGuidanceManeuver?> = (elements
        as Array<IGuidanceManeuver?>).castToImpl<IGuidanceManeuver,IGuidanceManeuver_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceManeuver?> =
        arrayOfNulls<IGuidanceManeuver_Impl>(size) as Array<IGuidanceManeuver?>
  }
}
