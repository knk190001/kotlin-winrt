package Microsoft.UI.Xaml.Controls

import Microsoft.UI.Xaml.Controls.Primitives.FlyoutBase
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

@ABIMarker(IButton.ABI::class)
@Signature("{216c183d-d07a-5aa5-b8a4-0300a2683e87}")
@Guid("216c183dd07a5aa5b8a40300a2683e87")
@WinRTInterface("216c183dd07a5aa5b8a40300a2683e87")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButton.ByReference::class)
public interface IButton : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Flyout(): FlyoutBase?

  @InterfaceMethod(1)
  public fun put_Flyout(value: FlyoutBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IButton> {
    public override fun getValue() = ABI.makeIButton(pointer.getPointer(0))

    public fun setValue(value: IButton_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButton {
    public val __1884570553_Ptr: Pointer?

    public val _1884570553_VtblPtr: Pointer?
      get() = __1884570553_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Flyout(): FlyoutBase? {
      val fnPtr = _1884570553_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1884570553_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Flyout(value: FlyoutBase?): Unit {
      val fnPtr = _1884570553_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1884570553_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IButton_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1884570553_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButton, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("216c183dd07a5aa5b8a40300a2683e87")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButton(ptr: Pointer?): WithDefault = IButton_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButton {
      val address = segment.toRawLongValue()
      return makeIButton(Pointer(address))
    }

    public override fun toNative(obj: IButton): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1884570553_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButton): Array<IButton?> = (elements as
        Array<IButton?>).castToImpl<IButton,IButton_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButton?> = arrayOfNulls<IButton_Impl>(size) as
        Array<IButton?>
  }
}
