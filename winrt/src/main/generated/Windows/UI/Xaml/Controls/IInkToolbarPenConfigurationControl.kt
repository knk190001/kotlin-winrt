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

@ABIMarker(IInkToolbarPenConfigurationControl.ABI::class)
@Signature("{601ae5f6-28a5-44cc-89a6-380e91a572dd}")
@Guid("601ae5f628a544cc89a6380e91a572dd")
@WinRTInterface("601ae5f628a544cc89a6380e91a572dd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarPenConfigurationControl.ByReference::class)
public interface IInkToolbarPenConfigurationControl : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PenButton(): InkToolbarPenButton?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarPenConfigurationControl> {
    public override fun getValue() =
        ABI.makeIInkToolbarPenConfigurationControl(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarPenConfigurationControl_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarPenConfigurationControl {
    public val __987790639_Ptr: Pointer?

    public val _987790639_VtblPtr: Pointer?
      get() = __987790639_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PenButton(): InkToolbarPenButton? {
      val fnPtr = _987790639_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<InkToolbarPenButton>()
      val hr = fn.invokeHR(arrayOf(__987790639_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<InkToolbarPenButton>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarPenConfigurationControl_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __987790639_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarPenConfigurationControl, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("601ae5f628a544cc89a6380e91a572dd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarPenConfigurationControl(ptr: Pointer?): WithDefault =
        IInkToolbarPenConfigurationControl_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarPenConfigurationControl {
      val address = segment.toRawLongValue()
      return makeIInkToolbarPenConfigurationControl(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarPenConfigurationControl): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__987790639_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarPenConfigurationControl):
        Array<IInkToolbarPenConfigurationControl?> = (elements as
        Array<IInkToolbarPenConfigurationControl?>).castToImpl<IInkToolbarPenConfigurationControl,IInkToolbarPenConfigurationControl_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarPenConfigurationControl?> =
        arrayOfNulls<IInkToolbarPenConfigurationControl_Impl>(size) as
        Array<IInkToolbarPenConfigurationControl?>
  }
}
