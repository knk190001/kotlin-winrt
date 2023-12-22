package Windows.Devices.Midi

import Windows.Devices.Enumeration.DeviceInformation
import Windows.Foundation.IAsyncOperation
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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiSynthesizerStatics.ABI::class)
@Signature("{4224eaa8-6629-4d6b-aa8f-d4521a5a31ce}")
@Guid("4224eaa866294d6baa8fd4521a5a31ce")
@WinRTInterface("4224eaa866294d6baa8fd4521a5a31ce")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiSynthesizerStatics.ByReference::class)
public interface IMidiSynthesizerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun CreateAsync(): IAsyncOperation<MidiSynthesizer?>?

  @InterfaceMethod(1)
  public fun CreateAsync(audioDevice: DeviceInformation?): IAsyncOperation<MidiSynthesizer?>?

  @InterfaceMethod(2)
  public fun IsSynthesizer(midiDevice: DeviceInformation?): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiSynthesizerStatics> {
    public override fun getValue() = ABI.makeIMidiSynthesizerStatics(pointer.getPointer(0))

    public fun setValue(value: IMidiSynthesizerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiSynthesizerStatics {
    public val __1669353046_Ptr: Pointer?

    public val _1669353046_VtblPtr: Pointer?
      get() = __1669353046_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun CreateAsync(): IAsyncOperation<MidiSynthesizer?>? {
      val fnPtr = _1669353046_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MidiSynthesizer?>>()
      val hr = fn.invokeHR(arrayOf(__1669353046_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MidiSynthesizer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun CreateAsync(audioDevice: DeviceInformation?):
        IAsyncOperation<MidiSynthesizer?>? {
      val fnPtr = _1669353046_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MidiSynthesizer?>>()
      val hr = fn.invokeHR(arrayOf(__1669353046_Ptr, marshalToNative(audioDevice), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MidiSynthesizer?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun IsSynthesizer(midiDevice: DeviceInformation?): Boolean {
      val fnPtr = _1669353046_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1669353046_Ptr, marshalToNative(midiDevice), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IMidiSynthesizerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1669353046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiSynthesizerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4224eaa866294d6baa8fd4521a5a31ce")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiSynthesizerStatics(ptr: Pointer?): WithDefault =
        IMidiSynthesizerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiSynthesizerStatics {
      val address = segment.toRawLongValue()
      return makeIMidiSynthesizerStatics(Pointer(address))
    }

    public override fun toNative(obj: IMidiSynthesizerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1669353046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiSynthesizerStatics): Array<IMidiSynthesizerStatics?>
        = (elements as
        Array<IMidiSynthesizerStatics?>).castToImpl<IMidiSynthesizerStatics,IMidiSynthesizerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiSynthesizerStatics?> =
        arrayOfNulls<IMidiSynthesizerStatics_Impl>(size) as Array<IMidiSynthesizerStatics?>
  }
}
