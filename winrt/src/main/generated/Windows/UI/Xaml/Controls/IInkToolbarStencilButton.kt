package Windows.UI.Xaml.Controls

import Windows.UI.Input.Inking.InkPresenterProtractor
import Windows.UI.Input.Inking.InkPresenterRuler
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

@ABIMarker(IInkToolbarStencilButton.ABI::class)
@Signature("{306a2616-5b40-4bf3-92b7-f1df936aeff5}")
@Guid("306a26165b404bf392b7f1df936aeff5")
@WinRTInterface("306a26165b404bf392b7f1df936aeff5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarStencilButton.ByReference::class)
public interface IInkToolbarStencilButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Ruler(): InkPresenterRuler?

  @InterfaceMethod(1)
  public fun get_Protractor(): InkPresenterProtractor?

  @InterfaceMethod(2)
  public fun get_SelectedStencil(): InkToolbarStencilKind?

  @InterfaceMethod(3)
  public fun put_SelectedStencil(value: InkToolbarStencilKind?): Unit

  @InterfaceMethod(4)
  public fun get_IsRulerItemVisible(): Boolean

  @InterfaceMethod(5)
  public fun put_IsRulerItemVisible(value: Boolean): Unit

  @InterfaceMethod(6)
  public fun get_IsProtractorItemVisible(): Boolean

  @InterfaceMethod(7)
  public fun put_IsProtractorItemVisible(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarStencilButton> {
    public override fun getValue() = ABI.makeIInkToolbarStencilButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarStencilButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarStencilButton {
    public val __212036029_Ptr: Pointer?

    public val _212036029_VtblPtr: Pointer?
      get() = __212036029_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Ruler(): InkPresenterRuler? {
      val fnPtr = _212036029_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenterRuler>()
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenterRuler>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Protractor(): InkPresenterProtractor? {
      val fnPtr = _212036029_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenterProtractor>()
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenterProtractor>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SelectedStencil(): InkToolbarStencilKind? {
      val fnPtr = _212036029_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarStencilKind>()
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarStencilKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SelectedStencil(value: InkToolbarStencilKind?): Unit {
      val fnPtr = _212036029_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_IsRulerItemVisible(): Boolean {
      val fnPtr = _212036029_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun put_IsRulerItemVisible(value: Boolean): Unit {
      val fnPtr = _212036029_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_IsProtractorItemVisible(): Boolean {
      val fnPtr = _212036029_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(7)
    public override fun put_IsProtractorItemVisible(value: Boolean): Unit {
      val fnPtr = _212036029_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__212036029_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInkToolbarStencilButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __212036029_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarStencilButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("306a26165b404bf392b7f1df936aeff5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarStencilButton(ptr: Pointer?): WithDefault =
        IInkToolbarStencilButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarStencilButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarStencilButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarStencilButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__212036029_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarStencilButton):
        Array<IInkToolbarStencilButton?> = (elements as
        Array<IInkToolbarStencilButton?>).castToImpl<IInkToolbarStencilButton,IInkToolbarStencilButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarStencilButton?> =
        arrayOfNulls<IInkToolbarStencilButton_Impl>(size) as Array<IInkToolbarStencilButton?>
  }
}
