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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDatePickerFlyoutItem.ABI::class)
@Signature("{9d9bc289-00d2-4aac-9c85-d74f06367887}")
@Guid("9d9bc28900d24aac9c85d74f06367887")
@WinRTInterface("9d9bc28900d24aac9c85d74f06367887")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutItem.ByReference::class)
public interface IDatePickerFlyoutItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PrimaryText(): String?

  @InterfaceMethod(1)
  public fun put_PrimaryText(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_SecondaryText(): String?

  @InterfaceMethod(3)
  public fun put_SecondaryText(value: String?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutItem> {
    public override fun getValue() = ABI.makeIDatePickerFlyoutItem(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutItem {
    public val __1455799494_Ptr: Pointer?

    public val _1455799494_VtblPtr: Pointer?
      get() = __1455799494_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PrimaryText(): String? {
      val fnPtr = _1455799494_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1455799494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_PrimaryText(value: String?): Unit {
      val fnPtr = _1455799494_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1455799494_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_SecondaryText(): String? {
      val fnPtr = _1455799494_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1455799494_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_SecondaryText(value: String?): Unit {
      val fnPtr = _1455799494_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1455799494_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDatePickerFlyoutItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1455799494_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9d9bc28900d24aac9c85d74f06367887")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutItem(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutItem {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutItem(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1455799494_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutItem): Array<IDatePickerFlyoutItem?> =
        (elements as
        Array<IDatePickerFlyoutItem?>).castToImpl<IDatePickerFlyoutItem,IDatePickerFlyoutItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutItem?> =
        arrayOfNulls<IDatePickerFlyoutItem_Impl>(size) as Array<IDatePickerFlyoutItem?>
  }
}
