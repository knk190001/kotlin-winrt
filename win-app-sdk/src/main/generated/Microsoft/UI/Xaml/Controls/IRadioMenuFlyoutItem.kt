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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRadioMenuFlyoutItem.ABI::class)
@Signature("{9d6f45f5-5532-5669-8f02-05735953026a}")
@Guid("9d6f45f5553256698f0205735953026a")
@WinRTInterface("9d6f45f5553256698f0205735953026a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRadioMenuFlyoutItem.ByReference::class)
public interface IRadioMenuFlyoutItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsChecked(): Boolean

  @InterfaceMethod(1)
  public fun put_IsChecked(value: Boolean): Unit

  @InterfaceMethod(2)
  public fun get_GroupName(): String?

  @InterfaceMethod(3)
  public fun put_GroupName(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRadioMenuFlyoutItem> {
    public override fun getValue() = ABI.makeIRadioMenuFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: IRadioMenuFlyoutItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRadioMenuFlyoutItem {
    public val __1206709793_Ptr: Pointer?

    public val _1206709793_VtblPtr: Pointer?
      get() = __1206709793_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsChecked(): Boolean {
      val fnPtr = _1206709793_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1206709793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_IsChecked(value: Boolean): Unit {
      val fnPtr = _1206709793_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1206709793_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_GroupName(): String? {
      val fnPtr = _1206709793_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1206709793_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_GroupName(value: String?): Unit {
      val fnPtr = _1206709793_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1206709793_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IRadioMenuFlyoutItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1206709793_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRadioMenuFlyoutItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d6f45f5553256698f0205735953026a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRadioMenuFlyoutItem(ptr: Pointer?): WithDefault = IRadioMenuFlyoutItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRadioMenuFlyoutItem {
      val address = segment.toRawLongValue()
      return makeIRadioMenuFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: IRadioMenuFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1206709793_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRadioMenuFlyoutItem): Array<IRadioMenuFlyoutItem?> =
        (elements as
        Array<IRadioMenuFlyoutItem?>).castToImpl<IRadioMenuFlyoutItem,IRadioMenuFlyoutItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRadioMenuFlyoutItem?> =
        arrayOfNulls<IRadioMenuFlyoutItem_Impl>(size) as Array<IRadioMenuFlyoutItem?>
  }
}
