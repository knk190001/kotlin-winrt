package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IPickerFlyoutPresenter.ABI::class)
@Signature("{2181b3f9-9f94-5ebe-9b56-aa106b7e02cd}")
@Guid("2181b3f99f945ebe9b56aa106b7e02cd")
@WinRTInterface("2181b3f99f945ebe9b56aa106b7e02cd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPickerFlyoutPresenter.ByReference::class)
public interface IPickerFlyoutPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPickerFlyoutPresenter> {
    public override fun getValue() = ABI.makeIPickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: IPickerFlyoutPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPickerFlyoutPresenter {
    public val __460433688_Ptr: Pointer?

    public val _460433688_VtblPtr: Pointer?
      get() = __460433688_Ptr?.getPointer(0)
  }

  public class IPickerFlyoutPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __460433688_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPickerFlyoutPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2181b3f99f945ebe9b56aa106b7e02cd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPickerFlyoutPresenter(ptr: Pointer?): WithDefault =
        IPickerFlyoutPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return makeIPickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: IPickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__460433688_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPickerFlyoutPresenter): Array<IPickerFlyoutPresenter?> =
        (elements as
        Array<IPickerFlyoutPresenter?>).castToImpl<IPickerFlyoutPresenter,IPickerFlyoutPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPickerFlyoutPresenter?> =
        arrayOfNulls<IPickerFlyoutPresenter_Impl>(size) as Array<IPickerFlyoutPresenter?>
  }
}
