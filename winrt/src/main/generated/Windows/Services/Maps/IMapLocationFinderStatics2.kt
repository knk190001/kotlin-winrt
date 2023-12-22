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

@ABIMarker(IMapLocationFinderStatics2.ABI::class)
@Signature("{959a8b96-6485-4dfd-851a-33ac317e3af6}")
@Guid("959a8b9664854dfd851a33ac317e3af6")
@WinRTInterface("959a8b9664854dfd851a33ac317e3af6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapLocationFinderStatics2.ByReference::class)
public interface IMapLocationFinderStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FindLocationsAtAsync(queryPoint: Geopoint?, accuracy: MapLocationDesiredAccuracy?):
      IAsyncOperation<MapLocationFinderResult?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapLocationFinderStatics2> {
    public override fun getValue() = ABI.makeIMapLocationFinderStatics2(pointer.getPointer(0))

    public fun setValue(value: IMapLocationFinderStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapLocationFinderStatics2 {
    public val __9560439_Ptr: Pointer?

    public val _9560439_VtblPtr: Pointer?
      get() = __9560439_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FindLocationsAtAsync(queryPoint: Geopoint?,
        accuracy: MapLocationDesiredAccuracy?): IAsyncOperation<MapLocationFinderResult?>? {
      val fnPtr = _9560439_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MapLocationFinderResult?>>()
      val hr = fn.invokeHR(arrayOf(__9560439_Ptr, marshalToNative(queryPoint),
          marshalToNative(accuracy), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<MapLocationFinderResult?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapLocationFinderStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __9560439_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapLocationFinderStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("959a8b9664854dfd851a33ac317e3af6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapLocationFinderStatics2(ptr: Pointer?): WithDefault =
        IMapLocationFinderStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapLocationFinderStatics2 {
      val address = segment.toRawLongValue()
      return makeIMapLocationFinderStatics2(Pointer(address))
    }

    public override fun toNative(obj: IMapLocationFinderStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__9560439_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapLocationFinderStatics2):
        Array<IMapLocationFinderStatics2?> = (elements as
        Array<IMapLocationFinderStatics2?>).castToImpl<IMapLocationFinderStatics2,IMapLocationFinderStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapLocationFinderStatics2?> =
        arrayOfNulls<IMapLocationFinderStatics2_Impl>(size) as Array<IMapLocationFinderStatics2?>
  }
}
