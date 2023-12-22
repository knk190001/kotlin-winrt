package Windows.UI.Input.Inking.Core

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Numerics.Matrix3x2
import Windows.Foundation.Rect
import Windows.UI.Input.Inking.InkDrawingAttributes
import Windows.UI.Input.Inking.InkPoint
import Windows.UI.Input.Inking.InkStroke
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreIncrementalInkStroke.ABI::class)
@Signature("{fda015d3-9d66-4f7d-a57f-cc70b9cfaa76}")
@Guid("fda015d39d664f7da57fcc70b9cfaa76")
@WinRTInterface("fda015d39d664f7da57fcc70b9cfaa76")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreIncrementalInkStroke.ByReference::class)
public interface ICoreIncrementalInkStroke : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AppendInkPoints(inkPoints: IIterable<InkPoint?>?): Rect?

  @InterfaceMethod(1)
  public fun CreateInkStroke(): InkStroke?

  @InterfaceMethod(2)
  public fun get_DrawingAttributes(): InkDrawingAttributes?

  @InterfaceMethod(3)
  public fun get_PointTransform(): Matrix3x2?

  @InterfaceMethod(4)
  public fun get_BoundingRect(): Rect?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreIncrementalInkStroke> {
    public override fun getValue() = ABI.makeICoreIncrementalInkStroke(pointer.getPointer(0))

    public fun setValue(value: ICoreIncrementalInkStroke_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreIncrementalInkStroke {
    public val __1044058418_Ptr: Pointer?

    public val _1044058418_VtblPtr: Pointer?
      get() = __1044058418_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AppendInkPoints(inkPoints: IIterable<InkPoint?>?): Rect? {
      val fnPtr = _1044058418_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1044058418_Ptr, marshalToNative(inkPoints), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateInkStroke(): InkStroke? {
      val fnPtr = _1044058418_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStroke>()
      val hr = fn.invokeHR(arrayOf(__1044058418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStroke>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_DrawingAttributes(): InkDrawingAttributes? {
      val fnPtr = _1044058418_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributes>()
      val hr = fn.invokeHR(arrayOf(__1044058418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PointTransform(): Matrix3x2? {
      val fnPtr = _1044058418_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3x2>()
      val hr = fn.invokeHR(arrayOf(__1044058418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3x2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_BoundingRect(): Rect? {
      val fnPtr = _1044058418_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__1044058418_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }
  }

  public class ICoreIncrementalInkStroke_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1044058418_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreIncrementalInkStroke, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fda015d39d664f7da57fcc70b9cfaa76")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreIncrementalInkStroke(ptr: Pointer?): WithDefault =
        ICoreIncrementalInkStroke_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreIncrementalInkStroke {
      val address = segment.toRawLongValue()
      return makeICoreIncrementalInkStroke(Pointer(address))
    }

    public override fun toNative(obj: ICoreIncrementalInkStroke): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1044058418_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreIncrementalInkStroke):
        Array<ICoreIncrementalInkStroke?> = (elements as
        Array<ICoreIncrementalInkStroke?>).castToImpl<ICoreIncrementalInkStroke,ICoreIncrementalInkStroke_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreIncrementalInkStroke?> =
        arrayOfNulls<ICoreIncrementalInkStroke_Impl>(size) as Array<ICoreIncrementalInkStroke?>
  }
}
