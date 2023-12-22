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

@ABIMarker(IInkToolbarPenButtonStatics.ABI::class)
@Signature("{b922ce42-09f0-453d-8026-44daf2753f65}")
@Guid("b922ce4209f0453d802644daf2753f65")
@WinRTInterface("b922ce4209f0453d802644daf2753f65")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarPenButtonStatics.ByReference::class)
public interface IInkToolbarPenButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_PaletteProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_MinStrokeWidthProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_MaxStrokeWidthProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_SelectedBrushProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_SelectedBrushIndexProperty(): DependencyProperty?

  @InterfaceMethod(5)
  public fun get_SelectedStrokeWidthProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarPenButtonStatics> {
    public override fun getValue() = ABI.makeIInkToolbarPenButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarPenButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarPenButtonStatics {
    public val __1085174901_Ptr: Pointer?

    public val _1085174901_VtblPtr: Pointer?
      get() = __1085174901_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_PaletteProperty(): DependencyProperty? {
      val fnPtr = _1085174901_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085174901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_MinStrokeWidthProperty(): DependencyProperty? {
      val fnPtr = _1085174901_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085174901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_MaxStrokeWidthProperty(): DependencyProperty? {
      val fnPtr = _1085174901_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085174901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_SelectedBrushProperty(): DependencyProperty? {
      val fnPtr = _1085174901_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085174901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_SelectedBrushIndexProperty(): DependencyProperty? {
      val fnPtr = _1085174901_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085174901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun get_SelectedStrokeWidthProperty(): DependencyProperty? {
      val fnPtr = _1085174901_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__1085174901_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarPenButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1085174901_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarPenButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b922ce4209f0453d802644daf2753f65")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarPenButtonStatics(ptr: Pointer?): WithDefault =
        IInkToolbarPenButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarPenButtonStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarPenButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarPenButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1085174901_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarPenButtonStatics):
        Array<IInkToolbarPenButtonStatics?> = (elements as
        Array<IInkToolbarPenButtonStatics?>).castToImpl<IInkToolbarPenButtonStatics,IInkToolbarPenButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarPenButtonStatics?> =
        arrayOfNulls<IInkToolbarPenButtonStatics_Impl>(size) as Array<IInkToolbarPenButtonStatics?>
  }
}
