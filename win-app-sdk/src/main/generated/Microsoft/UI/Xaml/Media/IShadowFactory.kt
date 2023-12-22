package Microsoft.UI.Xaml.Media

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

@ABIMarker(IShadowFactory.ABI::class)
@Signature("{c9115fbb-fcc3-52bf-b8ee-c348102a46e0}")
@Guid("c9115fbbfcc352bfb8eec348102a46e0")
@WinRTInterface("c9115fbbfcc352bfb8eec348102a46e0")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShadowFactory.ByReference::class)
public interface IShadowFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IShadowFactory>
      {
    public override fun getValue() = ABI.makeIShadowFactory(pointer.getPointer(0))

    public fun setValue(value: IShadowFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShadowFactory {
    public val __782275783_Ptr: Pointer?

    public val _782275783_VtblPtr: Pointer?
      get() = __782275783_Ptr?.getPointer(0)
  }

  public class IShadowFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __782275783_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShadowFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("c9115fbbfcc352bfb8eec348102a46e0")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShadowFactory(ptr: Pointer?): WithDefault = IShadowFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShadowFactory {
      val address = segment.toRawLongValue()
      return makeIShadowFactory(Pointer(address))
    }

    public override fun toNative(obj: IShadowFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__782275783_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShadowFactory): Array<IShadowFactory?> = (elements as
        Array<IShadowFactory?>).castToImpl<IShadowFactory,IShadowFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShadowFactory?> =
        arrayOfNulls<IShadowFactory_Impl>(size) as Array<IShadowFactory?>
  }
}
