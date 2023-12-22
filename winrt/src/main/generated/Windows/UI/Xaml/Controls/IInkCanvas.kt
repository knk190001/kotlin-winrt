package Windows.UI.Xaml.Controls

import Windows.UI.Input.Inking.InkPresenter
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

@ABIMarker(IInkCanvas.ABI::class)
@Signature("{29443c28-8e48-4fc8-a473-35b0ba12acea}")
@Guid("29443c288e484fc8a47335b0ba12acea")
@WinRTInterface("29443c288e484fc8a47335b0ba12acea")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkCanvas.ByReference::class)
public interface IInkCanvas : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InkPresenter(): InkPresenter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IInkCanvas> {
    public override fun getValue() = ABI.makeIInkCanvas(pointer.getPointer(0))

    public fun setValue(value: IInkCanvas_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkCanvas {
    public val __2145286210_Ptr: Pointer?

    public val _2145286210_VtblPtr: Pointer?
      get() = __2145286210_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InkPresenter(): InkPresenter? {
      val fnPtr = _2145286210_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenter>()
      val hr = fn.invokeHR(arrayOf(__2145286210_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenter>(result.getValue())
      return resultValue
    }
  }

  public class IInkCanvas_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2145286210_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkCanvas, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29443c288e484fc8a47335b0ba12acea")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkCanvas(ptr: Pointer?): WithDefault = IInkCanvas_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkCanvas {
      val address = segment.toRawLongValue()
      return makeIInkCanvas(Pointer(address))
    }

    public override fun toNative(obj: IInkCanvas): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2145286210_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkCanvas): Array<IInkCanvas?> = (elements as
        Array<IInkCanvas?>).castToImpl<IInkCanvas,IInkCanvas_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkCanvas?> = arrayOfNulls<IInkCanvas_Impl>(size)
        as Array<IInkCanvas?>
  }
}
