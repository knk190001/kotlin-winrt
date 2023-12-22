package Windows.System.RemoteSystems

import Windows.Security.Credentials.WebAccount
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

@ABIMarker(IRemoteSystemWebAccountFilterFactory.ABI::class)
@Signature("{348a2709-5f4d-5127-b4a7-bf99d5252b1b}")
@Guid("348a27095f4d5127b4a7bf99d5252b1b")
@WinRTInterface("348a27095f4d5127b4a7bf99d5252b1b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemWebAccountFilterFactory.ByReference::class)
public interface IRemoteSystemWebAccountFilterFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Create(account: WebAccount?): RemoteSystemWebAccountFilter?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemWebAccountFilterFactory> {
    public override fun getValue() =
        ABI.makeIRemoteSystemWebAccountFilterFactory(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemWebAccountFilterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemWebAccountFilterFactory {
    public val __265635579_Ptr: Pointer?

    public val _265635579_VtblPtr: Pointer?
      get() = __265635579_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Create(account: WebAccount?): RemoteSystemWebAccountFilter? {
      val fnPtr = _265635579_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemWebAccountFilter>()
      val hr = fn.invokeHR(arrayOf(__265635579_Ptr, marshalToNative(account), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemWebAccountFilter>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemWebAccountFilterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __265635579_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemWebAccountFilterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("348a27095f4d5127b4a7bf99d5252b1b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemWebAccountFilterFactory(ptr: Pointer?): WithDefault =
        IRemoteSystemWebAccountFilterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemWebAccountFilterFactory {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemWebAccountFilterFactory(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemWebAccountFilterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__265635579_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemWebAccountFilterFactory):
        Array<IRemoteSystemWebAccountFilterFactory?> = (elements as
        Array<IRemoteSystemWebAccountFilterFactory?>).castToImpl<IRemoteSystemWebAccountFilterFactory,IRemoteSystemWebAccountFilterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemWebAccountFilterFactory?> =
        arrayOfNulls<IRemoteSystemWebAccountFilterFactory_Impl>(size) as
        Array<IRemoteSystemWebAccountFilterFactory?>
  }
}
