package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.DependencyProperty
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

@ABIMarker(IEasingColorKeyFrameStatics.ABI::class)
@Signature("{c57818c0-3361-587d-b381-620b69251bcf}")
@Guid("c57818c03361587db381620b69251bcf")
@WinRTInterface("c57818c03361587db381620b69251bcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasingColorKeyFrameStatics.ByReference::class)
public interface IEasingColorKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_EasingFunctionProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasingColorKeyFrameStatics> {
    public override fun getValue() = ABI.makeIEasingColorKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: IEasingColorKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasingColorKeyFrameStatics {
    public val __1631011770_Ptr: Pointer?

    public val _1631011770_VtblPtr: Pointer?
      get() = __1631011770_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_EasingFunctionProperty(): DependencyProperty? {
      val fnPtr = _1631011770_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1631011770_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IEasingColorKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1631011770_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasingColorKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c57818c03361587db381620b69251bcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasingColorKeyFrameStatics(ptr: Pointer?): WithDefault =
        IEasingColorKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasingColorKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeIEasingColorKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: IEasingColorKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1631011770_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasingColorKeyFrameStatics):
        Array<IEasingColorKeyFrameStatics?> = (elements as
        Array<IEasingColorKeyFrameStatics?>).castToImpl<IEasingColorKeyFrameStatics,IEasingColorKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasingColorKeyFrameStatics?> =
        arrayOfNulls<IEasingColorKeyFrameStatics_Impl>(size) as Array<IEasingColorKeyFrameStatics?>
  }
}
