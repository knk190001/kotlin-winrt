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

@ABIMarker(ISplinePointKeyFrameStatics.ABI::class)
@Signature("{e97a32c2-0a7a-4766-95cb-0d692611cb4c}")
@Guid("e97a32c20a7a476695cb0d692611cb4c")
@WinRTInterface("e97a32c20a7a476695cb0d692611cb4c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplinePointKeyFrameStatics.ByReference::class)
public interface ISplinePointKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeySplineProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplinePointKeyFrameStatics> {
    public override fun getValue() = ABI.makeISplinePointKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: ISplinePointKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplinePointKeyFrameStatics {
    public val __1401743838_Ptr: Pointer?

    public val _1401743838_VtblPtr: Pointer?
      get() = __1401743838_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeySplineProperty(): DependencyProperty? {
      val fnPtr = _1401743838_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1401743838_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplinePointKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1401743838_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplinePointKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e97a32c20a7a476695cb0d692611cb4c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplinePointKeyFrameStatics(ptr: Pointer?): WithDefault =
        ISplinePointKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplinePointKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeISplinePointKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: ISplinePointKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1401743838_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplinePointKeyFrameStatics):
        Array<ISplinePointKeyFrameStatics?> = (elements as
        Array<ISplinePointKeyFrameStatics?>).castToImpl<ISplinePointKeyFrameStatics,ISplinePointKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplinePointKeyFrameStatics?> =
        arrayOfNulls<ISplinePointKeyFrameStatics_Impl>(size) as Array<ISplinePointKeyFrameStatics?>
  }
}
