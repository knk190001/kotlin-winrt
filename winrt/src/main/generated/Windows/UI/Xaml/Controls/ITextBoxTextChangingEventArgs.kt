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

@ABIMarker(ITextBoxTextChangingEventArgs.ABI::class)
@Signature("{4e6a4b75-43dd-4e33-acbe-2d8796a17927}")
@Guid("4e6a4b7543dd4e33acbe2d8796a17927")
@WinRTInterface("4e6a4b7543dd4e33acbe2d8796a17927")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextBoxTextChangingEventArgs.ByReference::class)
public interface ITextBoxTextChangingEventArgs : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextBoxTextChangingEventArgs> {
    public override fun getValue() = ABI.makeITextBoxTextChangingEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextBoxTextChangingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextBoxTextChangingEventArgs {
    public val __155072091_Ptr: Pointer?

    public val _155072091_VtblPtr: Pointer?
      get() = __155072091_Ptr?.getPointer(0)
  }

  public class ITextBoxTextChangingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __155072091_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextBoxTextChangingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4e6a4b7543dd4e33acbe2d8796a17927")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextBoxTextChangingEventArgs(ptr: Pointer?): WithDefault =
        ITextBoxTextChangingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextBoxTextChangingEventArgs {
      val address = segment.toRawLongValue()
      return makeITextBoxTextChangingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextBoxTextChangingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__155072091_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextBoxTextChangingEventArgs):
        Array<ITextBoxTextChangingEventArgs?> = (elements as
        Array<ITextBoxTextChangingEventArgs?>).castToImpl<ITextBoxTextChangingEventArgs,ITextBoxTextChangingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextBoxTextChangingEventArgs?> =
        arrayOfNulls<ITextBoxTextChangingEventArgs_Impl>(size) as
        Array<ITextBoxTextChangingEventArgs?>
  }
}
