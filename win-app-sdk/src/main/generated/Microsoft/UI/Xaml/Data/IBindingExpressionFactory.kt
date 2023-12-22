package Microsoft.UI.Xaml.Data

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

@ABIMarker(IBindingExpressionFactory.ABI::class)
@Signature("{086cae14-81a1-588b-b619-05ee84c0f089}")
@Guid("086cae1481a1588bb61905ee84c0f089")
@WinRTInterface("086cae1481a1588bb61905ee84c0f089")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBindingExpressionFactory.ByReference::class)
public interface IBindingExpressionFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBindingExpressionFactory> {
    public override fun getValue() = ABI.makeIBindingExpressionFactory(pointer.getPointer(0))

    public fun setValue(value: IBindingExpressionFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBindingExpressionFactory {
    public val __20278176_Ptr: Pointer?

    public val _20278176_VtblPtr: Pointer?
      get() = __20278176_Ptr?.getPointer(0)
  }

  public class IBindingExpressionFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __20278176_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBindingExpressionFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("086cae1481a1588bb61905ee84c0f089")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBindingExpressionFactory(ptr: Pointer?): WithDefault =
        IBindingExpressionFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBindingExpressionFactory {
      val address = segment.toRawLongValue()
      return makeIBindingExpressionFactory(Pointer(address))
    }

    public override fun toNative(obj: IBindingExpressionFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__20278176_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBindingExpressionFactory):
        Array<IBindingExpressionFactory?> = (elements as
        Array<IBindingExpressionFactory?>).castToImpl<IBindingExpressionFactory,IBindingExpressionFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBindingExpressionFactory?> =
        arrayOfNulls<IBindingExpressionFactory_Impl>(size) as Array<IBindingExpressionFactory?>
  }
}
