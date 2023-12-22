package Windows.System.RemoteSystems

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

@ABIMarker(IRemoteSystemWatcherErrorOccurredEventArgs.ABI::class)
@Signature("{74c5c6af-5114-4426-9216-20d81f8519ae}")
@Guid("74c5c6af51144426921620d81f8519ae")
@WinRTInterface("74c5c6af51144426921620d81f8519ae")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemWatcherErrorOccurredEventArgs.ByReference::class)
public interface IRemoteSystemWatcherErrorOccurredEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Error(): RemoteSystemWatcherError?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemWatcherErrorOccurredEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteSystemWatcherErrorOccurredEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemWatcherErrorOccurredEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemWatcherErrorOccurredEventArgs {
    public val __725965810_Ptr: Pointer?

    public val _725965810_VtblPtr: Pointer?
      get() = __725965810_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Error(): RemoteSystemWatcherError? {
      val fnPtr = _725965810_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemWatcherError>()
      val hr = fn.invokeHR(arrayOf(__725965810_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemWatcherError>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemWatcherErrorOccurredEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __725965810_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemWatcherErrorOccurredEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("74c5c6af51144426921620d81f8519ae")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemWatcherErrorOccurredEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemWatcherErrorOccurredEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemWatcherErrorOccurredEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemWatcherErrorOccurredEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemWatcherErrorOccurredEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__725965810_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemWatcherErrorOccurredEventArgs):
        Array<IRemoteSystemWatcherErrorOccurredEventArgs?> = (elements as
        Array<IRemoteSystemWatcherErrorOccurredEventArgs?>).castToImpl<IRemoteSystemWatcherErrorOccurredEventArgs,IRemoteSystemWatcherErrorOccurredEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemWatcherErrorOccurredEventArgs?> =
        arrayOfNulls<IRemoteSystemWatcherErrorOccurredEventArgs_Impl>(size) as
        Array<IRemoteSystemWatcherErrorOccurredEventArgs?>
  }
}
