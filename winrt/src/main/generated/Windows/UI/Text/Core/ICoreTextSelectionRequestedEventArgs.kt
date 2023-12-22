package Windows.UI.Text.Core

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICoreTextSelectionRequestedEventArgs.ABI::class)
@Signature("{13c6682b-f614-421a-8f4b-9ec8a5a37fcd}")
@Guid("13c6682bf614421a8f4b9ec8a5a37fcd")
@WinRTInterface("13c6682bf614421a8f4b9ec8a5a37fcd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextSelectionRequestedEventArgs.ByReference::class)
public interface ICoreTextSelectionRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): CoreTextSelectionRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextSelectionRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreTextSelectionRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreTextSelectionRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextSelectionRequestedEventArgs {
    public val __724489585_Ptr: Pointer?

    public val _724489585_VtblPtr: Pointer?
      get() = __724489585_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): CoreTextSelectionRequest? {
      val fnPtr = _724489585_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextSelectionRequest>()
      val hr = fn.invokeHR(arrayOf(__724489585_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextSelectionRequest>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextSelectionRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __724489585_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextSelectionRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("13c6682bf614421a8f4b9ec8a5a37fcd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextSelectionRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreTextSelectionRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextSelectionRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreTextSelectionRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextSelectionRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__724489585_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextSelectionRequestedEventArgs):
        Array<ICoreTextSelectionRequestedEventArgs?> = (elements as
        Array<ICoreTextSelectionRequestedEventArgs?>).castToImpl<ICoreTextSelectionRequestedEventArgs,ICoreTextSelectionRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextSelectionRequestedEventArgs?> =
        arrayOfNulls<ICoreTextSelectionRequestedEventArgs_Impl>(size) as
        Array<ICoreTextSelectionRequestedEventArgs?>
  }
}
