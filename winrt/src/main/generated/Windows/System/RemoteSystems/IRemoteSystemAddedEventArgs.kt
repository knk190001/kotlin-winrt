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

@ABIMarker(IRemoteSystemAddedEventArgs.ABI::class)
@Signature("{8f39560f-e534-4697-8836-7abea151516e}")
@Guid("8f39560fe534469788367abea151516e")
@WinRTInterface("8f39560fe534469788367abea151516e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemAddedEventArgs.ByReference::class)
public interface IRemoteSystemAddedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystem(): RemoteSystem?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemAddedEventArgs> {
    public override fun getValue() = ABI.makeIRemoteSystemAddedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemAddedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemAddedEventArgs {
    public val __72353195_Ptr: Pointer?

    public val _72353195_VtblPtr: Pointer?
      get() = __72353195_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystem(): RemoteSystem? {
      val fnPtr = _72353195_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystem>()
      val hr = fn.invokeHR(arrayOf(__72353195_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystem>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemAddedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __72353195_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemAddedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8f39560fe534469788367abea151516e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemAddedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemAddedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemAddedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemAddedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemAddedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__72353195_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemAddedEventArgs):
        Array<IRemoteSystemAddedEventArgs?> = (elements as
        Array<IRemoteSystemAddedEventArgs?>).castToImpl<IRemoteSystemAddedEventArgs,IRemoteSystemAddedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemAddedEventArgs?> =
        arrayOfNulls<IRemoteSystemAddedEventArgs_Impl>(size) as Array<IRemoteSystemAddedEventArgs?>
  }
}
