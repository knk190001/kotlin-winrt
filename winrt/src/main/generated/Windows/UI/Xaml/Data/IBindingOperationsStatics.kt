package Windows.UI.Xaml.Data

import Windows.UI.Xaml.DependencyObject
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

@ABIMarker(IBindingOperationsStatics.ABI::class)
@Signature("{e155ef73-95a0-4aab-8c7d-2a47da073c79}")
@Guid("e155ef7395a04aab8c7d2a47da073c79")
@WinRTInterface("e155ef7395a04aab8c7d2a47da073c79")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingOperationsStatics.ByReference::class)
public interface IBindingOperationsStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetBinding(
    target: DependencyObject?,
    dp: DependencyProperty?,
    binding: BindingBase?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingOperationsStatics> {
    public override fun getValue() = ABI.makeIBindingOperationsStatics(pointer.getPointer(0))

    public fun setValue(value: IBindingOperationsStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingOperationsStatics {
    public val __493215652_Ptr: Pointer?

    public val _493215652_VtblPtr: Pointer?
      get() = __493215652_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetBinding(
      target: DependencyObject?,
      dp: DependencyProperty?,
      binding: BindingBase?
    ): Unit {
      val fnPtr = _493215652_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__493215652_Ptr, marshalToNative(target), marshalToNative(dp),
          marshalToNative(binding),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IBindingOperationsStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __493215652_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingOperationsStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e155ef7395a04aab8c7d2a47da073c79")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingOperationsStatics(ptr: Pointer?): WithDefault =
        IBindingOperationsStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingOperationsStatics {
      val address = segment.toRawLongValue()
      return makeIBindingOperationsStatics(Pointer(address))
    }

    public override fun toNative(obj: IBindingOperationsStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__493215652_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingOperationsStatics):
        Array<IBindingOperationsStatics?> = (elements as
        Array<IBindingOperationsStatics?>).castToImpl<IBindingOperationsStatics,IBindingOperationsStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingOperationsStatics?> =
        arrayOfNulls<IBindingOperationsStatics_Impl>(size) as Array<IBindingOperationsStatics?>
  }
}
