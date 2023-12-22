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

@ABIMarker(IExceptionRoutedEventArgsFactory.ABI::class)
@Signature("{e1e71fb6-2ad0-5189-8d96-33bae488c5fb}")
@Guid("e1e71fb62ad051898d9633bae488c5fb")
@WinRTInterface("e1e71fb62ad051898d9633bae488c5fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExceptionRoutedEventArgsFactory.ByReference::class)
public interface IExceptionRoutedEventArgsFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IExceptionRoutedEventArgsFactory> {
    public override fun getValue() = ABI.makeIExceptionRoutedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: IExceptionRoutedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExceptionRoutedEventArgsFactory {
    public val __219673046_Ptr: Pointer?

    public val _219673046_VtblPtr: Pointer?
      get() = __219673046_Ptr?.getPointer(0)
  }

  public class IExceptionRoutedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __219673046_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExceptionRoutedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e1e71fb62ad051898d9633bae488c5fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExceptionRoutedEventArgsFactory(ptr: Pointer?): WithDefault =
        IExceptionRoutedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExceptionRoutedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeIExceptionRoutedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: IExceptionRoutedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__219673046_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExceptionRoutedEventArgsFactory):
        Array<IExceptionRoutedEventArgsFactory?> = (elements as
        Array<IExceptionRoutedEventArgsFactory?>).castToImpl<IExceptionRoutedEventArgsFactory,IExceptionRoutedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExceptionRoutedEventArgsFactory?> =
        arrayOfNulls<IExceptionRoutedEventArgsFactory_Impl>(size) as
        Array<IExceptionRoutedEventArgsFactory?>
  }
}
