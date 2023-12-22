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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IMidiMessageReceivedEventArgs.ABI::class)
@Signature("{76566e56-f328-4b51-907d-b3a8ce96bf80}")
@Guid("76566e56f3284b51907db3a8ce96bf80")
@WinRTInterface("76566e56f3284b51907db3a8ce96bf80")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IMidiMessageReceivedEventArgs.ByReference::class)
public interface IMidiMessageReceivedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Message(): IMidiMessage?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IMidiMessageReceivedEventArgs> {
    public override fun getValue() = ABI.makeIMidiMessageReceivedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IMidiMessageReceivedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IMidiMessageReceivedEventArgs {
    public val __575014716_Ptr: Pointer?

    public val _575014716_VtblPtr: Pointer?
      get() = __575014716_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Message(): IMidiMessage? {
      val fnPtr = _575014716_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMidiMessage>()
      val hr = fn.invokeHR(arrayOf(__575014716_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMidiMessage>(result.getValue())
      return resultValue
    }
  }

  public class IMidiMessageReceivedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __575014716_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IMidiMessageReceivedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("76566e56f3284b51907db3a8ce96bf80")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIMidiMessageReceivedEventArgs(ptr: Pointer?): WithDefault =
        IMidiMessageReceivedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IMidiMessageReceivedEventArgs {
      val address = segment.toRawLongValue()
      return makeIMidiMessageReceivedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IMidiMessageReceivedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__575014716_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IMidiMessageReceivedEventArgs):
        Array<IMidiMessageReceivedEventArgs?> = (elements as
        Array<IMidiMessageReceivedEventArgs?>).castToImpl<IMidiMessageReceivedEventArgs,IMidiMessageReceivedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IMidiMessageReceivedEventArgs?> =
        arrayOfNulls<IMidiMessageReceivedEventArgs_Impl>(size) as
        Array<IMidiMessageReceivedEventArgs?>
  }
}
