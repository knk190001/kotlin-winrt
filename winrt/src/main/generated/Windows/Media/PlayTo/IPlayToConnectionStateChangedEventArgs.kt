package Windows.Media.PlayTo

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

@ABIMarker(IPlayToConnectionStateChangedEventArgs.ABI::class)
@Signature("{68c4b50f-0c20-4980-8602-58c62238d423}")
@Guid("68c4b50f0c204980860258c62238d423")
@WinRTInterface("68c4b50f0c204980860258c62238d423")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToConnectionStateChangedEventArgs.ByReference::class)
public interface IPlayToConnectionStateChangedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreviousState(): PlayToConnectionState?

  @InterfaceMethod(1)
  public fun get_CurrentState(): PlayToConnectionState?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToConnectionStateChangedEventArgs> {
    public override fun getValue() =
        ABI.makeIPlayToConnectionStateChangedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPlayToConnectionStateChangedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToConnectionStateChangedEventArgs {
    public val __1987642334_Ptr: Pointer?

    public val _1987642334_VtblPtr: Pointer?
      get() = __1987642334_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreviousState(): PlayToConnectionState? {
      val fnPtr = _1987642334_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToConnectionState>()
      val hr = fn.invokeHR(arrayOf(__1987642334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToConnectionState>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentState(): PlayToConnectionState? {
      val fnPtr = _1987642334_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToConnectionState>()
      val hr = fn.invokeHR(arrayOf(__1987642334_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToConnectionState>(result.getValue())
      return resultValue
    }
  }

  public class IPlayToConnectionStateChangedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1987642334_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToConnectionStateChangedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("68c4b50f0c204980860258c62238d423")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToConnectionStateChangedEventArgs(ptr: Pointer?): WithDefault =
        IPlayToConnectionStateChangedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToConnectionStateChangedEventArgs {
      val address = segment.toRawLongValue()
      return makeIPlayToConnectionStateChangedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPlayToConnectionStateChangedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1987642334_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToConnectionStateChangedEventArgs):
        Array<IPlayToConnectionStateChangedEventArgs?> = (elements as
        Array<IPlayToConnectionStateChangedEventArgs?>).castToImpl<IPlayToConnectionStateChangedEventArgs,IPlayToConnectionStateChangedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToConnectionStateChangedEventArgs?> =
        arrayOfNulls<IPlayToConnectionStateChangedEventArgs_Impl>(size) as
        Array<IPlayToConnectionStateChangedEventArgs?>
  }
}
