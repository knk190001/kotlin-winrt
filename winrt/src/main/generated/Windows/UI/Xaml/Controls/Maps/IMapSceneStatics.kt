package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IIterable
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

@ABIMarker(IMapSceneStatics.ABI::class)
@Signature("{03e4ad6c-86ec-44d9-9597-fb75b7deba0a}")
@Guid("03e4ad6c86ec44d99597fb75b7deba0a")
@WinRTInterface("03e4ad6c86ec44d99597fb75b7deba0a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapSceneStatics.ByReference::class)
public interface IMapSceneStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateFromBoundingBox(bounds: GeoboundingBox?): MapScene?

  @InterfaceMethod(1)
  public fun CreateFromBoundingBox(
    bounds: GeoboundingBox?,
    headingInDegrees: Double,
    pitchInDegrees: Double
  ): MapScene?

  @InterfaceMethod(2)
  public fun CreateFromCamera(camera: MapCamera?): MapScene?

  @InterfaceMethod(3)
  public fun CreateFromLocation(location: Geopoint?): MapScene?

  @InterfaceMethod(4)
  public fun CreateFromLocation(
    location: Geopoint?,
    headingInDegrees: Double,
    pitchInDegrees: Double
  ): MapScene?

  @InterfaceMethod(5)
  public fun CreateFromLocationAndRadius(location: Geopoint?, radiusInMeters: Double): MapScene?

  @InterfaceMethod(6)
  public fun CreateFromLocationAndRadius(
    location: Geopoint?,
    radiusInMeters: Double,
    headingInDegrees: Double,
    pitchInDegrees: Double
  ): MapScene?

  @InterfaceMethod(7)
  public fun CreateFromLocations(locations: IIterable<Geopoint?>?): MapScene?

  @InterfaceMethod(8)
  public fun CreateFromLocations(
    locations: IIterable<Geopoint?>?,
    headingInDegrees: Double,
    pitchInDegrees: Double
  ): MapScene?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapSceneStatics> {
    public override fun getValue() = ABI.makeIMapSceneStatics(pointer.getPointer(0))

    public fun setValue(value: IMapSceneStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapSceneStatics {
    public val __196862044_Ptr: Pointer?

    public val _196862044_VtblPtr: Pointer?
      get() = __196862044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateFromBoundingBox(bounds: GeoboundingBox?): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(bounds), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromBoundingBox(
      bounds: GeoboundingBox?,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(bounds), headingInDegrees,
          pitchInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateFromCamera(camera: MapCamera?): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(camera), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateFromLocation(location: Geopoint?): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateFromLocation(
      location: Geopoint?,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(location), headingInDegrees,
          pitchInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateFromLocationAndRadius(location: Geopoint?, radiusInMeters: Double):
        MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(location), radiusInMeters,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateFromLocationAndRadius(
      location: Geopoint?,
      radiusInMeters: Double,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(location), radiusInMeters,
          headingInDegrees, pitchInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateFromLocations(locations: IIterable<Geopoint?>?): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(locations), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun CreateFromLocations(
      locations: IIterable<Geopoint?>?,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ): MapScene? {
      val fnPtr = _196862044_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapScene>()
      val hr = fn.invokeHR(arrayOf(__196862044_Ptr, marshalToNative(locations), headingInDegrees,
          pitchInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapScene>(result.getValue())
      return resultValue
    }
  }

  public class IMapSceneStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __196862044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapSceneStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("03e4ad6c86ec44d99597fb75b7deba0a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapSceneStatics(ptr: Pointer?): WithDefault = IMapSceneStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapSceneStatics {
      val address = segment.toRawLongValue()
      return makeIMapSceneStatics(Pointer(address))
    }

    public override fun toNative(obj: IMapSceneStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__196862044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapSceneStatics): Array<IMapSceneStatics?> = (elements as
        Array<IMapSceneStatics?>).castToImpl<IMapSceneStatics,IMapSceneStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapSceneStatics?> =
        arrayOfNulls<IMapSceneStatics_Impl>(size) as Array<IMapSceneStatics?>
  }
}
