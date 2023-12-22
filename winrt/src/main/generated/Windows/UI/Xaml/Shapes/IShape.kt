package Windows.UI.Xaml.Shapes

import Windows.UI.Xaml.Media.Brush
import Windows.UI.Xaml.Media.DoubleCollection
import Windows.UI.Xaml.Media.PenLineCap
import Windows.UI.Xaml.Media.PenLineJoin
import Windows.UI.Xaml.Media.Stretch
import Windows.UI.Xaml.Media.Transform
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

@ABIMarker(IShape.ABI::class)
@Signature("{786f2b75-9aa0-454d-ae06-a2466e37c832}")
@Guid("786f2b759aa0454dae06a2466e37c832")
@WinRTInterface("786f2b759aa0454dae06a2466e37c832")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShape.ByReference::class)
public interface IShape : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Fill(): Brush?

  @InterfaceMethod(1)
  public fun put_Fill(value: Brush?): Unit

  @InterfaceMethod(2)
  public fun get_Stroke(): Brush?

  @InterfaceMethod(3)
  public fun put_Stroke(value: Brush?): Unit

  @InterfaceMethod(4)
  public fun get_StrokeMiterLimit(): Double

  @InterfaceMethod(5)
  public fun put_StrokeMiterLimit(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_StrokeThickness(): Double

  @InterfaceMethod(7)
  public fun put_StrokeThickness(value: Double): Unit

  @InterfaceMethod(8)
  public fun get_StrokeStartLineCap(): PenLineCap?

  @InterfaceMethod(9)
  public fun put_StrokeStartLineCap(value: PenLineCap?): Unit

  @InterfaceMethod(10)
  public fun get_StrokeEndLineCap(): PenLineCap?

  @InterfaceMethod(11)
  public fun put_StrokeEndLineCap(value: PenLineCap?): Unit

  @InterfaceMethod(12)
  public fun get_StrokeLineJoin(): PenLineJoin?

  @InterfaceMethod(13)
  public fun put_StrokeLineJoin(value: PenLineJoin?): Unit

  @InterfaceMethod(14)
  public fun get_StrokeDashOffset(): Double

  @InterfaceMethod(15)
  public fun put_StrokeDashOffset(value: Double): Unit

  @InterfaceMethod(16)
  public fun get_StrokeDashCap(): PenLineCap?

  @InterfaceMethod(17)
  public fun put_StrokeDashCap(value: PenLineCap?): Unit

  @InterfaceMethod(18)
  public fun get_StrokeDashArray(): DoubleCollection?

  @InterfaceMethod(19)
  public fun put_StrokeDashArray(value: DoubleCollection?): Unit

  @InterfaceMethod(20)
  public fun get_Stretch(): Stretch?

  @InterfaceMethod(21)
  public fun put_Stretch(value: Stretch?): Unit

  @InterfaceMethod(22)
  public fun get_GeometryTransform(): Transform?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShape> {
    public override fun getValue() = ABI.makeIShape(pointer.getPointer(0))

    public fun setValue(value: IShape_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShape {
    public val __1600845825_Ptr: Pointer?

    public val _1600845825_VtblPtr: Pointer?
      get() = __1600845825_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Fill(): Brush? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Fill(value: Brush?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Stroke(): Brush? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Stroke(value: Brush?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_StrokeMiterLimit(): Double {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_StrokeMiterLimit(value: Double): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_StrokeThickness(): Double {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_StrokeThickness(value: Double): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_StrokeStartLineCap(): PenLineCap? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenLineCap>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenLineCap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_StrokeStartLineCap(value: PenLineCap?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_StrokeEndLineCap(): PenLineCap? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenLineCap>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenLineCap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_StrokeEndLineCap(value: PenLineCap?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_StrokeLineJoin(): PenLineJoin? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenLineJoin>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenLineJoin>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_StrokeLineJoin(value: PenLineJoin?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_StrokeDashOffset(): Double {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_StrokeDashOffset(value: Double): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_StrokeDashCap(): PenLineCap? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenLineCap>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenLineCap>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun put_StrokeDashCap(value: PenLineCap?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_StrokeDashArray(): DoubleCollection? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DoubleCollection>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DoubleCollection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_StrokeDashArray(value: DoubleCollection?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_Stretch(): Stretch? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Stretch>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Stretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(21)
    public override fun put_Stretch(value: Stretch?): Unit {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun get_GeometryTransform(): Transform? {
      val fnPtr = _1600845825_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Transform>()
      val hr = fn.invokeHR(arrayOf(__1600845825_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Transform>(result.getValue())
      return resultValue
    }
  }

  public class IShape_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1600845825_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShape, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("786f2b759aa0454dae06a2466e37c832")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShape(ptr: Pointer?): WithDefault = IShape_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShape {
      val address = segment.toRawLongValue()
      return makeIShape(Pointer(address))
    }

    public override fun toNative(obj: IShape): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1600845825_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShape): Array<IShape?> = (elements as
        Array<IShape?>).castToImpl<IShape,IShape_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShape?> = arrayOfNulls<IShape_Impl>(size) as
        Array<IShape?>
  }
}
