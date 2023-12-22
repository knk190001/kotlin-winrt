package Windows.Devices.Sms

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.IAsyncOperationWithProgress
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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(ISmsDeviceMessageStore.ABI::class)
@Signature("{9889f253-f188-4427-8d54-ce0c2423c5c1}")
@Guid("9889f253f18844278d54ce0c2423c5c1")
@WinRTInterface("9889f253f18844278d54ce0c2423c5c1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsDeviceMessageStore.ByReference::class)
public interface ISmsDeviceMessageStore : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun DeleteMessageAsync(messageId: WinDef.UINT): IAsyncAction?

  @InterfaceMethod(1)
  public fun DeleteMessagesAsync(messageFilter: SmsMessageFilter?): IAsyncAction?

  @InterfaceMethod(2)
  public fun GetMessageAsync(messageId: WinDef.UINT): IAsyncOperation<ISmsMessage?>?

  @InterfaceMethod(3)
  public fun GetMessagesAsync(messageFilter: SmsMessageFilter?):
      IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?, Int>?

  @InterfaceMethod(4)
  public fun get_MaxMessages(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsDeviceMessageStore> {
    public override fun getValue() = ABI.makeISmsDeviceMessageStore(pointer.getPointer(0))

    public fun setValue(value: ISmsDeviceMessageStore_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsDeviceMessageStore {
    public val __928864067_Ptr: Pointer?

    public val _928864067_VtblPtr: Pointer?
      get() = __928864067_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun DeleteMessageAsync(messageId: WinDef.UINT): IAsyncAction? {
      val fnPtr = _928864067_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__928864067_Ptr, messageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun DeleteMessagesAsync(messageFilter: SmsMessageFilter?): IAsyncAction? {
      val fnPtr = _928864067_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__928864067_Ptr, marshalToNative(messageFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetMessageAsync(messageId: WinDef.UINT): IAsyncOperation<ISmsMessage?>? {
      val fnPtr = _928864067_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<ISmsMessage?>>()
      val hr = fn.invokeHR(arrayOf(__928864067_Ptr, messageId, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<ISmsMessage?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetMessagesAsync(messageFilter: SmsMessageFilter?):
        IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?, Int>? {
      val fnPtr = _928864067_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?,
          Int>>()
      val hr = fn.invokeHR(arrayOf(__928864067_Ptr, marshalToNative(messageFilter), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperationWithProgress<IVectorView<ISmsMessage?>?,
          Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MaxMessages(): WinDef.UINT {
      val fnPtr = _928864067_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__928864067_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmsDeviceMessageStore_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __928864067_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsDeviceMessageStore, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9889f253f18844278d54ce0c2423c5c1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsDeviceMessageStore(ptr: Pointer?): WithDefault =
        ISmsDeviceMessageStore_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsDeviceMessageStore {
      val address = segment.toRawLongValue()
      return makeISmsDeviceMessageStore(Pointer(address))
    }

    public override fun toNative(obj: ISmsDeviceMessageStore): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__928864067_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsDeviceMessageStore): Array<ISmsDeviceMessageStore?> =
        (elements as
        Array<ISmsDeviceMessageStore?>).castToImpl<ISmsDeviceMessageStore,ISmsDeviceMessageStore_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsDeviceMessageStore?> =
        arrayOfNulls<ISmsDeviceMessageStore_Impl>(size) as Array<ISmsDeviceMessageStore?>
  }
}
