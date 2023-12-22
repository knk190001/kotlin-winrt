package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.AltitudeReferenceSystem
import Windows.Foundation.Collections.IVector
import Windows.Foundation.Point
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapControl6.ABI::class)
@Signature("{b0da89a2-1041-4bea-b88a-12ac9a82e0e2}")
@Guid("b0da89a210414beab88a12ac9a82e0e2")
@WinRTInterface("b0da89a210414beab88a12ac9a82e0e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapControl6.ByReference::class)
public interface IMapControl6 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Layers(): IVector<MapLayer?>?

  @InterfaceMethod(1)
  public fun put_Layers(value: IVector<MapLayer?>?): Unit

  @InterfaceMethod(2)
  public fun TryGetLocationFromOffset(offset: Point?,
      location: Windows.Devices.Geolocation.Geopoint.ByReference?): Boolean

  @InterfaceMethod(3)
  public fun TryGetLocationFromOffset(
    offset: Point?,
    desiredReferenceSystem: AltitudeReferenceSystem?,
    location: Windows.Devices.Geolocation.Geopoint.ByReference?
  ): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapControl6> {
    public override fun getValue() = ABI.makeIMapControl6(pointer.getPointer(0))

    public fun setValue(value: IMapControl6_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapControl6 {
    public val __1767447044_Ptr: Pointer?

    public val _1767447044_VtblPtr: Pointer?
      get() = __1767447044_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Layers(): IVector<MapLayer?>? {
      val fnPtr = _1767447044_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MapLayer?>>()
      val hr = fn.invokeHR(arrayOf(__1767447044_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MapLayer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Layers(value: IVector<MapLayer?>?): Unit {
      val fnPtr = _1767447044_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1767447044_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun TryGetLocationFromOffset(offset: Point?,
        location: Windows.Devices.Geolocation.Geopoint.ByReference?): Boolean {
      val fnPtr = _1767447044_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447044_Ptr, marshalToNative(offset),
          marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun TryGetLocationFromOffset(
      offset: Point?,
      desiredReferenceSystem: AltitudeReferenceSystem?,
      location: Windows.Devices.Geolocation.Geopoint.ByReference?
    ): Boolean {
      val fnPtr = _1767447044_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1767447044_Ptr, marshalToNative(offset),
          marshalToNative(desiredReferenceSystem), marshalToNative(location), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMapControl6_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1767447044_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapControl6, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b0da89a210414beab88a12ac9a82e0e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapControl6(ptr: Pointer?): WithDefault = IMapControl6_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapControl6 {
      val address = segment.toRawLongValue()
      return makeIMapControl6(Pointer(address))
    }

    public override fun toNative(obj: IMapControl6): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1767447044_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapControl6): Array<IMapControl6?> = (elements as
        Array<IMapControl6?>).castToImpl<IMapControl6,IMapControl6_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapControl6?> =
        arrayOfNulls<IMapControl6_Impl>(size) as Array<IMapControl6?>
  }
}
