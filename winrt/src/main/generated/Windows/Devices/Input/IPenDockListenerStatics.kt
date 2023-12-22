package Windows.Devices.Input

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

@ABIMarker(IPenDockListenerStatics.ABI::class)
@Signature("{cab75e9a-0016-5c72-969e-a97e11992a93}")
@Guid("cab75e9a00165c72969ea97e11992a93")
@WinRTInterface("cab75e9a00165c72969ea97e11992a93")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPenDockListenerStatics.ByReference::class)
public interface IPenDockListenerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetDefault(): PenDockListener?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPenDockListenerStatics> {
    public override fun getValue() = ABI.makeIPenDockListenerStatics(pointer.getPointer(0))

    public fun setValue(value: IPenDockListenerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPenDockListenerStatics {
    public val __725786400_Ptr: Pointer?

    public val _725786400_VtblPtr: Pointer?
      get() = __725786400_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetDefault(): PenDockListener? {
      val fnPtr = _725786400_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<PenDockListener>()
      val hr = fn.invokeHR(arrayOf(__725786400_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<PenDockListener>(result.getValue())
      return resultValue
    }
  }

  public class IPenDockListenerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __725786400_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPenDockListenerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("cab75e9a00165c72969ea97e11992a93")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPenDockListenerStatics(ptr: Pointer?): WithDefault =
        IPenDockListenerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPenDockListenerStatics {
      val address = segment.toRawLongValue()
      return makeIPenDockListenerStatics(Pointer(address))
    }

    public override fun toNative(obj: IPenDockListenerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__725786400_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPenDockListenerStatics): Array<IPenDockListenerStatics?>
        = (elements as
        Array<IPenDockListenerStatics?>).castToImpl<IPenDockListenerStatics,IPenDockListenerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPenDockListenerStatics?> =
        arrayOfNulls<IPenDockListenerStatics_Impl>(size) as Array<IPenDockListenerStatics?>
  }
}
