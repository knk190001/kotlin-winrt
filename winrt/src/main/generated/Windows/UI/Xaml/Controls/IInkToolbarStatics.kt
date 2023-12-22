package Windows.UI.Xaml.Controls

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

@ABIMarker(IInkToolbarStatics.ABI::class)
@Signature("{a3b493bb-cb4f-4e6b-a33d-f11e7a295efa}")
@Guid("a3b493bbcb4f4e6ba33df11e7a295efa")
@WinRTInterface("a3b493bbcb4f4e6ba33df11e7a295efa")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarStatics.ByReference::class)
public interface IInkToolbarStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_InitialControlsProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ChildrenProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ActiveToolProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_InkDrawingAttributesProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsRulerButtonCheckedProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_TargetInkCanvasProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarStatics> {
    public override fun getValue() = ABI.makeIInkToolbarStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarStatics {
    public val __219591860_Ptr: Pointer?

    public val _219591860_VtblPtr: Pointer?
      get() = __219591860_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_InitialControlsProperty(): DependencyProperty? {
      val fnPtr = _219591860_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__219591860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChildrenProperty(): DependencyProperty? {
      val fnPtr = _219591860_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__219591860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ActiveToolProperty(): DependencyProperty? {
      val fnPtr = _219591860_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__219591860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_InkDrawingAttributesProperty(): DependencyProperty? {
      val fnPtr = _219591860_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__219591860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsRulerButtonCheckedProperty(): DependencyProperty? {
      val fnPtr = _219591860_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__219591860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_TargetInkCanvasProperty(): DependencyProperty? {
      val fnPtr = _219591860_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__219591860_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __219591860_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a3b493bbcb4f4e6ba33df11e7a295efa")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarStatics(ptr: Pointer?): WithDefault = IInkToolbarStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__219591860_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarStatics): Array<IInkToolbarStatics?> =
        (elements as
        Array<IInkToolbarStatics?>).castToImpl<IInkToolbarStatics,IInkToolbarStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarStatics?> =
        arrayOfNulls<IInkToolbarStatics_Impl>(size) as Array<IInkToolbarStatics?>
  }
}
