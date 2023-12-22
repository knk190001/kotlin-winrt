package Microsoft.UI.Xaml.Media.Animation

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

@ABIMarker(IBackEase.ABI::class)
@Signature("{1775bd43-1939-57cb-8c31-cd7590ec9543}")
@Guid("1775bd43193957cb8c31cd7590ec9543")
@WinRTInterface("1775bd43193957cb8c31cd7590ec9543")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackEase.ByReference::class)
public interface IBackEase : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Amplitude(): Double

  @InterfaceMethod(1)
  public fun put_Amplitude(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBackEase> {
    public override fun getValue() = ABI.makeIBackEase(pointer.getPointer(0))

    public fun setValue(value: IBackEase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackEase {
    public val __2117866608_Ptr: Pointer?

    public val _2117866608_VtblPtr: Pointer?
      get() = __2117866608_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Amplitude(): Double {
      val fnPtr = _2117866608_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__2117866608_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Amplitude(value: Double): Unit {
      val fnPtr = _2117866608_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__2117866608_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBackEase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2117866608_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackEase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1775bd43193957cb8c31cd7590ec9543")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackEase(ptr: Pointer?): WithDefault = IBackEase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackEase {
      val address = segment.toRawLongValue()
      return makeIBackEase(Pointer(address))
    }

    public override fun toNative(obj: IBackEase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2117866608_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackEase): Array<IBackEase?> = (elements as
        Array<IBackEase?>).castToImpl<IBackEase,IBackEase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackEase?> = arrayOfNulls<IBackEase_Impl>(size)
        as Array<IBackEase?>
  }
}
