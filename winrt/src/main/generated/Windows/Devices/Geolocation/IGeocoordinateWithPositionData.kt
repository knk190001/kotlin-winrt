package Windows.Devices.Geolocation

import Windows.Devices.Geolocation.IGeocoordinate.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IGeocoordinateWithPositionData.ABI::class)
@Signature("{95e634be-dbd6-40ac-b8f2-a65c0340d9a6}")
@Guid("95e634bedbd640acb8f2a65c0340d9a6")
@WinRTInterface("95e634bedbd640acb8f2a65c0340d9a6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeocoordinateWithPositionData.ByReference::class)
public interface IGeocoordinateWithPositionData : NativeMapped, IWinRTInterface, IGeocoordinate {
  @InterfaceMethod(0)
  public fun get_PositionSource(): PositionSource?

  @InterfaceMethod(1)
  public fun get_SatelliteData(): GeocoordinateSatelliteData?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGeocoordinateWithPositionData> {
    public override fun getValue() = ABI.makeIGeocoordinateWithPositionData(pointer.getPointer(0))

    public fun setValue(value: IGeocoordinateWithPositionData_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeocoordinateWithPositionData, IGeocoordinate.WithDefault {
    public val __1941939485_Ptr: Pointer?

    public val _1941939485_VtblPtr: Pointer?
      get() = __1941939485_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PositionSource(): PositionSource? {
      val fnPtr = _1941939485_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PositionSource>()
      val hr = fn.invokeHR(arrayOf(__1941939485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PositionSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SatelliteData(): GeocoordinateSatelliteData? {
      val fnPtr = _1941939485_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeocoordinateSatelliteData>()
      val hr = fn.invokeHR(arrayOf(__1941939485_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeocoordinateSatelliteData>(result.getValue())
      return resultValue
    }
  }

  public class IGeocoordinateWithPositionData_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IGeocoordinate {
    public override val __2008031638_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1941939485_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1941939485_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeocoordinateWithPositionData, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("95e634bedbd640acb8f2a65c0340d9a6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeocoordinateWithPositionData(ptr: Pointer?): WithDefault =
        IGeocoordinateWithPositionData_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeocoordinateWithPositionData {
      val address = segment.toRawLongValue()
      return makeIGeocoordinateWithPositionData(Pointer(address))
    }

    public override fun toNative(obj: IGeocoordinateWithPositionData): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1941939485_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeocoordinateWithPositionData):
        Array<IGeocoordinateWithPositionData?> = (elements as
        Array<IGeocoordinateWithPositionData?>).castToImpl<IGeocoordinateWithPositionData,IGeocoordinateWithPositionData_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeocoordinateWithPositionData?> =
        arrayOfNulls<IGeocoordinateWithPositionData_Impl>(size) as
        Array<IGeocoordinateWithPositionData?>
  }
}
