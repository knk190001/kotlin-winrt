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

@ABIMarker(IMidiTimeCodeMessageFactory.ABI::class)
@Signature("{eb3099c5-771c-40de-b961-175a7489a85e}")
@Guid("eb3099c5771c40deb961175a7489a85e")
@WinRTInterface("eb3099c5771c40deb961175a7489a85e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiTimeCodeMessageFactory.ByReference::class)
public interface IMidiTimeCodeMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiTimeCodeMessage(frameType: Byte, values: Byte): MidiTimeCodeMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiTimeCodeMessageFactory> {
    public override fun getValue() = ABI.makeIMidiTimeCodeMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiTimeCodeMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiTimeCodeMessageFactory {
    public val __432457206_Ptr: Pointer?

    public val _432457206_VtblPtr: Pointer?
      get() = __432457206_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiTimeCodeMessage(frameType: Byte, values: Byte):
        MidiTimeCodeMessage? {
      val fnPtr = _432457206_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiTimeCodeMessage>()
      val hr = fn.invokeHR(arrayOf(__432457206_Ptr, frameType, values, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiTimeCodeMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiTimeCodeMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __432457206_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiTimeCodeMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("eb3099c5771c40deb961175a7489a85e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiTimeCodeMessageFactory(ptr: Pointer?): WithDefault =
        IMidiTimeCodeMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiTimeCodeMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiTimeCodeMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiTimeCodeMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__432457206_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiTimeCodeMessageFactory):
        Array<IMidiTimeCodeMessageFactory?> = (elements as
        Array<IMidiTimeCodeMessageFactory?>).castToImpl<IMidiTimeCodeMessageFactory,IMidiTimeCodeMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiTimeCodeMessageFactory?> =
        arrayOfNulls<IMidiTimeCodeMessageFactory_Impl>(size) as Array<IMidiTimeCodeMessageFactory?>
  }
}
