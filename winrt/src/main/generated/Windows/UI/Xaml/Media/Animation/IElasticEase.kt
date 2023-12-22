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

@ABIMarker(IElasticEase.ABI::class)
@Signature("{ef5ba58c-b0b6-4a6c-9ca8-fb4233f12459}")
@Guid("ef5ba58cb0b64a6c9ca8fb4233f12459")
@WinRTInterface("ef5ba58cb0b64a6c9ca8fb4233f12459")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IElasticEase.ByReference::class)
public interface IElasticEase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Oscillations(): Int

  @InterfaceMethod(1)
  public fun put_Oscillations(value: Int): Unit

  @InterfaceMethod(2)
  public fun get_Springiness(): Double

  @InterfaceMethod(3)
  public fun put_Springiness(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IElasticEase> {
    public override fun getValue() = ABI.makeIElasticEase(pointer.getPointer(0))

    public fun setValue(value: IElasticEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IElasticEase {
    public val __1835233949_Ptr: Pointer?

    public val _1835233949_VtblPtr: Pointer?
      get() = __1835233949_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Oscillations(): Int {
      val fnPtr = _1835233949_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Int>()
      val hr = fn.invokeHR(arrayOf(__1835233949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Int>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Oscillations(value: Int): Unit {
      val fnPtr = _1835233949_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1835233949_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Springiness(): Double {
      val fnPtr = _1835233949_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1835233949_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(3)
    public override fun put_Springiness(value: Double): Unit {
      val fnPtr = _1835233949_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1835233949_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IElasticEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1835233949_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IElasticEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ef5ba58cb0b64a6c9ca8fb4233f12459")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIElasticEase(ptr: Pointer?): WithDefault = IElasticEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IElasticEase {
      val address = segment.toRawLongValue()
      return makeIElasticEase(Pointer(address))
    }

    public override fun toNative(obj: IElasticEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1835233949_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IElasticEase): Array<IElasticEase?> = (elements as
        Array<IElasticEase?>).castToImpl<IElasticEase,IElasticEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IElasticEase?> =
        arrayOfNulls<IElasticEase_Impl>(size) as Array<IElasticEase?>
  }
}
