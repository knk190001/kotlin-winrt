package Windows.Services.Maps.Guidance

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geopath
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
import Windows.Services.Maps.MapRoute
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

@ABIMarker(IGuidanceRoute.ABI::class)
@Signature("{3a14545d-801a-40bd-a286-afb2010cce6c}")
@Guid("3a14545d801a40bda286afb2010cce6c")
@WinRTInterface("3a14545d801a40bda286afb2010cce6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceRoute.ByReference::class)
public interface IGuidanceRoute : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Duration(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_Distance(): Int

  @InterfaceMethod(2)
  public fun get_Maneuvers(): IVectorView<GuidanceManeuver?>?

  @InterfaceMethod(3)
  public fun get_BoundingBox(): GeoboundingBox?

  @InterfaceMethod(4)
  public fun get_Path(): Geopath?

  @InterfaceMethod(5)
  public fun get_RoadSegments(): IVectorView<GuidanceRoadSegment?>?

  @InterfaceMethod(6)
  public fun ConvertToMapRoute(): MapRoute?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGuidanceRoute>
      {
    public override fun getValue() = ABI.makeIGuidanceRoute(pointer.getPointer(0))

    public fun setValue(value: IGuidanceRoute_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceRoute {
    public val __1939571154_Ptr: Pointer?

    public val _1939571154_VtblPtr: Pointer?
      get() = __1939571154_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Duration(): TimeSpan? {
      val fnPtr = _1939571154_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1939571154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Distance(): Int {
      val fnPtr = _1939571154_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1939571154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Maneuvers(): IVectorView<GuidanceManeuver?>? {
      val fnPtr = _1939571154_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GuidanceManeuver?>>()
      val hr = fn.invokeHR(arrayOf(__1939571154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GuidanceManeuver?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_BoundingBox(): GeoboundingBox? {
      val fnPtr = _1939571154_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__1939571154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Path(): Geopath? {
      val fnPtr = _1939571154_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__1939571154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_RoadSegments(): IVectorView<GuidanceRoadSegment?>? {
      val fnPtr = _1939571154_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<GuidanceRoadSegment?>>()
      val hr = fn.invokeHR(arrayOf(__1939571154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<GuidanceRoadSegment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun ConvertToMapRoute(): MapRoute? {
      val fnPtr = _1939571154_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapRoute>()
      val hr = fn.invokeHR(arrayOf(__1939571154_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapRoute>(result.getValue())
      return resultValue
    }
  }

  public class IGuidanceRoute_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1939571154_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceRoute, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3a14545d801a40bda286afb2010cce6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceRoute(ptr: Pointer?): WithDefault = IGuidanceRoute_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceRoute {
      val address = segment.toRawLongValue()
      return makeIGuidanceRoute(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceRoute): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1939571154_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceRoute): Array<IGuidanceRoute?> = (elements as
        Array<IGuidanceRoute?>).castToImpl<IGuidanceRoute,IGuidanceRoute_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceRoute?> =
        arrayOfNulls<IGuidanceRoute_Impl>(size) as Array<IGuidanceRoute?>
  }
}
