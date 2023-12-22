package Microsoft.UI.Xaml.Media

import Microsoft.UI.Composition.CompositionColorSpace
import Windows.Foundation.Collections.IObservableVector
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

@ABIMarker(IRadialGradientBrush.ABI::class)
@Signature("{5d493ce1-b844-546a-b772-b3bcba7e98ee}")
@Guid("5d493ce1b844546ab772b3bcba7e98ee")
@WinRTInterface("5d493ce1b844546ab772b3bcba7e98ee")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadialGradientBrush.ByReference::class)
public interface IRadialGradientBrush : NativeMapped, IWinRTInterface {
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

  @InterfaceMethod(6)
  public fun get_GradientOrigin(): Point?

  @InterfaceMethod(7)
  public fun put_GradientOrigin(value: Point?): Unit

  @InterfaceMethod(8)
  public fun get_MappingMode(): BrushMappingMode?

  @InterfaceMethod(9)
  public fun put_MappingMode(value: BrushMappingMode?): Unit

  @InterfaceMethod(10)
  public fun get_InterpolationSpace(): CompositionColorSpace?

  @InterfaceMethod(11)
  public fun put_InterpolationSpace(value: CompositionColorSpace?): Unit

  @InterfaceMethod(12)
  public fun get_SpreadMethod(): GradientSpreadMethod?

  @InterfaceMethod(13)
  public fun put_SpreadMethod(value: GradientSpreadMethod?): Unit

  @InterfaceMethod(14)
  public fun get_GradientStops(): IObservableVector<GradientStop?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadialGradientBrush> {
    public override fun getValue() = ABI.makeIRadialGradientBrush(pointer.getPointer(0))

    public fun setValue(value: IRadialGradientBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadialGradientBrush {
    public val __1687694906_Ptr: Pointer?

    public val _1687694906_VtblPtr: Pointer?
      get() = __1687694906_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Center(): Point? {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Center(value: Point?): Unit {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_RadiusX(): Double {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_RadiusX(value: Double): Unit {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_RadiusY(): Double {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_RadiusY(value: Double): Unit {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_GradientOrigin(): Point? {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Point>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Point>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_GradientOrigin(value: Point?): Unit {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_MappingMode(): BrushMappingMode? {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BrushMappingMode>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BrushMappingMode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_MappingMode(value: BrushMappingMode?): Unit {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_InterpolationSpace(): CompositionColorSpace? {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionColorSpace>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionColorSpace>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_InterpolationSpace(value: CompositionColorSpace?): Unit {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_SpreadMethod(): GradientSpreadMethod? {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GradientSpreadMethod>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GradientSpreadMethod>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_SpreadMethod(value: GradientSpreadMethod?): Unit {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_GradientStops(): IObservableVector<GradientStop?>? {
      val fnPtr = _1687694906_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IObservableVector<GradientStop?>>()
      val hr = fn.invokeHR(arrayOf(__1687694906_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IObservableVector<GradientStop?>>(result.getValue())
      return resultValue
    }
  }

  public class IRadialGradientBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1687694906_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadialGradientBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5d493ce1b844546ab772b3bcba7e98ee")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadialGradientBrush(ptr: Pointer?): WithDefault = IRadialGradientBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadialGradientBrush {
      val address = segment.toRawLongValue()
      return makeIRadialGradientBrush(Pointer(address))
    }

    public override fun toNative(obj: IRadialGradientBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1687694906_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadialGradientBrush): Array<IRadialGradientBrush?> =
        (elements as
        Array<IRadialGradientBrush?>).castToImpl<IRadialGradientBrush,IRadialGradientBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadialGradientBrush?> =
        arrayOfNulls<IRadialGradientBrush_Impl>(size) as Array<IRadialGradientBrush?>
  }
}
