package Windows.UI.Xaml.Input

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
@Signature("{8a610dc6-d72d-4ca8-9f66-556f35b513da}")
@Guid("8a610dc6d72d4ca89f66556f35b513da")
@WinRTInterface("8a610dc6d72d4ca89f66556f35b513da")
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
    public val __93365131_Ptr: Pointer?

    public val _93365131_VtblPtr: Pointer?
      get() = __93365131_Ptr?.getPointer(0)
  }

  public class IAccessKeyDisplayDismissedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __93365131_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessKeyDisplayDismissedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a610dc6d72d4ca89f66556f35b513da")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessKeyDisplayDismissedEventArgs(ptr: Pointer?): WithDefault =
        IAccessKeyDisplayDismissedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessKeyDisplayDismissedEventArgs {
      val address = segment.toRawLongValue()
      return makeIAccessKeyDisplayDismissedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IAccessKeyDisplayDismissedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__93365131_Ptr))
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
