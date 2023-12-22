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

@ABIMarker(IFlyoutPresenter.ABI::class)
@Signature("{827d5b79-e37b-46a5-8d44-63a11a580e83}")
@Guid("827d5b79e37b46a58d4463a11a580e83")
@WinRTInterface("827d5b79e37b46a58d4463a11a580e83")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFlyoutPresenter.ByReference::class)
public interface IFlyoutPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFlyoutPresenter> {
    public override fun getValue() = ABI.makeIFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: IFlyoutPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFlyoutPresenter {
    public val __508564655_Ptr: Pointer?

    public val _508564655_VtblPtr: Pointer?
      get() = __508564655_Ptr?.getPointer(0)
  }

  public class IFlyoutPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __508564655_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFlyoutPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("827d5b79e37b46a58d4463a11a580e83")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFlyoutPresenter(ptr: Pointer?): WithDefault = IFlyoutPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFlyoutPresenter {
      val address = segment.toRawLongValue()
      return makeIFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: IFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__508564655_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFlyoutPresenter): Array<IFlyoutPresenter?> = (elements as
        Array<IFlyoutPresenter?>).castToImpl<IFlyoutPresenter,IFlyoutPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFlyoutPresenter?> =
        arrayOfNulls<IFlyoutPresenter_Impl>(size) as Array<IFlyoutPresenter?>
  }
}
