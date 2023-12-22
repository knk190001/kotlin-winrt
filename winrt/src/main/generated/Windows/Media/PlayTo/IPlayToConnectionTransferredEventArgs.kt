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

@ABIMarker(IPlayToConnectionTransferredEventArgs.ABI::class)
@Signature("{fae3193a-0683-47d9-8df0-18cbb48984d8}")
@Guid("fae3193a068347d98df018cbb48984d8")
@WinRTInterface("fae3193a068347d98df018cbb48984d8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPlayToConnectionTransferredEventArgs.ByReference::class)
public interface IPlayToConnectionTransferredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PreviousSource(): PlayToSource?

  @InterfaceMethod(1)
  public fun get_CurrentSource(): PlayToSource?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPlayToConnectionTransferredEventArgs> {
    public override fun getValue() =
        ABI.makeIPlayToConnectionTransferredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IPlayToConnectionTransferredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPlayToConnectionTransferredEventArgs {
    public val __2044947581_Ptr: Pointer?

    public val _2044947581_VtblPtr: Pointer?
      get() = __2044947581_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PreviousSource(): PlayToSource? {
      val fnPtr = _2044947581_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToSource>()
      val hr = fn.invokeHR(arrayOf(__2044947581_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToSource>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_CurrentSource(): PlayToSource? {
      val fnPtr = _2044947581_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PlayToSource>()
      val hr = fn.invokeHR(arrayOf(__2044947581_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PlayToSource>(result.getValue())
      return resultValue
    }
  }

  public class IPlayToConnectionTransferredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2044947581_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPlayToConnectionTransferredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fae3193a068347d98df018cbb48984d8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPlayToConnectionTransferredEventArgs(ptr: Pointer?): WithDefault =
        IPlayToConnectionTransferredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPlayToConnectionTransferredEventArgs {
      val address = segment.toRawLongValue()
      return makeIPlayToConnectionTransferredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IPlayToConnectionTransferredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2044947581_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPlayToConnectionTransferredEventArgs):
        Array<IPlayToConnectionTransferredEventArgs?> = (elements as
        Array<IPlayToConnectionTransferredEventArgs?>).castToImpl<IPlayToConnectionTransferredEventArgs,IPlayToConnectionTransferredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPlayToConnectionTransferredEventArgs?> =
        arrayOfNulls<IPlayToConnectionTransferredEventArgs_Impl>(size) as
        Array<IPlayToConnectionTransferredEventArgs?>
  }
}
