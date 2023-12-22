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

@ABIMarker(IListPickerFlyoutPresenter.ABI::class)
@Signature("{68155fb3-883e-417a-80d0-e2fd88410084}")
@Guid("68155fb3883e417a80d0e2fd88410084")
@WinRTInterface("68155fb3883e417a80d0e2fd88410084")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListPickerFlyoutPresenter.ByReference::class)
public interface IListPickerFlyoutPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListPickerFlyoutPresenter> {
    public override fun getValue() = ABI.makeIListPickerFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: IListPickerFlyoutPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListPickerFlyoutPresenter {
    public val __614419941_Ptr: Pointer?

    public val _614419941_VtblPtr: Pointer?
      get() = __614419941_Ptr?.getPointer(0)
  }

  public class IListPickerFlyoutPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __614419941_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListPickerFlyoutPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68155fb3883e417a80d0e2fd88410084")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListPickerFlyoutPresenter(ptr: Pointer?): WithDefault =
        IListPickerFlyoutPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListPickerFlyoutPresenter {
      val address = segment.toRawLongValue()
      return makeIListPickerFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: IListPickerFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__614419941_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListPickerFlyoutPresenter):
        Array<IListPickerFlyoutPresenter?> = (elements as
        Array<IListPickerFlyoutPresenter?>).castToImpl<IListPickerFlyoutPresenter,IListPickerFlyoutPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListPickerFlyoutPresenter?> =
        arrayOfNulls<IListPickerFlyoutPresenter_Impl>(size) as Array<IListPickerFlyoutPresenter?>
  }
}
