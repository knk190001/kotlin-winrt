package Windows.UI.Xaml.Media.Animation

import Windows.UI.Xaml.DependencyProperty
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

@ABIMarker(ISplineColorKeyFrameStatics.ABI::class)
@Signature("{61d1d997-8589-4f2f-8fbb-7d03edc98dd3}")
@Guid("61d1d99785894f2f8fbb7d03edc98dd3")
@WinRTInterface("61d1d99785894f2f8fbb7d03edc98dd3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplineColorKeyFrameStatics.ByReference::class)
public interface ISplineColorKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeySplineProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplineColorKeyFrameStatics> {
    public override fun getValue() = ABI.makeISplineColorKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: ISplineColorKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplineColorKeyFrameStatics {
    public val __1804652459_Ptr: Pointer?

    public val _1804652459_VtblPtr: Pointer?
      get() = __1804652459_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeySplineProperty(): DependencyProperty? {
      val fnPtr = _1804652459_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1804652459_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplineColorKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1804652459_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplineColorKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("61d1d99785894f2f8fbb7d03edc98dd3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplineColorKeyFrameStatics(ptr: Pointer?): WithDefault =
        ISplineColorKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplineColorKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeISplineColorKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: ISplineColorKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1804652459_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplineColorKeyFrameStatics):
        Array<ISplineColorKeyFrameStatics?> = (elements as
        Array<ISplineColorKeyFrameStatics?>).castToImpl<ISplineColorKeyFrameStatics,ISplineColorKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplineColorKeyFrameStatics?> =
        arrayOfNulls<ISplineColorKeyFrameStatics_Impl>(size) as Array<ISplineColorKeyFrameStatics?>
  }
}
