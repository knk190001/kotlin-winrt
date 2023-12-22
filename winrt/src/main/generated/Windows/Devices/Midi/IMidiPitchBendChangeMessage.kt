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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiPitchBendChangeMessage.ABI::class)
@Signature("{29df4cb1-2e9f-4faf-8c2b-9cb82a9079ca}")
@Guid("29df4cb12e9f4faf8c2b9cb82a9079ca")
@WinRTInterface("29df4cb12e9f4faf8c2b9cb82a9079ca")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiPitchBendChangeMessage.ByReference::class)
public interface IMidiPitchBendChangeMessage : NativeMapped, IWinRTInterface, IMidiMessage {
  @InterfaceMethod(0)
  public fun get_Channel(): Byte

  @InterfaceMethod(1)
  public fun get_Bend(): WinDef.USHORT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiPitchBendChangeMessage> {
    public override fun getValue() = ABI.makeIMidiPitchBendChangeMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiPitchBendChangeMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiPitchBendChangeMessage, IMidiMessage.WithDefault {
    public val __2118569003_Ptr: Pointer?

    public val _2118569003_VtblPtr: Pointer?
      get() = __2118569003_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Channel(): Byte {
      val fnPtr = _2118569003_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__2118569003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Bend(): WinDef.USHORT {
      val fnPtr = _2118569003_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.USHORT>()
      val hr = fn.invokeHR(arrayOf(__2118569003_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.USHORT>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiPitchBendChangeMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiMessage {
    public override val __450265702_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_2118569003_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __2118569003_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiPitchBendChangeMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("29df4cb12e9f4faf8c2b9cb82a9079ca")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiPitchBendChangeMessage(ptr: Pointer?): WithDefault =
        IMidiPitchBendChangeMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiPitchBendChangeMessage {
      val address = segment.toRawLongValue()
      return makeIMidiPitchBendChangeMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiPitchBendChangeMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2118569003_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiPitchBendChangeMessage):
        Array<IMidiPitchBendChangeMessage?> = (elements as
        Array<IMidiPitchBendChangeMessage?>).castToImpl<IMidiPitchBendChangeMessage,IMidiPitchBendChangeMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiPitchBendChangeMessage?> =
        arrayOfNulls<IMidiPitchBendChangeMessage_Impl>(size) as Array<IMidiPitchBendChangeMessage?>
  }
}
