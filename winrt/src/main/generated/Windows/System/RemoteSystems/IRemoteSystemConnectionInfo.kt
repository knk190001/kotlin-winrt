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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IRemoteSystemConnectionInfo.ABI::class)
@Signature("{23278bc3-0d09-52cb-9c6a-eed2940bee43}")
@Guid("23278bc30d0952cb9c6aeed2940bee43")
@WinRTInterface("23278bc30d0952cb9c6aeed2940bee43")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRemoteSystemConnectionInfo.ByReference::class)
public interface IRemoteSystemConnectionInfo : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsProximal(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRemoteSystemConnectionInfo> {
    public override fun getValue() = ABI.makeIRemoteSystemConnectionInfo(pointer.getPointer(0))

    public fun setValue(value: IRemoteSystemConnectionInfo_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRemoteSystemConnectionInfo {
    public val __365919008_Ptr: Pointer?

    public val _365919008_VtblPtr: Pointer?
      get() = __365919008_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsProximal(): Boolean {
      val fnPtr = _365919008_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__365919008_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IRemoteSystemConnectionInfo_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __365919008_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRemoteSystemConnectionInfo, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23278bc30d0952cb9c6aeed2940bee43")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRemoteSystemConnectionInfo(ptr: Pointer?): WithDefault =
        IRemoteSystemConnectionInfo_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRemoteSystemConnectionInfo {
      val address = segment.toRawLongValue()
      return makeIRemoteSystemConnectionInfo(Pointer(address))
    }

    public override fun toNative(obj: IRemoteSystemConnectionInfo): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__365919008_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRemoteSystemConnectionInfo):
        Array<IRemoteSystemConnectionInfo?> = (elements as
        Array<IRemoteSystemConnectionInfo?>).castToImpl<IRemoteSystemConnectionInfo,IRemoteSystemConnectionInfo_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRemoteSystemConnectionInfo?> =
        arrayOfNulls<IRemoteSystemConnectionInfo_Impl>(size) as Array<IRemoteSystemConnectionInfo?>
  }
}
