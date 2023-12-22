package Windows.ApplicationModel.Calls.Background

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

@ABIMarker(IPhoneCallOriginDataRequestTriggerDetails.ABI::class)
@Signature("{6e9b5b3f-c54b-4e82-4cc9-e329a4184592}")
@Guid("6e9b5b3fc54b4e824cc9e329a4184592")
@WinRTInterface("6e9b5b3fc54b4e824cc9e329a4184592")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneCallOriginDataRequestTriggerDetails.ByReference::class)
public interface IPhoneCallOriginDataRequestTriggerDetails : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RequestId(): com.sun.jna.platform.win32.Guid.GUID?

  @InterfaceMethod(1)
  public fun get_PhoneNumber(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneCallOriginDataRequestTriggerDetails> {
    public override fun getValue() =
        ABI.makeIPhoneCallOriginDataRequestTriggerDetails(pointer.getPointer(0))

    public fun setValue(value: IPhoneCallOriginDataRequestTriggerDetails_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneCallOriginDataRequestTriggerDetails {
    public val __728649717_Ptr: Pointer?

    public val _728649717_VtblPtr: Pointer?
      get() = __728649717_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RequestId(): com.sun.jna.platform.win32.Guid.GUID? {
      val fnPtr = _728649717_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<com.sun.jna.platform.win32.Guid.GUID>()
      val hr = fn.invokeHR(arrayOf(__728649717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<com.sun.jna.platform.win32.Guid.GUID>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PhoneNumber(): String? {
      val fnPtr = _728649717_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__728649717_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IPhoneCallOriginDataRequestTriggerDetails_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __728649717_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneCallOriginDataRequestTriggerDetails, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6e9b5b3fc54b4e824cc9e329a4184592")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneCallOriginDataRequestTriggerDetails(ptr: Pointer?): WithDefault =
        IPhoneCallOriginDataRequestTriggerDetails_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IPhoneCallOriginDataRequestTriggerDetails {
      val address = segment.toRawLongValue()
      return makeIPhoneCallOriginDataRequestTriggerDetails(Pointer(address))
    }

    public override fun toNative(obj: IPhoneCallOriginDataRequestTriggerDetails): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__728649717_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneCallOriginDataRequestTriggerDetails):
        Array<IPhoneCallOriginDataRequestTriggerDetails?> = (elements as
        Array<IPhoneCallOriginDataRequestTriggerDetails?>).castToImpl<IPhoneCallOriginDataRequestTriggerDetails,IPhoneCallOriginDataRequestTriggerDetails_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneCallOriginDataRequestTriggerDetails?> =
        arrayOfNulls<IPhoneCallOriginDataRequestTriggerDetails_Impl>(size) as
        Array<IPhoneCallOriginDataRequestTriggerDetails?>
  }
}
