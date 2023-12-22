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

@ABIMarker(IMidiTimeCodeMessage.ABI::class)
@Signature("{0bf7087d-fa63-4a1c-8deb-c0e87796a6d7}")
@Guid("0bf7087dfa634a1c8debc0e87796a6d7")
@WinRTInterface("0bf7087dfa634a1c8debc0e87796a6d7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiTimeCodeMessage.ByReference::class)
public interface IMidiTimeCodeMessage : NativeMapped, IWinRTInterface, IMidiMessage {
  @InterfaceMethod(0)
  public fun get_FrameType(): Byte

  @InterfaceMethod(1)
  public fun get_Values(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiTimeCodeMessage> {
    public override fun getValue() = ABI.makeIMidiTimeCodeMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiTimeCodeMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiTimeCodeMessage, IMidiMessage.WithDefault {
    public val __1953075936_Ptr: Pointer?

    public val _1953075936_VtblPtr: Pointer?
      get() = __1953075936_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FrameType(): Byte {
      val fnPtr = _1953075936_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1953075936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Values(): Byte {
      val fnPtr = _1953075936_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__1953075936_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiTimeCodeMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiMessage {
    public override val __450265702_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1953075936_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1953075936_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiTimeCodeMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0bf7087dfa634a1c8debc0e87796a6d7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiTimeCodeMessage(ptr: Pointer?): WithDefault = IMidiTimeCodeMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiTimeCodeMessage {
      val address = segment.toRawLongValue()
      return makeIMidiTimeCodeMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiTimeCodeMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1953075936_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiTimeCodeMessage): Array<IMidiTimeCodeMessage?> =
        (elements as
        Array<IMidiTimeCodeMessage?>).castToImpl<IMidiTimeCodeMessage,IMidiTimeCodeMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiTimeCodeMessage?> =
        arrayOfNulls<IMidiTimeCodeMessage_Impl>(size) as Array<IMidiTimeCodeMessage?>
  }
}
