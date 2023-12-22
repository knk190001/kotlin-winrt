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

@ABIMarker(IMidiPolyphonicKeyPressureMessage.ABI::class)
@Signature("{1f7337fe-ace8-48a0-868e-7cdbf20f04d6}")
@Guid("1f7337feace848a0868e7cdbf20f04d6")
@WinRTInterface("1f7337feace848a0868e7cdbf20f04d6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiPolyphonicKeyPressureMessage.ByReference::class)
public interface IMidiPolyphonicKeyPressureMessage : NativeMapped, IWinRTInterface, IMidiMessage {
  @InterfaceMethod(0)
  public fun get_Channel(): Byte

  @InterfaceMethod(1)
  public fun get_Note(): Byte

  @InterfaceMethod(2)
  public fun get_Pressure(): Byte

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiPolyphonicKeyPressureMessage> {
    public override fun getValue() =
        ABI.makeIMidiPolyphonicKeyPressureMessage(pointer.getPointer(0))

    public fun setValue(value: IMidiPolyphonicKeyPressureMessage_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiPolyphonicKeyPressureMessage, IMidiMessage.WithDefault {
    public val __480242893_Ptr: Pointer?

    public val _480242893_VtblPtr: Pointer?
      get() = __480242893_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Channel(): Byte {
      val fnPtr = _480242893_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__480242893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun get_Note(): Byte {
      val fnPtr = _480242893_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__480242893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(2)
    public override fun get_Pressure(): Byte {
      val fnPtr = _480242893_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Byte>()
      val hr = fn.invokeHR(arrayOf(__480242893_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Byte>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiPolyphonicKeyPressureMessage_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IMidiMessage {
    public override val __450265702_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_480242893_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __480242893_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiPolyphonicKeyPressureMessage, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1f7337feace848a0868e7cdbf20f04d6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiPolyphonicKeyPressureMessage(ptr: Pointer?): WithDefault =
        IMidiPolyphonicKeyPressureMessage_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiPolyphonicKeyPressureMessage {
      val address = segment.toRawLongValue()
      return makeIMidiPolyphonicKeyPressureMessage(Pointer(address))
    }

    public override fun toNative(obj: IMidiPolyphonicKeyPressureMessage): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__480242893_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiPolyphonicKeyPressureMessage):
        Array<IMidiPolyphonicKeyPressureMessage?> = (elements as
        Array<IMidiPolyphonicKeyPressureMessage?>).castToImpl<IMidiPolyphonicKeyPressureMessage,IMidiPolyphonicKeyPressureMessage_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiPolyphonicKeyPressureMessage?> =
        arrayOfNulls<IMidiPolyphonicKeyPressureMessage_Impl>(size) as
        Array<IMidiPolyphonicKeyPressureMessage?>
  }
}
