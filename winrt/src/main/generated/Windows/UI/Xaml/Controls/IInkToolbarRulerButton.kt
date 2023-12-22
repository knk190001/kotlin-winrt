package Windows.UI.Xaml.Controls

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IInkToolbarRulerButton.ABI::class)
@Signature("{4a992832-1984-4148-9f25-382b35db087f}")
@Guid("4a992832198441489f25382b35db087f")
@WinRTInterface("4a992832198441489f25382b35db087f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarRulerButton.ByReference::class)
public interface IInkToolbarRulerButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Ruler(): InkPresenterRuler?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarRulerButton> {
    public override fun getValue() = ABI.makeIInkToolbarRulerButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarRulerButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarRulerButton {
    public val __792465097_Ptr: Pointer?

    public val _792465097_VtblPtr: Pointer?
      get() = __792465097_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Ruler(): InkPresenterRuler? {
      val fnPtr = _792465097_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkPresenterRuler>()
      val hr = fn.invokeHR(arrayOf(__792465097_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkPresenterRuler>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarRulerButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __792465097_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarRulerButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4a992832198441489f25382b35db087f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarRulerButton(ptr: Pointer?): WithDefault =
        IInkToolbarRulerButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarRulerButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarRulerButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarRulerButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__792465097_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarRulerButton): Array<IInkToolbarRulerButton?> =
        (elements as
        Array<IInkToolbarRulerButton?>).castToImpl<IInkToolbarRulerButton,IInkToolbarRulerButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarRulerButton?> =
        arrayOfNulls<IInkToolbarRulerButton_Impl>(size) as Array<IInkToolbarRulerButton?>
  }
}
