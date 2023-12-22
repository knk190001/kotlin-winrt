package Windows.System.RemoteSystems

import Windows.Foundation.Collections.ValueSet
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

@ABIMarker(IRemoteSystemSessionValueSetReceivedEventArgs.ABI::class)
@Signature("{06f31785-2da5-4e58-a78f-9e8d0784ee25}")
@Guid("06f317852da54e58a78f9e8d0784ee25")
@WinRTInterface("06f317852da54e58a78f9e8d0784ee25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionValueSetReceivedEventArgs.ByReference::class)
public interface IRemoteSystemSessionValueSetReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Sender(): RemoteSystemSessionParticipant?

  @InterfaceMethod(1)
  public fun get_Message(): ValueSet?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionValueSetReceivedEventArgs> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionValueSetReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionValueSetReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionValueSetReceivedEventArgs {
    public val __2002694717_Ptr: Pointer?

    public val _2002694717_VtblPtr: Pointer?
      get() = __2002694717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Sender(): RemoteSystemSessionParticipant? {
      val fnPtr = _2002694717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionParticipant>()
      val hr = fn.invokeHR(arrayOf(__2002694717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionParticipant>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Message(): ValueSet? {
      val fnPtr = _2002694717_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ValueSet>()
      val hr = fn.invokeHR(arrayOf(__2002694717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ValueSet>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionValueSetReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2002694717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionValueSetReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("06f317852da54e58a78f9e8d0784ee25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionValueSetReceivedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionValueSetReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IRemoteSystemSessionValueSetReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionValueSetReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionValueSetReceivedEventArgs): MemoryAddress
        = MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2002694717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionValueSetReceivedEventArgs):
        Array<IRemoteSystemSessionValueSetReceivedEventArgs?> = (elements as
        Array<IRemoteSystemSessionValueSetReceivedEventArgs?>).castToImpl<IRemoteSystemSessionValueSetReceivedEventArgs,IRemoteSystemSessionValueSetReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionValueSetReceivedEventArgs?> =
        arrayOfNulls<IRemoteSystemSessionValueSetReceivedEventArgs_Impl>(size) as
        Array<IRemoteSystemSessionValueSetReceivedEventArgs?>
  }
}
