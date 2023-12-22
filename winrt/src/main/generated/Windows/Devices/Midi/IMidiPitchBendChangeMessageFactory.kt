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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IMidiPitchBendChangeMessageFactory.ABI::class)
@Signature("{f5eedf55-cfc8-4926-b30e-a3622393306c}")
@Guid("f5eedf55cfc84926b30ea3622393306c")
@WinRTInterface("f5eedf55cfc84926b30ea3622393306c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiPitchBendChangeMessageFactory.ByReference::class)
public interface IMidiPitchBendChangeMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiPitchBendChangeMessage(channel: Byte, bend: WinDef.USHORT):
      MidiPitchBendChangeMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiPitchBendChangeMessageFactory> {
    public override fun getValue() =
        ABI.makeIMidiPitchBendChangeMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiPitchBendChangeMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiPitchBendChangeMessageFactory {
    public val __196216415_Ptr: Pointer?

    public val _196216415_VtblPtr: Pointer?
      get() = __196216415_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiPitchBendChangeMessage(channel: Byte, bend: WinDef.USHORT):
        MidiPitchBendChangeMessage? {
      val fnPtr = _196216415_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiPitchBendChangeMessage>()
      val hr = fn.invokeHR(arrayOf(__196216415_Ptr, channel, bend, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiPitchBendChangeMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiPitchBendChangeMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __196216415_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiPitchBendChangeMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f5eedf55cfc84926b30ea3622393306c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiPitchBendChangeMessageFactory(ptr: Pointer?): WithDefault =
        IMidiPitchBendChangeMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiPitchBendChangeMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiPitchBendChangeMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiPitchBendChangeMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__196216415_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiPitchBendChangeMessageFactory):
        Array<IMidiPitchBendChangeMessageFactory?> = (elements as
        Array<IMidiPitchBendChangeMessageFactory?>).castToImpl<IMidiPitchBendChangeMessageFactory,IMidiPitchBendChangeMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiPitchBendChangeMessageFactory?> =
        arrayOfNulls<IMidiPitchBendChangeMessageFactory_Impl>(size) as
        Array<IMidiPitchBendChangeMessageFactory?>
  }
}
