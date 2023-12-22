package Windows.Services.Maps.LocalSearch

import Windows.Devices.Geolocation.Geopoint
import Windows.Services.Maps.MapAddress
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

@ABIMarker(ILocalLocation.ABI::class)
@Signature("{bb0fe9ab-4502-4f2c-94a9-0d60de0e2163}")
@Guid("bb0fe9ab45024f2c94a90d60de0e2163")
@WinRTInterface("bb0fe9ab45024f2c94a90d60de0e2163")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILocalLocation.ByReference::class)
public interface ILocalLocation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Address(): MapAddress?

  @InterfaceMethod(1)
  public fun get_Identifier(): String?

  @InterfaceMethod(2)
  public fun get_Description(): String?

  @InterfaceMethod(3)
  public fun get_DisplayName(): String?

  @InterfaceMethod(4)
  public fun get_Point(): Geopoint?

  @InterfaceMethod(5)
  public fun get_PhoneNumber(): String?

  @InterfaceMethod(6)
  public fun get_DataAttribution(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ILocalLocation>
      {
    public override fun getValue() = ABI.makeILocalLocation(pointer.getPointer(0))

    public fun setValue(value: ILocalLocation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILocalLocation {
    public val __1786012792_Ptr: Pointer?

    public val _1786012792_VtblPtr: Pointer?
      get() = __1786012792_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Address(): MapAddress? {
      val fnPtr = _1786012792_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MapAddress>()
      val hr = fn.invokeHR(arrayOf(__1786012792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MapAddress>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Identifier(): String? {
      val fnPtr = _1786012792_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1786012792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Description(): String? {
      val fnPtr = _1786012792_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1786012792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DisplayName(): String? {
      val fnPtr = _1786012792_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1786012792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Point(): Geopoint? {
      val fnPtr = _1786012792_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopoint>()
      val hr = fn.invokeHR(arrayOf(__1786012792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopoint>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_PhoneNumber(): String? {
      val fnPtr = _1786012792_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1786012792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_DataAttribution(): String? {
      val fnPtr = _1786012792_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1786012792_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class ILocalLocation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1786012792_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILocalLocation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bb0fe9ab45024f2c94a90d60de0e2163")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILocalLocation(ptr: Pointer?): WithDefault = ILocalLocation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILocalLocation {
      val address = segment.toRawLongValue()
      return makeILocalLocation(Pointer(address))
    }

    public override fun toNative(obj: ILocalLocation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1786012792_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILocalLocation): Array<ILocalLocation?> = (elements as
        Array<ILocalLocation?>).castToImpl<ILocalLocation,ILocalLocation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILocalLocation?> =
        arrayOfNulls<ILocalLocation_Impl>(size) as Array<ILocalLocation?>
  }
}
