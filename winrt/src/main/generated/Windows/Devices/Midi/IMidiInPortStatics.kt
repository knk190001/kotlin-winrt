package Windows.Devices.Midi

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiInPortStatics.ABI::class)
@Signature("{44c439dc-67ff-4a6e-8bac-fdb6610cf296}")
@Guid("44c439dc67ff4a6e8bacfdb6610cf296")
@WinRTInterface("44c439dc67ff4a6e8bacfdb6610cf296")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiInPortStatics.ByReference::class)
public interface IMidiInPortStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun FromIdAsync(deviceId: String?): IAsyncOperation<MidiInPort?>?

  @InterfaceMethod(1)
  public fun GetDeviceSelector(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiInPortStatics> {
    public override fun getValue() = ABI.makeIMidiInPortStatics(pointer.getPointer(0))

    public fun setValue(value: IMidiInPortStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiInPortStatics {
    public val __1894367474_Ptr: Pointer?

    public val _1894367474_VtblPtr: Pointer?
      get() = __1894367474_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun FromIdAsync(deviceId: String?): IAsyncOperation<MidiInPort?>? {
      val fnPtr = _1894367474_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<MidiInPort?>>()
      val hr = fn.invokeHR(arrayOf(__1894367474_Ptr, marshalToNative(deviceId), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<MidiInPort?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun GetDeviceSelector(): String? {
      val fnPtr = _1894367474_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1894367474_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IMidiInPortStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1894367474_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiInPortStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("44c439dc67ff4a6e8bacfdb6610cf296")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiInPortStatics(ptr: Pointer?): WithDefault = IMidiInPortStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiInPortStatics {
      val address = segment.toRawLongValue()
      return makeIMidiInPortStatics(Pointer(address))
    }

    public override fun toNative(obj: IMidiInPortStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1894367474_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiInPortStatics): Array<IMidiInPortStatics?> =
        (elements as
        Array<IMidiInPortStatics?>).castToImpl<IMidiInPortStatics,IMidiInPortStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiInPortStatics?> =
        arrayOfNulls<IMidiInPortStatics_Impl>(size) as Array<IMidiInPortStatics?>
  }
}
