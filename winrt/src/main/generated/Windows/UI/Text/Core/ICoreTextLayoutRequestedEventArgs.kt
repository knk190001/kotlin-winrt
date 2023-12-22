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

@ABIMarker(ICoreTextLayoutRequestedEventArgs.ABI::class)
@Signature("{b1dc6ae0-9a7b-4e9e-a566-4a6b5f8ad676}")
@Guid("b1dc6ae09a7b4e9ea5664a6b5f8ad676")
@WinRTInterface("b1dc6ae09a7b4e9ea5664a6b5f8ad676")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreTextLayoutRequestedEventArgs.ByReference::class)
public interface ICoreTextLayoutRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Request(): CoreTextLayoutRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreTextLayoutRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeICoreTextLayoutRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: ICoreTextLayoutRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreTextLayoutRequestedEventArgs {
    public val __1290874135_Ptr: Pointer?

    public val _1290874135_VtblPtr: Pointer?
      get() = __1290874135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Request(): CoreTextLayoutRequest? {
      val fnPtr = _1290874135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CoreTextLayoutRequest>()
      val hr = fn.invokeHR(arrayOf(__1290874135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CoreTextLayoutRequest>(result.getValue())
      return resultValue
    }
  }

  public class ICoreTextLayoutRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1290874135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreTextLayoutRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b1dc6ae09a7b4e9ea5664a6b5f8ad676")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreTextLayoutRequestedEventArgs(ptr: Pointer?): WithDefault =
        ICoreTextLayoutRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreTextLayoutRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeICoreTextLayoutRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: ICoreTextLayoutRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1290874135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreTextLayoutRequestedEventArgs):
        Array<ICoreTextLayoutRequestedEventArgs?> = (elements as
        Array<ICoreTextLayoutRequestedEventArgs?>).castToImpl<ICoreTextLayoutRequestedEventArgs,ICoreTextLayoutRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreTextLayoutRequestedEventArgs?> =
        arrayOfNulls<ICoreTextLayoutRequestedEventArgs_Impl>(size) as
        Array<ICoreTextLayoutRequestedEventArgs?>
  }
}
