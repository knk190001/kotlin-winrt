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

@ABIMarker(IRemoteSystemSessionJoinResult.ABI::class)
@Signature("{ce7b1f04-a03e-41a4-900b-1e79328c1267}")
@Guid("ce7b1f04a03e41a4900b1e79328c1267")
@WinRTInterface("ce7b1f04a03e41a4900b1e79328c1267")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemSessionJoinResult.ByReference::class)
public interface IRemoteSystemSessionJoinResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Status(): RemoteSystemSessionJoinStatus?

  @InterfaceMethod(1)
  public fun get_Session(): RemoteSystemSession?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemSessionJoinResult> {
    public override fun getValue() = ABI.makeIRemoteSystemSessionJoinResult(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemSessionJoinResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemSessionJoinResult {
    public val __1142064023_Ptr: Pointer?

    public val _1142064023_VtblPtr: Pointer?
      get() = __1142064023_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Status(): RemoteSystemSessionJoinStatus? {
      val fnPtr = _1142064023_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSessionJoinStatus>()
      val hr = fn.invokeHR(arrayOf(__1142064023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSessionJoinStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Session(): RemoteSystemSession? {
      val fnPtr = _1142064023_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemSession>()
      val hr = fn.invokeHR(arrayOf(__1142064023_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemSession>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemSessionJoinResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1142064023_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemSessionJoinResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ce7b1f04a03e41a4900b1e79328c1267")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemSessionJoinResult(ptr: Pointer?): WithDefault =
        IRemoteSystemSessionJoinResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemSessionJoinResult {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemSessionJoinResult(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemSessionJoinResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1142064023_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemSessionJoinResult):
        Array<IRemoteSystemSessionJoinResult?> = (elements as
        Array<IRemoteSystemSessionJoinResult?>).castToImpl<IRemoteSystemSessionJoinResult,IRemoteSystemSessionJoinResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemSessionJoinResult?> =
        arrayOfNulls<IRemoteSystemSessionJoinResult_Impl>(size) as
        Array<IRemoteSystemSessionJoinResult?>
  }
}
