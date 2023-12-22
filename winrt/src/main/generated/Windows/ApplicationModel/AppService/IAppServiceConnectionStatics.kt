package Windows.ApplicationModel.AppService

import Windows.Foundation.Collections.ValueSet
import Windows.Foundation.IAsyncOperation
import Windows.System.RemoteSystems.RemoteSystemConnectionRequest
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

@ABIMarker(IAppServiceConnectionStatics.ABI::class)
@Signature("{adc56ce9-d408-5673-8637-827a4b274168}")
@Guid("adc56ce9d40856738637827a4b274168")
@WinRTInterface("adc56ce9d40856738637827a4b274168")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceConnectionStatics.ByReference::class)
public interface IAppServiceConnectionStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SendStatelessMessageAsync(
    connection: AppServiceConnection?,
    connectionRequest: RemoteSystemConnectionRequest?,
    message: ValueSet?
  ): IAsyncOperation<StatelessAppServiceResponse?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceConnectionStatics> {
    public override fun getValue() = ABI.makeIAppServiceConnectionStatics(pointer.getPointer(0))

    public fun setValue(value: IAppServiceConnectionStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceConnectionStatics {
    public val __685377880_Ptr: Pointer?

    public val _685377880_VtblPtr: Pointer?
      get() = __685377880_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendStatelessMessageAsync(
      connection: AppServiceConnection?,
      connectionRequest: RemoteSystemConnectionRequest?,
      message: ValueSet?
    ): IAsyncOperation<StatelessAppServiceResponse?>? {
      val fnPtr = _685377880_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<StatelessAppServiceResponse?>>()
      val hr = fn.invokeHR(arrayOf(__685377880_Ptr, marshalToNative(connection),
          marshalToNative(connectionRequest), marshalToNative(message), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<StatelessAppServiceResponse?>>(result.getValue())
      return resultValue
    }
  }

  public class IAppServiceConnectionStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __685377880_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceConnectionStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("adc56ce9d40856738637827a4b274168")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceConnectionStatics(ptr: Pointer?): WithDefault =
        IAppServiceConnectionStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceConnectionStatics {
      val address = segment.toRawLongValue()
      return makeIAppServiceConnectionStatics(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceConnectionStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__685377880_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceConnectionStatics):
        Array<IAppServiceConnectionStatics?> = (elements as
        Array<IAppServiceConnectionStatics?>).castToImpl<IAppServiceConnectionStatics,IAppServiceConnectionStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceConnectionStatics?> =
        arrayOfNulls<IAppServiceConnectionStatics_Impl>(size) as
        Array<IAppServiceConnectionStatics?>
  }
}
