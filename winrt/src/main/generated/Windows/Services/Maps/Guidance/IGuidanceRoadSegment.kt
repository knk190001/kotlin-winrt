package Windows.Services.Maps.Guidance

import Windows.Devices.Geolocation.Geopath
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
import kotlin.Boolean
import kotlin.Double
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGuidanceRoadSegment.ABI::class)
@Signature("{b32758a6-be78-4c63-afe7-6c2957479b3e}")
@Guid("b32758a6be784c63afe76c2957479b3e")
@WinRTInterface("b32758a6be784c63afe76c2957479b3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGuidanceRoadSegment.ByReference::class)
public interface IGuidanceRoadSegment : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RoadName(): String?

  @InterfaceMethod(1)
  public fun get_ShortRoadName(): String?

  @InterfaceMethod(2)
  public fun get_SpeedLimit(): Double

  @InterfaceMethod(3)
  public fun get_TravelTime(): TimeSpan?

  @InterfaceMethod(4)
  public fun get_Path(): Geopath?

  @InterfaceMethod(5)
  public fun get_Id(): String?

  @InterfaceMethod(6)
  public fun get_IsHighway(): Boolean

  @InterfaceMethod(7)
  public fun get_IsTunnel(): Boolean

  @InterfaceMethod(8)
  public fun get_IsTollRoad(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGuidanceRoadSegment> {
    public override fun getValue() = ABI.makeIGuidanceRoadSegment(pointer.getPointer(0))

    public fun setValue(value: IGuidanceRoadSegment_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGuidanceRoadSegment {
    public val __1655683260_Ptr: Pointer?

    public val _1655683260_VtblPtr: Pointer?
      get() = __1655683260_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RoadName(): String? {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ShortRoadName(): String? {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SpeedLimit(): Double {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun get_TravelTime(): TimeSpan? {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_Path(): Geopath? {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Id(): String? {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_IsHighway(): Boolean {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun get_IsTunnel(): Boolean {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun get_IsTollRoad(): Boolean {
      val fnPtr = _1655683260_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1655683260_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IGuidanceRoadSegment_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1655683260_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGuidanceRoadSegment, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b32758a6be784c63afe76c2957479b3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGuidanceRoadSegment(ptr: Pointer?): WithDefault = IGuidanceRoadSegment_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGuidanceRoadSegment {
      val address = segment.toRawLongValue()
      return makeIGuidanceRoadSegment(Pointer(address))
    }

    public override fun toNative(obj: IGuidanceRoadSegment): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1655683260_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGuidanceRoadSegment): Array<IGuidanceRoadSegment?> =
        (elements as
        Array<IGuidanceRoadSegment?>).castToImpl<IGuidanceRoadSegment,IGuidanceRoadSegment_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGuidanceRoadSegment?> =
        arrayOfNulls<IGuidanceRoadSegment_Impl>(size) as Array<IGuidanceRoadSegment?>
  }
}
