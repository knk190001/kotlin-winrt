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

@ABIMarker(IEasingDoubleKeyFrame.ABI::class)
@Signature("{965adb8d-9a54-4108-b4ff-b5a5212cb338}")
@Guid("965adb8d9a544108b4ffb5a5212cb338")
@WinRTInterface("965adb8d9a544108b4ffb5a5212cb338")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasingDoubleKeyFrame.ByReference::class)
public interface IEasingDoubleKeyFrame : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EasingFunction(): EasingFunctionBase?

  @InterfaceMethod(1)
  public fun put_EasingFunction(value: EasingFunctionBase?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasingDoubleKeyFrame> {
    public override fun getValue() = ABI.makeIEasingDoubleKeyFrame(pointer.getPointer(0))

    public fun setValue(value: IEasingDoubleKeyFrame_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasingDoubleKeyFrame {
    public val __457205328_Ptr: Pointer?

    public val _457205328_VtblPtr: Pointer?
      get() = __457205328_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EasingFunction(): EasingFunctionBase? {
      val fnPtr = _457205328_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EasingFunctionBase>()
      val hr = fn.invokeHR(arrayOf(__457205328_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EasingFunctionBase>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_EasingFunction(value: EasingFunctionBase?): Unit {
      val fnPtr = _457205328_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__457205328_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IEasingDoubleKeyFrame_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __457205328_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasingDoubleKeyFrame, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("965adb8d9a544108b4ffb5a5212cb338")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasingDoubleKeyFrame(ptr: Pointer?): WithDefault =
        IEasingDoubleKeyFrame_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasingDoubleKeyFrame {
      val address = segment.toRawLongValue()
      return makeIEasingDoubleKeyFrame(Pointer(address))
    }

    public override fun toNative(obj: IEasingDoubleKeyFrame): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__457205328_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasingDoubleKeyFrame): Array<IEasingDoubleKeyFrame?> =
        (elements as
        Array<IEasingDoubleKeyFrame?>).castToImpl<IEasingDoubleKeyFrame,IEasingDoubleKeyFrame_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasingDoubleKeyFrame?> =
        arrayOfNulls<IEasingDoubleKeyFrame_Impl>(size) as Array<IEasingDoubleKeyFrame?>
  }
}
