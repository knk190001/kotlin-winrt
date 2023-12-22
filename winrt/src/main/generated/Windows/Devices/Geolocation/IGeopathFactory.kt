package Windows.Devices.Geolocation

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IGeopathFactory.ABI::class)
@Signature("{27bea9c8-c7e7-4359-9b9b-fca3e05ef593}")
@Guid("27bea9c8c7e743599b9bfca3e05ef593")
@WinRTInterface("27bea9c8c7e743599b9bfca3e05ef593")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeopathFactory.ByReference::class)
public interface IGeopathFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(positions: IIterable<BasicGeoposition?>?): Geopath?

  @InterfaceMethod(1)
  public fun CreateWithAltitudeReference(positions: IIterable<BasicGeoposition?>?,
      altitudeReferenceSystem: AltitudeReferenceSystem?): Geopath?

  @InterfaceMethod(2)
  public fun CreateWithAltitudeReferenceAndSpatialReference(
    positions: IIterable<BasicGeoposition?>?,
    altitudeReferenceSystem: AltitudeReferenceSystem?,
    spatialReferenceId: WinDef.UINT
  ): Geopath?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeopathFactory> {
    public override fun getValue() = ABI.makeIGeopathFactory(pointer.getPointer(0))

    public fun setValue(value: IGeopathFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeopathFactory {
    public val __1251677811_Ptr: Pointer?

    public val _1251677811_VtblPtr: Pointer?
      get() = __1251677811_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(positions: IIterable<BasicGeoposition?>?): Geopath? {
      val fnPtr = _1251677811_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__1251677811_Ptr, marshalToNative(positions), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithAltitudeReference(positions: IIterable<BasicGeoposition?>?,
        altitudeReferenceSystem: AltitudeReferenceSystem?): Geopath? {
      val fnPtr = _1251677811_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__1251677811_Ptr, marshalToNative(positions),
          marshalToNative(altitudeReferenceSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithAltitudeReferenceAndSpatialReference(
      positions: IIterable<BasicGeoposition?>?,
      altitudeReferenceSystem: AltitudeReferenceSystem?,
      spatialReferenceId: WinDef.UINT
    ): Geopath? {
      val fnPtr = _1251677811_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__1251677811_Ptr, marshalToNative(positions),
          marshalToNative(altitudeReferenceSystem), spatialReferenceId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }
  }

  public class IGeopathFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1251677811_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeopathFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("27bea9c8c7e743599b9bfca3e05ef593")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeopathFactory(ptr: Pointer?): WithDefault = IGeopathFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeopathFactory {
      val address = segment.toRawLongValue()
      return makeIGeopathFactory(Pointer(address))
    }

    public override fun toNative(obj: IGeopathFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1251677811_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeopathFactory): Array<IGeopathFactory?> = (elements as
        Array<IGeopathFactory?>).castToImpl<IGeopathFactory,IGeopathFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeopathFactory?> =
        arrayOfNulls<IGeopathFactory_Impl>(size) as Array<IGeopathFactory?>
  }
}
