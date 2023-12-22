package Windows.Services.Maps

import Windows.Devices.Geolocation.GeoboundingBox
import Windows.Devices.Geolocation.Geopath
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.TimeSpan
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

@ABIMarker(IMapRouteLeg.ABI::class)
@Signature("{96f8b2f6-5bba-4d17-9db6-1a263fec7471}")
@Guid("96f8b2f65bba4d179db61a263fec7471")
@WinRTInterface("96f8b2f65bba4d179db61a263fec7471")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapRouteLeg.ByReference::class)
public interface IMapRouteLeg : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BoundingBox(): GeoboundingBox?

  @InterfaceMethod(1)
  public fun get_Path(): Geopath?

  @InterfaceMethod(2)
  public fun get_LengthInMeters(): Double

  @InterfaceMethod(3)
  public fun get_EstimatedDuration(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_Maneuvers(): IVectorView<MapRouteManeuver?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapRouteLeg> {
    public override fun getValue() = ABI.makeIMapRouteLeg(pointer.getPointer(0))

    public fun setValue(value: IMapRouteLeg_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapRouteLeg {
    public val __415147092_Ptr: Pointer?

    public val _415147092_VtblPtr: Pointer?
      get() = __415147092_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BoundingBox(): GeoboundingBox? {
      val fnPtr = _415147092_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GeoboundingBox>()
      val hr = fn.invokeHR(arrayOf(__415147092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GeoboundingBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Path(): Geopath? {
      val fnPtr = _415147092_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__415147092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_LengthInMeters(): Double {
      val fnPtr = _415147092_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__415147092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_EstimatedDuration(): TimeSpan? {
      val fnPtr = _415147092_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__415147092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Maneuvers(): IVectorView<MapRouteManeuver?>? {
      val fnPtr = _415147092_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<MapRouteManeuver?>>()
      val hr = fn.invokeHR(arrayOf(__415147092_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<MapRouteManeuver?>>(result.getValue())
      return resultValue
    }
  }

  public class IMapRouteLeg_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __415147092_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapRouteLeg, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("96f8b2f65bba4d179db61a263fec7471")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapRouteLeg(ptr: Pointer?): WithDefault = IMapRouteLeg_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapRouteLeg {
      val address = segment.toRawLongValue()
      return makeIMapRouteLeg(Pointer(address))
    }

    public override fun toNative(obj: IMapRouteLeg): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__415147092_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapRouteLeg): Array<IMapRouteLeg?> = (elements as
        Array<IMapRouteLeg?>).castToImpl<IMapRouteLeg,IMapRouteLeg_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapRouteLeg?> =
        arrayOfNulls<IMapRouteLeg_Impl>(size) as Array<IMapRouteLeg?>
  }
}
