package Microsoft.UI.Content

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

@ABIMarker(IContentIslandFactory.ABI::class)
@Signature("{82383f52-e81a-5ec9-a954-bac8a931ba7d}")
@Guid("82383f52e81a5ec9a954bac8a931ba7d")
@WinRTInterface("82383f52e81a5ec9a954bac8a931ba7d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentIslandFactory.ByReference::class)
public interface IContentIslandFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentIslandFactory> {
    public override fun getValue() = ABI.makeIContentIslandFactory(pointer.getPointer(0))

    public fun setValue(value: IContentIslandFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentIslandFactory {
    public val __1261461606_Ptr: Pointer?

    public val _1261461606_VtblPtr: Pointer?
      get() = __1261461606_Ptr?.getPointer(0)
  }

  public class IContentIslandFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1261461606_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentIslandFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("82383f52e81a5ec9a954bac8a931ba7d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentIslandFactory(ptr: Pointer?): WithDefault =
        IContentIslandFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentIslandFactory {
      val address = segment.toRawLongValue()
      return makeIContentIslandFactory(Pointer(address))
    }

    public override fun toNative(obj: IContentIslandFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1261461606_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentIslandFactory): Array<IContentIslandFactory?> =
        (elements as
        Array<IContentIslandFactory?>).castToImpl<IContentIslandFactory,IContentIslandFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentIslandFactory?> =
        arrayOfNulls<IContentIslandFactory_Impl>(size) as Array<IContentIslandFactory?>
  }
}
