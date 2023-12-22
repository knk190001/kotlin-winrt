package Microsoft.UI.Xaml.Controls

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

@ABIMarker(IIconElementFactory.ABI::class)
@Signature("{7161eeff-2cc3-59c9-b355-f752ef2030fb}")
@Guid("7161eeff2cc359c9b355f752ef2030fb")
@WinRTInterface("7161eeff2cc359c9b355f752ef2030fb")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconElementFactory.ByReference::class)
public interface IIconElementFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconElementFactory> {
    public override fun getValue() = ABI.makeIIconElementFactory(pointer.getPointer(0))

    public fun setValue(value: IIconElementFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconElementFactory {
    public val __945807694_Ptr: Pointer?

    public val _945807694_VtblPtr: Pointer?
      get() = __945807694_Ptr?.getPointer(0)
  }

  public class IIconElementFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __945807694_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconElementFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7161eeff2cc359c9b355f752ef2030fb")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconElementFactory(ptr: Pointer?): WithDefault = IIconElementFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconElementFactory {
      val address = segment.toRawLongValue()
      return makeIIconElementFactory(Pointer(address))
    }

    public override fun toNative(obj: IIconElementFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__945807694_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconElementFactory): Array<IIconElementFactory?> =
        (elements as
        Array<IIconElementFactory?>).castToImpl<IIconElementFactory,IIconElementFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconElementFactory?> =
        arrayOfNulls<IIconElementFactory_Impl>(size) as Array<IIconElementFactory?>
  }
}
