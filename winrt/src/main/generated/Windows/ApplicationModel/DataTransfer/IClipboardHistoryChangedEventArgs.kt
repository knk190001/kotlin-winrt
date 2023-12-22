package Windows.ApplicationModel.DataTransfer

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

@ABIMarker(IClipboardHistoryChangedEventArgs.ABI::class)
@Signature("{c0be453f-8ea2-53ce-9aba-8d2212573452}")
@Guid("c0be453f8ea253ce9aba8d2212573452")
@WinRTInterface("c0be453f8ea253ce9aba8d2212573452")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IClipboardHistoryChangedEventArgs.ByReference::class)
public interface IClipboardHistoryChangedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IClipboardHistoryChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIClipboardHistoryChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IClipboardHistoryChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IClipboardHistoryChangedEventArgs {
    public val __809971381_Ptr: Pointer?

    public val _809971381_VtblPtr: Pointer?
      get() = __809971381_Ptr?.getPointer(0)
  }

  public class IClipboardHistoryChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __809971381_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IClipboardHistoryChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0be453f8ea253ce9aba8d2212573452")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIClipboardHistoryChangedEventArgs(ptr: Pointer?): WithDefault =
        IClipboardHistoryChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IClipboardHistoryChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIClipboardHistoryChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IClipboardHistoryChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__809971381_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IClipboardHistoryChangedEventArgs):
        Array<IClipboardHistoryChangedEventArgs?> = (elements as
        Array<IClipboardHistoryChangedEventArgs?>).castToImpl<IClipboardHistoryChangedEventArgs,IClipboardHistoryChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IClipboardHistoryChangedEventArgs?> =
        arrayOfNulls<IClipboardHistoryChangedEventArgs_Impl>(size) as
        Array<IClipboardHistoryChangedEventArgs?>
  }
}
