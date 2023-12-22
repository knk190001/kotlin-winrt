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

@ABIMarker(IProgressRingStatics.ABI::class)
@Signature("{4ba1166a-cec2-50e2-b26b-66b69dc2e371}")
@Guid("4ba1166acec250e2b26b66b69dc2e371")
@WinRTInterface("4ba1166acec250e2b26b66b69dc2e371")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IProgressRingStatics.ByReference::class)
public interface IProgressRingStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_IsActiveProperty(): DependencyProperty?

  @InterfaceMethod(1)
  public fun get_IsIndeterminateProperty(): DependencyProperty?

  @InterfaceMethod(2)
  public fun get_ValueProperty(): DependencyProperty?

  @InterfaceMethod(3)
  public fun get_MinimumProperty(): DependencyProperty?

  @InterfaceMethod(4)
  public fun get_MaximumProperty(): DependencyProperty?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IProgressRingStatics> {
    public override fun getValue() = ABI.makeIProgressRingStatics(pointer.getPointer(0))

    public fun setValue(value: IProgressRingStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IProgressRingStatics {
    public val __200358431_Ptr: Pointer?

    public val _200358431_VtblPtr: Pointer?
      get() = __200358431_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_IsActiveProperty(): DependencyProperty? {
      val fnPtr = _200358431_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__200358431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_IsIndeterminateProperty(): DependencyProperty? {
      val fnPtr = _200358431_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__200358431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_ValueProperty(): DependencyProperty? {
      val fnPtr = _200358431_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__200358431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_MinimumProperty(): DependencyProperty? {
      val fnPtr = _200358431_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__200358431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun get_MaximumProperty(): DependencyProperty? {
      val fnPtr = _200358431_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DependencyProperty>()
      val hr = fn.invokeHR(arrayOf(__200358431_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DependencyProperty>(result.getValue())
      return resultValue
    }
  }

  public class IProgressRingStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __200358431_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IProgressRingStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4ba1166acec250e2b26b66b69dc2e371")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIProgressRingStatics(ptr: Pointer?): WithDefault = IProgressRingStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IProgressRingStatics {
      val address = segment.toRawLongValue()
      return makeIProgressRingStatics(Pointer(address))
    }

    public override fun toNative(obj: IProgressRingStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__200358431_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IProgressRingStatics): Array<IProgressRingStatics?> =
        (elements as
        Array<IProgressRingStatics?>).castToImpl<IProgressRingStatics,IProgressRingStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IProgressRingStatics?> =
        arrayOfNulls<IProgressRingStatics_Impl>(size) as Array<IProgressRingStatics?>
  }
}
