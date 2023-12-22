package Windows.Security.DataProtection

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
import Windows.Storage.IStorageItem
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IUserDataProtectionManager.ABI::class)
@Signature("{1f13237d-b42e-4a88-9480-0f240924c876}")
@Guid("1f13237db42e4a8894800f240924c876")
@WinRTInterface("1f13237db42e4a8894800f240924c876")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUserDataProtectionManager.ByReference::class)
public interface IUserDataProtectionManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ProtectStorageItemAsync(storageItem: IStorageItem?,
      availability: UserDataAvailability?): IAsyncOperation<UserDataStorageItemProtectionStatus?>?

  @InterfaceMethod(1)
  public fun GetStorageItemProtectionInfoAsync(storageItem: IStorageItem?):
      IAsyncOperation<UserDataStorageItemProtectionInfo?>?

  @InterfaceMethod(2)
  public fun ProtectBufferAsync(unprotectedBuffer: IBuffer?, availability: UserDataAvailability?):
      IAsyncOperation<IBuffer?>?

  @InterfaceMethod(3)
  public fun UnprotectBufferAsync(protectedBuffer: IBuffer?):
      IAsyncOperation<UserDataBufferUnprotectResult?>?

  @InterfaceMethod(4)
  public fun IsContinuedDataAvailabilityExpected(availability: UserDataAvailability?): Boolean

  @InterfaceMethod(5)
  public fun add_DataAvailabilityStateChanged(handler: TypedEventHandler<UserDataProtectionManager?,
      UserDataAvailabilityStateChangedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_DataAvailabilityStateChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUserDataProtectionManager> {
    public override fun getValue() = ABI.makeIUserDataProtectionManager(pointer.getPointer(0))

    public fun setValue(value: IUserDataProtectionManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUserDataProtectionManager {
    public val __1042337084_Ptr: Pointer?

    public val _1042337084_VtblPtr: Pointer?
      get() = __1042337084_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ProtectStorageItemAsync(storageItem: IStorageItem?,
        availability: UserDataAvailability?):
        IAsyncOperation<UserDataStorageItemProtectionStatus?>? {
      val fnPtr = _1042337084_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataStorageItemProtectionStatus?>>()
      val hr = fn.invokeHR(arrayOf(__1042337084_Ptr, marshalToNative(storageItem),
          marshalToNative(availability), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UserDataStorageItemProtectionStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetStorageItemProtectionInfoAsync(storageItem: IStorageItem?):
        IAsyncOperation<UserDataStorageItemProtectionInfo?>? {
      val fnPtr = _1042337084_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataStorageItemProtectionInfo?>>()
      val hr = fn.invokeHR(arrayOf(__1042337084_Ptr, marshalToNative(storageItem), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UserDataStorageItemProtectionInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ProtectBufferAsync(unprotectedBuffer: IBuffer?,
        availability: UserDataAvailability?): IAsyncOperation<IBuffer?>? {
      val fnPtr = _1042337084_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IBuffer?>>()
      val hr = fn.invokeHR(arrayOf(__1042337084_Ptr, marshalToNative(unprotectedBuffer),
          marshalToNative(availability), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<IBuffer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun UnprotectBufferAsync(protectedBuffer: IBuffer?):
        IAsyncOperation<UserDataBufferUnprotectResult?>? {
      val fnPtr = _1042337084_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<UserDataBufferUnprotectResult?>>()
      val hr = fn.invokeHR(arrayOf(__1042337084_Ptr, marshalToNative(protectedBuffer), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<UserDataBufferUnprotectResult?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun IsContinuedDataAvailabilityExpected(availability: UserDataAvailability?):
        Boolean {
      val fnPtr = _1042337084_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1042337084_Ptr, marshalToNative(availability), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override
        fun add_DataAvailabilityStateChanged(handler: TypedEventHandler<UserDataProtectionManager?,
        UserDataAvailabilityStateChangedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1042337084_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1042337084_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_DataAvailabilityStateChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1042337084_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1042337084_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IUserDataProtectionManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1042337084_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUserDataProtectionManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f13237db42e4a8894800f240924c876")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUserDataProtectionManager(ptr: Pointer?): WithDefault =
        IUserDataProtectionManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUserDataProtectionManager {
      val address = segment.toRawLongValue()
      return makeIUserDataProtectionManager(Pointer(address))
    }

    public override fun toNative(obj: IUserDataProtectionManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1042337084_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUserDataProtectionManager):
        Array<IUserDataProtectionManager?> = (elements as
        Array<IUserDataProtectionManager?>).castToImpl<IUserDataProtectionManager,IUserDataProtectionManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUserDataProtectionManager?> =
        arrayOfNulls<IUserDataProtectionManager_Impl>(size) as Array<IUserDataProtectionManager?>
  }
}
