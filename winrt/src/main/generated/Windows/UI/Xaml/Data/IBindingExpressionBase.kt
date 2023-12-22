package Windows.UI.Xaml.Data

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
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
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IBindingExpressionBase.ABI::class)
@Signature("{fded3154-e954-4f67-8fb6-6ed79b3a1cb3}")
@Guid("fded3154e9544f678fb66ed79b3a1cb3")
@WinRTInterface("fded3154e9544f678fb66ed79b3a1cb3")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingExpressionBase.ByReference::class)
public interface IBindingExpressionBase : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingExpressionBase> {
    public override fun getValue() = ABI.makeIBindingExpressionBase(pointer.getPointer(0))

    public fun setValue(value: IBindingExpressionBase_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingExpressionBase {
    public val __124324422_Ptr: Pointer?

    public val _124324422_VtblPtr: Pointer?
      get() = __124324422_Ptr?.getPointer(0)
  }

  public class IBindingExpressionBase_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __124324422_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingExpressionBase, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("fded3154e9544f678fb66ed79b3a1cb3")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingExpressionBase(ptr: Pointer?): WithDefault =
        IBindingExpressionBase_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingExpressionBase {
      val address = segment.toRawLongValue()
      return makeIBindingExpressionBase(Pointer(address))
    }

    public override fun toNative(obj: IBindingExpressionBase): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__124324422_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingExpressionBase): Array<IBindingExpressionBase?> =
        (elements as
        Array<IBindingExpressionBase?>).castToImpl<IBindingExpressionBase,IBindingExpressionBase_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingExpressionBase?> =
        arrayOfNulls<IBindingExpressionBase_Impl>(size) as Array<IBindingExpressionBase?>
  }
}
