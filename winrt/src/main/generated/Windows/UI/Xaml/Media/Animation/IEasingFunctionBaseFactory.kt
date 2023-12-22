package Windows.UI.Xaml.Media.Animation

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

@ABIMarker(IEasingFunctionBaseFactory.ABI::class)
@Signature("{1830fe6a-f01b-43e0-b61f-b452a1c66fd2}")
@Guid("1830fe6af01b43e0b61fb452a1c66fd2")
@WinRTInterface("1830fe6af01b43e0b61fb452a1c66fd2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEasingFunctionBaseFactory.ByReference::class)
public interface IEasingFunctionBaseFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEasingFunctionBaseFactory> {
    public override fun getValue() = ABI.makeIEasingFunctionBaseFactory(pointer.getPointer(0))

    public fun setValue(value: IEasingFunctionBaseFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEasingFunctionBaseFactory {
    public val __2003229584_Ptr: Pointer?

    public val _2003229584_VtblPtr: Pointer?
      get() = __2003229584_Ptr?.getPointer(0)
  }

  public class IEasingFunctionBaseFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2003229584_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEasingFunctionBaseFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("1830fe6af01b43e0b61fb452a1c66fd2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEasingFunctionBaseFactory(ptr: Pointer?): WithDefault =
        IEasingFunctionBaseFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEasingFunctionBaseFactory {
      val address = segment.toRawLongValue()
      return makeIEasingFunctionBaseFactory(Pointer(address))
    }

    public override fun toNative(obj: IEasingFunctionBaseFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2003229584_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEasingFunctionBaseFactory):
        Array<IEasingFunctionBaseFactory?> = (elements as
        Array<IEasingFunctionBaseFactory?>).castToImpl<IEasingFunctionBaseFactory,IEasingFunctionBaseFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEasingFunctionBaseFactory?> =
        arrayOfNulls<IEasingFunctionBaseFactory_Impl>(size) as Array<IEasingFunctionBaseFactory?>
  }
}
