package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IPowerEase.ABI::class)
@Signature("{69c80579-eedf-405b-8680-d9606880c937}")
@Guid("69c80579eedf405b8680d9606880c937")
@WinRTInterface("69c80579eedf405b8680d9606880c937")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPowerEase.ByReference::class)
public interface IPowerEase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Power(): Double

  @InterfaceMethod(1)
  public fun put_Power(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IPowerEase> {
    public override fun getValue() = ABI.makeIPowerEase(pointer.getPointer(0))

    public fun setValue(value: IPowerEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPowerEase {
    public val __1564669773_Ptr: Pointer?

    public val _1564669773_VtblPtr: Pointer?
      get() = __1564669773_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Power(): Double {
      val fnPtr = _1564669773_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1564669773_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Power(value: Double): Unit {
      val fnPtr = _1564669773_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1564669773_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IPowerEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1564669773_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPowerEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("69c80579eedf405b8680d9606880c937")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPowerEase(ptr: Pointer?): WithDefault = IPowerEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPowerEase {
      val address = segment.toRawLongValue()
      return makeIPowerEase(Pointer(address))
    }

    public override fun toNative(obj: IPowerEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1564669773_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPowerEase): Array<IPowerEase?> = (elements as
        Array<IPowerEase?>).castToImpl<IPowerEase,IPowerEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPowerEase?> = arrayOfNulls<IPowerEase_Impl>(size)
        as Array<IPowerEase?>
  }
}
