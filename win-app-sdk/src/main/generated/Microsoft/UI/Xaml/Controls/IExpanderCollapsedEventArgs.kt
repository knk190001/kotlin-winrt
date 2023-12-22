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

@ABIMarker(IExpanderCollapsedEventArgs.ABI::class)
@Signature("{968a6870-7426-535e-a526-279e6eedecd0}")
@Guid("968a68707426535ea526279e6eedecd0")
@WinRTInterface("968a68707426535ea526279e6eedecd0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpanderCollapsedEventArgs.ByReference::class)
public interface IExpanderCollapsedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpanderCollapsedEventArgs> {
    public override fun getValue() = ABI.makeIExpanderCollapsedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExpanderCollapsedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpanderCollapsedEventArgs {
    public val __1156754898_Ptr: Pointer?

    public val _1156754898_VtblPtr: Pointer?
      get() = __1156754898_Ptr?.getPointer(0)
  }

  public class IExpanderCollapsedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1156754898_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpanderCollapsedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("968a68707426535ea526279e6eedecd0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpanderCollapsedEventArgs(ptr: Pointer?): WithDefault =
        IExpanderCollapsedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpanderCollapsedEventArgs {
      val address = segment.toRawLongValue()
      return makeIExpanderCollapsedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExpanderCollapsedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1156754898_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpanderCollapsedEventArgs):
        Array<IExpanderCollapsedEventArgs?> = (elements as
        Array<IExpanderCollapsedEventArgs?>).castToImpl<IExpanderCollapsedEventArgs,IExpanderCollapsedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpanderCollapsedEventArgs?> =
        arrayOfNulls<IExpanderCollapsedEventArgs_Impl>(size) as Array<IExpanderCollapsedEventArgs?>
  }
}
