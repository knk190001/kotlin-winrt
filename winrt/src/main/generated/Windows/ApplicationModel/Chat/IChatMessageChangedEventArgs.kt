package Windows.ApplicationModel.Chat

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

@ABIMarker(IChatMessageChangedEventArgs.ABI::class)
@Signature("{b6b73e2d-691c-4edf-8660-6eb9896892e3}")
@Guid("b6b73e2d691c4edf86606eb9896892e3")
@WinRTInterface("b6b73e2d691c4edf86606eb9896892e3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IChatMessageChangedEventArgs.ByReference::class)
public interface IChatMessageChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): ChatMessageChangedDeferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IChatMessageChangedEventArgs> {
    public override fun getValue() = ABI.makeIChatMessageChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IChatMessageChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IChatMessageChangedEventArgs {
    public val __1994375179_Ptr: Pointer?

    public val _1994375179_VtblPtr: Pointer?
      get() = __1994375179_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): ChatMessageChangedDeferral? {
      val fnPtr = _1994375179_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ChatMessageChangedDeferral>()
      val hr = fn.invokeHR(arrayOf(__1994375179_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ChatMessageChangedDeferral>(result.getValue())
      return resultValue
    }
  }

  public class IChatMessageChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1994375179_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IChatMessageChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b6b73e2d691c4edf86606eb9896892e3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIChatMessageChangedEventArgs(ptr: Pointer?): WithDefault =
        IChatMessageChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IChatMessageChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIChatMessageChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IChatMessageChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1994375179_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IChatMessageChangedEventArgs):
        Array<IChatMessageChangedEventArgs?> = (elements as
        Array<IChatMessageChangedEventArgs?>).castToImpl<IChatMessageChangedEventArgs,IChatMessageChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IChatMessageChangedEventArgs?> =
        arrayOfNulls<IChatMessageChangedEventArgs_Impl>(size) as
        Array<IChatMessageChangedEventArgs?>
  }
}
