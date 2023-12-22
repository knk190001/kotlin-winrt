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

@ABIMarker(IColorKeyFrameStatics.ABI::class)
@Signature("{b62fdd68-15c7-5c6c-a4fa-0cee10e04556}")
@Guid("b62fdd6815c75c6ca4fa0cee10e04556")
@WinRTInterface("b62fdd6815c75c6ca4fa0cee10e04556")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IColorKeyFrameStatics.ByReference::class)
public interface IColorKeyFrameStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ValueProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_KeyTimeProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IColorKeyFrameStatics> {
    public override fun getValue() = ABI.makeIColorKeyFrameStatics(pointer.getPointer(0))

    public fun setValue(value: IColorKeyFrameStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IColorKeyFrameStatics {
    public val __705568303_Ptr: Pointer?

    public val _705568303_VtblPtr: Pointer?
      get() = __705568303_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _705568303_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__705568303_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_KeyTimeProperty(): DependencyProperty? {
      val fnPtr = _705568303_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__705568303_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IColorKeyFrameStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __705568303_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IColorKeyFrameStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b62fdd6815c75c6ca4fa0cee10e04556")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIColorKeyFrameStatics(ptr: Pointer?): WithDefault =
        IColorKeyFrameStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IColorKeyFrameStatics {
      val address = segment.toRawLongValue()
      return makeIColorKeyFrameStatics(Pointer(address))
    }

    public override fun toNative(obj: IColorKeyFrameStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__705568303_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IColorKeyFrameStatics): Array<IColorKeyFrameStatics?> =
        (elements as
        Array<IColorKeyFrameStatics?>).castToImpl<IColorKeyFrameStatics,IColorKeyFrameStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IColorKeyFrameStatics?> =
        arrayOfNulls<IColorKeyFrameStatics_Impl>(size) as Array<IColorKeyFrameStatics?>
  }
}
