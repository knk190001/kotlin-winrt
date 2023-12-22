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

@ABIMarker(ISplitCloseThemeAnimationStatics.ABI::class)
@Signature("{7aa94de9-cc9b-4e90-a11a-0050a2216a9e}")
@Guid("7aa94de9cc9b4e90a11a0050a2216a9e")
@WinRTInterface("7aa94de9cc9b4e90a11a0050a2216a9e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitCloseThemeAnimationStatics.ByReference::class)
public interface ISplitCloseThemeAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_OpenedTargetNameProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_OpenedTargetProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ClosedTargetNameProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_ClosedTargetProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_ContentTargetNameProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_ContentTargetProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_OpenedLengthProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_ClosedLengthProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_OffsetFromCenterProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_ContentTranslationDirectionProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_ContentTranslationOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISplitCloseThemeAnimationStatics> {
    public override fun getValue() = ABI.makeISplitCloseThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: ISplitCloseThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitCloseThemeAnimationStatics {
    public val __1111181414_Ptr: Pointer?

    public val _1111181414_VtblPtr: Pointer?
      get() = __1111181414_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpenedTargetNameProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OpenedTargetProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ClosedTargetNameProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ClosedTargetProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ContentTargetNameProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ContentTargetProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_OpenedLengthProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ClosedLengthProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_OffsetFromCenterProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ContentTranslationDirectionProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ContentTranslationOffsetProperty(): DependencyProperty? {
      val fnPtr = _1111181414_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1111181414_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplitCloseThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1111181414_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitCloseThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7aa94de9cc9b4e90a11a0050a2216a9e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitCloseThemeAnimationStatics(ptr: Pointer?): WithDefault =
        ISplitCloseThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitCloseThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeISplitCloseThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISplitCloseThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1111181414_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitCloseThemeAnimationStatics):
        Array<ISplitCloseThemeAnimationStatics?> = (elements as
        Array<ISplitCloseThemeAnimationStatics?>).castToImpl<ISplitCloseThemeAnimationStatics,ISplitCloseThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitCloseThemeAnimationStatics?> =
        arrayOfNulls<ISplitCloseThemeAnimationStatics_Impl>(size) as
        Array<ISplitCloseThemeAnimationStatics?>
  }
}
