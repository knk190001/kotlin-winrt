package Windows.ApplicationModel.Chat

import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.IAsyncAction
import Windows.Foundation.IAsyncOperation
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

@ABIMarker(IRcsManagerStatics.ABI::class)
@Signature("{7d270ac5-0abd-4f31-9b99-a59e71a7b731}")
@Guid("7d270ac50abd4f319b99a59e71a7b731")
@WinRTInterface("7d270ac50abd4f319b99a59e71a7b731")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IRcsManagerStatics.ByReference::class)
public interface IRcsManagerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetEndUserMessageManager(): RcsEndUserMessageManager?

  @InterfaceMethod(1)
  public fun GetTransportsAsync(): IAsyncOperation<IVectorView<RcsTransport?>?>?

  @InterfaceMethod(2)
  public fun GetTransportAsync(transportId: String?): IAsyncOperation<RcsTransport?>?

  @InterfaceMethod(3)
  public fun LeaveConversationAsync(conversation: ChatConversation?): IAsyncAction?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IRcsManagerStatics> {
    public override fun getValue() = ABI.makeIRcsManagerStatics(pointer.getPointer(0))

    public fun setValue(value: IRcsManagerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IRcsManagerStatics {
    public val __282440269_Ptr: Pointer?

    public val _282440269_VtblPtr: Pointer?
      get() = __282440269_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetEndUserMessageManager(): RcsEndUserMessageManager? {
      val fnPtr = _282440269_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<RcsEndUserMessageManager>()
      val hr = fn.invokeHR(arrayOf(__282440269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<RcsEndUserMessageManager>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetTransportsAsync(): IAsyncOperation<IVectorView<RcsTransport?>?>? {
      val fnPtr = _282440269_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<IVectorView<RcsTransport?>?>>()
      val hr = fn.invokeHR(arrayOf(__282440269_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IAsyncOperation<IVectorView<RcsTransport?>?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun GetTransportAsync(transportId: String?): IAsyncOperation<RcsTransport?>? {
      val fnPtr = _282440269_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<RcsTransport?>>()
      val hr = fn.invokeHR(arrayOf(__282440269_Ptr, marshalToNative(transportId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<RcsTransport?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun LeaveConversationAsync(conversation: ChatConversation?): IAsyncAction? {
      val fnPtr = _282440269_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncAction>()
      val hr = fn.invokeHR(arrayOf(__282440269_Ptr, marshalToNative(conversation), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncAction>(result.getValue())
      return resultValue
    }
  }

  public class IRcsManagerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __282440269_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IRcsManagerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7d270ac50abd4f319b99a59e71a7b731")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIRcsManagerStatics(ptr: Pointer?): WithDefault = IRcsManagerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IRcsManagerStatics {
      val address = segment.toRawLongValue()
      return makeIRcsManagerStatics(Pointer(address))
    }

    public override fun toNative(obj: IRcsManagerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__282440269_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IRcsManagerStatics): Array<IRcsManagerStatics?> =
        (elements as
        Array<IRcsManagerStatics?>).castToImpl<IRcsManagerStatics,IRcsManagerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IRcsManagerStatics?> =
        arrayOfNulls<IRcsManagerStatics_Impl>(size) as Array<IRcsManagerStatics?>
  }
}
