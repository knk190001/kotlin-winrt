package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
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

@ABIMarker(IRcsEndUserMessage.ABI::class)
@Signature("{d7cda5eb-cbd7-4f3b-8526-b506dec35c53}")
@Guid("d7cda5ebcbd74f3b8526b506dec35c53")
@WinRTInterface("d7cda5ebcbd74f3b8526b506dec35c53")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsEndUserMessage.ByReference::class)
public interface IRcsEndUserMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TransportId(): String?

  @InterfaceMethod(1)
  public fun get_Title(): String?

  @InterfaceMethod(2)
  public fun get_Text(): String?

  @InterfaceMethod(3)
  public fun get_IsPinRequired(): Boolean

  @InterfaceMethod(4)
  public fun get_Actions(): IVectorView<RcsEndUserMessageAction?>?

  @InterfaceMethod(5)
  public fun SendResponseAsync(action: RcsEndUserMessageAction?): IAsyncAction?

  @InterfaceMethod(6)
  public fun SendResponseWithPinAsync(action: RcsEndUserMessageAction?, pin: String?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsEndUserMessage> {
    public override fun getValue() = ABI.makeIRcsEndUserMessage(pointer.getPointer(0))

    public fun setValue(value: IRcsEndUserMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsEndUserMessage {
    public val __760558532_Ptr: Pointer?

    public val _760558532_VtblPtr: Pointer?
      get() = __760558532_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TransportId(): String? {
      val fnPtr = _760558532_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__760558532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Title(): String? {
      val fnPtr = _760558532_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__760558532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Text(): String? {
      val fnPtr = _760558532_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__760558532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsPinRequired(): Boolean {
      val fnPtr = _760558532_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__760558532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun get_Actions(): IVectorView<RcsEndUserMessageAction?>? {
      val fnPtr = _760558532_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<RcsEndUserMessageAction?>>()
      val hr = fn.invokeHR(arrayOf(__760558532_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<RcsEndUserMessageAction?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun SendResponseAsync(action: RcsEndUserMessageAction?): IAsyncAction? {
      val fnPtr = _760558532_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__760558532_Ptr, marshalToNative(action), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun SendResponseWithPinAsync(action: RcsEndUserMessageAction?, pin: String?):
        IAsyncAction? {
      val fnPtr = _760558532_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__760558532_Ptr, marshalToNative(action), marshalToNative(pin),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IRcsEndUserMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __760558532_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsEndUserMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d7cda5ebcbd74f3b8526b506dec35c53")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsEndUserMessage(ptr: Pointer?): WithDefault = IRcsEndUserMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsEndUserMessage {
      val address = segment.toRawLongValue()
      return makeIRcsEndUserMessage(Pointer(address))
    }

    public override fun toNative(obj: IRcsEndUserMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__760558532_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsEndUserMessage): Array<IRcsEndUserMessage?> =
        (elements as
        Array<IRcsEndUserMessage?>).castToImpl<IRcsEndUserMessage,IRcsEndUserMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsEndUserMessage?> =
        arrayOfNulls<IRcsEndUserMessage_Impl>(size) as Array<IRcsEndUserMessage?>
  }
}
