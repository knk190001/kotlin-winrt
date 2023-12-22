package Windows.Services.Maps

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapRouteFinderStatics3.ABI::class)
@Signature("{f6098134-5913-11e6-8b77-86f30ca893d3}")
@Guid("f6098134591311e68b7786f30ca893d3")
@WinRTInterface("f6098134591311e68b7786f30ca893d3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteFinderStatics3.ByReference::class)
public interface IMapRouteFinderStatics3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDrivingRouteFromEnhancedWaypointsAsync(waypoints: IIterable<EnhancedWaypoint?>?):
      IAsyncOperation<MapRouteFinderResult?>?

  @InterfaceMethod(1)
  public fun GetDrivingRouteFromEnhancedWaypointsAsync(waypoints: IIterable<EnhancedWaypoint?>?,
      options: MapRouteDrivingOptions?): IAsyncOperation<MapRouteFinderResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteFinderStatics3> {
    public override fun getValue() = ABI.makeIMapRouteFinderStatics3(pointer.getPointer(0))

    public fun setValue(value: IMapRouteFinderStatics3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteFinderStatics3 {
    public val __2136390322_Ptr: Pointer?

    public val _2136390322_VtblPtr: Pointer?
      get() = __2136390322_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun GetDrivingRouteFromEnhancedWaypointsAsync(waypoints: IIterable<EnhancedWaypoint?>?):
        IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _2136390322_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__2136390322_Ptr, marshalToNative(waypoints), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override
        fun GetDrivingRouteFromEnhancedWaypointsAsync(waypoints: IIterable<EnhancedWaypoint?>?,
        options: MapRouteDrivingOptions?): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _2136390322_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__2136390322_Ptr, marshalToNative(waypoints),
          marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteFinderStatics3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2136390322_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteFinderStatics3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f6098134591311e68b7786f30ca893d3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteFinderStatics3(ptr: Pointer?): WithDefault =
        IMapRouteFinderStatics3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteFinderStatics3 {
      val address = segment.toRawLongValue()
      return makeIMapRouteFinderStatics3(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteFinderStatics3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2136390322_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteFinderStatics3): Array<IMapRouteFinderStatics3?>
        = (elements as
        Array<IMapRouteFinderStatics3?>).castToImpl<IMapRouteFinderStatics3,IMapRouteFinderStatics3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteFinderStatics3?> =
        arrayOfNulls<IMapRouteFinderStatics3_Impl>(size) as Array<IMapRouteFinderStatics3?>
  }
}
