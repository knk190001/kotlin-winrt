package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.Media.Brush
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

@ABIMarker(IInkToolbarPenButton.ABI::class)
@Signature("{e0b80c21-b032-40ee-a2b9-507f6ccb827b}")
@Guid("e0b80c21b03240eea2b9507f6ccb827b")
@WinRTInterface("e0b80c21b03240eea2b9507f6ccb827b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarPenButton.ByReference::class)
public interface IInkToolbarPenButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Palette(): IVector<Brush?>?

  @InterfaceMethod(1)
  public fun put_Palette(value: IVector<Brush?>?): Unit

  @InterfaceMethod(2)
  public fun get_MinStrokeWidth(): Double

  @InterfaceMethod(3)
  public fun put_MinStrokeWidth(value: Double): Unit

  @InterfaceMethod(4)
  public fun get_MaxStrokeWidth(): Double

  @InterfaceMethod(5)
  public fun put_MaxStrokeWidth(value: Double): Unit

  @InterfaceMethod(6)
  public fun get_SelectedBrush(): Brush?

  @InterfaceMethod(7)
  public fun get_SelectedBrushIndex(): Int

  @InterfaceMethod(8)
  public fun put_SelectedBrushIndex(value: Int): Unit

  @InterfaceMethod(9)
  public fun get_SelectedStrokeWidth(): Double

  @InterfaceMethod(10)
  public fun put_SelectedStrokeWidth(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarPenButton> {
    public override fun getValue() = ABI.makeIInkToolbarPenButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarPenButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarPenButton {
    public val __1437793574_Ptr: Pointer?

    public val _1437793574_VtblPtr: Pointer?
      get() = __1437793574_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Palette(): IVector<Brush?>? {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<Brush?>>()
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<Brush?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Palette(value: IVector<Brush?>?): Unit {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_MinStrokeWidth(): Double {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_MinStrokeWidth(value: Double): Unit {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_MaxStrokeWidth(): Double {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_MaxStrokeWidth(value: Double): Unit {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_SelectedBrush(): Brush? {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Brush>()
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Brush>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SelectedBrushIndex(): Int {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(8)
    public override fun put_SelectedBrushIndex(value: Int): Unit {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun get_SelectedStrokeWidth(): Double {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(10)
    public override fun put_SelectedStrokeWidth(value: Double): Unit {
      val fnPtr = _1437793574_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1437793574_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbarPenButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1437793574_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarPenButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e0b80c21b03240eea2b9507f6ccb827b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarPenButton(ptr: Pointer?): WithDefault = IInkToolbarPenButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarPenButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarPenButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarPenButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1437793574_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarPenButton): Array<IInkToolbarPenButton?> =
        (elements as
        Array<IInkToolbarPenButton?>).castToImpl<IInkToolbarPenButton,IInkToolbarPenButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarPenButton?> =
        arrayOfNulls<IInkToolbarPenButton_Impl>(size) as Array<IInkToolbarPenButton?>
  }
}
