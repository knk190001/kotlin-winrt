package Windows.Networking.Proximity

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
import kotlin.Long
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IProximityMessage.ABI::class)
@Signature("{efab0782-f6e1-4675-a045-d8e320c24808}")
@Guid("efab0782f6e14675a045d8e320c24808")
@WinRTInterface("efab0782f6e14675a045d8e320c24808")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProximityMessage.ByReference::class)
public interface IProximityMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MessageType(): String?

  @InterfaceMethod(1)
  public fun get_SubscriptionId(): Long

  @InterfaceMethod(2)
  public fun get_Data(): IBuffer?

  @InterfaceMethod(3)
  public fun get_DataAsString(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProximityMessage> {
    public override fun getValue() = ABI.makeIProximityMessage(pointer.getPointer(0))

    public fun setValue(value: IProximityMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProximityMessage {
    public val __875857473_Ptr: Pointer?

    public val _875857473_VtblPtr: Pointer?
      get() = __875857473_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MessageType(): String? {
      val fnPtr = _875857473_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__875857473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_SubscriptionId(): Long {
      val fnPtr = _875857473_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Long>()
      val hr = fn.invokeHR(arrayOf(__875857473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Long>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Data(): IBuffer? {
      val fnPtr = _875857473_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__875857473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_DataAsString(): String? {
      val fnPtr = _875857473_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__875857473_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IProximityMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __875857473_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProximityMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("efab0782f6e14675a045d8e320c24808")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProximityMessage(ptr: Pointer?): WithDefault = IProximityMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProximityMessage {
      val address = segment.toRawLongValue()
      return makeIProximityMessage(Pointer(address))
    }

    public override fun toNative(obj: IProximityMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__875857473_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProximityMessage): Array<IProximityMessage?> = (elements
        as Array<IProximityMessage?>).castToImpl<IProximityMessage,IProximityMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProximityMessage?> =
        arrayOfNulls<IProximityMessage_Impl>(size) as Array<IProximityMessage?>
  }
}
