package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IIterable
import Windows.Foundation.IAsyncOperation
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRouteFinderStatics.ABI::class)
@Signature("{b8a5c50f-1c64-4c3a-81eb-1f7c152afbbb}")
@Guid("b8a5c50f1c644c3a81eb1f7c152afbbb")
@WinRTInterface("b8a5c50f1c644c3a81eb1f7c152afbbb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteFinderStatics.ByReference::class)
public interface IMapRouteFinderStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDrivingRouteAsync(startPoint: Geopoint?, endPoint: Geopoint?):
      IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(1)
  public fun GetDrivingRouteAsync(
    startPoint: Geopoint?,
    endPoint: Geopoint?,
    optimization: MapRouteOptimization?
  ): IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(2)
  public fun GetDrivingRouteAsync(
    startPoint: Geopoint?,
    endPoint: Geopoint?,
    optimization: MapRouteOptimization?,
    restrictions: MapRouteRestrictions?
  ): IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(3)
  public fun GetDrivingRouteAsync(
    startPoint: Geopoint?,
    endPoint: Geopoint?,
    optimization: MapRouteOptimization?,
    restrictions: MapRouteRestrictions?,
    headingInDegrees: Double
  ): IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(4)
  public fun GetDrivingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>?):
      IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(5)
  public fun GetDrivingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>?,
      optimization: MapRouteOptimization?): IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(6)
  public fun GetDrivingRouteFromWaypointsAsync(
    wayPoints: IIterable<Geopoint?>?,
    optimization: MapRouteOptimization?,
    restrictions: MapRouteRestrictions?
  ): IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(7)
  public fun GetDrivingRouteFromWaypointsAsync(
    wayPoints: IIterable<Geopoint?>?,
    optimization: MapRouteOptimization?,
    restrictions: MapRouteRestrictions?,
    headingInDegrees: Double
  ): IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(8)
  public fun GetWalkingRouteAsync(startPoint: Geopoint?, endPoint: Geopoint?):
      IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(9)
  public fun GetWalkingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>?):
      IAsyncOperation<MapRouteFinderResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteFinderStatics> {
    public override fun getValue() = ABI.makeIMapRouteFinderStatics(pointer.getPointer(0))

    public fun setValue(value: IMapRouteFinderStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteFinderStatics {
    public val __623105147_Ptr: Pointer?

    public val _623105147_VtblPtr: Pointer?
      get() = __623105147_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDrivingRouteAsync(startPoint: Geopoint?, endPoint: Geopoint?):
        IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(startPoint),
          marshalToNative(endPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDrivingRouteAsync(
      startPoint: Geopoint?,
      endPoint: Geopoint?,
      optimization: MapRouteOptimization?
    ): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(startPoint),
          marshalToNative(endPoint), marshalToNative(optimization), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetDrivingRouteAsync(
      startPoint: Geopoint?,
      endPoint: Geopoint?,
      optimization: MapRouteOptimization?,
      restrictions: MapRouteRestrictions?
    ): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(startPoint),
          marshalToNative(endPoint), marshalToNative(optimization), marshalToNative(restrictions),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetDrivingRouteAsync(
      startPoint: Geopoint?,
      endPoint: Geopoint?,
      optimization: MapRouteOptimization?,
      restrictions: MapRouteRestrictions?,
      headingInDegrees: Double
    ): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(startPoint),
          marshalToNative(endPoint), marshalToNative(optimization), marshalToNative(restrictions),
          headingInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetDrivingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>?):
        IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(wayPoints), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun GetDrivingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>?,
        optimization: MapRouteOptimization?): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(wayPoints),
          marshalToNative(optimization), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun GetDrivingRouteFromWaypointsAsync(
      wayPoints: IIterable<Geopoint?>?,
      optimization: MapRouteOptimization?,
      restrictions: MapRouteRestrictions?
    ): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(wayPoints),
          marshalToNative(optimization), marshalToNative(restrictions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun GetDrivingRouteFromWaypointsAsync(
      wayPoints: IIterable<Geopoint?>?,
      optimization: MapRouteOptimization?,
      restrictions: MapRouteRestrictions?,
      headingInDegrees: Double
    ): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(wayPoints),
          marshalToNative(optimization), marshalToNative(restrictions), headingInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun GetWalkingRouteAsync(startPoint: Geopoint?, endPoint: Geopoint?):
        IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(startPoint),
          marshalToNative(endPoint), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetWalkingRouteFromWaypointsAsync(wayPoints: IIterable<Geopoint?>?):
        IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _623105147_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__623105147_Ptr, marshalToNative(wayPoints), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteFinderStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __623105147_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteFinderStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8a5c50f1c644c3a81eb1f7c152afbbb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteFinderStatics(ptr: Pointer?): WithDefault =
        IMapRouteFinderStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteFinderStatics {
      val address = segment.toRawLongValue()
      return makeIMapRouteFinderStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteFinderStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__623105147_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteFinderStatics): Array<IMapRouteFinderStatics?> =
        (elements as
        Array<IMapRouteFinderStatics?>).castToImpl<IMapRouteFinderStatics,IMapRouteFinderStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteFinderStatics?> =
        arrayOfNulls<IMapRouteFinderStatics_Impl>(size) as Array<IMapRouteFinderStatics?>
  }
}
