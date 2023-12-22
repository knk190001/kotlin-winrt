package Windows.UI.Xaml

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

@ABIMarker(IXamlRootChangedEventArgs.ABI::class)
@Signature("{92d71c21-d23c-5a17-bcb8-001504b6bb19}")
@Guid("92d71c21d23c5a17bcb8001504b6bb19")
@WinRTInterface("92d71c21d23c5a17bcb8001504b6bb19")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlRootChangedEventArgs.ByReference::class)
public interface IXamlRootChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlRootChangedEventArgs> {
    public override fun getValue() = ABI.makeIXamlRootChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IXamlRootChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlRootChangedEventArgs {
    public val __1224006143_Ptr: Pointer?

    public val _1224006143_VtblPtr: Pointer?
      get() = __1224006143_Ptr?.getPointer(0)
  }

  public class IXamlRootChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1224006143_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlRootChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("92d71c21d23c5a17bcb8001504b6bb19")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlRootChangedEventArgs(ptr: Pointer?): WithDefault =
        IXamlRootChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlRootChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIXamlRootChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IXamlRootChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1224006143_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlRootChangedEventArgs):
        Array<IXamlRootChangedEventArgs?> = (elements as
        Array<IXamlRootChangedEventArgs?>).castToImpl<IXamlRootChangedEventArgs,IXamlRootChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlRootChangedEventArgs?> =
        arrayOfNulls<IXamlRootChangedEventArgs_Impl>(size) as Array<IXamlRootChangedEventArgs?>
  }
}
