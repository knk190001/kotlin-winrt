package Windows.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
import Windows.UI.Xaml.Style
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

@ABIMarker(IMenuFlyout.ABI::class)
@Signature("{ad3210f1-985b-4171-bbba-67bcc729649b}")
@Guid("ad3210f1985b4171bbba67bcc729649b")
@WinRTInterface("ad3210f1985b4171bbba67bcc729649b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyout.ByReference::class)
public interface IMenuFlyout : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IVector<MenuFlyoutItemBase?>?

  @InterfaceMethod(1)
  public fun get_MenuFlyoutPresenterStyle(): Style?

  @InterfaceMethod(2)
  public fun put_MenuFlyoutPresenterStyle(value: Style?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMenuFlyout> {
    public override fun getValue() = ABI.makeIMenuFlyout(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyout_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyout {
    public val __1964773718_Ptr: Pointer?

    public val _1964773718_VtblPtr: Pointer?
      get() = __1964773718_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVector<MenuFlyoutItemBase?>? {
      val fnPtr = _1964773718_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MenuFlyoutItemBase?>>()
      val hr = fn.invokeHR(arrayOf(__1964773718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MenuFlyoutItemBase?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MenuFlyoutPresenterStyle(): Style? {
      val fnPtr = _1964773718_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Style>()
      val hr = fn.invokeHR(arrayOf(__1964773718_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Style>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_MenuFlyoutPresenterStyle(value: Style?): Unit {
      val fnPtr = _1964773718_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1964773718_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMenuFlyout_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1964773718_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyout, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ad3210f1985b4171bbba67bcc729649b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyout(ptr: Pointer?): WithDefault = IMenuFlyout_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyout {
      val address = segment.toRawLongValue()
      return makeIMenuFlyout(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyout): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1964773718_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyout): Array<IMenuFlyout?> = (elements as
        Array<IMenuFlyout?>).castToImpl<IMenuFlyout,IMenuFlyout_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyout?> =
        arrayOfNulls<IMenuFlyout_Impl>(size) as Array<IMenuFlyout?>
  }
}
