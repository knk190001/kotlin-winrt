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

@ABIMarker(ISwipeHintThemeAnimationStatics.ABI::class)
@Signature("{23d61a57-9115-4d63-b04a-b89f1c744dc0}")
@Guid("23d61a5791154d63b04ab89f1c744dc0")
@WinRTInterface("23d61a5791154d63b04ab89f1c744dc0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISwipeHintThemeAnimationStatics.ByReference::class)
public interface ISwipeHintThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TargetNameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ToHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ToVerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISwipeHintThemeAnimationStatics> {
    public override fun getValue() = ABI.makeISwipeHintThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: ISwipeHintThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISwipeHintThemeAnimationStatics {
    public val __608809135_Ptr: Pointer?

    public val _608809135_VtblPtr: Pointer?
      get() = __608809135_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TargetNameProperty(): DependencyProperty? {
      val fnPtr = _608809135_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__608809135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ToHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _608809135_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__608809135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ToVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _608809135_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__608809135_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISwipeHintThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __608809135_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISwipeHintThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("23d61a5791154d63b04ab89f1c744dc0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISwipeHintThemeAnimationStatics(ptr: Pointer?): WithDefault =
        ISwipeHintThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISwipeHintThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeISwipeHintThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISwipeHintThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__608809135_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISwipeHintThemeAnimationStatics):
        Array<ISwipeHintThemeAnimationStatics?> = (elements as
        Array<ISwipeHintThemeAnimationStatics?>).castToImpl<ISwipeHintThemeAnimationStatics,ISwipeHintThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISwipeHintThemeAnimationStatics?> =
        arrayOfNulls<ISwipeHintThemeAnimationStatics_Impl>(size) as
        Array<ISwipeHintThemeAnimationStatics?>
  }
}
