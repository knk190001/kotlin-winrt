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

@ABIMarker(ISplineDoubleKeyFrameStatics.ABI::class)
@Signature("{060a8ffc-975f-4e4e-9ec7-13c5aee02062}")
@Guid("060a8ffc975f4e4e9ec713c5aee02062")
@WinRTInterface("060a8ffc975f4e4e9ec713c5aee02062")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplineDoubleKeyFrameStatics.ByReference::class)
public interface ISplineDoubleKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_KeySplineProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplineDoubleKeyFrameStatics> {
    public override fun getValue() = ABI.makeISplineDoubleKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: ISplineDoubleKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplineDoubleKeyFrameStatics {
    public val __1894821999_Ptr: Pointer?

    public val _1894821999_VtblPtr: Pointer?
      get() = __1894821999_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_KeySplineProperty(): DependencyProperty? {
      val fnPtr = _1894821999_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1894821999_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplineDoubleKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1894821999_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplineDoubleKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("060a8ffc975f4e4e9ec713c5aee02062")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplineDoubleKeyFrameStatics(ptr: Pointer?): WithDefault =
        ISplineDoubleKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplineDoubleKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeISplineDoubleKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: ISplineDoubleKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1894821999_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplineDoubleKeyFrameStatics):
        Array<ISplineDoubleKeyFrameStatics?> = (elements as
        Array<ISplineDoubleKeyFrameStatics?>).castToImpl<ISplineDoubleKeyFrameStatics,ISplineDoubleKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplineDoubleKeyFrameStatics?> =
        arrayOfNulls<ISplineDoubleKeyFrameStatics_Impl>(size) as
        Array<ISplineDoubleKeyFrameStatics?>
  }
}
