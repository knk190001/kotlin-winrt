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

@ABIMarker(ISwipeBackThemeAnimationStatics.ABI::class)
@Signature("{18a7a588-b9a2-573b-8e2b-38048c4635a7}")
@Guid("18a7a588b9a2573b8e2b38048c4635a7")
@WinRTInterface("18a7a588b9a2573b8e2b38048c4635a7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeBackThemeAnimationStatics.ByReference::class)
public interface ISwipeBackThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_FromHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FromVerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeBackThemeAnimationStatics> {
    public override fun getValue() = ABI.makeISwipeBackThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: ISwipeBackThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeBackThemeAnimationStatics {
    public val __762188676_Ptr: Pointer?

    public val _762188676_VtblPtr: Pointer?
      get() = __762188676_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _762188676_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__762188676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_FromHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _762188676_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__762188676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FromVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _762188676_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__762188676_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeBackThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __762188676_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeBackThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("18a7a588b9a2573b8e2b38048c4635a7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeBackThemeAnimationStatics(ptr: Pointer?): WithDefault =
        ISwipeBackThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeBackThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeISwipeBackThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISwipeBackThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__762188676_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeBackThemeAnimationStatics):
        Array<ISwipeBackThemeAnimationStatics?> = (elements as
        Array<ISwipeBackThemeAnimationStatics?>).castToImpl<ISwipeBackThemeAnimationStatics,ISwipeBackThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeBackThemeAnimationStatics?> =
        arrayOfNulls<ISwipeBackThemeAnimationStatics_Impl>(size) as
        Array<ISwipeBackThemeAnimationStatics?>
  }
}
