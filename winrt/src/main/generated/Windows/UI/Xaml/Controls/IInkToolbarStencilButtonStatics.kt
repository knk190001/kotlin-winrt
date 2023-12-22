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

@ABIMarker(IInkToolbarStencilButtonStatics.ABI::class)
@Signature("{4748c07f-63e4-420d-939a-6b7243e9d124}")
@Guid("4748c07f63e4420d939a6b7243e9d124")
@WinRTInterface("4748c07f63e4420d939a6b7243e9d124")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInkToolbarStencilButtonStatics.ByReference::class)
public interface IInkToolbarStencilButtonStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_RulerProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ProtractorProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_SelectedStencilProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_IsRulerItemVisibleProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_IsProtractorItemVisibleProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInkToolbarStencilButtonStatics> {
    public override fun getValue() = ABI.makeIInkToolbarStencilButtonStatics(pointer.getPointer(0))

    public fun setValue(value: IInkToolbarStencilButtonStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInkToolbarStencilButtonStatics {
    public val __80162632_Ptr: Pointer?

    public val _80162632_VtblPtr: Pointer?
      get() = __80162632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_RulerProperty(): DependencyProperty? {
      val fnPtr = _80162632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__80162632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ProtractorProperty(): DependencyProperty? {
      val fnPtr = _80162632_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__80162632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_SelectedStencilProperty(): DependencyProperty? {
      val fnPtr = _80162632_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__80162632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsRulerItemVisibleProperty(): DependencyProperty? {
      val fnPtr = _80162632_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__80162632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_IsProtractorItemVisibleProperty(): DependencyProperty? {
      val fnPtr = _80162632_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__80162632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IInkToolbarStencilButtonStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __80162632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInkToolbarStencilButtonStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4748c07f63e4420d939a6b7243e9d124")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInkToolbarStencilButtonStatics(ptr: Pointer?): WithDefault =
        IInkToolbarStencilButtonStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInkToolbarStencilButtonStatics {
      val address = segment.toRawLongValue()
      return makeIInkToolbarStencilButtonStatics(Pointer(address))
    }

    public override fun toNative(obj: IInkToolbarStencilButtonStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__80162632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInkToolbarStencilButtonStatics):
        Array<IInkToolbarStencilButtonStatics?> = (elements as
        Array<IInkToolbarStencilButtonStatics?>).castToImpl<IInkToolbarStencilButtonStatics,IInkToolbarStencilButtonStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInkToolbarStencilButtonStatics?> =
        arrayOfNulls<IInkToolbarStencilButtonStatics_Impl>(size) as
        Array<IInkToolbarStencilButtonStatics?>
  }
}
