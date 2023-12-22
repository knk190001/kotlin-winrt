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

@ABIMarker(IMidiNoteOnMessageFactory.ABI::class)
@Signature("{9b4280a0-59c1-420e-b517-15a10aa9606b}")
@Guid("9b4280a059c1420eb51715a10aa9606b")
@WinRTInterface("9b4280a059c1420eb51715a10aa9606b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiNoteOnMessageFactory.ByReference::class)
public interface IMidiNoteOnMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiNoteOnMessage(
    channel: Byte,
    note: Byte,
    velocity: Byte
  ): MidiNoteOnMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiNoteOnMessageFactory> {
    public override fun getValue() = ABI.makeIMidiNoteOnMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiNoteOnMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiNoteOnMessageFactory {
    public val __778822689_Ptr: Pointer?

    public val _778822689_VtblPtr: Pointer?
      get() = __778822689_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiNoteOnMessage(
      channel: Byte,
      note: Byte,
      velocity: Byte
    ): MidiNoteOnMessage? {
      val fnPtr = _778822689_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiNoteOnMessage>()
      val hr = fn.invokeHR(arrayOf(__778822689_Ptr, channel, note, velocity, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiNoteOnMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiNoteOnMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __778822689_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiNoteOnMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b4280a059c1420eb51715a10aa9606b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiNoteOnMessageFactory(ptr: Pointer?): WithDefault =
        IMidiNoteOnMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiNoteOnMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiNoteOnMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiNoteOnMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__778822689_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiNoteOnMessageFactory):
        Array<IMidiNoteOnMessageFactory?> = (elements as
        Array<IMidiNoteOnMessageFactory?>).castToImpl<IMidiNoteOnMessageFactory,IMidiNoteOnMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiNoteOnMessageFactory?> =
        arrayOfNulls<IMidiNoteOnMessageFactory_Impl>(size) as Array<IMidiNoteOnMessageFactory?>
  }
}
