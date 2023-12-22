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

@ABIMarker(IMidiNoteOffMessage.ABI::class)
@Signature("{16fd8af4-198e-4d8f-a654-d305a293548f}")
@Guid("16fd8af4198e4d8fa654d305a293548f")
@WinRTInterface("16fd8af4198e4d8fa654d305a293548f")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiNoteOffMessage.ByReference::class)
public interface IMidiNoteOffMessage : NativeMapped, IWinRTInterface, IMidiMessage {
  @InterfaceMethod(0)
  public fun get_Channel(): Byte

  @InterfaceMethod(1)
  public fun get_Note(): Byte

  @InterfaceMethod(2)
  public fun get_Velocity(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiNoteOffMessage> {
    public override fun getValue() = ABI.makeIMidiNoteOffMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiNoteOffMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiNoteOffMessage, IMidiMessage.WithDefault {
    public val __1943481399_Ptr: Pointer?

    public val _1943481399_VtblPtr: Pointer?
      get() = __1943481399_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Channel(): Byte {
      val fnPtr = _1943481399_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1943481399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Note(): Byte {
      val fnPtr = _1943481399_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1943481399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Velocity(): Byte {
      val fnPtr = _1943481399_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1943481399_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiNoteOffMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiMessage {
    public override val __450265702_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1943481399_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1943481399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiNoteOffMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("16fd8af4198e4d8fa654d305a293548f")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiNoteOffMessage(ptr: Pointer?): WithDefault = IMidiNoteOffMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiNoteOffMessage {
      val address = segment.toRawLongValue()
      return makeIMidiNoteOffMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiNoteOffMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1943481399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiNoteOffMessage): Array<IMidiNoteOffMessage?> =
        (elements as
        Array<IMidiNoteOffMessage?>).castToImpl<IMidiNoteOffMessage,IMidiNoteOffMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiNoteOffMessage?> =
        arrayOfNulls<IMidiNoteOffMessage_Impl>(size) as Array<IMidiNoteOffMessage?>
  }
}
