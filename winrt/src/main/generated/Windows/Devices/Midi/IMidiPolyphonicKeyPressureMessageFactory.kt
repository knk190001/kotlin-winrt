package Windows.Devices.Midi

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

@ABIMarker(IMidiPolyphonicKeyPressureMessageFactory.ABI::class)
@Signature("{e98f483e-c4b3-4dd2-917c-e349815a1b3b}")
@Guid("e98f483ec4b34dd2917ce349815a1b3b")
@WinRTInterface("e98f483ec4b34dd2917ce349815a1b3b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiPolyphonicKeyPressureMessageFactory.ByReference::class)
public interface IMidiPolyphonicKeyPressureMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiPolyphonicKeyPressureMessage(
    channel: Byte,
    note: Byte,
    pressure: Byte
  ): MidiPolyphonicKeyPressureMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiPolyphonicKeyPressureMessageFactory> {
    public override fun getValue() =
        ABI.makeIMidiPolyphonicKeyPressureMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiPolyphonicKeyPressureMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiPolyphonicKeyPressureMessageFactory {
    public val __693324669_Ptr: Pointer?

    public val _693324669_VtblPtr: Pointer?
      get() = __693324669_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiPolyphonicKeyPressureMessage(
      channel: Byte,
      note: Byte,
      pressure: Byte
    ): MidiPolyphonicKeyPressureMessage? {
      val fnPtr = _693324669_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiPolyphonicKeyPressureMessage>()
      val hr = fn.invokeHR(arrayOf(__693324669_Ptr, channel, note, pressure, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiPolyphonicKeyPressureMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiPolyphonicKeyPressureMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __693324669_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiPolyphonicKeyPressureMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e98f483ec4b34dd2917ce349815a1b3b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiPolyphonicKeyPressureMessageFactory(ptr: Pointer?): WithDefault =
        IMidiPolyphonicKeyPressureMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IMidiPolyphonicKeyPressureMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiPolyphonicKeyPressureMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiPolyphonicKeyPressureMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__693324669_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiPolyphonicKeyPressureMessageFactory):
        Array<IMidiPolyphonicKeyPressureMessageFactory?> = (elements as
        Array<IMidiPolyphonicKeyPressureMessageFactory?>).castToImpl<IMidiPolyphonicKeyPressureMessageFactory,IMidiPolyphonicKeyPressureMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiPolyphonicKeyPressureMessageFactory?> =
        arrayOfNulls<IMidiPolyphonicKeyPressureMessageFactory_Impl>(size) as
        Array<IMidiPolyphonicKeyPressureMessageFactory?>
  }
}
