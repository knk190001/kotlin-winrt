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

@ABIMarker(IBindingExpressionBaseFactory.ABI::class)
@Signature("{ea7116a7-c2d9-4375-b471-66b9c48c7930}")
@Guid("ea7116a7c2d94375b47166b9c48c7930")
@WinRTInterface("ea7116a7c2d94375b47166b9c48c7930")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingExpressionBaseFactory.ByReference::class)
public interface IBindingExpressionBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingExpressionBaseFactory> {
    public override fun getValue() = ABI.makeIBindingExpressionBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IBindingExpressionBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingExpressionBaseFactory {
    public val __705838108_Ptr: Pointer?

    public val _705838108_VtblPtr: Pointer?
      get() = __705838108_Ptr?.getPointer(0)
  }

  public class IBindingExpressionBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __705838108_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingExpressionBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ea7116a7c2d94375b47166b9c48c7930")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingExpressionBaseFactory(ptr: Pointer?): WithDefault =
        IBindingExpressionBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingExpressionBaseFactory {
      val address = segment.toRawLongValue()
      return makeIBindingExpressionBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IBindingExpressionBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__705838108_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingExpressionBaseFactory):
        Array<IBindingExpressionBaseFactory?> = (elements as
        Array<IBindingExpressionBaseFactory?>).castToImpl<IBindingExpressionBaseFactory,IBindingExpressionBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingExpressionBaseFactory?> =
        arrayOfNulls<IBindingExpressionBaseFactory_Impl>(size) as
        Array<IBindingExpressionBaseFactory?>
  }
}
