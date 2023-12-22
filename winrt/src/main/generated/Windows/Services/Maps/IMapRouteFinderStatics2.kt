package Windows.Services.Maps

import Windows.Devices.Geolocation.Geopoint
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

@ABIMarker(IMapRouteFinderStatics2.ABI::class)
@Signature("{afcc2c73-7760-49af-b3bd-baf135b703e1}")
@Guid("afcc2c73776049afb3bdbaf135b703e1")
@WinRTInterface("afcc2c73776049afb3bdbaf135b703e1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteFinderStatics2.ByReference::class)
public interface IMapRouteFinderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDrivingRouteAsync(
    startPoint: Geopoint?,
    endPoint: Geopoint?,
    options: MapRouteDrivingOptions?
  ): IAsyncOperation<MapRouteFinderResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapRouteFinderStatics2> {
    public override fun getValue() = ABI.makeIMapRouteFinderStatics2(pointer.getPointer(0))

    public fun setValue(value: IMapRouteFinderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteFinderStatics2 {
    public val __2136390323_Ptr: Pointer?

    public val _2136390323_VtblPtr: Pointer?
      get() = __2136390323_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDrivingRouteAsync(
      startPoint: Geopoint?,
      endPoint: Geopoint?,
      options: MapRouteDrivingOptions?
    ): IAsyncOperation<MapRouteFinderResult?>? {
      val fnPtr = _2136390323_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapRouteFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__2136390323_Ptr, marshalToNative(startPoint),
          marshalToNative(endPoint), marshalToNative(options), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MapRouteFinderResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteFinderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2136390323_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteFinderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("afcc2c73776049afb3bdbaf135b703e1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteFinderStatics2(ptr: Pointer?): WithDefault =
        IMapRouteFinderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteFinderStatics2 {
      val address = segment.toRawLongValue()
      return makeIMapRouteFinderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteFinderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2136390323_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteFinderStatics2): Array<IMapRouteFinderStatics2?>
        = (elements as
        Array<IMapRouteFinderStatics2?>).castToImpl<IMapRouteFinderStatics2,IMapRouteFinderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteFinderStatics2?> =
        arrayOfNulls<IMapRouteFinderStatics2_Impl>(size) as Array<IMapRouteFinderStatics2?>
  }
}
