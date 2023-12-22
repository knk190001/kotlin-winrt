package Microsoft.UI.Xaml.Documents

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

@ABIMarker(IHyperlinkStatics.ABI::class)
@Signature("{e13598f4-7bc7-5ab9-885b-70f32f8c9531}")
@Guid("e13598f47bc75ab9885b70f32f8c9531")
@WinRTInterface("e13598f47bc75ab9885b70f32f8c9531")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IHyperlinkStatics.ByReference::class)
public interface IHyperlinkStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_NavigateUriProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_UnderlineStyleProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_XYFocusLeftProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_XYFocusRightProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_XYFocusUpProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_XYFocusDownProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_ElementSoundModeProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_FocusStateProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_XYFocusUpNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_XYFocusDownNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_XYFocusLeftNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_XYFocusRightNavigationStrategyProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_IsTabStopProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_TabIndexProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IHyperlinkStatics> {
    public override fun getValue() = ABI.makeIHyperlinkStatics(pointer.getPointer(0))

    public fun setValue(value: IHyperlinkStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IHyperlinkStatics {
    public val __1042988964_Ptr: Pointer?

    public val _1042988964_VtblPtr: Pointer?
      get() = __1042988964_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_NavigateUriProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_UnderlineStyleProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_XYFocusLeftProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_XYFocusRightProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_XYFocusUpProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_XYFocusDownProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_ElementSoundModeProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_FocusStateProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_XYFocusUpNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_XYFocusDownNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_XYFocusLeftNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_XYFocusRightNavigationStrategyProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IsTabStopProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_TabIndexProperty(): DependencyProperty? {
      val fnPtr = _1042988964_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1042988964_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IHyperlinkStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1042988964_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IHyperlinkStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e13598f47bc75ab9885b70f32f8c9531")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIHyperlinkStatics(ptr: Pointer?): WithDefault = IHyperlinkStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IHyperlinkStatics {
      val address = segment.toRawLongValue()
      return makeIHyperlinkStatics(Pointer(address))
    }

    public override fun toNative(obj: IHyperlinkStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1042988964_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IHyperlinkStatics): Array<IHyperlinkStatics?> = (elements
        as Array<IHyperlinkStatics?>).castToImpl<IHyperlinkStatics,IHyperlinkStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IHyperlinkStatics?> =
        arrayOfNulls<IHyperlinkStatics_Impl>(size) as Array<IHyperlinkStatics?>
  }
}
