package Windows.Devices.SmartCards

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IAsyncOperation
import Windows.Foundation.TypedEventHandler
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

@ABIMarker(ISmartCardReader.ABI::class)
@Signature("{1074b4e0-54c2-4df0-817a-14c14378f06c}")
@Guid("1074b4e054c24df0817a14c14378f06c")
@WinRTInterface("1074b4e054c24df0817a14c14378f06c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmartCardReader.ByReference::class)
public interface ISmartCardReader : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DeviceId(): String?

  @InterfaceMethod(1)
  public fun get_Name(): String?

  @InterfaceMethod(2)
  public fun get_Kind(): SmartCardReaderKind?

  @InterfaceMethod(3)
  public fun GetStatusAsync(): IAsyncOperation<SmartCardReaderStatus?>?

  @InterfaceMethod(4)
  public fun FindAllCardsAsync(): IAsyncOperation<IVectorView<SmartCard?>?>?

  @InterfaceMethod(5)
  public fun add_CardAdded(handler: TypedEventHandler<SmartCardReader?, CardAddedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_CardAdded(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun add_CardRemoved(handler: TypedEventHandler<SmartCardReader?, CardRemovedEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(8)
  public fun remove_CardRemoved(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmartCardReader> {
    public override fun getValue() = ABI.makeISmartCardReader(pointer.getPointer(0))

    public fun setValue(value: ISmartCardReader_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmartCardReader {
    public val __68226679_Ptr: Pointer?

    public val _68226679_VtblPtr: Pointer?
      get() = __68226679_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DeviceId(): String? {
      val fnPtr = _68226679_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Name(): String? {
      val fnPtr = _68226679_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Kind(): SmartCardReaderKind? {
      val fnPtr = _68226679_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmartCardReaderKind>()
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmartCardReaderKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun GetStatusAsync(): IAsyncOperation<SmartCardReaderStatus?>? {
      val fnPtr = _68226679_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<SmartCardReaderStatus?>>()
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<SmartCardReaderStatus?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun FindAllCardsAsync(): IAsyncOperation<IVectorView<SmartCard?>?>? {
      val fnPtr = _68226679_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<SmartCard?>?>>()
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<SmartCard?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun add_CardAdded(handler: TypedEventHandler<SmartCardReader?,
        CardAddedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _68226679_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_CardAdded(token: EventRegistrationToken?): Unit {
      val fnPtr = _68226679_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun add_CardRemoved(handler: TypedEventHandler<SmartCardReader?,
        CardRemovedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _68226679_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun remove_CardRemoved(token: EventRegistrationToken?): Unit {
      val fnPtr = _68226679_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__68226679_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISmartCardReader_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __68226679_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmartCardReader, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1074b4e054c24df0817a14c14378f06c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmartCardReader(ptr: Pointer?): WithDefault = ISmartCardReader_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmartCardReader {
      val address = segment.toRawLongValue()
      return makeISmartCardReader(Pointer(address))
    }

    public override fun toNative(obj: ISmartCardReader): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__68226679_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmartCardReader): Array<ISmartCardReader?> = (elements as
        Array<ISmartCardReader?>).castToImpl<ISmartCardReader,ISmartCardReader_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmartCardReader?> =
        arrayOfNulls<ISmartCardReader_Impl>(size) as Array<ISmartCardReader?>
  }
}
