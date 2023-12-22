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

@ABIMarker(IRemoteSystemSessionStatics.ABI::class)
@Signature("{8524899f-fd20-44e3-9565-e75a3b14c66e}")
@Guid("8524899ffd2044e39565e75a3b14c66e")
@WinRTInterface("8524899ffd2044e39565e75a3b14c66e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionStatics.ByReference::class)
public interface IRemoteSystemSessionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateWatcher(): RemoteSystemSessionWatcher?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionStatics> {
    public override fun getValue() = ABI.makeIRemoteSystemSessionStatics(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionStatics {
    public val __1760695165_Ptr: Pointer?

    public val _1760695165_VtblPtr: Pointer?
      get() = __1760695165_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateWatcher(): RemoteSystemSessionWatcher? {
      val fnPtr = _1760695165_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionWatcher>()
      val hr = fn.invokeHR(arrayOf(__1760695165_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionWatcher>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1760695165_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8524899ffd2044e39565e75a3b14c66e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionStatics(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionStatics {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionStatics(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1760695165_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionStatics):
        Array<IRemoteSystemSessionStatics?> = (elements as
        Array<IRemoteSystemSessionStatics?>).castToImpl<IRemoteSystemSessionStatics,IRemoteSystemSessionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionStatics?> =
        arrayOfNulls<IRemoteSystemSessionStatics_Impl>(size) as Array<IRemoteSystemSessionStatics?>
  }
}
