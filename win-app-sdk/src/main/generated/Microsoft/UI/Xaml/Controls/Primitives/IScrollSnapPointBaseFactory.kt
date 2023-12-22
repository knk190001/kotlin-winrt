package Microsoft.UI.Xaml.Controls.Primitives

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

@ABIMarker(IScrollSnapPointBaseFactory.ABI::class)
@Signature("{3fa2e552-1a45-5691-99dc-6400087cbb38}")
@Guid("3fa2e5521a45569199dc6400087cbb38")
@WinRTInterface("3fa2e5521a45569199dc6400087cbb38")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IScrollSnapPointBaseFactory.ByReference::class)
public interface IScrollSnapPointBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IScrollSnapPointBaseFactory> {
    public override fun getValue() = ABI.makeIScrollSnapPointBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IScrollSnapPointBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IScrollSnapPointBaseFactory {
    public val __126315697_Ptr: Pointer?

    public val _126315697_VtblPtr: Pointer?
      get() = __126315697_Ptr?.getPointer(0)
  }

  public class IScrollSnapPointBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __126315697_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IScrollSnapPointBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fa2e5521a45569199dc6400087cbb38")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIScrollSnapPointBaseFactory(ptr: Pointer?): WithDefault =
        IScrollSnapPointBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IScrollSnapPointBaseFactory {
      val address = segment.toRawLongValue()
      return makeIScrollSnapPointBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IScrollSnapPointBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__126315697_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IScrollSnapPointBaseFactory):
        Array<IScrollSnapPointBaseFactory?> = (elements as
        Array<IScrollSnapPointBaseFactory?>).castToImpl<IScrollSnapPointBaseFactory,IScrollSnapPointBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IScrollSnapPointBaseFactory?> =
        arrayOfNulls<IScrollSnapPointBaseFactory_Impl>(size) as Array<IScrollSnapPointBaseFactory?>
  }
}
