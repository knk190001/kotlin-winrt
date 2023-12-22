package Windows.UI.Xaml

import Windows.Foundation.Point
import Windows.Foundation.Rect
import Windows.Foundation.Size
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRectHelperStatics.ABI::class)
@Signature("{5ee163e4-c17e-494f-b580-2f0574fc3a15}")
@Guid("5ee163e4c17e494fb5802f0574fc3a15")
@WinRTInterface("5ee163e4c17e494fb5802f0574fc3a15")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRectHelperStatics.ByReference::class)
public interface IRectHelperStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Empty(): Rect?

  @InterfaceMethod(1)
  public fun FromCoordinatesAndDimensions(
    x: Float,
    y: Float,
    width: Float,
    height: Float
  ): Rect?

  @InterfaceMethod(2)
  public fun FromPoints(point1: Point?, point2: Point?): Rect?

  @InterfaceMethod(3)
  public fun FromLocationAndSize(location: Point?, size: Size?): Rect?

  @InterfaceMethod(4)
  public fun GetIsEmpty(target: Rect?): Boolean

  @InterfaceMethod(5)
  public fun GetBottom(target: Rect?): Float

  @InterfaceMethod(6)
  public fun GetLeft(target: Rect?): Float

  @InterfaceMethod(7)
  public fun GetRight(target: Rect?): Float

  @InterfaceMethod(8)
  public fun GetTop(target: Rect?): Float

  @InterfaceMethod(9)
  public fun Contains(target: Rect?, point: Point?): Boolean

  @InterfaceMethod(10)
  public fun Equals(target: Rect?, value: Rect?): Boolean

  @InterfaceMethod(11)
  public fun Intersect(target: Rect?, rect: Rect?): Rect?

  @InterfaceMethod(12)
  public fun Union(target: Rect?, point: Point?): Rect?

  @InterfaceMethod(13)
  public fun Union(target: Rect?, rect: Rect?): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRectHelperStatics> {
    public override fun getValue() = ABI.makeIRectHelperStatics(pointer.getPointer(0))

    public fun setValue(value: IRectHelperStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRectHelperStatics {
    public val __925525855_Ptr: Pointer?

    public val _925525855_VtblPtr: Pointer?
      get() = __925525855_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Empty(): Rect? {
      val fnPtr = _925525855_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun FromCoordinatesAndDimensions(
      x: Float,
      y: Float,
      width: Float,
      height: Float
    ): Rect? {
      val fnPtr = _925525855_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, x, y, width, height, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun FromPoints(point1: Point?, point2: Point?): Rect? {
      val fnPtr = _925525855_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(point1),
          marshalToNative(point2), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun FromLocationAndSize(location: Point?, size: Size?): Rect? {
      val fnPtr = _925525855_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(location),
          marshalToNative(size), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun GetIsEmpty(target: Rect?): Boolean {
      val fnPtr = _925525855_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun GetBottom(target: Rect?): Float {
      val fnPtr = _925525855_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetLeft(target: Rect?): Float {
      val fnPtr = _925525855_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun GetRight(target: Rect?): Float {
      val fnPtr = _925525855_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun GetTop(target: Rect?): Float {
      val fnPtr = _925525855_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun Contains(target: Rect?, point: Point?): Boolean {
      val fnPtr = _925525855_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), marshalToNative(point),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun Equals(target: Rect?, value: Rect?): Boolean {
      val fnPtr = _925525855_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), marshalToNative(value),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun Intersect(target: Rect?, rect: Rect?): Rect? {
      val fnPtr = _925525855_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), marshalToNative(rect),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun Union(target: Rect?, point: Point?): Rect? {
      val fnPtr = _925525855_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), marshalToNative(point),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun Union(target: Rect?, rect: Rect?): Rect? {
      val fnPtr = _925525855_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__925525855_Ptr, marshalToNative(target), marshalToNative(rect),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class IRectHelperStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __925525855_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectHelperStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5ee163e4c17e494fb5802f0574fc3a15")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectHelperStatics(ptr: Pointer?): WithDefault = IRectHelperStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectHelperStatics {
      val address = segment.toRawLongValue()
      return makeIRectHelperStatics(Pointer(address))
    }

    public override fun toNative(obj: IRectHelperStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__925525855_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectHelperStatics): Array<IRectHelperStatics?> =
        (elements as
        Array<IRectHelperStatics?>).castToImpl<IRectHelperStatics,IRectHelperStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectHelperStatics?> =
        arrayOfNulls<IRectHelperStatics_Impl>(size) as Array<IRectHelperStatics?>
  }
}
