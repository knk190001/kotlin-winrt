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

@ABIMarker(IAppBarElementContainer.ABI::class)
@Signature("{1d5ba067-a990-5dab-a9c3-e6be56642a1a}")
@Guid("1d5ba067a9905daba9c3e6be56642a1a")
@WinRTInterface("1d5ba067a9905daba9c3e6be56642a1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppBarElementContainer.ByReference::class)
public interface IAppBarElementContainer : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppBarElementContainer> {
    public override fun getValue() = ABI.makeIAppBarElementContainer(pointer.getPointer(0))

    public fun setValue(value: IAppBarElementContainer_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppBarElementContainer {
    public val __1048743341_Ptr: Pointer?

    public val _1048743341_VtblPtr: Pointer?
      get() = __1048743341_Ptr?.getPointer(0)
  }

  public class IAppBarElementContainer_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1048743341_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppBarElementContainer, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1d5ba067a9905daba9c3e6be56642a1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppBarElementContainer(ptr: Pointer?): WithDefault =
        IAppBarElementContainer_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppBarElementContainer {
      val address = segment.toRawLongValue()
      return makeIAppBarElementContainer(Pointer(address))
    }

    public override fun toNative(obj: IAppBarElementContainer): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1048743341_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppBarElementContainer): Array<IAppBarElementContainer?>
        = (elements as
        Array<IAppBarElementContainer?>).castToImpl<IAppBarElementContainer,IAppBarElementContainer_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppBarElementContainer?> =
        arrayOfNulls<IAppBarElementContainer_Impl>(size) as Array<IAppBarElementContainer?>
  }
}
