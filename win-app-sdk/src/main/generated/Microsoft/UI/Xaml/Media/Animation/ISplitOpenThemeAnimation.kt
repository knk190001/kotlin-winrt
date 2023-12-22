package Microsoft.UI.Xaml.Media.Animation

import Microsoft.UI.Xaml.Controls.Primitives.AnimationDirection
import Microsoft.UI.Xaml.DependencyObject
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ISplitOpenThemeAnimation.ABI::class)
@Signature("{79fdfaca-4245-53f0-b5c7-da1ce2b0b851}")
@Guid("79fdfaca424553f0b5c7da1ce2b0b851")
@WinRTInterface("79fdfaca424553f0b5c7da1ce2b0b851")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitOpenThemeAnimation.ByReference::class)
public interface ISplitOpenThemeAnimation : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OpenedTargetName(): String?

  @InterfaceMethod(1)
  public fun put_OpenedTargetName(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_OpenedTarget(): DependencyObject?

  @InterfaceMethod(3)
  public fun put_OpenedTarget(value: DependencyObject?): Unit

  @InterfaceMethod(4)
  public fun get_ClosedTargetName(): String?

  @InterfaceMethod(5)
  public fun put_ClosedTargetName(value: String?): Unit

  @InterfaceMethod(6)
  public fun get_ClosedTarget(): DependencyObject?

  @InterfaceMethod(7)
  public fun put_ClosedTarget(value: DependencyObject?): Unit

  @InterfaceMethod(8)
  public fun get_ContentTargetName(): String?

  @InterfaceMethod(9)
  public fun put_ContentTargetName(value: String?): Unit

  @InterfaceMethod(10)
  public fun get_ContentTarget(): DependencyObject?

  @InterfaceMethod(11)
  public fun put_ContentTarget(value: DependencyObject?): Unit

  @InterfaceMethod(12)
  public fun get_OpenedLength(): Double

  @InterfaceMethod(13)
  public fun put_OpenedLength(value: Double): Unit

  @InterfaceMethod(14)
  public fun get_ClosedLength(): Double

  @InterfaceMethod(15)
  public fun put_ClosedLength(value: Double): Unit

  @InterfaceMethod(16)
  public fun get_OffsetFromCenter(): Double

  @InterfaceMethod(17)
  public fun put_OffsetFromCenter(value: Double): Unit

  @InterfaceMethod(18)
  public fun get_ContentTranslationDirection(): AnimationDirection?

  @InterfaceMethod(19)
  public fun put_ContentTranslationDirection(value: AnimationDirection?): Unit

  @InterfaceMethod(20)
  public fun get_ContentTranslationOffset(): Double

  @InterfaceMethod(21)
  public fun put_ContentTranslationOffset(value: Double): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitOpenThemeAnimation> {
    public override fun getValue() = ABI.makeISplitOpenThemeAnimation(pointer.getPointer(0))

    public fun setValue(value: ISplitOpenThemeAnimation_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitOpenThemeAnimation {
    public val __1854319876_Ptr: Pointer?

    public val _1854319876_VtblPtr: Pointer?
      get() = __1854319876_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpenedTargetName(): String? {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_OpenedTargetName(value: String?): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_OpenedTarget(): DependencyObject? {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_OpenedTarget(value: DependencyObject?): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_ClosedTargetName(): String? {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_ClosedTargetName(value: String?): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun get_ClosedTarget(): DependencyObject? {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun put_ClosedTarget(value: DependencyObject?): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_ContentTargetName(): String? {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun put_ContentTargetName(value: String?): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun get_ContentTarget(): DependencyObject? {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyObject>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyObject>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun put_ContentTarget(value: DependencyObject?): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun get_OpenedLength(): Double {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(13)
    public override fun put_OpenedLength(value: Double): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun get_ClosedLength(): Double {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(15)
    public override fun put_ClosedLength(value: Double): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(16)
    public override fun get_OffsetFromCenter(): Double {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(17)
    public override fun put_OffsetFromCenter(value: Double): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(18)
    public override fun get_ContentTranslationDirection(): AnimationDirection? {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(24L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AnimationDirection>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AnimationDirection>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(19)
    public override fun put_ContentTranslationDirection(value: AnimationDirection?): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(25L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(20)
    public override fun get_ContentTranslationOffset(): Double {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(26L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Double>()
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Double>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(21)
    public override fun put_ContentTranslationOffset(value: Double): Unit {
      val fnPtr = _1854319876_VtblPtr!!.getPointer(27L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1854319876_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ISplitOpenThemeAnimation_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1854319876_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitOpenThemeAnimation, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79fdfaca424553f0b5c7da1ce2b0b851")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitOpenThemeAnimation(ptr: Pointer?): WithDefault =
        ISplitOpenThemeAnimation_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitOpenThemeAnimation {
      val address = segment.toRawLongValue()
      return makeISplitOpenThemeAnimation(Pointer(address))
    }

    public override fun toNative(obj: ISplitOpenThemeAnimation): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1854319876_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitOpenThemeAnimation):
        Array<ISplitOpenThemeAnimation?> = (elements as
        Array<ISplitOpenThemeAnimation?>).castToImpl<ISplitOpenThemeAnimation,ISplitOpenThemeAnimation_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitOpenThemeAnimation?> =
        arrayOfNulls<ISplitOpenThemeAnimation_Impl>(size) as Array<ISplitOpenThemeAnimation?>
  }
}
