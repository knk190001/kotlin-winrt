package Windows.Devices.Midi

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Foundation.TypedEventHandler
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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiInPort.ABI::class)
@Signature("{d5c1d9db-971a-4eaf-a23d-ea19fe607ff9}")
@Guid("d5c1d9db971a4eafa23dea19fe607ff9")
@WinRTInterface("d5c1d9db971a4eafa23dea19fe607ff9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiInPort.ByReference::class)
public interface IMidiInPort : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun add_MessageReceived(handler: TypedEventHandler<MidiInPort?,
      MidiMessageReceivedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(1)
  public fun remove_MessageReceived(token: EventRegistrationToken?): Unit

  @InterfaceMethod(2)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMidiInPort> {
    public override fun getValue() = ABI.makeIMidiInPort(pointer.getPointer(0))

    public fun setValue(value: IMidiInPort_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiInPort, IClosable.WithDefault {
    public val __1922890925_Ptr: Pointer?

    public val _1922890925_VtblPtr: Pointer?
      get() = __1922890925_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun add_MessageReceived(handler: TypedEventHandler<MidiInPort?,
        MidiMessageReceivedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1922890925_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1922890925_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun remove_MessageReceived(token: EventRegistrationToken?): Unit {
      val fnPtr = _1922890925_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1922890925_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1922890925_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1922890925_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMidiInPort_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1922890925_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1922890925_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiInPort, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("d5c1d9db971a4eafa23dea19fe607ff9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiInPort(ptr: Pointer?): WithDefault = IMidiInPort_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiInPort {
      val address = segment.toRawLongValue()
      return makeIMidiInPort(Pointer(address))
    }

    public override fun toNative(obj: IMidiInPort): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1922890925_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiInPort): Array<IMidiInPort?> = (elements as
        Array<IMidiInPort?>).castToImpl<IMidiInPort,IMidiInPort_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiInPort?> =
        arrayOfNulls<IMidiInPort_Impl>(size) as Array<IMidiInPort?>
  }
}
