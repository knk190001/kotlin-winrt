package Windows.UI.Input.Inking

import Windows.Foundation.Numerics.Matrix3x2
import Windows.UI.Color
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

@ABIMarker(IInkPresenterStencil.ABI::class)
@Signature("{30d12d6d-3e06-4d02-b116-277fb5d8addc}")
@Guid("30d12d6d3e064d02b116277fb5d8addc")
@WinRTInterface("30d12d6d3e064d02b116277fb5d8addc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkPresenterStencil.ByReference::class)
public interface IInkPresenterStencil : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): InkPresenterStencilKind?

  @InterfaceMethod(1)
  public fun get_IsVisible(): Boolean

  @InterfaceMethod(2)
  public fun put_IsVisible(value: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_BackgroundColor(): Color?

  @InterfaceMethod(4)
  public fun put_BackgroundColor(value: Color?): Unit

  @InterfaceMethod(5)
  public fun get_ForegroundColor(): Color?

  @InterfaceMethod(6)
  public fun put_ForegroundColor(value: Color?): Unit

  @InterfaceMethod(7)
  public fun get_Transform(): Matrix3x2?

  @InterfaceMethod(8)
  public fun put_Transform(value: Matrix3x2?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkPresenterStencil> {
    public override fun getValue() = ABI.makeIInkPresenterStencil(pointer.getPointer(0))

    public fun setValue(value: IInkPresenterStencil_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkPresenterStencil {
    public val __516770336_Ptr: Pointer?

    public val _516770336_VtblPtr: Pointer?
      get() = __516770336_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): InkPresenterStencilKind? {
      val fnPtr = _516770336_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenterStencilKind>()
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenterStencilKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsVisible(): Boolean {
      val fnPtr = _516770336_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun put_IsVisible(value: Boolean): Unit {
      val fnPtr = _516770336_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_BackgroundColor(): Color? {
      val fnPtr = _516770336_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_BackgroundColor(value: Color?): Unit {
      val fnPtr = _516770336_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_ForegroundColor(): Color? {
      val fnPtr = _516770336_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Color>()
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Color>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun put_ForegroundColor(value: Color?): Unit {
      val fnPtr = _516770336_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_Transform(): Matrix3x2? {
      val fnPtr = _516770336_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Matrix3x2>()
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Matrix3x2>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun put_Transform(value: Matrix3x2?): Unit {
      val fnPtr = _516770336_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__516770336_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkPresenterStencil_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __516770336_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkPresenterStencil, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30d12d6d3e064d02b116277fb5d8addc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkPresenterStencil(ptr: Pointer?): WithDefault = IInkPresenterStencil_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkPresenterStencil {
      val address = segment.toRawLongValue()
      return makeIInkPresenterStencil(Pointer(address))
    }

    public override fun toNative(obj: IInkPresenterStencil): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__516770336_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkPresenterStencil): Array<IInkPresenterStencil?> =
        (elements as
        Array<IInkPresenterStencil?>).castToImpl<IInkPresenterStencil,IInkPresenterStencil_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkPresenterStencil?> =
        arrayOfNulls<IInkPresenterStencil_Impl>(size) as Array<IInkPresenterStencil?>
  }
}
