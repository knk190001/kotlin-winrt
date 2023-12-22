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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(INavigationViewItem.ABI::class)
@Signature("{8614be0f-b7b6-4851-960a-f5e3f69f624a}")
@Guid("8614be0fb7b64851960af5e3f69f624a")
@WinRTInterface("8614be0fb7b64851960af5e3f69f624a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewItem.ByReference::class)
public interface INavigationViewItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Icon(): IconElement?

  @InterfaceMethod(1)
  public fun put_Icon(value: IconElement?): Unit

  @InterfaceMethod(2)
  public fun get_CompactPaneLength(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewItem> {
    public override fun getValue() = ABI.makeINavigationViewItem(pointer.getPointer(0))

    public fun setValue(value: INavigationViewItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewItem {
    public val __1651280216_Ptr: Pointer?

    public val _1651280216_VtblPtr: Pointer?
      get() = __1651280216_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Icon(): IconElement? {
      val fnPtr = _1651280216_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__1651280216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Icon(value: IconElement?): Unit {
      val fnPtr = _1651280216_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1651280216_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_CompactPaneLength(): Double {
      val fnPtr = _1651280216_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1651280216_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class INavigationViewItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1651280216_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8614be0fb7b64851960af5e3f69f624a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewItem(ptr: Pointer?): WithDefault = INavigationViewItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewItem {
      val address = segment.toRawLongValue()
      return makeINavigationViewItem(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1651280216_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewItem): Array<INavigationViewItem?> =
        (elements as
        Array<INavigationViewItem?>).castToImpl<INavigationViewItem,INavigationViewItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewItem?> =
        arrayOfNulls<INavigationViewItem_Impl>(size) as Array<INavigationViewItem?>
  }
}
