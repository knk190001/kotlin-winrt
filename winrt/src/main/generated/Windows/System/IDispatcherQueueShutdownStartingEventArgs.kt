package Windows.System

import Windows.Foundation.Deferral
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

@ABIMarker(IDispatcherQueueShutdownStartingEventArgs.ABI::class)
@Signature("{c4724c4c-ff97-40c0-a226-cc0aaa545e89}")
@Guid("c4724c4cff9740c0a226cc0aaa545e89")
@WinRTInterface("c4724c4cff9740c0a226cc0aaa545e89")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDispatcherQueueShutdownStartingEventArgs.ByReference::class)
public interface IDispatcherQueueShutdownStartingEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDeferral(): Deferral?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDispatcherQueueShutdownStartingEventArgs> {
    public override fun getValue() =
        ABI.makeIDispatcherQueueShutdownStartingEventArgs(pointer.getPointer(0))

    public fun setValue(value: IDispatcherQueueShutdownStartingEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDispatcherQueueShutdownStartingEventArgs {
    public val __1057936230_Ptr: Pointer?

    public val _1057936230_VtblPtr: Pointer?
      get() = __1057936230_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDeferral(): Deferral? {
      val fnPtr = _1057936230_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Deferral>()
      val hr = fn.invokeHR(arrayOf(__1057936230_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Deferral>(result.getValue())
      return resultValue
    }
  }

  public class IDispatcherQueueShutdownStartingEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1057936230_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDispatcherQueueShutdownStartingEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c4724c4cff9740c0a226cc0aaa545e89")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDispatcherQueueShutdownStartingEventArgs(ptr: Pointer?): WithDefault =
        IDispatcherQueueShutdownStartingEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IDispatcherQueueShutdownStartingEventArgs {
      val address = segment.toRawLongValue()
      return makeIDispatcherQueueShutdownStartingEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IDispatcherQueueShutdownStartingEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1057936230_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDispatcherQueueShutdownStartingEventArgs):
        Array<IDispatcherQueueShutdownStartingEventArgs?> = (elements as
        Array<IDispatcherQueueShutdownStartingEventArgs?>).castToImpl<IDispatcherQueueShutdownStartingEventArgs,IDispatcherQueueShutdownStartingEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDispatcherQueueShutdownStartingEventArgs?> =
        arrayOfNulls<IDispatcherQueueShutdownStartingEventArgs_Impl>(size) as
        Array<IDispatcherQueueShutdownStartingEventArgs?>
  }
}
