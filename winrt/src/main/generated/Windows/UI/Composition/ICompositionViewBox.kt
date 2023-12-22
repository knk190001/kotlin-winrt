package Windows.UI.Composition

import Windows.Foundation.Numerics.Vector2
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
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICompositionViewBox.ABI::class)
@Signature("{b440bf07-068f-4537-84c6-4ecbe019e1f4}")
@Guid("b440bf07068f453784c64ecbe019e1f4")
@WinRTInterface("b440bf07068f453784c64ecbe019e1f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICompositionViewBox.ByReference::class)
public interface ICompositionViewBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_HorizontalAlignmentRatio(): Float

  @InterfaceMethod(1)
  public fun put_HorizontalAlignmentRatio(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_Offset(): Vector2?

  @InterfaceMethod(3)
  public fun put_Offset(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_Size(): Vector2?

  @InterfaceMethod(5)
  public fun put_Size(value: Vector2?): Unit

  @InterfaceMethod(6)
  public fun get_Stretch(): CompositionStretch?

  @InterfaceMethod(7)
  public fun put_Stretch(value: CompositionStretch?): Unit

  @InterfaceMethod(8)
  public fun get_VerticalAlignmentRatio(): Float

  @InterfaceMethod(9)
  public fun put_VerticalAlignmentRatio(value: Float): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICompositionViewBox> {
    public override fun getValue() = ABI.makeICompositionViewBox(pointer.getPointer(0))

    public fun setValue(value: ICompositionViewBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICompositionViewBox {
    public val __876126198_Ptr: Pointer?

    public val _876126198_VtblPtr: Pointer?
      get() = __876126198_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_HorizontalAlignmentRatio(): Float {
      val fnPtr = _876126198_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_HorizontalAlignmentRatio(value: Float): Unit {
      val fnPtr = _876126198_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Offset(): Vector2? {
      val fnPtr = _876126198_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Offset(value: Vector2?): Unit {
      val fnPtr = _876126198_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_Size(): Vector2? {
      val fnPtr = _876126198_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_Size(value: Vector2?): Unit {
      val fnPtr = _876126198_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Stretch(): CompositionStretch? {
      val fnPtr = _876126198_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CompositionStretch>()
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CompositionStretch>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_Stretch(value: CompositionStretch?): Unit {
      val fnPtr = _876126198_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_VerticalAlignmentRatio(): Float {
      val fnPtr = _876126198_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_VerticalAlignmentRatio(value: Float): Unit {
      val fnPtr = _876126198_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__876126198_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICompositionViewBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __876126198_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICompositionViewBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b440bf07068f453784c64ecbe019e1f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICompositionViewBox(ptr: Pointer?): WithDefault = ICompositionViewBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICompositionViewBox {
      val address = segment.toRawLongValue()
      return makeICompositionViewBox(Pointer(address))
    }

    public override fun toNative(obj: ICompositionViewBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__876126198_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICompositionViewBox): Array<ICompositionViewBox?> =
        (elements as
        Array<ICompositionViewBox?>).castToImpl<ICompositionViewBox,ICompositionViewBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICompositionViewBox?> =
        arrayOfNulls<ICompositionViewBox_Impl>(size) as Array<ICompositionViewBox?>
  }
}
