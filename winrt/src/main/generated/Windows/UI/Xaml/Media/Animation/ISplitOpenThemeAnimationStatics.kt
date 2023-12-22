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

@ABIMarker(ISplitOpenThemeAnimationStatics.ABI::class)
@Signature("{8d4cfa89-3a91-458d-b0fb-4cad625cbf8d}")
@Guid("8d4cfa893a91458db0fb4cad625cbf8d")
@WinRTInterface("8d4cfa893a91458db0fb4cad625cbf8d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISplitOpenThemeAnimationStatics.ByReference::class)
public interface ISplitOpenThemeAnimationStatics : NativeMapped, IWinRTInterface {
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
      IByReference<ISplitOpenThemeAnimationStatics> {
    public override fun getValue() = ABI.makeISplitOpenThemeAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: ISplitOpenThemeAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISplitOpenThemeAnimationStatics {
    public val __512635116_Ptr: Pointer?

    public val _512635116_VtblPtr: Pointer?
      get() = __512635116_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_OpenedTargetNameProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_OpenedTargetProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ClosedTargetNameProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_ClosedTargetProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_ContentTargetNameProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_ContentTargetProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_OpenedLengthProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_ClosedLengthProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_OffsetFromCenterProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_ContentTranslationDirectionProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_ContentTranslationOffsetProperty(): DependencyProperty? {
      val fnPtr = _512635116_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__512635116_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ISplitOpenThemeAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __512635116_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISplitOpenThemeAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d4cfa893a91458db0fb4cad625cbf8d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISplitOpenThemeAnimationStatics(ptr: Pointer?): WithDefault =
        ISplitOpenThemeAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISplitOpenThemeAnimationStatics {
      val address = segment.toRawLongValue()
      return makeISplitOpenThemeAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: ISplitOpenThemeAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__512635116_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISplitOpenThemeAnimationStatics):
        Array<ISplitOpenThemeAnimationStatics?> = (elements as
        Array<ISplitOpenThemeAnimationStatics?>).castToImpl<ISplitOpenThemeAnimationStatics,ISplitOpenThemeAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISplitOpenThemeAnimationStatics?> =
        arrayOfNulls<ISplitOpenThemeAnimationStatics_Impl>(size) as
        Array<ISplitOpenThemeAnimationStatics?>
  }
}
