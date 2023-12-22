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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemRemovedEventArgs.ABI::class)
@Signature("{8b3d16bb-7306-49ea-b7df-67d5714cb013}")
@Guid("8b3d16bb730649eab7df67d5714cb013")
@WinRTInterface("8b3d16bb730649eab7df67d5714cb013")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemRemovedEventArgs.ByReference::class)
public interface IRemoteSystemRemovedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystemId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemRemovedEventArgs> {
    public override fun getValue() = ABI.makeIRemoteSystemRemovedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemRemovedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemRemovedEventArgs {
    public val __1432887989_Ptr: Pointer?

    public val _1432887989_VtblPtr: Pointer?
      get() = __1432887989_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystemId(): String? {
      val fnPtr = _1432887989_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1432887989_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemRemovedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1432887989_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemRemovedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8b3d16bb730649eab7df67d5714cb013")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemRemovedEventArgs(ptr: Pointer?): WithDefault =
        IRemoteSystemRemovedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemRemovedEventArgs {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemRemovedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemRemovedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1432887989_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemRemovedEventArgs):
        Array<IRemoteSystemRemovedEventArgs?> = (elements as
        Array<IRemoteSystemRemovedEventArgs?>).castToImpl<IRemoteSystemRemovedEventArgs,IRemoteSystemRemovedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemRemovedEventArgs?> =
        arrayOfNulls<IRemoteSystemRemovedEventArgs_Impl>(size) as
        Array<IRemoteSystemRemovedEventArgs?>
  }
}
