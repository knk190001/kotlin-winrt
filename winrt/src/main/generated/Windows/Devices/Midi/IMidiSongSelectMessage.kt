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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IMidiSongSelectMessage.ABI::class)
@Signature("{49f0f27f-6d83-4741-a5bf-4629f6be974f}")
@Guid("49f0f27f6d834741a5bf4629f6be974f")
@WinRTInterface("49f0f27f6d834741a5bf4629f6be974f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiSongSelectMessage.ByReference::class)
public interface IMidiSongSelectMessage : NativeMapped, IWinRTInterface, IMidiMessage {
  @InterfaceMethod(0)
  public fun get_Song(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiSongSelectMessage> {
    public override fun getValue() = ABI.makeIMidiSongSelectMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiSongSelectMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiSongSelectMessage, IMidiMessage.WithDefault {
    public val __1007932969_Ptr: Pointer?

    public val _1007932969_VtblPtr: Pointer?
      get() = __1007932969_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Song(): Byte {
      val fnPtr = _1007932969_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1007932969_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiSongSelectMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiMessage {
    public override val __450265702_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1007932969_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1007932969_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiSongSelectMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49f0f27f6d834741a5bf4629f6be974f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiSongSelectMessage(ptr: Pointer?): WithDefault =
        IMidiSongSelectMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiSongSelectMessage {
      val address = segment.toRawLongValue()
      return makeIMidiSongSelectMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiSongSelectMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1007932969_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiSongSelectMessage): Array<IMidiSongSelectMessage?> =
        (elements as
        Array<IMidiSongSelectMessage?>).castToImpl<IMidiSongSelectMessage,IMidiSongSelectMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiSongSelectMessage?> =
        arrayOfNulls<IMidiSongSelectMessage_Impl>(size) as Array<IMidiSongSelectMessage?>
  }
}
