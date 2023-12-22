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

@ABIMarker(IMidiNoteOffMessageFactory.ABI::class)
@Signature("{a6b240e0-a749-425f-8af4-a4d979cc15b5}")
@Guid("a6b240e0a749425f8af4a4d979cc15b5")
@WinRTInterface("a6b240e0a749425f8af4a4d979cc15b5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiNoteOffMessageFactory.ByReference::class)
public interface IMidiNoteOffMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiNoteOffMessage(
    channel: Byte,
    note: Byte,
    velocity: Byte
  ): MidiNoteOffMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiNoteOffMessageFactory> {
    public override fun getValue() = ABI.makeIMidiNoteOffMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiNoteOffMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiNoteOffMessageFactory {
    public val __58966227_Ptr: Pointer?

    public val _58966227_VtblPtr: Pointer?
      get() = __58966227_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiNoteOffMessage(
      channel: Byte,
      note: Byte,
      velocity: Byte
    ): MidiNoteOffMessage? {
      val fnPtr = _58966227_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiNoteOffMessage>()
      val hr = fn.invokeHR(arrayOf(__58966227_Ptr, channel, note, velocity, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiNoteOffMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiNoteOffMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __58966227_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiNoteOffMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a6b240e0a749425f8af4a4d979cc15b5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiNoteOffMessageFactory(ptr: Pointer?): WithDefault =
        IMidiNoteOffMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiNoteOffMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiNoteOffMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiNoteOffMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__58966227_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiNoteOffMessageFactory):
        Array<IMidiNoteOffMessageFactory?> = (elements as
        Array<IMidiNoteOffMessageFactory?>).castToImpl<IMidiNoteOffMessageFactory,IMidiNoteOffMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiNoteOffMessageFactory?> =
        arrayOfNulls<IMidiNoteOffMessageFactory_Impl>(size) as Array<IMidiNoteOffMessageFactory?>
  }
}
