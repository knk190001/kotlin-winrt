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

@ABIMarker(IDoubleKeyFrame.ABI::class)
@Signature("{94c82ae6-ca62-5f52-934c-3e427e75d69a}")
@Guid("94c82ae6ca625f52934c3e427e75d69a")
@WinRTInterface("94c82ae6ca625f52934c3e427e75d69a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDoubleKeyFrame.ByReference::class)
public interface IDoubleKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Value(): Double

  @InterfaceMethod(1)
  public fun put_Value(value: Double): Unit

  @InterfaceMethod(2)
  public fun get_KeyTime(): KeyTime?

  @InterfaceMethod(3)
  public fun put_KeyTime(value: KeyTime?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDoubleKeyFrame> {
    public override fun getValue() = ABI.makeIDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IDoubleKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDoubleKeyFrame {
    public val __1066227706_Ptr: Pointer?

    public val _1066227706_VtblPtr: Pointer?
      get() = __1066227706_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Value(): Double {
      val fnPtr = _1066227706_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1066227706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Value(value: Double): Unit {
      val fnPtr = _1066227706_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1066227706_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_KeyTime(): KeyTime? {
      val fnPtr = _1066227706_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<KeyTime>()
      val hr = fn.invokeHR(arrayOf(__1066227706_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<KeyTime>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_KeyTime(value: KeyTime?): Unit {
      val fnPtr = _1066227706_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1066227706_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDoubleKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1066227706_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDoubleKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("94c82ae6ca625f52934c3e427e75d69a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDoubleKeyFrame(ptr: Pointer?): WithDefault = IDoubleKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return makeIDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1066227706_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDoubleKeyFrame): Array<IDoubleKeyFrame?> = (elements as
        Array<IDoubleKeyFrame?>).castToImpl<IDoubleKeyFrame,IDoubleKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDoubleKeyFrame?> =
        arrayOfNulls<IDoubleKeyFrame_Impl>(size) as Array<IDoubleKeyFrame?>
  }
}
