package Windows.Networking.NetworkOperators

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IMobileBroadbandAccountStatics.ABI::class)
@Signature("{aa7f4d24-afc1-4fc8-ae9a-a9175310faad}")
@Guid("aa7f4d24afc14fc8ae9aa9175310faad")
@WinRTInterface("aa7f4d24afc14fc8ae9aa9175310faad")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMobileBroadbandAccountStatics.ByReference::class)
public interface IMobileBroadbandAccountStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_AvailableNetworkAccountIds(): IVectorView<String?>?

  @InterfaceMethod(1)
  public fun CreateFromNetworkAccountId(networkAccountId: String?): MobileBroadbandAccount?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMobileBroadbandAccountStatics> {
    public override fun getValue() = ABI.makeIMobileBroadbandAccountStatics(pointer.getPointer(0))

    public fun setValue(value: IMobileBroadbandAccountStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMobileBroadbandAccountStatics {
    public val __653390356_Ptr: Pointer?

    public val _653390356_VtblPtr: Pointer?
      get() = __653390356_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_AvailableNetworkAccountIds(): IVectorView<String?>? {
      val fnPtr = _653390356_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<String?>>()
      val hr = fn.invokeHR(arrayOf(__653390356_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateFromNetworkAccountId(networkAccountId: String?):
        MobileBroadbandAccount? {
      val fnPtr = _653390356_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MobileBroadbandAccount>()
      val hr = fn.invokeHR(arrayOf(__653390356_Ptr, marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MobileBroadbandAccount>(result.getValue())
      return resultValue
    }
  }

  public class IMobileBroadbandAccountStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __653390356_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMobileBroadbandAccountStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aa7f4d24afc14fc8ae9aa9175310faad")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMobileBroadbandAccountStatics(ptr: Pointer?): WithDefault =
        IMobileBroadbandAccountStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMobileBroadbandAccountStatics {
      val address = segment.toRawLongValue()
      return makeIMobileBroadbandAccountStatics(Pointer(address))
    }

    public override fun toNative(obj: IMobileBroadbandAccountStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__653390356_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMobileBroadbandAccountStatics):
        Array<IMobileBroadbandAccountStatics?> = (elements as
        Array<IMobileBroadbandAccountStatics?>).castToImpl<IMobileBroadbandAccountStatics,IMobileBroadbandAccountStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMobileBroadbandAccountStatics?> =
        arrayOfNulls<IMobileBroadbandAccountStatics_Impl>(size) as
        Array<IMobileBroadbandAccountStatics?>
  }
}
