package Windows.UI.Xaml

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

@ABIMarker(IUIElementFactory.ABI::class)
@Signature("{b9ee93fe-a338-419f-ac32-91dcaadf5d08}")
@Guid("b9ee93fea338419fac3291dcaadf5d08")
@WinRTInterface("b9ee93fea338419fac3291dcaadf5d08")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IUIElementFactory.ByReference::class)
public interface IUIElementFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IUIElementFactory> {
    public override fun getValue() = ABI.makeIUIElementFactory(pointer.getPointer(0))

    public fun setValue(value: IUIElementFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IUIElementFactory {
    public val __1159100500_Ptr: Pointer?

    public val _1159100500_VtblPtr: Pointer?
      get() = __1159100500_Ptr?.getPointer(0)
  }

  public class IUIElementFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1159100500_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IUIElementFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b9ee93fea338419fac3291dcaadf5d08")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIUIElementFactory(ptr: Pointer?): WithDefault = IUIElementFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IUIElementFactory {
      val address = segment.toRawLongValue()
      return makeIUIElementFactory(Pointer(address))
    }

    public override fun toNative(obj: IUIElementFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1159100500_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IUIElementFactory): Array<IUIElementFactory?> = (elements
        as Array<IUIElementFactory?>).castToImpl<IUIElementFactory,IUIElementFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IUIElementFactory?> =
        arrayOfNulls<IUIElementFactory_Impl>(size) as Array<IUIElementFactory?>
  }
}
