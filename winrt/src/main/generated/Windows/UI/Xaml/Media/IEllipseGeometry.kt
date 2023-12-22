package Windows.UI.Xaml.Media

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEllipseGeometry.ABI::class)
@Signature("{d4f61bba-4ea2-40d6-aa6c-8d38aa87651f}")
@Guid("d4f61bba4ea240d6aa6c8d38aa87651f")
@WinRTInterface("d4f61bba4ea240d6aa6c8d38aa87651f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEllipseGeometry.ByReference::class)
public interface IEllipseGeometry : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Center(): Point?

  @InterfaceMethod(1)
  public fun put_Center(value: Point?): Unit

  @InterfaceMethod(2)
  public fun get_RadiusX(): Double

  @InterfaceMethod(3)
  public fun put_RadiusX(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_RadiusY(): Double

  @InterfaceMethod(5)
  public fun put_RadiusY(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEllipseGeometry> {
    public override fun getValue() = ABI.makeIEllipseGeometry(pointer.getPointer(0))

    public fun setValue(value: IEllipseGeometry_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEllipseGeometry {
    public val __526450932_Ptr: Pointer?

    public val _526450932_VtblPtr: Pointer?
      get() = __526450932_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Center(): Point? {
      val fnPtr = _526450932_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__526450932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Center(value: Point?): Unit {
      val fnPtr = _526450932_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__526450932_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RadiusX(): Double {
      val fnPtr = _526450932_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__526450932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_RadiusX(value: Double): Unit {
      val fnPtr = _526450932_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__526450932_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RadiusY(): Double {
      val fnPtr = _526450932_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__526450932_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RadiusY(value: Double): Unit {
      val fnPtr = _526450932_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__526450932_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEllipseGeometry_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __526450932_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEllipseGeometry, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d4f61bba4ea240d6aa6c8d38aa87651f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEllipseGeometry(ptr: Pointer?): WithDefault = IEllipseGeometry_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEllipseGeometry {
      val address = segment.toRawLongValue()
      return makeIEllipseGeometry(Pointer(address))
    }

    public override fun toNative(obj: IEllipseGeometry): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__526450932_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEllipseGeometry): Array<IEllipseGeometry?> = (elements as
        Array<IEllipseGeometry?>).castToImpl<IEllipseGeometry,IEllipseGeometry_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEllipseGeometry?> =
        arrayOfNulls<IEllipseGeometry_Impl>(size) as Array<IEllipseGeometry?>
  }
}
