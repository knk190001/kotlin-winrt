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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IEasingPointKeyFrame.ABI::class)
@Signature("{b3c91380-6868-4225-a70b-3981cc0b2947}")
@Guid("b3c9138068684225a70b3981cc0b2947")
@WinRTInterface("b3c9138068684225a70b3981cc0b2947")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasingPointKeyFrame.ByReference::class)
public interface IEasingPointKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EasingFunction(): EasingFunctionBase?

  @InterfaceMethod(1)
  public fun put_EasingFunction(value: EasingFunctionBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasingPointKeyFrame> {
    public override fun getValue() = ABI.makeIEasingPointKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IEasingPointKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasingPointKeyFrame {
    public val __1906321203_Ptr: Pointer?

    public val _1906321203_VtblPtr: Pointer?
      get() = __1906321203_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EasingFunction(): EasingFunctionBase? {
      val fnPtr = _1906321203_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasingFunctionBase>()
      val hr = fn.invokeHR(arrayOf(__1906321203_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasingFunctionBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EasingFunction(value: EasingFunctionBase?): Unit {
      val fnPtr = _1906321203_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1906321203_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEasingPointKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1906321203_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasingPointKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b3c9138068684225a70b3981cc0b2947")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasingPointKeyFrame(ptr: Pointer?): WithDefault = IEasingPointKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasingPointKeyFrame {
      val address = segment.toRawLongValue()
      return makeIEasingPointKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IEasingPointKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1906321203_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasingPointKeyFrame): Array<IEasingPointKeyFrame?> =
        (elements as
        Array<IEasingPointKeyFrame?>).castToImpl<IEasingPointKeyFrame,IEasingPointKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasingPointKeyFrame?> =
        arrayOfNulls<IEasingPointKeyFrame_Impl>(size) as Array<IEasingPointKeyFrame?>
  }
}
