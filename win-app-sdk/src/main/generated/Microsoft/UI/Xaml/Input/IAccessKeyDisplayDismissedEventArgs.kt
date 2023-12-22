package Microsoft.UI.Xaml.Input

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

@ABIMarker(IAccessKeyDisplayDismissedEventArgs.ABI::class)
@Signature("{125a83d8-7f86-5ea9-9063-b9407e644587}")
@Guid("125a83d87f865ea99063b9407e644587")
@WinRTInterface("125a83d87f865ea99063b9407e644587")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessKeyDisplayDismissedEventArgs.ByReference::class)
public interface IAccessKeyDisplayDismissedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessKeyDisplayDismissedEventArgs> {
    public override fun getValue() =
        ABI.makeIAccessKeyDisplayDismissedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IAccessKeyDisplayDismissedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessKeyDisplayDismissedEventArgs {
    public val __722713728_Ptr: Pointer?

    public val _722713728_VtblPtr: Pointer?
      get() = __722713728_Ptr?.getPointer(0)
  }

  public class IAccessKeyDisplayDismissedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __722713728_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessKeyDisplayDismissedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("125a83d87f865ea99063b9407e644587")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessKeyDisplayDismissedEventArgs(ptr: Pointer?): WithDefault =
        IAccessKeyDisplayDismissedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessKeyDisplayDismissedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAccessKeyDisplayDismissedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAccessKeyDisplayDismissedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__722713728_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessKeyDisplayDismissedEventArgs):
        Array<IAccessKeyDisplayDismissedEventArgs?> = (elements as
        Array<IAccessKeyDisplayDismissedEventArgs?>).castToImpl<IAccessKeyDisplayDismissedEventArgs,IAccessKeyDisplayDismissedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessKeyDisplayDismissedEventArgs?> =
        arrayOfNulls<IAccessKeyDisplayDismissedEventArgs_Impl>(size) as
        Array<IAccessKeyDisplayDismissedEventArgs?>
  }
}
