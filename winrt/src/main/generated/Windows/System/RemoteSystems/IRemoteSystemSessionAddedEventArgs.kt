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

@ABIMarker(IRemoteSystemSessionAddedEventArgs.ABI::class)
@Signature("{d585d754-bc97-4c39-99b4-beca76e04c3f}")
@Guid("d585d754bc974c3999b4beca76e04c3f")
@WinRTInterface("d585d754bc974c3999b4beca76e04c3f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionAddedEventArgs.ByReference::class)
public interface IRemoteSystemSessionAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SessionInfo(): RemoteSystemSessionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionAddedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionAddedEventArgs {
    public val __720626951_Ptr: Pointer?

    public val _720626951_VtblPtr: Pointer?
      get() = __720626951_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SessionInfo(): RemoteSystemSessionInfo? {
      val fnPtr = _720626951_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionInfo>()
      val hr = fn.invokeHR(arrayOf(__720626951_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __720626951_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d585d754bc974c3999b4beca76e04c3f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionAddedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__720626951_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionAddedEventArgs):
        Array<IRemoteSystemSessionAddedEventArgs?> = (elements as
        Array<IRemoteSystemSessionAddedEventArgs?>).castToImpl<IRemoteSystemSessionAddedEventArgs,IRemoteSystemSessionAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionAddedEventArgs?> =
        arrayOfNulls<IRemoteSystemSessionAddedEventArgs_Impl>(size) as
        Array<IRemoteSystemSessionAddedEventArgs?>
  }
}
