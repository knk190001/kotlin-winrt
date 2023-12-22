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

@ABIMarker(IRevealListViewItemPresenter.ABI::class)
@Signature("{365fdbac-3989-559c-bea9-764561881c96}")
@Guid("365fdbac3989559cbea9764561881c96")
@WinRTInterface("365fdbac3989559cbea9764561881c96")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRevealListViewItemPresenter.ByReference::class)
public interface IRevealListViewItemPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRevealListViewItemPresenter> {
    public override fun getValue() = ABI.makeIRevealListViewItemPresenter(pointer.getPointer(0))

    public fun setValue(value: IRevealListViewItemPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRevealListViewItemPresenter {
    public val __1753283902_Ptr: Pointer?

    public val _1753283902_VtblPtr: Pointer?
      get() = __1753283902_Ptr?.getPointer(0)
  }

  public class IRevealListViewItemPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1753283902_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRevealListViewItemPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("365fdbac3989559cbea9764561881c96")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRevealListViewItemPresenter(ptr: Pointer?): WithDefault =
        IRevealListViewItemPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRevealListViewItemPresenter {
      val address = segment.toRawLongValue()
      return makeIRevealListViewItemPresenter(Pointer(address))
    }

    public override fun toNative(obj: IRevealListViewItemPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1753283902_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRevealListViewItemPresenter):
        Array<IRevealListViewItemPresenter?> = (elements as
        Array<IRevealListViewItemPresenter?>).castToImpl<IRevealListViewItemPresenter,IRevealListViewItemPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRevealListViewItemPresenter?> =
        arrayOfNulls<IRevealListViewItemPresenter_Impl>(size) as
        Array<IRevealListViewItemPresenter?>
  }
}
