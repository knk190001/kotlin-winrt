package Windows.UI.Xaml.Controls

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITextControlCuttingToClipboardEventArgs.ABI::class)
@Signature("{5f894995-a58d-4cf3-b589-b5e500e06475}")
@Guid("5f894995a58d4cf3b589b5e500e06475")
@WinRTInterface("5f894995a58d4cf3b589b5e500e06475")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextControlCuttingToClipboardEventArgs.ByReference::class)
public interface ITextControlCuttingToClipboardEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextControlCuttingToClipboardEventArgs> {
    public override fun getValue() =
        ABI.makeITextControlCuttingToClipboardEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextControlCuttingToClipboardEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextControlCuttingToClipboardEventArgs {
    public val __1070394024_Ptr: Pointer?

    public val _1070394024_VtblPtr: Pointer?
      get() = __1070394024_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1070394024_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1070394024_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1070394024_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1070394024_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextControlCuttingToClipboardEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1070394024_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextControlCuttingToClipboardEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("5f894995a58d4cf3b589b5e500e06475")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextControlCuttingToClipboardEventArgs(ptr: Pointer?): WithDefault =
        ITextControlCuttingToClipboardEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITextControlCuttingToClipboardEventArgs {
      val address = segment.toRawLongValue()
      return makeITextControlCuttingToClipboardEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextControlCuttingToClipboardEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1070394024_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextControlCuttingToClipboardEventArgs):
        Array<ITextControlCuttingToClipboardEventArgs?> = (elements as
        Array<ITextControlCuttingToClipboardEventArgs?>).castToImpl<ITextControlCuttingToClipboardEventArgs,ITextControlCuttingToClipboardEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextControlCuttingToClipboardEventArgs?> =
        arrayOfNulls<ITextControlCuttingToClipboardEventArgs_Impl>(size) as
        Array<ITextControlCuttingToClipboardEventArgs?>
  }
}
