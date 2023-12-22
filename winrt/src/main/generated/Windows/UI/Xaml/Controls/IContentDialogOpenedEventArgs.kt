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

@ABIMarker(IContentDialogOpenedEventArgs.ABI::class)
@Signature("{0966b315-5f59-4999-9e3e-374c0f174b04}")
@Guid("0966b3155f5949999e3e374c0f174b04")
@WinRTInterface("0966b3155f5949999e3e374c0f174b04")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogOpenedEventArgs.ByReference::class)
public interface IContentDialogOpenedEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogOpenedEventArgs> {
    public override fun getValue() = ABI.makeIContentDialogOpenedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContentDialogOpenedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogOpenedEventArgs {
    public val __445400297_Ptr: Pointer?

    public val _445400297_VtblPtr: Pointer?
      get() = __445400297_Ptr?.getPointer(0)
  }

  public class IContentDialogOpenedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __445400297_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogOpenedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0966b3155f5949999e3e374c0f174b04")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogOpenedEventArgs(ptr: Pointer?): WithDefault =
        IContentDialogOpenedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogOpenedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContentDialogOpenedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogOpenedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__445400297_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogOpenedEventArgs):
        Array<IContentDialogOpenedEventArgs?> = (elements as
        Array<IContentDialogOpenedEventArgs?>).castToImpl<IContentDialogOpenedEventArgs,IContentDialogOpenedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogOpenedEventArgs?> =
        arrayOfNulls<IContentDialogOpenedEventArgs_Impl>(size) as
        Array<IContentDialogOpenedEventArgs?>
  }
}
