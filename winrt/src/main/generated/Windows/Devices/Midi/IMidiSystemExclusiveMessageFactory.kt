package Windows.Devices.Midi

import Windows.Storage.Streams.IBuffer
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

@ABIMarker(IMidiSystemExclusiveMessageFactory.ABI::class)
@Signature("{083de222-3b74-4320-9b42-0ca8545f8a24}")
@Guid("083de2223b7443209b420ca8545f8a24")
@WinRTInterface("083de2223b7443209b420ca8545f8a24")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiSystemExclusiveMessageFactory.ByReference::class)
public interface IMidiSystemExclusiveMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiSystemExclusiveMessage(rawData: IBuffer?): MidiSystemExclusiveMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiSystemExclusiveMessageFactory> {
    public override fun getValue() =
        ABI.makeIMidiSystemExclusiveMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiSystemExclusiveMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiSystemExclusiveMessageFactory {
    public val __838713189_Ptr: Pointer?

    public val _838713189_VtblPtr: Pointer?
      get() = __838713189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiSystemExclusiveMessage(rawData: IBuffer?):
        MidiSystemExclusiveMessage? {
      val fnPtr = _838713189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiSystemExclusiveMessage>()
      val hr = fn.invokeHR(arrayOf(__838713189_Ptr, marshalToNative(rawData), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiSystemExclusiveMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiSystemExclusiveMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __838713189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiSystemExclusiveMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("083de2223b7443209b420ca8545f8a24")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiSystemExclusiveMessageFactory(ptr: Pointer?): WithDefault =
        IMidiSystemExclusiveMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiSystemExclusiveMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiSystemExclusiveMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiSystemExclusiveMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__838713189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiSystemExclusiveMessageFactory):
        Array<IMidiSystemExclusiveMessageFactory?> = (elements as
        Array<IMidiSystemExclusiveMessageFactory?>).castToImpl<IMidiSystemExclusiveMessageFactory,IMidiSystemExclusiveMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiSystemExclusiveMessageFactory?> =
        arrayOfNulls<IMidiSystemExclusiveMessageFactory_Impl>(size) as
        Array<IMidiSystemExclusiveMessageFactory?>
  }
}
