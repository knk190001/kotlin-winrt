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

@ABIMarker(IMidiProgramChangeMessage.ABI::class)
@Signature("{9cbb3c78-7a3e-4327-aa98-20b8e4485af8}")
@Guid("9cbb3c787a3e4327aa9820b8e4485af8")
@WinRTInterface("9cbb3c787a3e4327aa9820b8e4485af8")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiProgramChangeMessage.ByReference::class)
public interface IMidiProgramChangeMessage : NativeMapped, IWinRTInterface, IMidiMessage {
  @InterfaceMethod(0)
  public fun get_Channel(): Byte

  @InterfaceMethod(1)
  public fun get_Program(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiProgramChangeMessage> {
    public override fun getValue() = ABI.makeIMidiProgramChangeMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiProgramChangeMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiProgramChangeMessage, IMidiMessage.WithDefault {
    public val __457977696_Ptr: Pointer?

    public val _457977696_VtblPtr: Pointer?
      get() = __457977696_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Channel(): Byte {
      val fnPtr = _457977696_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__457977696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Program(): Byte {
      val fnPtr = _457977696_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__457977696_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiProgramChangeMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiMessage {
    public override val __450265702_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_457977696_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __457977696_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiProgramChangeMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9cbb3c787a3e4327aa9820b8e4485af8")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiProgramChangeMessage(ptr: Pointer?): WithDefault =
        IMidiProgramChangeMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiProgramChangeMessage {
      val address = segment.toRawLongValue()
      return makeIMidiProgramChangeMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiProgramChangeMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__457977696_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiProgramChangeMessage):
        Array<IMidiProgramChangeMessage?> = (elements as
        Array<IMidiProgramChangeMessage?>).castToImpl<IMidiProgramChangeMessage,IMidiProgramChangeMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiProgramChangeMessage?> =
        arrayOfNulls<IMidiProgramChangeMessage_Impl>(size) as Array<IMidiProgramChangeMessage?>
  }
}
