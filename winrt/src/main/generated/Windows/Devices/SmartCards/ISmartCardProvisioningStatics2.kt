package Windows.Devices.SmartCards

import Windows.Foundation.IAsyncOperation
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(ISmartCardProvisioningStatics2.ABI::class)
@Signature("{3447c6a8-c9a0-4bd6-b50d-251f4e8d3a62}")
@Guid("3447c6a8c9a04bd6b50d251f4e8d3a62")
@WinRTInterface("3447c6a8c9a04bd6b50d251f4e8d3a62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardProvisioningStatics2.ByReference::class)
public interface ISmartCardProvisioningStatics2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RequestAttestedVirtualSmartCardCreationAsync(
    friendlyName: String?,
    administrativeKey: IBuffer?,
    pinPolicy: SmartCardPinPolicy?
  ): IAsyncOperation<SmartCardProvisioning?>?

  @InterfaceMethod(1)
  public fun RequestAttestedVirtualSmartCardCreationAsync(
    friendlyName: String?,
    administrativeKey: IBuffer?,
    pinPolicy: SmartCardPinPolicy?,
    cardId: com.sun.jna.platform.win32.Guid.GUID?
  ): IAsyncOperation<SmartCardProvisioning?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardProvisioningStatics2> {
    public override fun getValue() = ABI.makeISmartCardProvisioningStatics2(pointer.getPointer(0))

    public fun setValue(value: ISmartCardProvisioningStatics2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardProvisioningStatics2 {
    public val __2009250144_Ptr: Pointer?

    public val _2009250144_VtblPtr: Pointer?
      get() = __2009250144_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RequestAttestedVirtualSmartCardCreationAsync(
      friendlyName: String?,
      administrativeKey: IBuffer?,
      pinPolicy: SmartCardPinPolicy?
    ): IAsyncOperation<SmartCardProvisioning?>? {
      val fnPtr = _2009250144_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardProvisioning?>>()
      val hr = fn.invokeHR(arrayOf(__2009250144_Ptr, marshalToNative(friendlyName),
          marshalToNative(administrativeKey), marshalToNative(pinPolicy), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardProvisioning?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestAttestedVirtualSmartCardCreationAsync(
      friendlyName: String?,
      administrativeKey: IBuffer?,
      pinPolicy: SmartCardPinPolicy?,
      cardId: com.sun.jna.platform.win32.Guid.GUID?
    ): IAsyncOperation<SmartCardProvisioning?>? {
      val fnPtr = _2009250144_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardProvisioning?>>()
      val hr = fn.invokeHR(arrayOf(__2009250144_Ptr, marshalToNative(friendlyName),
          marshalToNative(administrativeKey), marshalToNative(pinPolicy), marshalToNative(cardId),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardProvisioning?>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardProvisioningStatics2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2009250144_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardProvisioningStatics2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3447c6a8c9a04bd6b50d251f4e8d3a62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardProvisioningStatics2(ptr: Pointer?): WithDefault =
        ISmartCardProvisioningStatics2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardProvisioningStatics2 {
      val address = segment.toRawLongValue()
      return makeISmartCardProvisioningStatics2(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardProvisioningStatics2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2009250144_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardProvisioningStatics2):
        Array<ISmartCardProvisioningStatics2?> = (elements as
        Array<ISmartCardProvisioningStatics2?>).castToImpl<ISmartCardProvisioningStatics2,ISmartCardProvisioningStatics2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardProvisioningStatics2?> =
        arrayOfNulls<ISmartCardProvisioningStatics2_Impl>(size) as
        Array<ISmartCardProvisioningStatics2?>
  }
}
