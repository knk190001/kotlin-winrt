package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ITextControlCopyingToClipboardEventArgs.ABI::class)
@Signature("{1daac6d5-8db5-5d9f-9382-1e644f9aa437}")
@Guid("1daac6d58db55d9f93821e644f9aa437")
@WinRTInterface("1daac6d58db55d9f93821e644f9aa437")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextControlCopyingToClipboardEventArgs.ByReference::class)
public interface ITextControlCopyingToClipboardEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextControlCopyingToClipboardEventArgs> {
    public override fun getValue() =
        ABI.makeITextControlCopyingToClipboardEventArgs(pointer.getPointer(0))

    public fun setValue(value: ITextControlCopyingToClipboardEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextControlCopyingToClipboardEventArgs {
    public val __1211339360_Ptr: Pointer?

    public val _1211339360_VtblPtr: Pointer?
      get() = __1211339360_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1211339360_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1211339360_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1211339360_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1211339360_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITextControlCopyingToClipboardEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1211339360_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextControlCopyingToClipboardEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1daac6d58db55d9f93821e644f9aa437")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextControlCopyingToClipboardEventArgs(ptr: Pointer?): WithDefault =
        ITextControlCopyingToClipboardEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        ITextControlCopyingToClipboardEventArgs {
      val address = segment.toRawLongValue()
      return makeITextControlCopyingToClipboardEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ITextControlCopyingToClipboardEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1211339360_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextControlCopyingToClipboardEventArgs):
        Array<ITextControlCopyingToClipboardEventArgs?> = (elements as
        Array<ITextControlCopyingToClipboardEventArgs?>).castToImpl<ITextControlCopyingToClipboardEventArgs,ITextControlCopyingToClipboardEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextControlCopyingToClipboardEventArgs?> =
        arrayOfNulls<ITextControlCopyingToClipboardEventArgs_Impl>(size) as
        Array<ITextControlCopyingToClipboardEventArgs?>
  }
}
