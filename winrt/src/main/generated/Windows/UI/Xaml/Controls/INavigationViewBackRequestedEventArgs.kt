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

@ABIMarker(INavigationViewBackRequestedEventArgs.ABI::class)
@Signature("{446700e1-9a9d-4500-a71d-25c15809b879}")
@Guid("446700e19a9d4500a71d25c15809b879")
@WinRTInterface("446700e19a9d4500a71d25c15809b879")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = INavigationViewBackRequestedEventArgs.ByReference::class)
public interface INavigationViewBackRequestedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<INavigationViewBackRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeINavigationViewBackRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: INavigationViewBackRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : INavigationViewBackRequestedEventArgs {
    public val __963644315_Ptr: Pointer?

    public val _963644315_VtblPtr: Pointer?
      get() = __963644315_Ptr?.getPointer(0)
  }

  public class INavigationViewBackRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __963644315_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<INavigationViewBackRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("446700e19a9d4500a71d25c15809b879")

    public override val layout: ValueLayout = ADDRESS

    public fun makeINavigationViewBackRequestedEventArgs(ptr: Pointer?): WithDefault =
        INavigationViewBackRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): INavigationViewBackRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeINavigationViewBackRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: INavigationViewBackRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__963644315_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: INavigationViewBackRequestedEventArgs):
        Array<INavigationViewBackRequestedEventArgs?> = (elements as
        Array<INavigationViewBackRequestedEventArgs?>).castToImpl<INavigationViewBackRequestedEventArgs,INavigationViewBackRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<INavigationViewBackRequestedEventArgs?> =
        arrayOfNulls<INavigationViewBackRequestedEventArgs_Impl>(size) as
        Array<INavigationViewBackRequestedEventArgs?>
  }
}
