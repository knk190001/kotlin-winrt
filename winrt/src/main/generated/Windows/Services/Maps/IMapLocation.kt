package Windows.Services.Maps

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMapLocation.ABI::class)
@Signature("{3c073f57-0da4-42e8-9ee2-a96fcf2371dc}")
@Guid("3c073f570da442e89ee2a96fcf2371dc")
@WinRTInterface("3c073f570da442e89ee2a96fcf2371dc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapLocation.ByReference::class)
public interface IMapLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Point(): Geopoint?

  @InterfaceMethod(1)
  public fun get_DisplayName(): String?

  @InterfaceMethod(2)
  public fun get_Description(): String?

  @InterfaceMethod(3)
  public fun get_Address(): MapAddress?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapLocation> {
    public override fun getValue() = ABI.makeIMapLocation(pointer.getPointer(0))

    public fun setValue(value: IMapLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapLocation {
    public val __1984176892_Ptr: Pointer?

    public val _1984176892_VtblPtr: Pointer?
      get() = __1984176892_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Point(): Geopoint? {
      val fnPtr = _1984176892_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1984176892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1984176892_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1984176892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Description(): String? {
      val fnPtr = _1984176892_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1984176892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Address(): MapAddress? {
      val fnPtr = _1984176892_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapAddress>()
      val hr = fn.invokeHR(arrayOf(__1984176892_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapAddress>(result.getValue())
      return resultValue
    }
  }

  public class IMapLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1984176892_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3c073f570da442e89ee2a96fcf2371dc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapLocation(ptr: Pointer?): WithDefault = IMapLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapLocation {
      val address = segment.toRawLongValue()
      return makeIMapLocation(Pointer(address))
    }

    public override fun toNative(obj: IMapLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1984176892_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapLocation): Array<IMapLocation?> = (elements as
        Array<IMapLocation?>).castToImpl<IMapLocation,IMapLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapLocation?> =
        arrayOfNulls<IMapLocation_Impl>(size) as Array<IMapLocation?>
  }
}
