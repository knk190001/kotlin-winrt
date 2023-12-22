package Windows.Services.Maps.Guidance

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IGuidanceUpdatedEventArgs.ABI::class)
@Signature("{fdac160b-9e8d-4de3-a9fa-b06321d18db9}")
@Guid("fdac160b9e8d4de3a9fab06321d18db9")
@WinRTInterface("fdac160b9e8d4de3a9fab06321d18db9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceUpdatedEventArgs.ByReference::class)
public interface IGuidanceUpdatedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Mode(): GuidanceMode?

  @InterfaceMethod(1)
  public fun get_NextManeuver(): GuidanceManeuver?

  @InterfaceMethod(2)
  public fun get_NextManeuverDistance(): Int

  @InterfaceMethod(3)
  public fun get_AfterNextManeuver(): GuidanceManeuver?

  @InterfaceMethod(4)
  public fun get_AfterNextManeuverDistance(): Int

  @InterfaceMethod(5)
  public fun get_DistanceToDestination(): Int

  @InterfaceMethod(6)
  public fun get_ElapsedDistance(): Int

  @InterfaceMethod(7)
  public fun get_ElapsedTime(): TimeSpan?

  @InterfaceMethod(8)
  public fun get_TimeToDestination(): TimeSpan?

  @InterfaceMethod(9)
  public fun get_RoadName(): String?

  @InterfaceMethod(10)
  public fun get_Route(): GuidanceRoute?

  @InterfaceMethod(11)
  public fun get_CurrentLocation(): GuidanceMapMatchedCoordinate?

  @InterfaceMethod(12)
  public fun get_IsNewManeuver(): Boolean

  @InterfaceMethod(13)
  public fun get_LaneInfo(): IVectorView<GuidanceLaneInfo?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceUpdatedEventArgs> {
    public override fun getValue() = ABI.makeIGuidanceUpdatedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IGuidanceUpdatedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceUpdatedEventArgs {
    public val __72158451_Ptr: Pointer?

    public val _72158451_VtblPtr: Pointer?
      get() = __72158451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Mode(): GuidanceMode? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceMode>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_NextManeuver(): GuidanceManeuver? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceManeuver>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceManeuver>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_NextManeuverDistance(): Int {
      val fnPtr = _72158451_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_AfterNextManeuver(): GuidanceManeuver? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceManeuver>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceManeuver>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_AfterNextManeuverDistance(): Int {
      val fnPtr = _72158451_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_DistanceToDestination(): Int {
      val fnPtr = _72158451_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_ElapsedDistance(): Int {
      val fnPtr = _72158451_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_ElapsedTime(): TimeSpan? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_TimeToDestination(): TimeSpan? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_RoadName(): String? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_Route(): GuidanceRoute? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceRoute>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceRoute>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_CurrentLocation(): GuidanceMapMatchedCoordinate? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GuidanceMapMatchedCoordinate>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GuidanceMapMatchedCoordinate>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IsNewManeuver(): Boolean {
      val fnPtr = _72158451_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun get_LaneInfo(): IVectorView<GuidanceLaneInfo?>? {
      val fnPtr = _72158451_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GuidanceLaneInfo?>>()
      val hr = fn.invokeHR(arrayOf(__72158451_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GuidanceLaneInfo?>>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceUpdatedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __72158451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceUpdatedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fdac160b9e8d4de3a9fab06321d18db9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceUpdatedEventArgs(ptr: Pointer?): WithDefault =
        IGuidanceUpdatedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceUpdatedEventArgs {
      val address = segment.toRawLongValue()
      return makeIGuidanceUpdatedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceUpdatedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__72158451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceUpdatedEventArgs):
        Array<IGuidanceUpdatedEventArgs?> = (elements as
        Array<IGuidanceUpdatedEventArgs?>).castToImpl<IGuidanceUpdatedEventArgs,IGuidanceUpdatedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceUpdatedEventArgs?> =
        arrayOfNulls<IGuidanceUpdatedEventArgs_Impl>(size) as Array<IGuidanceUpdatedEventArgs?>
  }
}
