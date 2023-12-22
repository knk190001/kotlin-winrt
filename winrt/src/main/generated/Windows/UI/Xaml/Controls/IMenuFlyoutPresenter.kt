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

@ABIMarker(IMenuFlyoutPresenter.ABI::class)
@Signature("{906e0304-254e-413f-b219-c7b97f003752}")
@Guid("906e0304254e413fb219c7b97f003752")
@WinRTInterface("906e0304254e413fb219c7b97f003752")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMenuFlyoutPresenter.ByReference::class)
public interface IMenuFlyoutPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMenuFlyoutPresenter> {
    public override fun getValue() = ABI.makeIMenuFlyoutPresenter(pointer.getPointer(0))

    public fun setValue(value: IMenuFlyoutPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMenuFlyoutPresenter {
    public val __1139707406_Ptr: Pointer?

    public val _1139707406_VtblPtr: Pointer?
      get() = __1139707406_Ptr?.getPointer(0)
  }

  public class IMenuFlyoutPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1139707406_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMenuFlyoutPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("906e0304254e413fb219c7b97f003752")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMenuFlyoutPresenter(ptr: Pointer?): WithDefault = IMenuFlyoutPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMenuFlyoutPresenter {
      val address = segment.toRawLongValue()
      return makeIMenuFlyoutPresenter(Pointer(address))
    }

    public override fun toNative(obj: IMenuFlyoutPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1139707406_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMenuFlyoutPresenter): Array<IMenuFlyoutPresenter?> =
        (elements as
        Array<IMenuFlyoutPresenter?>).castToImpl<IMenuFlyoutPresenter,IMenuFlyoutPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMenuFlyoutPresenter?> =
        arrayOfNulls<IMenuFlyoutPresenter_Impl>(size) as Array<IMenuFlyoutPresenter?>
  }
}
