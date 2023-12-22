package Windows.Devices.Sms

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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISmsSendMessageResult.ABI::class)
@Signature("{db139af2-78c9-4feb-9622-452328088d62}")
@Guid("db139af278c94feb9622452328088d62")
@WinRTInterface("db139af278c94feb9622452328088d62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISmsSendMessageResult.ByReference::class)
public interface ISmsSendMessageResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsSuccessful(): Boolean

  @InterfaceMethod(1)
  public fun get_MessageReferenceNumbers(): IVectorView<Int>?

  @InterfaceMethod(2)
  public fun get_CellularClass(): CellularClass?

  @InterfaceMethod(3)
  public fun get_ModemErrorCode(): SmsModemErrorCode?

  @InterfaceMethod(4)
  public fun get_IsErrorTransient(): Boolean

  @InterfaceMethod(5)
  public fun get_NetworkCauseCode(): Int

  @InterfaceMethod(6)
  public fun get_TransportFailureCause(): Int

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISmsSendMessageResult> {
    public override fun getValue() = ABI.makeISmsSendMessageResult(pointer.getPointer(0))

    public fun setValue(value: ISmsSendMessageResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISmsSendMessageResult {
    public val __341400433_Ptr: Pointer?

    public val _341400433_VtblPtr: Pointer?
      get() = __341400433_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsSuccessful(): Boolean {
      val fnPtr = _341400433_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__341400433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_MessageReferenceNumbers(): IVectorView<Int>? {
      val fnPtr = _341400433_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<Int>>()
      val hr = fn.invokeHR(arrayOf(__341400433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<Int>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_CellularClass(): CellularClass? {
      val fnPtr = _341400433_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CellularClass>()
      val hr = fn.invokeHR(arrayOf(__341400433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CellularClass>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ModemErrorCode(): SmsModemErrorCode? {
      val fnPtr = _341400433_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<SmsModemErrorCode>()
      val hr = fn.invokeHR(arrayOf(__341400433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<SmsModemErrorCode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsErrorTransient(): Boolean {
      val fnPtr = _341400433_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__341400433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(5)
    public override fun get_NetworkCauseCode(): Int {
      val fnPtr = _341400433_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__341400433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(6)
    public override fun get_TransportFailureCause(): Int {
      val fnPtr = _341400433_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__341400433_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }
  }

  public class ISmsSendMessageResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __341400433_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISmsSendMessageResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("db139af278c94feb9622452328088d62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISmsSendMessageResult(ptr: Pointer?): WithDefault =
        ISmsSendMessageResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISmsSendMessageResult {
      val address = segment.toRawLongValue()
      return makeISmsSendMessageResult(Pointer(address))
    }

    public override fun toNative(obj: ISmsSendMessageResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__341400433_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISmsSendMessageResult): Array<ISmsSendMessageResult?> =
        (elements as
        Array<ISmsSendMessageResult?>).castToImpl<ISmsSendMessageResult,ISmsSendMessageResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISmsSendMessageResult?> =
        arrayOfNulls<ISmsSendMessageResult_Impl>(size) as Array<ISmsSendMessageResult?>
  }
}
