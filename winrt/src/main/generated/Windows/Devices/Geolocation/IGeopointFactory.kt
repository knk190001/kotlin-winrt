package Windows.Devices.Geolocation

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

@ABIMarker(IGeopointFactory.ABI::class)
@Signature("{db6b8d33-76bd-4e30-8af7-a844dc37b7a0}")
@Guid("db6b8d3376bd4e308af7a844dc37b7a0")
@WinRTInterface("db6b8d3376bd4e308af7a844dc37b7a0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeopointFactory.ByReference::class)
public interface IGeopointFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(position: BasicGeoposition?): Geopoint?

  @InterfaceMethod(1)
  public fun CreateWithAltitudeReferenceSystem(position: BasicGeoposition?,
      altitudeReferenceSystem: AltitudeReferenceSystem?): Geopoint?

  @InterfaceMethod(2)
  public fun CreateWithAltitudeReferenceSystemAndSpatialReferenceId(
    position: BasicGeoposition?,
    altitudeReferenceSystem: AltitudeReferenceSystem?,
    spatialReferenceId: WinDef.UINT
  ): Geopoint?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeopointFactory> {
    public override fun getValue() = ABI.makeIGeopointFactory(pointer.getPointer(0))

    public fun setValue(value: IGeopointFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeopointFactory {
    public val __965936588_Ptr: Pointer?

    public val _965936588_VtblPtr: Pointer?
      get() = __965936588_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(position: BasicGeoposition?): Geopoint? {
      val fnPtr = _965936588_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__965936588_Ptr, marshalToNative(position), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateWithAltitudeReferenceSystem(position: BasicGeoposition?,
        altitudeReferenceSystem: AltitudeReferenceSystem?): Geopoint? {
      val fnPtr = _965936588_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__965936588_Ptr, marshalToNative(position),
          marshalToNative(altitudeReferenceSystem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateWithAltitudeReferenceSystemAndSpatialReferenceId(
      position: BasicGeoposition?,
      altitudeReferenceSystem: AltitudeReferenceSystem?,
      spatialReferenceId: WinDef.UINT
    ): Geopoint? {
      val fnPtr = _965936588_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__965936588_Ptr, marshalToNative(position),
          marshalToNative(altitudeReferenceSystem), spatialReferenceId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }
  }

  public class IGeopointFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __965936588_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeopointFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db6b8d3376bd4e308af7a844dc37b7a0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeopointFactory(ptr: Pointer?): WithDefault = IGeopointFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeopointFactory {
      val address = segment.toRawLongValue()
      return makeIGeopointFactory(Pointer(address))
    }

    public override fun toNative(obj: IGeopointFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__965936588_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeopointFactory): Array<IGeopointFactory?> = (elements as
        Array<IGeopointFactory?>).castToImpl<IGeopointFactory,IGeopointFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeopointFactory?> =
        arrayOfNulls<IGeopointFactory_Impl>(size) as Array<IGeopointFactory?>
  }
}
