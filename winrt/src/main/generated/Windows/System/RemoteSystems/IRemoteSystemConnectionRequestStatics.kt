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

@ABIMarker(IRemoteSystemConnectionRequestStatics.ABI::class)
@Signature("{86ca143d-8214-425c-8932-db49032d1306}")
@Guid("86ca143d8214425c8932db49032d1306")
@WinRTInterface("86ca143d8214425c8932db49032d1306")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemConnectionRequestStatics.ByReference::class)
public interface IRemoteSystemConnectionRequestStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateForApp(remoteSystemApp: RemoteSystemApp?): RemoteSystemConnectionRequest?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemConnectionRequestStatics> {
    public override fun getValue() =
        ABI.makeIRemoteSystemConnectionRequestStatics(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemConnectionRequestStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemConnectionRequestStatics {
    public val __2104786968_Ptr: Pointer?

    public val _2104786968_VtblPtr: Pointer?
      get() = __2104786968_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateForApp(remoteSystemApp: RemoteSystemApp?):
        RemoteSystemConnectionRequest? {
      val fnPtr = _2104786968_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemConnectionRequest>()
      val hr = fn.invokeHR(arrayOf(__2104786968_Ptr, marshalToNative(remoteSystemApp), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemConnectionRequest>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemConnectionRequestStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2104786968_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemConnectionRequestStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("86ca143d8214425c8932db49032d1306")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemConnectionRequestStatics(ptr: Pointer?): WithDefault =
        IRemoteSystemConnectionRequestStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemConnectionRequestStatics {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemConnectionRequestStatics(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemConnectionRequestStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2104786968_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemConnectionRequestStatics):
        Array<IRemoteSystemConnectionRequestStatics?> = (elements as
        Array<IRemoteSystemConnectionRequestStatics?>).castToImpl<IRemoteSystemConnectionRequestStatics,IRemoteSystemConnectionRequestStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemConnectionRequestStatics?> =
        arrayOfNulls<IRemoteSystemConnectionRequestStatics_Impl>(size) as
        Array<IRemoteSystemConnectionRequestStatics?>
  }
}
