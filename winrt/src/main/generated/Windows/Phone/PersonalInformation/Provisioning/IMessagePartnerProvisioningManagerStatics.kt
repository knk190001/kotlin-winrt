package Windows.Phone.PersonalInformation.Provisioning

import Windows.Foundation.Collections.IMapView
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.IAsyncAction
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMessagePartnerProvisioningManagerStatics.ABI::class)
@Signature("{8a1b0850-73c5-457c-bc59-ed7d615c05a4}")
@Guid("8a1b085073c5457cbc59ed7d615c05a4")
@WinRTInterface("8a1b085073c5457cbc59ed7d615c05a4")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMessagePartnerProvisioningManagerStatics.ByReference::class)
public interface IMessagePartnerProvisioningManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ImportSmsToSystemAsync(
    incoming: Boolean,
    read: Boolean,
    body: String?,
    sender: String?,
    recipients: IVectorView<String?>?,
    deliveryTime: DateTime?
  ): IAsyncAction?

  @InterfaceMethod(1)
  public fun ImportMmsToSystemAsync(
    incoming: Boolean,
    read: Boolean,
    subject: String?,
    sender: String?,
    recipients: IVectorView<String?>?,
    deliveryTime: DateTime?,
    attachments: IVectorView<IMapView<String?, IUnknown?>?>?
  ): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMessagePartnerProvisioningManagerStatics> {
    public override fun getValue() =
        ABI.makeIMessagePartnerProvisioningManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IMessagePartnerProvisioningManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMessagePartnerProvisioningManagerStatics {
    public val __1612379733_Ptr: Pointer?

    public val _1612379733_VtblPtr: Pointer?
      get() = __1612379733_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ImportSmsToSystemAsync(
      incoming: Boolean,
      read: Boolean,
      body: String?,
      sender: String?,
      recipients: IVectorView<String?>?,
      deliveryTime: DateTime?
    ): IAsyncAction? {
      val fnPtr = _1612379733_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1612379733_Ptr, incoming, read, marshalToNative(body),
          marshalToNative(sender), marshalToNative(recipients), marshalToNative(deliveryTime),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun ImportMmsToSystemAsync(
      incoming: Boolean,
      read: Boolean,
      subject: String?,
      sender: String?,
      recipients: IVectorView<String?>?,
      deliveryTime: DateTime?,
      attachments: IVectorView<IMapView<String?, IUnknown?>?>?
    ): IAsyncAction? {
      val fnPtr = _1612379733_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__1612379733_Ptr, incoming, read, marshalToNative(subject),
          marshalToNative(sender), marshalToNative(recipients), marshalToNative(deliveryTime),
          marshalToNative(attachments), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IMessagePartnerProvisioningManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1612379733_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMessagePartnerProvisioningManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8a1b085073c5457cbc59ed7d615c05a4")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMessagePartnerProvisioningManagerStatics(ptr: Pointer?): WithDefault =
        IMessagePartnerProvisioningManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMessagePartnerProvisioningManagerStatics {
      val address = segment.toRawLongValue()
      return makeIMessagePartnerProvisioningManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IMessagePartnerProvisioningManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1612379733_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMessagePartnerProvisioningManagerStatics):
        Array<IMessagePartnerProvisioningManagerStatics?> = (elements as
        Array<IMessagePartnerProvisioningManagerStatics?>).castToImpl<IMessagePartnerProvisioningManagerStatics,IMessagePartnerProvisioningManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMessagePartnerProvisioningManagerStatics?> =
        arrayOfNulls<IMessagePartnerProvisioningManagerStatics_Impl>(size) as
        Array<IMessagePartnerProvisioningManagerStatics?>
  }
}
