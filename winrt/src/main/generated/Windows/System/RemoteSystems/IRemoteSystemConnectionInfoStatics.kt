package Windows.System.RemoteSystems

import Windows.ApplicationModel.AppService.AppServiceConnection
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

@ABIMarker(IRemoteSystemConnectionInfoStatics.ABI::class)
@Signature("{ac831e2d-66c5-56d7-a4ce-705d94925ad6}")
@Guid("ac831e2d66c556d7a4ce705d94925ad6")
@WinRTInterface("ac831e2d66c556d7a4ce705d94925ad6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemConnectionInfoStatics.ByReference::class)
public interface IRemoteSystemConnectionInfoStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun TryCreateFromAppServiceConnection(connection: AppServiceConnection?):
      RemoteSystemConnectionInfo?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemConnectionInfoStatics> {
    public override fun getValue() =
        ABI.makeIRemoteSystemConnectionInfoStatics(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemConnectionInfoStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemConnectionInfoStatics {
    public val __840881861_Ptr: Pointer?

    public val _840881861_VtblPtr: Pointer?
      get() = __840881861_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun TryCreateFromAppServiceConnection(connection: AppServiceConnection?):
        RemoteSystemConnectionInfo? {
      val fnPtr = _840881861_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemConnectionInfo>()
      val hr = fn.invokeHR(arrayOf(__840881861_Ptr, marshalToNative(connection), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemConnectionInfo>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemConnectionInfoStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __840881861_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemConnectionInfoStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac831e2d66c556d7a4ce705d94925ad6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemConnectionInfoStatics(ptr: Pointer?): WithDefault =
        IRemoteSystemConnectionInfoStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemConnectionInfoStatics {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemConnectionInfoStatics(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemConnectionInfoStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__840881861_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemConnectionInfoStatics):
        Array<IRemoteSystemConnectionInfoStatics?> = (elements as
        Array<IRemoteSystemConnectionInfoStatics?>).castToImpl<IRemoteSystemConnectionInfoStatics,IRemoteSystemConnectionInfoStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemConnectionInfoStatics?> =
        arrayOfNulls<IRemoteSystemConnectionInfoStatics_Impl>(size) as
        Array<IRemoteSystemConnectionInfoStatics?>
  }
}
