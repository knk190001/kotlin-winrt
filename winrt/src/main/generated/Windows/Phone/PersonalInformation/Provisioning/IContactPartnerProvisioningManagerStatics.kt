package Windows.Phone.PersonalInformation.Provisioning

import Windows.Foundation.IAsyncAction
import Windows.Phone.PersonalInformation.ContactStore
import Windows.Storage.Streams.IInputStream
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

@ABIMarker(IContactPartnerProvisioningManagerStatics.ABI::class)
@Signature("{c0d79a21-01af-4fd3-98cd-b3d656de15f4}")
@Guid("c0d79a2101af4fd398cdb3d656de15f4")
@WinRTInterface("c0d79a2101af4fd398cdb3d656de15f4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPartnerProvisioningManagerStatics.ByReference::class)
public interface IContactPartnerProvisioningManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AssociateNetworkAccountAsync(
    store: ContactStore?,
    networkName: String?,
    networkAccountId: String?
  ): IAsyncAction?

  @InterfaceMethod(1)
  public fun ImportVcardToSystemAsync(stream: IInputStream?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPartnerProvisioningManagerStatics> {
    public override fun getValue() =
        ABI.makeIContactPartnerProvisioningManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IContactPartnerProvisioningManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPartnerProvisioningManagerStatics {
    public val __109217444_Ptr: Pointer?

    public val _109217444_VtblPtr: Pointer?
      get() = __109217444_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AssociateNetworkAccountAsync(
      store: ContactStore?,
      networkName: String?,
      networkAccountId: String?
    ): IAsyncAction? {
      val fnPtr = _109217444_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__109217444_Ptr, marshalToNative(store),
          marshalToNative(networkName), marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ImportVcardToSystemAsync(stream: IInputStream?): IAsyncAction? {
      val fnPtr = _109217444_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__109217444_Ptr, marshalToNative(stream), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactPartnerProvisioningManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __109217444_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPartnerProvisioningManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c0d79a2101af4fd398cdb3d656de15f4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPartnerProvisioningManagerStatics(ptr: Pointer?): WithDefault =
        IContactPartnerProvisioningManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactPartnerProvisioningManagerStatics {
      val address = segment.toRawLongValue()
      return makeIContactPartnerProvisioningManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IContactPartnerProvisioningManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__109217444_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPartnerProvisioningManagerStatics):
        Array<IContactPartnerProvisioningManagerStatics?> = (elements as
        Array<IContactPartnerProvisioningManagerStatics?>).castToImpl<IContactPartnerProvisioningManagerStatics,IContactPartnerProvisioningManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPartnerProvisioningManagerStatics?> =
        arrayOfNulls<IContactPartnerProvisioningManagerStatics_Impl>(size) as
        Array<IContactPartnerProvisioningManagerStatics?>
  }
}
