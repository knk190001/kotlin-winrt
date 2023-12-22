package Windows.ApplicationModel.AppService

import Windows.Foundation.IAsyncOperation
import Windows.System.RemoteSystems.RemoteSystemConnectionRequest
import Windows.System.User
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

@ABIMarker(IAppServiceConnection2.ABI::class)
@Signature("{8bdfcd5f-2302-4fbd-8061-52511c2f8bf9}")
@Guid("8bdfcd5f23024fbd806152511c2f8bf9")
@WinRTInterface("8bdfcd5f23024fbd806152511c2f8bf9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppServiceConnection2.ByReference::class)
public interface IAppServiceConnection2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun OpenRemoteAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest?):
      IAsyncOperation<AppServiceConnectionStatus?>?

  @InterfaceMethod(1)
  public fun get_User(): User?

  @InterfaceMethod(2)
  public fun put_User(value: User?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppServiceConnection2> {
    public override fun getValue() = ABI.makeIAppServiceConnection2(pointer.getPointer(0))

    public fun setValue(value: IAppServiceConnection2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppServiceConnection2 {
    public val __489266549_Ptr: Pointer?

    public val _489266549_VtblPtr: Pointer?
      get() = __489266549_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override
        fun OpenRemoteAsync(remoteSystemConnectionRequest: RemoteSystemConnectionRequest?):
        IAsyncOperation<AppServiceConnectionStatus?>? {
      val fnPtr = _489266549_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<AppServiceConnectionStatus?>>()
      val hr = fn.invokeHR(arrayOf(__489266549_Ptr, marshalToNative(remoteSystemConnectionRequest),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<AppServiceConnectionStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_User(): User? {
      val fnPtr = _489266549_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<User>()
      val hr = fn.invokeHR(arrayOf(__489266549_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<User>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_User(value: User?): Unit {
      val fnPtr = _489266549_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__489266549_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppServiceConnection2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __489266549_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppServiceConnection2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8bdfcd5f23024fbd806152511c2f8bf9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppServiceConnection2(ptr: Pointer?): WithDefault =
        IAppServiceConnection2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppServiceConnection2 {
      val address = segment.toRawLongValue()
      return makeIAppServiceConnection2(Pointer(address))
    }

    public override fun toNative(obj: IAppServiceConnection2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__489266549_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppServiceConnection2): Array<IAppServiceConnection2?> =
        (elements as
        Array<IAppServiceConnection2?>).castToImpl<IAppServiceConnection2,IAppServiceConnection2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppServiceConnection2?> =
        arrayOfNulls<IAppServiceConnection2_Impl>(size) as Array<IAppServiceConnection2?>
  }
}
