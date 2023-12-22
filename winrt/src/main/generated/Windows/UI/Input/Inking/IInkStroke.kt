package Windows.UI.Input.Inking

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.Rect
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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkStroke.ABI::class)
@Signature("{15144d60-cce3-4fcf-9d52-11518ab6afd4}")
@Guid("15144d60cce34fcf9d5211518ab6afd4")
@WinRTInterface("15144d60cce34fcf9d5211518ab6afd4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkStroke.ByReference::class)
public interface IInkStroke : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DrawingAttributes(): InkDrawingAttributes?

  @InterfaceMethod(1)
  public fun put_DrawingAttributes(value: InkDrawingAttributes?): Unit

  @InterfaceMethod(2)
  public fun get_BoundingRect(): Rect?

  @InterfaceMethod(3)
  public fun get_Selected(): Boolean

  @InterfaceMethod(4)
  public fun put_Selected(value: Boolean): Unit

  @InterfaceMethod(5)
  public fun get_Recognized(): Boolean

  @InterfaceMethod(6)
  public fun GetRenderingSegments(): IVectorView<InkStrokeRenderingSegment?>?

  @InterfaceMethod(7)
  public fun Clone(): InkStroke?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkStroke> {
    public override fun getValue() = ABI.makeIInkStroke(pointer.getPointer(0))

    public fun setValue(value: IInkStroke_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkStroke {
    public val __884781412_Ptr: Pointer?

    public val _884781412_VtblPtr: Pointer?
      get() = __884781412_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DrawingAttributes(): InkDrawingAttributes? {
      val fnPtr = _884781412_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkDrawingAttributes>()
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkDrawingAttributes>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_DrawingAttributes(value: InkDrawingAttributes?): Unit {
      val fnPtr = _884781412_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BoundingRect(): Rect? {
      val fnPtr = _884781412_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Rect>()
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Rect>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_Selected(): Boolean {
      val fnPtr = _884781412_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun put_Selected(value: Boolean): Unit {
      val fnPtr = _884781412_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Recognized(): Boolean {
      val fnPtr = _884781412_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun GetRenderingSegments(): IVectorView<InkStrokeRenderingSegment?>? {
      val fnPtr = _884781412_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<InkStrokeRenderingSegment?>>()
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<InkStrokeRenderingSegment?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun Clone(): InkStroke? {
      val fnPtr = _884781412_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkStroke>()
      val hr = fn.invokeHR(arrayOf(__884781412_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkStroke>(result.getValue())
      return resultValue
    }
  }

  public class IInkStroke_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __884781412_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkStroke, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("15144d60cce34fcf9d5211518ab6afd4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkStroke(ptr: Pointer?): WithDefault = IInkStroke_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkStroke {
      val address = segment.toRawLongValue()
      return makeIInkStroke(Pointer(address))
    }

    public override fun toNative(obj: IInkStroke): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__884781412_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkStroke): Array<IInkStroke?> = (elements as
        Array<IInkStroke?>).castToImpl<IInkStroke,IInkStroke_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkStroke?> = arrayOfNulls<IInkStroke_Impl>(size)
        as Array<IInkStroke?>
  }
}
