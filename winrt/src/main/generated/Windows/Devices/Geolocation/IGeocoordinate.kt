package Windows.Devices.Geolocation

import Windows.Foundation.DateTime
import Windows.Foundation.IReference
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

@ABIMarker(IGeocoordinate.ABI::class)
@Signature("{ee21a3aa-976a-4c70-803d-083ea55bcbc4}")
@Guid("ee21a3aa976a4c70803d083ea55bcbc4")
@WinRTInterface("ee21a3aa976a4c70803d083ea55bcbc4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGeocoordinate.ByReference::class)
public interface IGeocoordinate : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Latitude(): Double

  @InterfaceMethod(1)
  public fun get_Longitude(): Double

  @InterfaceMethod(2)
  public fun get_Altitude(): IReference<Double>?

  @InterfaceMethod(3)
  public fun get_Accuracy(): Double

  @InterfaceMethod(4)
  public fun get_AltitudeAccuracy(): IReference<Double>?

  @InterfaceMethod(5)
  public fun get_Heading(): IReference<Double>?

  @InterfaceMethod(6)
  public fun get_Speed(): IReference<Double>?

  @InterfaceMethod(7)
  public fun get_Timestamp(): DateTime?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IGeocoordinate>
      {
    public override fun getValue() = ABI.makeIGeocoordinate(pointer.getPointer(0))

    public fun setValue(value: IGeocoordinate_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGeocoordinate {
    public val __2008031638_Ptr: Pointer?

    public val _2008031638_VtblPtr: Pointer?
      get() = __2008031638_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Latitude(): Double {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Longitude(): Double {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Altitude(): IReference<Double>? {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Accuracy(): Double {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_AltitudeAccuracy(): IReference<Double>? {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_Heading(): IReference<Double>? {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_Speed(): IReference<Double>? {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Double>>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Double>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_Timestamp(): DateTime? {
      val fnPtr = _2008031638_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DateTime>()
      val hr = fn.invokeHR(arrayOf(__2008031638_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DateTime>(result.getValue())
      return resultValue
    }
  }

  public class IGeocoordinate_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2008031638_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGeocoordinate, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ee21a3aa976a4c70803d083ea55bcbc4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGeocoordinate(ptr: Pointer?): WithDefault = IGeocoordinate_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGeocoordinate {
      val address = segment.toRawLongValue()
      return makeIGeocoordinate(Pointer(address))
    }

    public override fun toNative(obj: IGeocoordinate): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2008031638_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGeocoordinate): Array<IGeocoordinate?> = (elements as
        Array<IGeocoordinate?>).castToImpl<IGeocoordinate,IGeocoordinate_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGeocoordinate?> =
        arrayOfNulls<IGeocoordinate_Impl>(size) as Array<IGeocoordinate?>
  }
}
