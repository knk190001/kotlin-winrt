package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarToggleButton.ABI::class)
@Signature("{b4a278fa-f5f0-4b1f-beb0-0b8a29905a4a}")
@Guid("b4a278faf5f04b1fbeb00b8a29905a4a")
@WinRTInterface("b4a278faf5f04b1fbeb00b8a29905a4a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarToggleButton.ByReference::class)
public interface IInkToolbarToggleButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ToggleKind(): InkToolbarToggle?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarToggleButton> {
    public override fun getValue() = ABI.makeIInkToolbarToggleButton(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarToggleButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarToggleButton {
    public val __1307244521_Ptr: Pointer?

    public val _1307244521_VtblPtr: Pointer?
      get() = __1307244521_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ToggleKind(): InkToolbarToggle? {
      val fnPtr = _1307244521_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarToggle>()
      val hr = fn.invokeHR(arrayOf(__1307244521_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarToggle>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarToggleButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1307244521_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarToggleButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b4a278faf5f04b1fbeb00b8a29905a4a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarToggleButton(ptr: Pointer?): WithDefault =
        IInkToolbarToggleButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarToggleButton {
      val address = segment.toRawLongValue()
      return makeIInkToolbarToggleButton(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarToggleButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1307244521_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarToggleButton): Array<IInkToolbarToggleButton?>
        = (elements as
        Array<IInkToolbarToggleButton?>).castToImpl<IInkToolbarToggleButton,IInkToolbarToggleButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarToggleButton?> =
        arrayOfNulls<IInkToolbarToggleButton_Impl>(size) as Array<IInkToolbarToggleButton?>
  }
}
