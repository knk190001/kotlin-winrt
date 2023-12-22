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

@ABIMarker(IToggleSplitButtonIsCheckedChangedEventArgs.ABI::class)
@Signature("{2138f0cf-5fcd-5dbb-99ae-359483070f6b}")
@Guid("2138f0cf5fcd5dbb99ae359483070f6b")
@WinRTInterface("2138f0cf5fcd5dbb99ae359483070f6b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IToggleSplitButtonIsCheckedChangedEventArgs.ByReference::class)
public interface IToggleSplitButtonIsCheckedChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IToggleSplitButtonIsCheckedChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIToggleSplitButtonIsCheckedChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IToggleSplitButtonIsCheckedChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IToggleSplitButtonIsCheckedChangedEventArgs {
    public val __945832068_Ptr: Pointer?

    public val _945832068_VtblPtr: Pointer?
      get() = __945832068_Ptr?.getPointer(0)
  }

  public class IToggleSplitButtonIsCheckedChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __945832068_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IToggleSplitButtonIsCheckedChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2138f0cf5fcd5dbb99ae359483070f6b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIToggleSplitButtonIsCheckedChangedEventArgs(ptr: Pointer?): WithDefault =
        IToggleSplitButtonIsCheckedChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IToggleSplitButtonIsCheckedChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIToggleSplitButtonIsCheckedChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IToggleSplitButtonIsCheckedChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__945832068_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IToggleSplitButtonIsCheckedChangedEventArgs):
        Array<IToggleSplitButtonIsCheckedChangedEventArgs?> = (elements as
        Array<IToggleSplitButtonIsCheckedChangedEventArgs?>).castToImpl<IToggleSplitButtonIsCheckedChangedEventArgs,IToggleSplitButtonIsCheckedChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IToggleSplitButtonIsCheckedChangedEventArgs?> =
        arrayOfNulls<IToggleSplitButtonIsCheckedChangedEventArgs_Impl>(size) as
        Array<IToggleSplitButtonIsCheckedChangedEventArgs?>
  }
}
