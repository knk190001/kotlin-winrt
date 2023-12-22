package Windows.Media.Audio

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
import kotlin.Double
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAudioGraphConnection.ABI::class)
@Signature("{763070ed-d04e-4fac-b233-600b42edd469}")
@Guid("763070edd04e4facb233600b42edd469")
@WinRTInterface("763070edd04e4facb233600b42edd469")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAudioGraphConnection.ByReference::class)
public interface IAudioGraphConnection : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Destination(): IAudioNode?

  @InterfaceMethod(1)
  public fun put_Gain(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_Gain(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAudioGraphConnection> {
    public override fun getValue() = ABI.makeIAudioGraphConnection(pointer.getPointer(0))

    public fun setValue(value: IAudioGraphConnection_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAudioGraphConnection {
    public val __145617250_Ptr: Pointer?

    public val _145617250_VtblPtr: Pointer?
      get() = __145617250_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Destination(): IAudioNode? {
      val fnPtr = _145617250_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAudioNode>()
      val hr = fn.invokeHR(arrayOf(__145617250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAudioNode>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Gain(value: Double): Unit {
      val fnPtr = _145617250_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__145617250_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Gain(): Double {
      val fnPtr = _145617250_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__145617250_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IAudioGraphConnection_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __145617250_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAudioGraphConnection, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("763070edd04e4facb233600b42edd469")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAudioGraphConnection(ptr: Pointer?): WithDefault =
        IAudioGraphConnection_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAudioGraphConnection {
      val address = segment.toRawLongValue()
      return makeIAudioGraphConnection(Pointer(address))
    }

    public override fun toNative(obj: IAudioGraphConnection): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__145617250_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAudioGraphConnection): Array<IAudioGraphConnection?> =
        (elements as
        Array<IAudioGraphConnection?>).castToImpl<IAudioGraphConnection,IAudioGraphConnection_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAudioGraphConnection?> =
        arrayOfNulls<IAudioGraphConnection_Impl>(size) as Array<IAudioGraphConnection?>
  }
}
