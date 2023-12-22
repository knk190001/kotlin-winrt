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
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmartCardProvisioningStatics.ABI::class)
@Signature("{13882848-0d13-4e70-9735-51daeca5254f}")
@Guid("138828480d134e70973551daeca5254f")
@WinRTInterface("138828480d134e70973551daeca5254f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardProvisioningStatics.ByReference::class)
public interface ISmartCardProvisioningStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromSmartCardAsync(card: SmartCard?): IAsyncOperation<SmartCardProvisioning?>?

  @InterfaceMethod(1)
  public fun RequestVirtualSmartCardCreationAsync(
    friendlyName: String?,
    administrativeKey: IBuffer?,
    pinPolicy: SmartCardPinPolicy?
  ): IAsyncOperation<SmartCardProvisioning?>?

  @InterfaceMethod(2)
  public fun RequestVirtualSmartCardCreationAsync(
    friendlyName: String?,
    administrativeKey: IBuffer?,
    pinPolicy: SmartCardPinPolicy?,
    cardId: com.sun.jna.platform.win32.Guid.GUID?
  ): IAsyncOperation<SmartCardProvisioning?>?

  @InterfaceMethod(3)
  public fun RequestVirtualSmartCardDeletionAsync(card: SmartCard?): IAsyncOperation<Boolean>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardProvisioningStatics> {
    public override fun getValue() = ABI.makeISmartCardProvisioningStatics(pointer.getPointer(0))

    public fun setValue(value: ISmartCardProvisioningStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardProvisioningStatics {
    public val __1182111470_Ptr: Pointer?

    public val _1182111470_VtblPtr: Pointer?
      get() = __1182111470_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromSmartCardAsync(card: SmartCard?):
        IAsyncOperation<SmartCardProvisioning?>? {
      val fnPtr = _1182111470_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardProvisioning?>>()
      val hr = fn.invokeHR(arrayOf(__1182111470_Ptr, marshalToNative(card), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardProvisioning?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun RequestVirtualSmartCardCreationAsync(
      friendlyName: String?,
      administrativeKey: IBuffer?,
      pinPolicy: SmartCardPinPolicy?
    ): IAsyncOperation<SmartCardProvisioning?>? {
      val fnPtr = _1182111470_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardProvisioning?>>()
      val hr = fn.invokeHR(arrayOf(__1182111470_Ptr, marshalToNative(friendlyName),
          marshalToNative(administrativeKey), marshalToNative(pinPolicy), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardProvisioning?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun RequestVirtualSmartCardCreationAsync(
      friendlyName: String?,
      administrativeKey: IBuffer?,
      pinPolicy: SmartCardPinPolicy?,
      cardId: com.sun.jna.platform.win32.Guid.GUID?
    ): IAsyncOperation<SmartCardProvisioning?>? {
      val fnPtr = _1182111470_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardProvisioning?>>()
      val hr = fn.invokeHR(arrayOf(__1182111470_Ptr, marshalToNative(friendlyName),
          marshalToNative(administrativeKey), marshalToNative(pinPolicy), marshalToNative(cardId),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardProvisioning?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun RequestVirtualSmartCardDeletionAsync(card: SmartCard?):
        IAsyncOperation<Boolean>? {
      val fnPtr = _1182111470_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1182111470_Ptr, marshalToNative(card), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }
  }

  public class ISmartCardProvisioningStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1182111470_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardProvisioningStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("138828480d134e70973551daeca5254f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardProvisioningStatics(ptr: Pointer?): WithDefault =
        ISmartCardProvisioningStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardProvisioningStatics {
      val address = segment.toRawLongValue()
      return makeISmartCardProvisioningStatics(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardProvisioningStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1182111470_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardProvisioningStatics):
        Array<ISmartCardProvisioningStatics?> = (elements as
        Array<ISmartCardProvisioningStatics?>).castToImpl<ISmartCardProvisioningStatics,ISmartCardProvisioningStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardProvisioningStatics?> =
        arrayOfNulls<ISmartCardProvisioningStatics_Impl>(size) as
        Array<ISmartCardProvisioningStatics?>
  }
}
