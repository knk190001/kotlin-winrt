package Windows.UI.Xaml.Documents

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

@ABIMarker(ITextElementStatics4.ABI::class)
@Signature("{fd8f641e-6b12-40d5-b6ef-d1bd12ac9066}")
@Guid("fd8f641e6b1240d5b6efd1bd12ac9066")
@WinRTInterface("fd8f641e6b1240d5b6efd1bd12ac9066")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITextElementStatics4.ByReference::class)
public interface ITextElementStatics4 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TextDecorationsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsAccessKeyScopeProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_AccessKeyScopeOwnerProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_KeyTipPlacementModeProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_KeyTipHorizontalOffsetProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_KeyTipVerticalOffsetProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITextElementStatics4> {
    public override fun getValue() = ABI.makeITextElementStatics4(pointer.getPointer(0))

    public fun setValue(value: ITextElementStatics4_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITextElementStatics4 {
    public val __1124852714_Ptr: Pointer?

    public val _1124852714_VtblPtr: Pointer?
      get() = __1124852714_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TextDecorationsProperty(): DependencyProperty? {
      val fnPtr = _1124852714_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsAccessKeyScopeProperty(): DependencyProperty? {
      val fnPtr = _1124852714_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_AccessKeyScopeOwnerProperty(): DependencyProperty? {
      val fnPtr = _1124852714_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_KeyTipPlacementModeProperty(): DependencyProperty? {
      val fnPtr = _1124852714_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_KeyTipHorizontalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1124852714_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_KeyTipVerticalOffsetProperty(): DependencyProperty? {
      val fnPtr = _1124852714_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1124852714_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class ITextElementStatics4_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1124852714_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITextElementStatics4, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fd8f641e6b1240d5b6efd1bd12ac9066")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITextElementStatics4(ptr: Pointer?): WithDefault = ITextElementStatics4_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITextElementStatics4 {
      val address = segment.toRawLongValue()
      return makeITextElementStatics4(Pointer(address))
    }

    public override fun toNative(obj: ITextElementStatics4): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1124852714_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITextElementStatics4): Array<ITextElementStatics4?> =
        (elements as
        Array<ITextElementStatics4?>).castToImpl<ITextElementStatics4,ITextElementStatics4_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITextElementStatics4?> =
        arrayOfNulls<ITextElementStatics4_Impl>(size) as Array<ITextElementStatics4?>
  }
}
