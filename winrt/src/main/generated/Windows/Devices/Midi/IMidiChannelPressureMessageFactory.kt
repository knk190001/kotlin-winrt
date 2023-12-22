package Windows.Devices.Midi

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
import kotlin.Byte
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiChannelPressureMessageFactory.ABI::class)
@Signature("{6218ed2f-2284-412a-94cf-10fb04842c6c}")
@Guid("6218ed2f2284412a94cf10fb04842c6c")
@WinRTInterface("6218ed2f2284412a94cf10fb04842c6c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiChannelPressureMessageFactory.ByReference::class)
public interface IMidiChannelPressureMessageFactory : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateMidiChannelPressureMessage(channel: Byte, pressure: Byte):
      MidiChannelPressureMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiChannelPressureMessageFactory> {
    public override fun getValue() =
        ABI.makeIMidiChannelPressureMessageFactory(pointer.getPointer(0))

    public fun setValue(value: IMidiChannelPressureMessageFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiChannelPressureMessageFactory {
    public val __1467614498_Ptr: Pointer?

    public val _1467614498_VtblPtr: Pointer?
      get() = __1467614498_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateMidiChannelPressureMessage(channel: Byte, pressure: Byte):
        MidiChannelPressureMessage? {
      val fnPtr = _1467614498_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<MidiChannelPressureMessage>()
      val hr = fn.invokeHR(arrayOf(__1467614498_Ptr, channel, pressure, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<MidiChannelPressureMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiChannelPressureMessageFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1467614498_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiChannelPressureMessageFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6218ed2f2284412a94cf10fb04842c6c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiChannelPressureMessageFactory(ptr: Pointer?): WithDefault =
        IMidiChannelPressureMessageFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiChannelPressureMessageFactory {
      val address = segment.toRawLongValue()
      return makeIMidiChannelPressureMessageFactory(Pointer(address))
    }

    public override fun toNative(obj: IMidiChannelPressureMessageFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1467614498_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiChannelPressureMessageFactory):
        Array<IMidiChannelPressureMessageFactory?> = (elements as
        Array<IMidiChannelPressureMessageFactory?>).castToImpl<IMidiChannelPressureMessageFactory,IMidiChannelPressureMessageFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiChannelPressureMessageFactory?> =
        arrayOfNulls<IMidiChannelPressureMessageFactory_Impl>(size) as
        Array<IMidiChannelPressureMessageFactory?>
  }
}
