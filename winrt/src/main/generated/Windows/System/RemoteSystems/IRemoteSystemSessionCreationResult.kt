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

@ABIMarker(IRemoteSystemSessionCreationResult.ABI::class)
@Signature("{a79812c2-37de-448c-8b83-a30aa3c4ead6}")
@Guid("a79812c237de448c8b83a30aa3c4ead6")
@WinRTInterface("a79812c237de448c8b83a30aa3c4ead6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionCreationResult.ByReference::class)
public interface IRemoteSystemSessionCreationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): RemoteSystemSessionCreationStatus?

  @InterfaceMethod(1)
  public fun get_Session(): RemoteSystemSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionCreationResult> {
    public override fun getValue() =
        ABI.makeIRemoteSystemSessionCreationResult(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionCreationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionCreationResult {
    public val __1253253470_Ptr: Pointer?

    public val _1253253470_VtblPtr: Pointer?
      get() = __1253253470_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): RemoteSystemSessionCreationStatus? {
      val fnPtr = _1253253470_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionCreationStatus>()
      val hr = fn.invokeHR(arrayOf(__1253253470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionCreationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Session(): RemoteSystemSession? {
      val fnPtr = _1253253470_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSession>()
      val hr = fn.invokeHR(arrayOf(__1253253470_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSession>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionCreationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1253253470_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionCreationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a79812c237de448c8b83a30aa3c4ead6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionCreationResult(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionCreationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionCreationResult {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionCreationResult(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionCreationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1253253470_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionCreationResult):
        Array<IRemoteSystemSessionCreationResult?> = (elements as
        Array<IRemoteSystemSessionCreationResult?>).castToImpl<IRemoteSystemSessionCreationResult,IRemoteSystemSessionCreationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionCreationResult?> =
        arrayOfNulls<IRemoteSystemSessionCreationResult_Impl>(size) as
        Array<IRemoteSystemSessionCreationResult?>
  }
}
