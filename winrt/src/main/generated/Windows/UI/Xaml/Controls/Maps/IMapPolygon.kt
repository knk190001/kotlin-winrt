package Windows.UI.Xaml.Controls.Maps

import Windows.Devices.Geolocation.Geopath
import Windows.UI.Color
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

@ABIMarker(IMapPolygon.ABI::class)
@Signature("{abda2285-4926-4c3a-a5f9-19df7f69db3d}")
@Guid("abda228549264c3aa5f919df7f69db3d")
@WinRTInterface("abda228549264c3aa5f919df7f69db3d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMapPolygon.ByReference::class)
public interface IMapPolygon : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Path(): Geopath?

  @InterfaceMethod(1)
  public fun put_Path(value: Geopath?): Unit

  @InterfaceMethod(2)
  public fun get_StrokeColor(): Color?

  @InterfaceMethod(3)
  public fun put_StrokeColor(value: Color?): Unit

  @InterfaceMethod(4)
  public fun get_StrokeThickness(): Double

  @InterfaceMethod(5)
  public fun put_StrokeThickness(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_StrokeDashed(): Boolean

  @InterfaceMethod(7)
  public fun put_StrokeDashed(value: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_FillColor(): Color?

  @InterfaceMethod(9)
  public fun put_FillColor(value: Color?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMapPolygon> {
    public override fun getValue() = ABI.makeIMapPolygon(pointer.getPointer(0))

    public fun setValue(value: IMapPolygon_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMapPolygon {
    public val __1894540367_Ptr: Pointer?

    public val _1894540367_VtblPtr: Pointer?
      get() = __1894540367_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Path(): Geopath? {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Geopath>()
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Geopath>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Path(value: Geopath?): Unit {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_StrokeColor(): Color? {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_StrokeColor(value: Color?): Unit {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StrokeThickness(): Double {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_StrokeThickness(value: Double): Unit {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_StrokeDashed(): Boolean {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_StrokeDashed(value: Boolean): Unit {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_FillColor(): Color? {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_FillColor(value: Color?): Unit {
      val fnPtr = _1894540367_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1894540367_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMapPolygon_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1894540367_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMapPolygon, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("abda228549264c3aa5f919df7f69db3d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMapPolygon(ptr: Pointer?): WithDefault = IMapPolygon_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMapPolygon {
      val address = segment.toRawLongValue()
      return makeIMapPolygon(Pointer(address))
    }

    public override fun toNative(obj: IMapPolygon): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1894540367_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMapPolygon): Array<IMapPolygon?> = (elements as
        Array<IMapPolygon?>).castToImpl<IMapPolygon,IMapPolygon_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMapPolygon?> =
        arrayOfNulls<IMapPolygon_Impl>(size) as Array<IMapPolygon?>
  }
}
