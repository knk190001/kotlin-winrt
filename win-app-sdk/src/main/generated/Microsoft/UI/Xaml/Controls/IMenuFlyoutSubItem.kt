package Microsoft.UI.Xaml.Controls

import Windows.Foundation.Collections.IVector
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

@ABIMarker(IMenuFlyoutSubItem.ABI::class)
@Signature("{6b0688c1-47b0-53b5-b6f9-5ec5d6623b84}")
@Guid("6b0688c147b053b5b6f95ec5d6623b84")
@WinRTInterface("6b0688c147b053b5b6f95ec5d6623b84")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutSubItem.ByReference::class)
public interface IMenuFlyoutSubItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IVector<MenuFlyoutItemBase?>?

  @InterfaceMethod(1)
  public fun get_Text(): String?

  @InterfaceMethod(2)
  public fun put_Text(value: String?): Unit

  @InterfaceMethod(3)
  public fun get_Icon(): IconElement?

  @InterfaceMethod(4)
  public fun put_Icon(value: IconElement?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutSubItem> {
    public override fun getValue() = ABI.makeIMenuFlyoutSubItem(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutSubItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutSubItem {
    public val __663699214_Ptr: Pointer?

    public val _663699214_VtblPtr: Pointer?
      get() = __663699214_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IVector<MenuFlyoutItemBase?>? {
      val fnPtr = _663699214_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVector<MenuFlyoutItemBase?>>()
      val hr = fn.invokeHR(arrayOf(__663699214_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVector<MenuFlyoutItemBase?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Text(): String? {
      val fnPtr = _663699214_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__663699214_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_Text(value: String?): Unit {
      val fnPtr = _663699214_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663699214_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Icon(): IconElement? {
      val fnPtr = _663699214_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IconElement>()
      val hr = fn.invokeHR(arrayOf(__663699214_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IconElement>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun put_Icon(value: IconElement?): Unit {
      val fnPtr = _663699214_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__663699214_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IMenuFlyoutSubItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __663699214_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutSubItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b0688c147b053b5b6f95ec5d6623b84")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutSubItem(ptr: Pointer?): WithDefault = IMenuFlyoutSubItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutSubItem {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutSubItem(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutSubItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__663699214_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutSubItem): Array<IMenuFlyoutSubItem?> =
        (elements as
        Array<IMenuFlyoutSubItem?>).castToImpl<IMenuFlyoutSubItem,IMenuFlyoutSubItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutSubItem?> =
        arrayOfNulls<IMenuFlyoutSubItem_Impl>(size) as Array<IMenuFlyoutSubItem?>
  }
}
