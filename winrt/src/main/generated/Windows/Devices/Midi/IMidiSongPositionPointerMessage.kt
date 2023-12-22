package Windows.Devices.Midi

import Windows.Devices.Midi.IMidiMessage.ABI.IID
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IMidiSongPositionPointerMessage.ABI::class)
@Signature("{4ca50c56-ec5e-4ae4-a115-88dc57cc2b79}")
@Guid("4ca50c56ec5e4ae4a11588dc57cc2b79")
@WinRTInterface("4ca50c56ec5e4ae4a11588dc57cc2b79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiSongPositionPointerMessage.ByReference::class)
public interface IMidiSongPositionPointerMessage : NativeMapped, IWinRTInterface, IMidiMessage {
  @InterfaceMethod(0)
  public fun get_Beats(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiSongPositionPointerMessage> {
    public override fun getValue() = ABI.makeIMidiSongPositionPointerMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiSongPositionPointerMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiSongPositionPointerMessage, IMidiMessage.WithDefault {
    public val __1161895019_Ptr: Pointer?

    public val _1161895019_VtblPtr: Pointer?
      get() = __1161895019_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Beats(): WinDef.USHORT {
      val fnPtr = _1161895019_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__1161895019_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiSongPositionPointerMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiMessage {
    public override val __450265702_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1161895019_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1161895019_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiSongPositionPointerMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ca50c56ec5e4ae4a11588dc57cc2b79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiSongPositionPointerMessage(ptr: Pointer?): WithDefault =
        IMidiSongPositionPointerMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiSongPositionPointerMessage {
      val address = segment.toRawLongValue()
      return makeIMidiSongPositionPointerMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiSongPositionPointerMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1161895019_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiSongPositionPointerMessage):
        Array<IMidiSongPositionPointerMessage?> = (elements as
        Array<IMidiSongPositionPointerMessage?>).castToImpl<IMidiSongPositionPointerMessage,IMidiSongPositionPointerMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiSongPositionPointerMessage?> =
        arrayOfNulls<IMidiSongPositionPointerMessage_Impl>(size) as
        Array<IMidiSongPositionPointerMessage?>
  }
}
