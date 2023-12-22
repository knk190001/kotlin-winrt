package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IToggleMenuFlyoutItem.ABI::class)
@Signature("{1803f260-67e4-5bc1-a63a-123510167bb8}")
@Guid("1803f26067e45bc1a63a123510167bb8")
@WinRTInterface("1803f26067e45bc1a63a123510167bb8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleMenuFlyoutItem.ByReference::class)
public interface IToggleMenuFlyoutItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsChecked(): Boolean

  @InterfaceMethod(1)
  public fun put_IsChecked(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleMenuFlyoutItem> {
    public override fun getValue() = ABI.makeIToggleMenuFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: IToggleMenuFlyoutItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleMenuFlyoutItem {
    public val __733695192_Ptr: Pointer?

    public val _733695192_VtblPtr: Pointer?
      get() = __733695192_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsChecked(): Boolean {
      val fnPtr = _733695192_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__733695192_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsChecked(value: Boolean): Unit {
      val fnPtr = _733695192_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__733695192_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IToggleMenuFlyoutItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __733695192_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleMenuFlyoutItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1803f26067e45bc1a63a123510167bb8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleMenuFlyoutItem(ptr: Pointer?): WithDefault =
        IToggleMenuFlyoutItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IToggleMenuFlyoutItem {
      val address = segment.toRawLongValue()
      return makeIToggleMenuFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: IToggleMenuFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__733695192_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleMenuFlyoutItem): Array<IToggleMenuFlyoutItem?> =
        (elements as
        Array<IToggleMenuFlyoutItem?>).castToImpl<IToggleMenuFlyoutItem,IToggleMenuFlyoutItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleMenuFlyoutItem?> =
        arrayOfNulls<IToggleMenuFlyoutItem_Impl>(size) as Array<IToggleMenuFlyoutItem?>
  }
}
