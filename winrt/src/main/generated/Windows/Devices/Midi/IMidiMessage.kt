package Windows.Devices.Midi

import Windows.Foundation.TimeSpan
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
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiMessage.ABI::class)
@Signature("{79767945-1094-4283-9be0-289fc0ee8334}")
@Guid("79767945109442839be0289fc0ee8334")
@WinRTInterface("79767945109442839be0289fc0ee8334")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiMessage.ByReference::class)
public interface IMidiMessage : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Timestamp(): TimeSpan?

  @InterfaceMethod(1)
  public fun get_RawData(): IBuffer?

  @InterfaceMethod(2)
  public fun get_Type(): MidiMessageType?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMidiMessage> {
    public override fun getValue() = ABI.makeIMidiMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiMessage {
    public val __450265702_Ptr: Pointer?

    public val _450265702_VtblPtr: Pointer?
      get() = __450265702_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Timestamp(): TimeSpan? {
      val fnPtr = _450265702_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TimeSpan>()
      val hr = fn.invokeHR(arrayOf(__450265702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TimeSpan>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_RawData(): IBuffer? {
      val fnPtr = _450265702_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IBuffer>()
      val hr = fn.invokeHR(arrayOf(__450265702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IBuffer>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_Type(): MidiMessageType? {
      val fnPtr = _450265702_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiMessageType>()
      val hr = fn.invokeHR(arrayOf(__450265702_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiMessageType>(result.getValue())
      return resultValue
    }
  }

  public class IMidiMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __450265702_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79767945109442839be0289fc0ee8334")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiMessage(ptr: Pointer?): WithDefault = IMidiMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiMessage {
      val address = segment.toRawLongValue()
      return makeIMidiMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__450265702_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiMessage): Array<IMidiMessage?> = (elements as
        Array<IMidiMessage?>).castToImpl<IMidiMessage,IMidiMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiMessage?> =
        arrayOfNulls<IMidiMessage_Impl>(size) as Array<IMidiMessage?>
  }
}
