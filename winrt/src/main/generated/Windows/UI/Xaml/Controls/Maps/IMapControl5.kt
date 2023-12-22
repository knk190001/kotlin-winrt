package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.AltitudeReferenceSystem
import Windows.Devices.Geolocation.Geopoint
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.Point
import Windows.Foundation.TypedEventHandler
import Windows.UI.Xaml.Thickness
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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapControl5.ABI::class)
@Signature("{dd9b0ffd-7823-46a2-82c9-65ddac4f365f}")
@Guid("dd9b0ffd782346a282c965ddac4f365f")
@WinRTInterface("dd9b0ffd782346a282c965ddac4f365f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl5.ByReference::class)
public interface IMapControl5 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MapProjection(): MapProjection?

  @InterfaceMethod(1)
  public fun put_MapProjection(value: MapProjection?): Unit

  @InterfaceMethod(2)
  public fun get_StyleSheet(): MapStyleSheet?

  @InterfaceMethod(3)
  public fun put_StyleSheet(value: MapStyleSheet?): Unit

  @InterfaceMethod(4)
  public fun get_ViewPadding(): Thickness?

  @InterfaceMethod(5)
  public fun put_ViewPadding(value: Thickness?): Unit

  @InterfaceMethod(6)
  public fun add_MapContextRequested(handler: TypedEventHandler<MapControl?,
      MapContextRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(7)
  public fun remove_MapContextRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(8)
  public fun FindMapElementsAtOffset(offset: Point?, radius: Double): IVectorView<MapElement?>?

  @InterfaceMethod(9)
  public fun GetLocationFromOffset(
    offset: Point?,
    desiredReferenceSystem: AltitudeReferenceSystem?,
    location: Windows.Devices.Geolocation.Geopoint.ByReference?
  ): Unit

  @InterfaceMethod(10)
  public fun StartContinuousPan(horizontalPixelsPerSecond: Double, verticalPixelsPerSecond: Double):
      Unit

  @InterfaceMethod(11)
  public fun StopContinuousPan(): Unit

  @InterfaceMethod(12)
  public fun TryPanAsync(horizontalPixels: Double, verticalPixels: Double):
      IAsyncOperation<Boolean>?

  @InterfaceMethod(13)
  public fun TryPanToAsync(location: Geopoint?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl5> {
    public override fun getValue() = ABI.makeIMapControl5(pointer.getPointer(0))

    public fun setValue(value: IMapControl5_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl5 {
    public val __1767447043_Ptr: Pointer?

    public val _1767447043_VtblPtr: Pointer?
      get() = __1767447043_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MapProjection(): MapProjection? {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapProjection>()
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapProjection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_MapProjection(value: MapProjection?): Unit {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StyleSheet(): MapStyleSheet? {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapStyleSheet>()
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapStyleSheet>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_StyleSheet(value: MapStyleSheet?): Unit {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ViewPadding(): Thickness? {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Thickness>()
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Thickness>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ViewPadding(value: Thickness?): Unit {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun add_MapContextRequested(handler: TypedEventHandler<MapControl?,
        MapContextRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun remove_MapContextRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun FindMapElementsAtOffset(offset: Point?, radius: Double):
        IVectorView<MapElement?>? {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MapElement?>>()
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(offset), radius, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MapElement?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetLocationFromOffset(
      offset: Point?,
      desiredReferenceSystem: AltitudeReferenceSystem?,
      location: Windows.Devices.Geolocation.Geopoint.ByReference?
    ): Unit {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(offset),
          marshalToNative(desiredReferenceSystem), marshalToNative(location),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun StartContinuousPan(horizontalPixelsPerSecond: Double,
        verticalPixelsPerSecond: Double): Unit {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, horizontalPixelsPerSecond,
          verticalPixelsPerSecond,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun StopContinuousPan(): Unit {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun TryPanAsync(horizontalPixels: Double, verticalPixels: Double):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, horizontalPixels, verticalPixels, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun TryPanToAsync(location: Geopoint?): IAsyncOperation<Boolean>? {
      val fnPtr = _1767447043_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1767447043_Ptr, marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class IMapControl5_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767447043_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl5, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("dd9b0ffd782346a282c965ddac4f365f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl5(ptr: Pointer?): WithDefault = IMapControl5_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl5 {
      val address = segment.toRawLongValue()
      return makeIMapControl5(Pointer(address))
    }

    public override fun toNative(obj: IMapControl5): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767447043_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl5): Array<IMapControl5?> = (elements as
        Array<IMapControl5?>).castToImpl<IMapControl5,IMapControl5_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl5?> =
        arrayOfNulls<IMapControl5_Impl>(size) as Array<IMapControl5?>
  }
}
