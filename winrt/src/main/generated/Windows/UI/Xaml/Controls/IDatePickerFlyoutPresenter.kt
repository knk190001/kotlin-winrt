package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDatePickerFlyoutPresenter.ABI::class)
@Signature("{7c62f70e-2ddc-4381-832f-54cbdfaa849a}")
@Guid("7c62f70e2ddc4381832f54cbdfaa849a")
@WinRTInterface("7c62f70e2ddc4381832f54cbdfaa849a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDatePickerFlyoutPresenter.ByReference::class)
public interface IDatePickerFlyoutPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDatePickerFlyoutPresenter> {
    public override fun getValue() = ABI.makeIDatePickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: IDatePickerFlyoutPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDatePickerFlyoutPresenter {
    public val __1955850027_Ptr: Pointer?

    public val _1955850027_VtblPtr: Pointer?
      get() = __1955850027_Ptr?.getPointer(0)
  }

  public class IDatePickerFlyoutPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1955850027_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDatePickerFlyoutPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7c62f70e2ddc4381832f54cbdfaa849a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDatePickerFlyoutPresenter(ptr: Pointer?): WithDefault =
        IDatePickerFlyoutPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDatePickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return makeIDatePickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: IDatePickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1955850027_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDatePickerFlyoutPresenter):
        Array<IDatePickerFlyoutPresenter?> = (elements as
        Array<IDatePickerFlyoutPresenter?>).castToImpl<IDatePickerFlyoutPresenter,IDatePickerFlyoutPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDatePickerFlyoutPresenter?> =
        arrayOfNulls<IDatePickerFlyoutPresenter_Impl>(size) as Array<IDatePickerFlyoutPresenter?>
  }
}
