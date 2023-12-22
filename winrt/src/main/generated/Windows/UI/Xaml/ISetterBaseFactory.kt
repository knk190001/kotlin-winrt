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

@ABIMarker(ISetterBaseFactory.ABI::class)
@Signature("{81f8ad60-1ce8-469d-a667-16e37cef8ba9}")
@Guid("81f8ad601ce8469da66716e37cef8ba9")
@WinRTInterface("81f8ad601ce8469da66716e37cef8ba9")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISetterBaseFactory.ByReference::class)
public interface ISetterBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISetterBaseFactory> {
    public override fun getValue() = ABI.makeISetterBaseFactory(pointer.getPointer(0))

    public fun setValue(value: ISetterBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISetterBaseFactory {
    public val __1050038552_Ptr: Pointer?

    public val _1050038552_VtblPtr: Pointer?
      get() = __1050038552_Ptr?.getPointer(0)
  }

  public class ISetterBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1050038552_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetterBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("81f8ad601ce8469da66716e37cef8ba9")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetterBaseFactory(ptr: Pointer?): WithDefault = ISetterBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetterBaseFactory {
      val address = segment.toRawLongValue()
      return makeISetterBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: ISetterBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1050038552_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetterBaseFactory): Array<ISetterBaseFactory?> =
        (elements as
        Array<ISetterBaseFactory?>).castToImpl<ISetterBaseFactory,ISetterBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetterBaseFactory?> =
        arrayOfNulls<ISetterBaseFactory_Impl>(size) as Array<ISetterBaseFactory?>
  }
}
