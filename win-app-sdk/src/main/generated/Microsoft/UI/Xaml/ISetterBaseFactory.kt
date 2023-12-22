package Microsoft.UI.Xaml

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
@Signature("{780a1d2f-c4be-5707-8a8a-4550dc22583e}")
@Guid("780a1d2fc4be57078a8a4550dc22583e")
@WinRTInterface("780a1d2fc4be57078a8a4550dc22583e")
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
    public val __857193069_Ptr: Pointer?

    public val _857193069_VtblPtr: Pointer?
      get() = __857193069_Ptr?.getPointer(0)
  }

  public class ISetterBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __857193069_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISetterBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("780a1d2fc4be57078a8a4550dc22583e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISetterBaseFactory(ptr: Pointer?): WithDefault = ISetterBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISetterBaseFactory {
      val address = segment.toRawLongValue()
      return makeISetterBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: ISetterBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__857193069_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISetterBaseFactory): Array<ISetterBaseFactory?> =
        (elements as
        Array<ISetterBaseFactory?>).castToImpl<ISetterBaseFactory,ISetterBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISetterBaseFactory?> =
        arrayOfNulls<ISetterBaseFactory_Impl>(size) as Array<ISetterBaseFactory?>
  }
}
