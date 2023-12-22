package Windows.UI.Xaml.Controls.Maps

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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapCameraFactory.ABI::class)
@Signature("{ea3b0f16-83af-4ace-8e71-10ad9f1e9e7f}")
@Guid("ea3b0f1683af4ace8e7110ad9f1e9e7f")
@WinRTInterface("ea3b0f1683af4ace8e7110ad9f1e9e7f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapCameraFactory.ByReference::class)
public interface IMapCameraFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateInstanceWithLocation(location: Geopoint?): MapCamera?

  @InterfaceMethod(1)
  public fun CreateInstanceWithLocationAndHeading(location: Geopoint?, headingInDegrees: Double):
      MapCamera?

  @InterfaceMethod(2)
  public fun CreateInstanceWithLocationHeadingAndPitch(
    location: Geopoint?,
    headingInDegrees: Double,
    pitchInDegrees: Double
  ): MapCamera?

  @InterfaceMethod(3)
  public fun CreateInstanceWithLocationHeadingPitchRollAndFieldOfView(
    location: Geopoint?,
    headingInDegrees: Double,
    pitchInDegrees: Double,
    rollInDegrees: Double,
    fieldOfViewInDegrees: Double
  ): MapCamera?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMapCameraFactory> {
    public override fun getValue() = ABI.makeIMapCameraFactory(pointer.getPointer(0))

    public fun setValue(value: IMapCameraFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapCameraFactory {
    public val __1623051642_Ptr: Pointer?

    public val _1623051642_VtblPtr: Pointer?
      get() = __1623051642_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateInstanceWithLocation(location: Geopoint?): MapCamera? {
      val fnPtr = _1623051642_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1623051642_Ptr, marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInstanceWithLocationAndHeading(location: Geopoint?,
        headingInDegrees: Double): MapCamera? {
      val fnPtr = _1623051642_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1623051642_Ptr, marshalToNative(location), headingInDegrees,
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateInstanceWithLocationHeadingAndPitch(
      location: Geopoint?,
      headingInDegrees: Double,
      pitchInDegrees: Double
    ): MapCamera? {
      val fnPtr = _1623051642_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1623051642_Ptr, marshalToNative(location), headingInDegrees,
          pitchInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateInstanceWithLocationHeadingPitchRollAndFieldOfView(
      location: Geopoint?,
      headingInDegrees: Double,
      pitchInDegrees: Double,
      rollInDegrees: Double,
      fieldOfViewInDegrees: Double
    ): MapCamera? {
      val fnPtr = _1623051642_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapCamera>()
      val hr = fn.invokeHR(arrayOf(__1623051642_Ptr, marshalToNative(location), headingInDegrees,
          pitchInDegrees, rollInDegrees, fieldOfViewInDegrees, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapCamera>(result.getValue())
      return resultValue
    }
  }

  public class IMapCameraFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1623051642_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapCameraFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea3b0f1683af4ace8e7110ad9f1e9e7f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapCameraFactory(ptr: Pointer?): WithDefault = IMapCameraFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapCameraFactory {
      val address = segment.toRawLongValue()
      return makeIMapCameraFactory(Pointer(address))
    }

    public override fun toNative(obj: IMapCameraFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1623051642_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapCameraFactory): Array<IMapCameraFactory?> = (elements
        as Array<IMapCameraFactory?>).castToImpl<IMapCameraFactory,IMapCameraFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapCameraFactory?> =
        arrayOfNulls<IMapCameraFactory_Impl>(size) as Array<IMapCameraFactory?>
  }
}
