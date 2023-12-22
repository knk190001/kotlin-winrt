package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IContentDialogStatics.ABI::class)
@Signature("{397b18dd-6964-5056-97c3-d69cd7716a4b}")
@Guid("397b18dd6964505697c3d69cd7716a4b")
@WinRTInterface("397b18dd6964505697c3d69cd7716a4b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentDialogStatics.ByReference::class)
public interface IContentDialogStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_TitleProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_TitleTemplateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_FullSizeDesiredProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_PrimaryButtonTextProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SecondaryButtonTextProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_CloseButtonTextProperty(): DependencyProperty?

  @InterfaceMethod(6)
  public fun get_PrimaryButtonCommandProperty(): DependencyProperty?

  @InterfaceMethod(7)
  public fun get_SecondaryButtonCommandProperty(): DependencyProperty?

  @InterfaceMethod(8)
  public fun get_CloseButtonCommandProperty(): DependencyProperty?

  @InterfaceMethod(9)
  public fun get_PrimaryButtonCommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(10)
  public fun get_SecondaryButtonCommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(11)
  public fun get_CloseButtonCommandParameterProperty(): DependencyProperty?

  @InterfaceMethod(12)
  public fun get_IsPrimaryButtonEnabledProperty(): DependencyProperty?

  @InterfaceMethod(13)
  public fun get_IsSecondaryButtonEnabledProperty(): DependencyProperty?

  @InterfaceMethod(14)
  public fun get_PrimaryButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(15)
  public fun get_SecondaryButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(16)
  public fun get_CloseButtonStyleProperty(): DependencyProperty?

  @InterfaceMethod(17)
  public fun get_DefaultButtonProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentDialogStatics> {
    public override fun getValue() = ABI.makeIContentDialogStatics(pointer.getPointer(0))

    public fun setValue(value: IContentDialogStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentDialogStatics {
    public val __1334868565_Ptr: Pointer?

    public val _1334868565_VtblPtr: Pointer?
      get() = __1334868565_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_TitleProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_TitleTemplateProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_FullSizeDesiredProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_PrimaryButtonTextProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SecondaryButtonTextProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_CloseButtonTextProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun get_PrimaryButtonCommandProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun get_SecondaryButtonCommandProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun get_CloseButtonCommandProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun get_PrimaryButtonCommandParameterProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun get_SecondaryButtonCommandParameterProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun get_CloseButtonCommandParameterProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(12)
    public override fun get_IsPrimaryButtonEnabledProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(13)
    public override fun get_IsSecondaryButtonEnabledProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(14)
    public override fun get_PrimaryButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(15)
    public override fun get_SecondaryButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(21L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(16)
    public override fun get_CloseButtonStyleProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(22L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(17)
    public override fun get_DefaultButtonProperty(): DependencyProperty? {
      val fnPtr = _1334868565_VtblPtr!!.getPointer(23L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1334868565_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IContentDialogStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1334868565_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentDialogStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("397b18dd6964505697c3d69cd7716a4b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentDialogStatics(ptr: Pointer?): WithDefault =
        IContentDialogStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentDialogStatics {
      val address = segment.toRawLongValue()
      return makeIContentDialogStatics(Pointer(address))
    }

    public override fun toNative(obj: IContentDialogStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1334868565_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentDialogStatics): Array<IContentDialogStatics?> =
        (elements as
        Array<IContentDialogStatics?>).castToImpl<IContentDialogStatics,IContentDialogStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentDialogStatics?> =
        arrayOfNulls<IContentDialogStatics_Impl>(size) as Array<IContentDialogStatics?>
  }
}
