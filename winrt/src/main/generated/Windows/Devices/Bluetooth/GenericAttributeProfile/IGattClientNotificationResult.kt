package Windows.Devices.Bluetooth.GenericAttributeProfile

import Windows.Foundation.IReference
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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IGattClientNotificationResult.ABI::class)
@Signature("{506d5599-0112-419a-8e3b-ae21afabd2c2}")
@Guid("506d55990112419a8e3bae21afabd2c2")
@WinRTInterface("506d55990112419a8e3bae21afabd2c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IGattClientNotificationResult.ByReference::class)
public interface IGattClientNotificationResult : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_SubscribedClient(): GattSubscribedClient?

  @InterfaceMethod(1)
  public fun get_Status(): GattCommunicationStatus?

  @InterfaceMethod(2)
  public fun get_ProtocolError(): IReference<Byte>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IGattClientNotificationResult> {
    public override fun getValue() = ABI.makeIGattClientNotificationResult(pointer.getPointer(0))

    public fun setValue(value: IGattClientNotificationResult_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IGattClientNotificationResult {
    public val __932522958_Ptr: Pointer?

    public val _932522958_VtblPtr: Pointer?
      get() = __932522958_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_SubscribedClient(): GattSubscribedClient? {
      val fnPtr = _932522958_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattSubscribedClient>()
      val hr = fn.invokeHR(arrayOf(__932522958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattSubscribedClient>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_Status(): GattCommunicationStatus? {
      val fnPtr = _932522958_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<GattCommunicationStatus>()
      val hr = fn.invokeHR(arrayOf(__932522958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<GattCommunicationStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ProtocolError(): IReference<Byte>? {
      val fnPtr = _932522958_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Byte>>()
      val hr = fn.invokeHR(arrayOf(__932522958_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Byte>>(result.getValue())
      return resultValue
    }
  }

  public class IGattClientNotificationResult_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __932522958_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IGattClientNotificationResult, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("506d55990112419a8e3bae21afabd2c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIGattClientNotificationResult(ptr: Pointer?): WithDefault =
        IGattClientNotificationResult_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IGattClientNotificationResult {
      val address = segment.toRawLongValue()
      return makeIGattClientNotificationResult(Pointer(address))
    }

    public override fun toNative(obj: IGattClientNotificationResult): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__932522958_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IGattClientNotificationResult):
        Array<IGattClientNotificationResult?> = (elements as
        Array<IGattClientNotificationResult?>).castToImpl<IGattClientNotificationResult,IGattClientNotificationResult_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IGattClientNotificationResult?> =
        arrayOfNulls<IGattClientNotificationResult_Impl>(size) as
        Array<IGattClientNotificationResult?>
  }
}
