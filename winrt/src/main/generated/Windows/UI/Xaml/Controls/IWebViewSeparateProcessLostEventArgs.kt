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

@ABIMarker(IWebViewSeparateProcessLostEventArgs.ABI::class)
@Signature("{a405700a-c482-40b5-aaea-e10cfa9f5abe}")
@Guid("a405700ac48240b5aaeae10cfa9f5abe")
@WinRTInterface("a405700ac48240b5aaeae10cfa9f5abe")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IWebViewSeparateProcessLostEventArgs.ByReference::class)
public interface IWebViewSeparateProcessLostEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IWebViewSeparateProcessLostEventArgs> {
    public override fun getValue() =
        ABI.makeIWebViewSeparateProcessLostEventArgs(pointer.getPointer(0))

    public fun setValue(value: IWebViewSeparateProcessLostEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IWebViewSeparateProcessLostEventArgs {
    public val __1152214148_Ptr: Pointer?

    public val _1152214148_VtblPtr: Pointer?
      get() = __1152214148_Ptr?.getPointer(0)
  }

  public class IWebViewSeparateProcessLostEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1152214148_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IWebViewSeparateProcessLostEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a405700ac48240b5aaeae10cfa9f5abe")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIWebViewSeparateProcessLostEventArgs(ptr: Pointer?): WithDefault =
        IWebViewSeparateProcessLostEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IWebViewSeparateProcessLostEventArgs {
      val address = segment.toRawLongValue()
      return makeIWebViewSeparateProcessLostEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IWebViewSeparateProcessLostEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1152214148_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IWebViewSeparateProcessLostEventArgs):
        Array<IWebViewSeparateProcessLostEventArgs?> = (elements as
        Array<IWebViewSeparateProcessLostEventArgs?>).castToImpl<IWebViewSeparateProcessLostEventArgs,IWebViewSeparateProcessLostEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IWebViewSeparateProcessLostEventArgs?> =
        arrayOfNulls<IWebViewSeparateProcessLostEventArgs_Impl>(size) as
        Array<IWebViewSeparateProcessLostEventArgs?>
  }
}
