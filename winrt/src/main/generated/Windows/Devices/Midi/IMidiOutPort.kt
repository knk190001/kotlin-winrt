package Windows.Devices.Midi

import Windows.Foundation.IClosable
import Windows.Foundation.IClosable.ABI.IID
import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IMidiOutPort.ABI::class)
@Signature("{931d6d9f-57a2-4a3a-adb8-4640886f6693}")
@Guid("931d6d9f57a24a3aadb84640886f6693")
@WinRTInterface("931d6d9f57a24a3aadb84640886f6693")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiOutPort.ByReference::class)
public interface IMidiOutPort : NativeMapped, IWinRTInterface, IClosable {
  @InterfaceMethod(0)
  public fun SendMessage(midiMessage: IMidiMessage?): Unit

  @InterfaceMethod(1)
  public fun SendBuffer(midiData: IBuffer?): Unit

  @InterfaceMethod(2)
  public fun get_DeviceId(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IMidiOutPort> {
    public override fun getValue() = ABI.makeIMidiOutPort(pointer.getPointer(0))

    public fun setValue(value: IMidiOutPort_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiOutPort, IClosable.WithDefault {
    public val __1782702722_Ptr: Pointer?

    public val _1782702722_VtblPtr: Pointer?
      get() = __1782702722_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SendMessage(midiMessage: IMidiMessage?): Unit {
      val fnPtr = _1782702722_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1782702722_Ptr, marshalToNative(midiMessage),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun SendBuffer(midiData: IBuffer?): Unit {
      val fnPtr = _1782702722_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1782702722_Ptr, marshalToNative(midiData),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_DeviceId(): String? {
      val fnPtr = _1782702722_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1782702722_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMidiOutPort_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IClosable {
    public override val __1260617006_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1782702722_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1782702722_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiOutPort, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("931d6d9f57a24a3aadb84640886f6693")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiOutPort(ptr: Pointer?): WithDefault = IMidiOutPort_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiOutPort {
      val address = segment.toRawLongValue()
      return makeIMidiOutPort(Pointer(address))
    }

    public override fun toNative(obj: IMidiOutPort): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1782702722_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiOutPort): Array<IMidiOutPort?> = (elements as
        Array<IMidiOutPort?>).castToImpl<IMidiOutPort,IMidiOutPort_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiOutPort?> =
        arrayOfNulls<IMidiOutPort_Impl>(size) as Array<IMidiOutPort?>
  }
}
