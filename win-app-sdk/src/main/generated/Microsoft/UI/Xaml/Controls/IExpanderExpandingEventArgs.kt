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

@ABIMarker(IExpanderExpandingEventArgs.ABI::class)
@Signature("{433f2e36-19e7-579c-b4ce-9ce5d510d001}")
@Guid("433f2e3619e7579cb4ce9ce5d510d001")
@WinRTInterface("433f2e3619e7579cb4ce9ce5d510d001")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpanderExpandingEventArgs.ByReference::class)
public interface IExpanderExpandingEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExpanderExpandingEventArgs> {
    public override fun getValue() = ABI.makeIExpanderExpandingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IExpanderExpandingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpanderExpandingEventArgs {
    public val __635903843_Ptr: Pointer?

    public val _635903843_VtblPtr: Pointer?
      get() = __635903843_Ptr?.getPointer(0)
  }

  public class IExpanderExpandingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __635903843_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpanderExpandingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("433f2e3619e7579cb4ce9ce5d510d001")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpanderExpandingEventArgs(ptr: Pointer?): WithDefault =
        IExpanderExpandingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpanderExpandingEventArgs {
      val address = segment.toRawLongValue()
      return makeIExpanderExpandingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IExpanderExpandingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__635903843_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpanderExpandingEventArgs):
        Array<IExpanderExpandingEventArgs?> = (elements as
        Array<IExpanderExpandingEventArgs?>).castToImpl<IExpanderExpandingEventArgs,IExpanderExpandingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpanderExpandingEventArgs?> =
        arrayOfNulls<IExpanderExpandingEventArgs_Impl>(size) as Array<IExpanderExpandingEventArgs?>
  }
}
