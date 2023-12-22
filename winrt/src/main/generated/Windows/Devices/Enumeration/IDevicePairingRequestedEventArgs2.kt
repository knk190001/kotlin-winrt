package Windows.Devices.Enumeration

import Windows.Security.Credentials.PasswordCredential
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

@ABIMarker(IDevicePairingRequestedEventArgs2.ABI::class)
@Signature("{c83752d9-e4d3-4db0-a360-a105e437dbdc}")
@Guid("c83752d9e4d34db0a360a105e437dbdc")
@WinRTInterface("c83752d9e4d34db0a360a105e437dbdc")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDevicePairingRequestedEventArgs2.ByReference::class)
public interface IDevicePairingRequestedEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AcceptWithPasswordCredential(passwordCredential: PasswordCredential?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDevicePairingRequestedEventArgs2> {
    public override fun getValue() =
        ABI.makeIDevicePairingRequestedEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IDevicePairingRequestedEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDevicePairingRequestedEventArgs2 {
    public val __1970272501_Ptr: Pointer?

    public val _1970272501_VtblPtr: Pointer?
      get() = __1970272501_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AcceptWithPasswordCredential(passwordCredential: PasswordCredential?):
        Unit {
      val fnPtr = _1970272501_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1970272501_Ptr, marshalToNative(passwordCredential),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDevicePairingRequestedEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1970272501_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDevicePairingRequestedEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c83752d9e4d34db0a360a105e437dbdc")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDevicePairingRequestedEventArgs2(ptr: Pointer?): WithDefault =
        IDevicePairingRequestedEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDevicePairingRequestedEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIDevicePairingRequestedEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IDevicePairingRequestedEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1970272501_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDevicePairingRequestedEventArgs2):
        Array<IDevicePairingRequestedEventArgs2?> = (elements as
        Array<IDevicePairingRequestedEventArgs2?>).castToImpl<IDevicePairingRequestedEventArgs2,IDevicePairingRequestedEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDevicePairingRequestedEventArgs2?> =
        arrayOfNulls<IDevicePairingRequestedEventArgs2_Impl>(size) as
        Array<IDevicePairingRequestedEventArgs2?>
  }
}
