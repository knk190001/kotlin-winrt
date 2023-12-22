package Windows.Phone.PersonalInformation.Provisioning

import Windows.Foundation.IAsyncAction
import Windows.Phone.PersonalInformation.ContactStore
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

@ABIMarker(IContactPartnerProvisioningManagerStatics2.ABI::class)
@Signature("{c26155f7-55ed-475d-9334-c5d484c30f1a}")
@Guid("c26155f755ed475d9334c5d484c30f1a")
@WinRTInterface("c26155f755ed475d9334c5d484c30f1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPartnerProvisioningManagerStatics2.ByReference::class)
public interface IContactPartnerProvisioningManagerStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun AssociateSocialNetworkAccountAsync(
    store: ContactStore?,
    networkName: String?,
    networkAccountId: String?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPartnerProvisioningManagerStatics2> {
    public override fun getValue() =
        ABI.makeIContactPartnerProvisioningManagerStatics2(pointer.getPointer(0))

    public fun setValue(value: IContactPartnerProvisioningManagerStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPartnerProvisioningManagerStatics2 {
    public val __909226582_Ptr: Pointer?

    public val _909226582_VtblPtr: Pointer?
      get() = __909226582_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun AssociateSocialNetworkAccountAsync(
      store: ContactStore?,
      networkName: String?,
      networkAccountId: String?
    ): IAsyncAction? {
      val fnPtr = _909226582_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__909226582_Ptr, marshalToNative(store),
          marshalToNative(networkName), marshalToNative(networkAccountId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IContactPartnerProvisioningManagerStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __909226582_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPartnerProvisioningManagerStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c26155f755ed475d9334c5d484c30f1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPartnerProvisioningManagerStatics2(ptr: Pointer?): WithDefault =
        IContactPartnerProvisioningManagerStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactPartnerProvisioningManagerStatics2 {
      val address = segment.toRawLongValue()
      return makeIContactPartnerProvisioningManagerStatics2(Pointer(address))
    }

    public override fun toNative(obj: IContactPartnerProvisioningManagerStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__909226582_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPartnerProvisioningManagerStatics2):
        Array<IContactPartnerProvisioningManagerStatics2?> = (elements as
        Array<IContactPartnerProvisioningManagerStatics2?>).castToImpl<IContactPartnerProvisioningManagerStatics2,IContactPartnerProvisioningManagerStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPartnerProvisioningManagerStatics2?> =
        arrayOfNulls<IContactPartnerProvisioningManagerStatics2_Impl>(size) as
        Array<IContactPartnerProvisioningManagerStatics2?>
  }
}
