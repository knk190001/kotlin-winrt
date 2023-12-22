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

@ABIMarker(IMidiSongSelectMessageFactory.ABI::class)
@Signature("{848878e4-8748-4129-a66c-a05493f75daa}")
@Guid("848878e487484129a66ca05493f75daa")
@WinRTInterface("848878e487484129a66ca05493f75daa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiSongSelectMessageFactory.ByReference::class)
public interface IMidiSongSelectMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiSongSelectMessage(song: Byte): MidiSongSelectMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiSongSelectMessageFactory> {
    public override fun getValue() = ABI.makeIMidiSongSelectMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiSongSelectMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiSongSelectMessageFactory {
    public val __1723637087_Ptr: Pointer?

    public val _1723637087_VtblPtr: Pointer?
      get() = __1723637087_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiSongSelectMessage(song: Byte): MidiSongSelectMessage? {
      val fnPtr = _1723637087_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiSongSelectMessage>()
      val hr = fn.invokeHR(arrayOf(__1723637087_Ptr, song, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiSongSelectMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiSongSelectMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1723637087_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiSongSelectMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("848878e487484129a66ca05493f75daa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiSongSelectMessageFactory(ptr: Pointer?): WithDefault =
        IMidiSongSelectMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiSongSelectMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiSongSelectMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiSongSelectMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1723637087_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiSongSelectMessageFactory):
        Array<IMidiSongSelectMessageFactory?> = (elements as
        Array<IMidiSongSelectMessageFactory?>).castToImpl<IMidiSongSelectMessageFactory,IMidiSongSelectMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiSongSelectMessageFactory?> =
        arrayOfNulls<IMidiSongSelectMessageFactory_Impl>(size) as
        Array<IMidiSongSelectMessageFactory?>
  }
}
