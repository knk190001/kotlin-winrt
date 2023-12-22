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

@ABIMarker(IInkToolbarToggleButtonFactory.ABI::class)
@Signature("{b2f90710-e5a1-4365-9d1a-e5b7ad8b9668}")
@Guid("b2f90710e5a143659d1ae5b7ad8b9668")
@WinRTInterface("b2f90710e5a143659d1ae5b7ad8b9668")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarToggleButtonFactory.ByReference::class)
public interface IInkToolbarToggleButtonFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarToggleButtonFactory> {
    public override fun getValue() = ABI.makeIInkToolbarToggleButtonFactory(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarToggleButtonFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarToggleButtonFactory {
    public val __1024510195_Ptr: Pointer?

    public val _1024510195_VtblPtr: Pointer?
      get() = __1024510195_Ptr?.getPointer(0)
  }

  public class IInkToolbarToggleButtonFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1024510195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarToggleButtonFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b2f90710e5a143659d1ae5b7ad8b9668")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarToggleButtonFactory(ptr: Pointer?): WithDefault =
        IInkToolbarToggleButtonFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarToggleButtonFactory {
      val address = segment.toRawLongValue()
      return makeIInkToolbarToggleButtonFactory(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarToggleButtonFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1024510195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarToggleButtonFactory):
        Array<IInkToolbarToggleButtonFactory?> = (elements as
        Array<IInkToolbarToggleButtonFactory?>).castToImpl<IInkToolbarToggleButtonFactory,IInkToolbarToggleButtonFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarToggleButtonFactory?> =
        arrayOfNulls<IInkToolbarToggleButtonFactory_Impl>(size) as
        Array<IInkToolbarToggleButtonFactory?>
  }
}
