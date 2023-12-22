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

@ABIMarker(IPointAnimationStatics.ABI::class)
@Signature("{2f99b356-e737-408b-a0fd-327826d32255}")
@Guid("2f99b356e737408ba0fd327826d32255")
@WinRTInterface("2f99b356e737408ba0fd327826d32255")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPointAnimationStatics.ByReference::class)
public interface IPointAnimationStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_FromProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_ToProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ByProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_EasingFunctionProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_EnableDependentAnimationProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPointAnimationStatics> {
    public override fun getValue() = ABI.makeIPointAnimationStatics(pointer.getPointer(0))

    public fun setValue(value: IPointAnimationStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPointAnimationStatics {
    public val __469897995_Ptr: Pointer?

    public val _469897995_VtblPtr: Pointer?
      get() = __469897995_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_FromProperty(): DependencyProperty? {
      val fnPtr = _469897995_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__469897995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ToProperty(): DependencyProperty? {
      val fnPtr = _469897995_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__469897995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ByProperty(): DependencyProperty? {
      val fnPtr = _469897995_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__469897995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_EasingFunctionProperty(): DependencyProperty? {
      val fnPtr = _469897995_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__469897995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_EnableDependentAnimationProperty(): DependencyProperty? {
      val fnPtr = _469897995_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__469897995_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IPointAnimationStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __469897995_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPointAnimationStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2f99b356e737408ba0fd327826d32255")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPointAnimationStatics(ptr: Pointer?): WithDefault =
        IPointAnimationStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPointAnimationStatics {
      val address = segment.toRawLongValue()
      return makeIPointAnimationStatics(Pointer(address))
    }

    public override fun toNative(obj: IPointAnimationStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__469897995_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPointAnimationStatics): Array<IPointAnimationStatics?> =
        (elements as
        Array<IPointAnimationStatics?>).castToImpl<IPointAnimationStatics,IPointAnimationStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPointAnimationStatics?> =
        arrayOfNulls<IPointAnimationStatics_Impl>(size) as Array<IPointAnimationStatics?>
  }
}
