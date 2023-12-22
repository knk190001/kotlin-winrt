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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiSongPositionPointerMessageFactory.ABI::class)
@Signature("{9c00e996-f10b-4fea-b395-f5d6cf80f64e}")
@Guid("9c00e996f10b4feab395f5d6cf80f64e")
@WinRTInterface("9c00e996f10b4feab395f5d6cf80f64e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiSongPositionPointerMessageFactory.ByReference::class)
public interface IMidiSongPositionPointerMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiSongPositionPointerMessage(beats: WinDef.USHORT):
      MidiSongPositionPointerMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiSongPositionPointerMessageFactory> {
    public override fun getValue() =
        ABI.makeIMidiSongPositionPointerMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiSongPositionPointerMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiSongPositionPointerMessageFactory {
    public val __1770085451_Ptr: Pointer?

    public val _1770085451_VtblPtr: Pointer?
      get() = __1770085451_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiSongPositionPointerMessage(beats: WinDef.USHORT):
        MidiSongPositionPointerMessage? {
      val fnPtr = _1770085451_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiSongPositionPointerMessage>()
      val hr = fn.invokeHR(arrayOf(__1770085451_Ptr, beats, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiSongPositionPointerMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiSongPositionPointerMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1770085451_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiSongPositionPointerMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9c00e996f10b4feab395f5d6cf80f64e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiSongPositionPointerMessageFactory(ptr: Pointer?): WithDefault =
        IMidiSongPositionPointerMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiSongPositionPointerMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiSongPositionPointerMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiSongPositionPointerMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1770085451_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiSongPositionPointerMessageFactory):
        Array<IMidiSongPositionPointerMessageFactory?> = (elements as
        Array<IMidiSongPositionPointerMessageFactory?>).castToImpl<IMidiSongPositionPointerMessageFactory,IMidiSongPositionPointerMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiSongPositionPointerMessageFactory?> =
        arrayOfNulls<IMidiSongPositionPointerMessageFactory_Impl>(size) as
        Array<IMidiSongPositionPointerMessageFactory?>
  }
}
