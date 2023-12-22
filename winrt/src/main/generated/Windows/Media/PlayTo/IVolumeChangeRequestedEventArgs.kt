package Windows.Media.PlayTo

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

@ABIMarker(IVolumeChangeRequestedEventArgs.ABI::class)
@Signature("{6f026d5c-cf75-4c2b-913e-6d7c6c329179}")
@Guid("6f026d5ccf754c2b913e6d7c6c329179")
@WinRTInterface("6f026d5ccf754c2b913e6d7c6c329179")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IVolumeChangeRequestedEventArgs.ByReference::class)
public interface IVolumeChangeRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Volume(): Double

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IVolumeChangeRequestedEventArgs> {
    public override fun getValue() = ABI.makeIVolumeChangeRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IVolumeChangeRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IVolumeChangeRequestedEventArgs {
    public val __496850424_Ptr: Pointer?

    public val _496850424_VtblPtr: Pointer?
      get() = __496850424_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Volume(): Double {
      val fnPtr = _496850424_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__496850424_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }
  }

  public class IVolumeChangeRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __496850424_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IVolumeChangeRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f026d5ccf754c2b913e6d7c6c329179")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIVolumeChangeRequestedEventArgs(ptr: Pointer?): WithDefault =
        IVolumeChangeRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IVolumeChangeRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIVolumeChangeRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IVolumeChangeRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__496850424_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IVolumeChangeRequestedEventArgs):
        Array<IVolumeChangeRequestedEventArgs?> = (elements as
        Array<IVolumeChangeRequestedEventArgs?>).castToImpl<IVolumeChangeRequestedEventArgs,IVolumeChangeRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IVolumeChangeRequestedEventArgs?> =
        arrayOfNulls<IVolumeChangeRequestedEventArgs_Impl>(size) as
        Array<IVolumeChangeRequestedEventArgs?>
  }
}
