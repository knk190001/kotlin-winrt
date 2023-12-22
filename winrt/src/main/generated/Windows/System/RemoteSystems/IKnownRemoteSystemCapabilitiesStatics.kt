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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IKnownRemoteSystemCapabilitiesStatics.ABI::class)
@Signature("{8108e380-7f8a-44e4-92cd-03b6469b94a3}")
@Guid("8108e3807f8a44e492cd03b6469b94a3")
@WinRTInterface("8108e3807f8a44e492cd03b6469b94a3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IKnownRemoteSystemCapabilitiesStatics.ByReference::class)
public interface IKnownRemoteSystemCapabilitiesStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AppService(): String?

  @InterfaceMethod(1)
  public fun get_LaunchUri(): String?

  @InterfaceMethod(2)
  public fun get_RemoteSession(): String?

  @InterfaceMethod(3)
  public fun get_SpatialEntity(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IKnownRemoteSystemCapabilitiesStatics> {
    public override fun getValue() =
        ABI.makeIKnownRemoteSystemCapabilitiesStatics(pointer.getPointer(0))

    public fun setValue(value: IKnownRemoteSystemCapabilitiesStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IKnownRemoteSystemCapabilitiesStatics {
    public val __1963068182_Ptr: Pointer?

    public val _1963068182_VtblPtr: Pointer?
      get() = __1963068182_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AppService(): String? {
      val fnPtr = _1963068182_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1963068182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_LaunchUri(): String? {
      val fnPtr = _1963068182_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1963068182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_RemoteSession(): String? {
      val fnPtr = _1963068182_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1963068182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SpatialEntity(): String? {
      val fnPtr = _1963068182_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1963068182_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IKnownRemoteSystemCapabilitiesStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1963068182_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IKnownRemoteSystemCapabilitiesStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8108e3807f8a44e492cd03b6469b94a3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIKnownRemoteSystemCapabilitiesStatics(ptr: Pointer?): WithDefault =
        IKnownRemoteSystemCapabilitiesStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IKnownRemoteSystemCapabilitiesStatics {
      val address = segment.toRawLongValue()
      return makeIKnownRemoteSystemCapabilitiesStatics(Pointer(address))
    }

    public override fun toNative(obj: IKnownRemoteSystemCapabilitiesStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1963068182_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IKnownRemoteSystemCapabilitiesStatics):
        Array<IKnownRemoteSystemCapabilitiesStatics?> = (elements as
        Array<IKnownRemoteSystemCapabilitiesStatics?>).castToImpl<IKnownRemoteSystemCapabilitiesStatics,IKnownRemoteSystemCapabilitiesStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IKnownRemoteSystemCapabilitiesStatics?> =
        arrayOfNulls<IKnownRemoteSystemCapabilitiesStatics_Impl>(size) as
        Array<IKnownRemoteSystemCapabilitiesStatics?>
  }
}
