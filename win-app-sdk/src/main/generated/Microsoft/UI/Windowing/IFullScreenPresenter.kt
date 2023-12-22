package Microsoft.UI.Windowing

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

@ABIMarker(IFullScreenPresenter.ABI::class)
@Signature("{fa9141fd-b8dd-5da1-8b2b-7cdadb76f593}")
@Guid("fa9141fdb8dd5da18b2b7cdadb76f593")
@WinRTInterface("fa9141fdb8dd5da18b2b7cdadb76f593")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IFullScreenPresenter.ByReference::class)
public interface IFullScreenPresenter : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IFullScreenPresenter> {
    public override fun getValue() = ABI.makeIFullScreenPresenter(pointer.getPointer(0))

    public fun setValue(value: IFullScreenPresenter_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IFullScreenPresenter {
    public val __244445724_Ptr: Pointer?

    public val _244445724_VtblPtr: Pointer?
      get() = __244445724_Ptr?.getPointer(0)
  }

  public class IFullScreenPresenter_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __244445724_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IFullScreenPresenter, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fa9141fdb8dd5da18b2b7cdadb76f593")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIFullScreenPresenter(ptr: Pointer?): WithDefault = IFullScreenPresenter_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IFullScreenPresenter {
      val address = segment.toRawLongValue()
      return makeIFullScreenPresenter(Pointer(address))
    }

    public override fun toNative(obj: IFullScreenPresenter): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__244445724_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IFullScreenPresenter): Array<IFullScreenPresenter?> =
        (elements as
        Array<IFullScreenPresenter?>).castToImpl<IFullScreenPresenter,IFullScreenPresenter_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IFullScreenPresenter?> =
        arrayOfNulls<IFullScreenPresenter_Impl>(size) as Array<IFullScreenPresenter?>
  }
}
