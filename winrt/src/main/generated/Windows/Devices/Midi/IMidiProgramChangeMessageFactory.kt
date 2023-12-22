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

@ABIMarker(IMidiProgramChangeMessageFactory.ABI::class)
@Signature("{d6b04387-524b-4104-9c99-6572bfd2e261}")
@Guid("d6b04387524b41049c996572bfd2e261")
@WinRTInterface("d6b04387524b41049c996572bfd2e261")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiProgramChangeMessageFactory.ByReference::class)
public interface IMidiProgramChangeMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiProgramChangeMessage(channel: Byte, program: Byte): MidiProgramChangeMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiProgramChangeMessageFactory> {
    public override fun getValue() = ABI.makeIMidiProgramChangeMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiProgramChangeMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiProgramChangeMessageFactory {
    public val __1157991818_Ptr: Pointer?

    public val _1157991818_VtblPtr: Pointer?
      get() = __1157991818_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiProgramChangeMessage(channel: Byte, program: Byte):
        MidiProgramChangeMessage? {
      val fnPtr = _1157991818_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiProgramChangeMessage>()
      val hr = fn.invokeHR(arrayOf(__1157991818_Ptr, channel, program, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiProgramChangeMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiProgramChangeMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1157991818_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiProgramChangeMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d6b04387524b41049c996572bfd2e261")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiProgramChangeMessageFactory(ptr: Pointer?): WithDefault =
        IMidiProgramChangeMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiProgramChangeMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiProgramChangeMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiProgramChangeMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1157991818_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiProgramChangeMessageFactory):
        Array<IMidiProgramChangeMessageFactory?> = (elements as
        Array<IMidiProgramChangeMessageFactory?>).castToImpl<IMidiProgramChangeMessageFactory,IMidiProgramChangeMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiProgramChangeMessageFactory?> =
        arrayOfNulls<IMidiProgramChangeMessageFactory_Impl>(size) as
        Array<IMidiProgramChangeMessageFactory?>
  }
}
