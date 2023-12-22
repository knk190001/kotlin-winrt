package Windows.UI.Input.Inking

import Windows.Foundation.Numerics.Matrix3x2
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

@ABIMarker(IInkDrawingAttributes2.ABI::class)
@Signature("{7cab6508-8ec4-42fd-a5a5-e4b7d1d5316d}")
@Guid("7cab65088ec442fda5a5e4b7d1d5316d")
@WinRTInterface("7cab65088ec442fda5a5e4b7d1d5316d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkDrawingAttributes2.ByReference::class)
public interface IInkDrawingAttributes2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PenTipTransform(): Matrix3x2?

  @InterfaceMethod(1)
  public fun put_PenTipTransform(value: Matrix3x2?): Unit

  @InterfaceMethod(2)
  public fun get_DrawAsHighlighter(): Boolean

  @InterfaceMethod(3)
  public fun put_DrawAsHighlighter(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkDrawingAttributes2> {
    public override fun getValue() = ABI.makeIInkDrawingAttributes2(pointer.getPointer(0))

    public fun setValue(value: IInkDrawingAttributes2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkDrawingAttributes2 {
    public val __1946136553_Ptr: Pointer?

    public val _1946136553_VtblPtr: Pointer?
      get() = __1946136553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PenTipTransform(): Matrix3x2? {
      val fnPtr = _1946136553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3x2>()
      val hr = fn.invokeHR(arrayOf(__1946136553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3x2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PenTipTransform(value: Matrix3x2?): Unit {
      val fnPtr = _1946136553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946136553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DrawAsHighlighter(): Boolean {
      val fnPtr = _1946136553_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1946136553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_DrawAsHighlighter(value: Boolean): Unit {
      val fnPtr = _1946136553_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1946136553_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkDrawingAttributes2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1946136553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkDrawingAttributes2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7cab65088ec442fda5a5e4b7d1d5316d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkDrawingAttributes2(ptr: Pointer?): WithDefault =
        IInkDrawingAttributes2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkDrawingAttributes2 {
      val address = segment.toRawLongValue()
      return makeIInkDrawingAttributes2(Pointer(address))
    }

    public override fun toNative(obj: IInkDrawingAttributes2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1946136553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkDrawingAttributes2): Array<IInkDrawingAttributes2?> =
        (elements as
        Array<IInkDrawingAttributes2?>).castToImpl<IInkDrawingAttributes2,IInkDrawingAttributes2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkDrawingAttributes2?> =
        arrayOfNulls<IInkDrawingAttributes2_Impl>(size) as Array<IInkDrawingAttributes2?>
  }
}
