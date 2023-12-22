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

@ABIMarker(IRemoteSystemConnectionRequest2.ABI::class)
@Signature("{12df6d6f-bffc-483a-8abe-d34a6c19f92b}")
@Guid("12df6d6fbffc483a8abed34a6c19f92b")
@WinRTInterface("12df6d6fbffc483a8abed34a6c19f92b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemConnectionRequest2.ByReference::class)
public interface IRemoteSystemConnectionRequest2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RemoteSystemApp(): RemoteSystemApp?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemConnectionRequest2> {
    public override fun getValue() = ABI.makeIRemoteSystemConnectionRequest2(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemConnectionRequest2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemConnectionRequest2 {
    public val __2134960459_Ptr: Pointer?

    public val _2134960459_VtblPtr: Pointer?
      get() = __2134960459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RemoteSystemApp(): RemoteSystemApp? {
      val fnPtr = _2134960459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RemoteSystemApp>()
      val hr = fn.invokeHR(arrayOf(__2134960459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RemoteSystemApp>(result.getValue())
      return resultValue
    }
  }

  public class IRemoteSystemConnectionRequest2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2134960459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemConnectionRequest2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("12df6d6fbffc483a8abed34a6c19f92b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemConnectionRequest2(ptr: Pointer?): WithDefault =
        IRemoteSystemConnectionRequest2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemConnectionRequest2 {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemConnectionRequest2(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemConnectionRequest2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2134960459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemConnectionRequest2):
        Array<IRemoteSystemConnectionRequest2?> = (elements as
        Array<IRemoteSystemConnectionRequest2?>).castToImpl<IRemoteSystemConnectionRequest2,IRemoteSystemConnectionRequest2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemConnectionRequest2?> =
        arrayOfNulls<IRemoteSystemConnectionRequest2_Impl>(size) as
        Array<IRemoteSystemConnectionRequest2?>
  }
}
