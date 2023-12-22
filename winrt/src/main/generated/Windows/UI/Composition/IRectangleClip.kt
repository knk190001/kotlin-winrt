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

@ABIMarker(IRectangleClip.ABI::class)
@Signature("{b3e7549e-00b4-5b53-8be8-353f6c433101}")
@Guid("b3e7549e00b45b538be8353f6c433101")
@WinRTInterface("b3e7549e00b45b538be8353f6c433101")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRectangleClip.ByReference::class)
public interface IRectangleClip : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Bottom(): Float

  @InterfaceMethod(1)
  public fun put_Bottom(value: Float): Unit

  @InterfaceMethod(2)
  public fun get_BottomLeftRadius(): Vector2?

  @InterfaceMethod(3)
  public fun put_BottomLeftRadius(value: Vector2?): Unit

  @InterfaceMethod(4)
  public fun get_BottomRightRadius(): Vector2?

  @InterfaceMethod(5)
  public fun put_BottomRightRadius(value: Vector2?): Unit

  @InterfaceMethod(6)
  public fun get_Left(): Float

  @InterfaceMethod(7)
  public fun put_Left(value: Float): Unit

  @InterfaceMethod(8)
  public fun get_Right(): Float

  @InterfaceMethod(9)
  public fun put_Right(value: Float): Unit

  @InterfaceMethod(10)
  public fun get_Top(): Float

  @InterfaceMethod(11)
  public fun put_Top(value: Float): Unit

  @InterfaceMethod(12)
  public fun get_TopLeftRadius(): Vector2?

  @InterfaceMethod(13)
  public fun put_TopLeftRadius(value: Vector2?): Unit

  @InterfaceMethod(14)
  public fun get_TopRightRadius(): Vector2?

  @InterfaceMethod(15)
  public fun put_TopRightRadius(value: Vector2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IRectangleClip>
      {
    public override fun getValue() = ABI.makeIRectangleClip(pointer.getPointer(0))

    public fun setValue(value: IRectangleClip_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRectangleClip {
    public val __228263823_Ptr: Pointer?

    public val _228263823_VtblPtr: Pointer?
      get() = __228263823_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Bottom(): Float {
      val fnPtr = _228263823_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Bottom(value: Float): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_BottomLeftRadius(): Vector2? {
      val fnPtr = _228263823_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_BottomLeftRadius(value: Vector2?): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_BottomRightRadius(): Vector2? {
      val fnPtr = _228263823_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_BottomRightRadius(value: Vector2?): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_Left(): Float {
      val fnPtr = _228263823_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_Left(value: Float): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_Right(): Float {
      val fnPtr = _228263823_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(9)
    public override fun put_Right(value: Float): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_Top(): Float {
      val fnPtr = _228263823_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Float>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Float>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(11)
    public override fun put_Top(value: Float): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_TopLeftRadius(): Vector2? {
      val fnPtr = _228263823_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun put_TopLeftRadius(value: Vector2?): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_TopRightRadius(): Vector2? {
      val fnPtr = _228263823_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Vector2>()
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Vector2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun put_TopRightRadius(value: Vector2?): Unit {
      val fnPtr = _228263823_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__228263823_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRectangleClip_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __228263823_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRectangleClip, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3e7549e00b45b538be8353f6c433101")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRectangleClip(ptr: Pointer?): WithDefault = IRectangleClip_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRectangleClip {
      val address = segment.toRawLongValue()
      return makeIRectangleClip(Pointer(address))
    }

    public override fun toNative(obj: IRectangleClip): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__228263823_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRectangleClip): Array<IRectangleClip?> = (elements as
        Array<IRectangleClip?>).castToImpl<IRectangleClip,IRectangleClip_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRectangleClip?> =
        arrayOfNulls<IRectangleClip_Impl>(size) as Array<IRectangleClip?>
  }
}
