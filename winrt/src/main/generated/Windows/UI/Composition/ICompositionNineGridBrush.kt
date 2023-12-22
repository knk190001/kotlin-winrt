package Windows.UI.Composition

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

@ABIMarker(ICompositionNineGridBrush.ABI::class)
@Signature("{f25154e4-bc8c-4be7-b80f-8685b83c0186}")
@Guid("f25154e4bc8c4be7b80f8685b83c0186")
@WinRTInterface("f25154e4bc8c4be7b80f8685b83c0186")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionNineGridBrush.ByReference::class)
public interface ICompositionNineGridBrush : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_BottomInset(): Float

  @InterfaceMethod(1)
  public fun put_BottomInset(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_BottomInsetScale(): Float

  @InterfaceMethod(3)
  public fun put_BottomInsetScale(value: Float): Unit

  @InterfaceMethod(4)
  public fun get_IsCenterHollow(): Boolean

  @InterfaceMethod(5)
  public fun put_IsCenterHollow(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_LeftInset(): Float

  @InterfaceMethod(7)
  public fun put_LeftInset(value: Float): Unit

  @InterfaceMethod(8)
  public fun get_LeftInsetScale(): Float

  @InterfaceMethod(9)
  public fun put_LeftInsetScale(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_RightInset(): Float

  @InterfaceMethod(11)
  public fun put_RightInset(value: Float): Unit

  @InterfaceMethod(12)
  public fun get_RightInsetScale(): Float

  @InterfaceMethod(13)
  public fun put_RightInsetScale(value: Float): Unit

  @InterfaceMethod(14)
  public fun get_Source(): CompositionBrush?

  @InterfaceMethod(15)
  public fun put_Source(value: CompositionBrush?): Unit

  @InterfaceMethod(16)
  public fun get_TopInset(): Float

  @InterfaceMethod(17)
  public fun put_TopInset(value: Float): Unit

  @InterfaceMethod(18)
  public fun get_TopInsetScale(): Float

  @InterfaceMethod(19)
  public fun put_TopInsetScale(value: Float): Unit

  @InterfaceMethod(20)
  public fun SetInsets(inset: Float): Unit

  @InterfaceMethod(21)
  public fun SetInsets(
    left: Float,
    top: Float,
    right: Float,
    bottom: Float
  ): Unit

  @InterfaceMethod(22)
  public fun SetInsetScales(scale: Float): Unit

  @InterfaceMethod(23)
  public fun SetInsetScales(
    left: Float,
    top: Float,
    right: Float,
    bottom: Float
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionNineGridBrush> {
    public override fun getValue() = ABI.makeICompositionNineGridBrush(pointer.getPointer(0))

    public fun setValue(value: ICompositionNineGridBrush_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionNineGridBrush {
    public val __1316900646_Ptr: Pointer?

    public val _1316900646_VtblPtr: Pointer?
      get() = __1316900646_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_BottomInset(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_BottomInset(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BottomInsetScale(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_BottomInsetScale(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsCenterHollow(): Boolean {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsCenterHollow(value: Boolean): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_LeftInset(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_LeftInset(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_LeftInsetScale(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_LeftInsetScale(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_RightInset(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_RightInset(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_RightInsetScale(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_RightInsetScale(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_Source(): CompositionBrush? {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionBrush>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionBrush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_Source(value: CompositionBrush?): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_TopInset(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_TopInset(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_TopInsetScale(): Float {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(19)
    public override fun put_TopInsetScale(value: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun SetInsets(inset: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, inset,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(21)
    public override fun SetInsets(
      left: Float,
      top: Float,
      right: Float,
      bottom: Float
    ): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, left, top, right, bottom,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(22)
    public override fun SetInsetScales(scale: Float): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(28L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, scale,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(23)
    public override fun SetInsetScales(
      left: Float,
      top: Float,
      right: Float,
      bottom: Float
    ): Unit {
      val fnPtr = _1316900646_VtblPtr!!.getPointer(29L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316900646_Ptr, left, top, right, bottom,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionNineGridBrush_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1316900646_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionNineGridBrush, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f25154e4bc8c4be7b80f8685b83c0186")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionNineGridBrush(ptr: Pointer?): WithDefault =
        ICompositionNineGridBrush_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionNineGridBrush {
      val address = segment.toRawLongValue()
      return makeICompositionNineGridBrush(Pointer(address))
    }

    public override fun toNative(obj: ICompositionNineGridBrush): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1316900646_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionNineGridBrush):
        Array<ICompositionNineGridBrush?> = (elements as
        Array<ICompositionNineGridBrush?>).castToImpl<ICompositionNineGridBrush,ICompositionNineGridBrush_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionNineGridBrush?> =
        arrayOfNulls<ICompositionNineGridBrush_Impl>(size) as Array<ICompositionNineGridBrush?>
  }
}
