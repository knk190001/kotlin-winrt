package Windows.UI.Xaml.Controls

import Windows.UI.Xaml.Controls.Primitives.FlyoutBase
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

@ABIMarker(IButtonWithFlyout.ABI::class)
@Signature("{09108f87-df6c-4180-9b3a-e60845825811}")
@Guid("09108f87df6c41809b3ae60845825811")
@WinRTInterface("09108f87df6c41809b3ae60845825811")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IButtonWithFlyout.ByReference::class)
public interface IButtonWithFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Flyout(): FlyoutBase?

  @InterfaceMethod(1)
  public fun put_Flyout(value: FlyoutBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IButtonWithFlyout> {
    public override fun getValue() = ABI.makeIButtonWithFlyout(pointer.getPointer(0))

    public fun setValue(value: IButtonWithFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IButtonWithFlyout {
    public val __1655166129_Ptr: Pointer?

    public val _1655166129_VtblPtr: Pointer?
      get() = __1655166129_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Flyout(): FlyoutBase? {
      val fnPtr = _1655166129_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<FlyoutBase>()
      val hr = fn.invokeHR(arrayOf(__1655166129_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<FlyoutBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Flyout(value: FlyoutBase?): Unit {
      val fnPtr = _1655166129_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1655166129_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IButtonWithFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1655166129_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IButtonWithFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("09108f87df6c41809b3ae60845825811")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIButtonWithFlyout(ptr: Pointer?): WithDefault = IButtonWithFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IButtonWithFlyout {
      val address = segment.toRawLongValue()
      return makeIButtonWithFlyout(Pointer(address))
    }

    public override fun toNative(obj: IButtonWithFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1655166129_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IButtonWithFlyout): Array<IButtonWithFlyout?> = (elements
        as Array<IButtonWithFlyout?>).castToImpl<IButtonWithFlyout,IButtonWithFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IButtonWithFlyout?> =
        arrayOfNulls<IButtonWithFlyout_Impl>(size) as Array<IButtonWithFlyout?>
  }
}
