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

@ABIMarker(ICommandBarOverflowPresenter.ABI::class)
@Signature("{6e7a9427-58ef-4366-a017-18c193d56b14}")
@Guid("6e7a942758ef4366a01718c193d56b14")
@WinRTInterface("6e7a942758ef4366a01718c193d56b14")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICommandBarOverflowPresenter.ByReference::class)
public interface ICommandBarOverflowPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICommandBarOverflowPresenter> {
    public override fun getValue() = ABI.makeICommandBarOverflowPresenter(pointer.getPointer(0))

    public fun setValue(value: ICommandBarOverflowPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICommandBarOverflowPresenter {
    public val __558010178_Ptr: Pointer?

    public val _558010178_VtblPtr: Pointer?
      get() = __558010178_Ptr?.getPointer(0)
  }

  public class ICommandBarOverflowPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558010178_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICommandBarOverflowPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e7a942758ef4366a01718c193d56b14")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICommandBarOverflowPresenter(ptr: Pointer?): WithDefault =
        ICommandBarOverflowPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICommandBarOverflowPresenter {
      val address = segment.toRawLongValue()
      return makeICommandBarOverflowPresenter(Pointer(address))
    }

    public override fun toNative(obj: ICommandBarOverflowPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558010178_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICommandBarOverflowPresenter):
        Array<ICommandBarOverflowPresenter?> = (elements as
        Array<ICommandBarOverflowPresenter?>).castToImpl<ICommandBarOverflowPresenter,ICommandBarOverflowPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICommandBarOverflowPresenter?> =
        arrayOfNulls<ICommandBarOverflowPresenter_Impl>(size) as
        Array<ICommandBarOverflowPresenter?>
  }
}
