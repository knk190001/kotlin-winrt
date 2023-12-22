package Windows.UI.Xaml.Media

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

@ABIMarker(IBitmapCache.ABI::class)
@Signature("{79c2219e-44d2-4610-9735-9bec83809ecf}")
@Guid("79c2219e44d2461097359bec83809ecf")
@WinRTInterface("79c2219e44d2461097359bec83809ecf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBitmapCache.ByReference::class)
public interface IBitmapCache : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IBitmapCache> {
    public override fun getValue() = ABI.makeIBitmapCache(pointer.getPointer(0))

    public fun setValue(value: IBitmapCache_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBitmapCache {
    public val __67351529_Ptr: Pointer?

    public val _67351529_VtblPtr: Pointer?
      get() = __67351529_Ptr?.getPointer(0)
  }

  public class IBitmapCache_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __67351529_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBitmapCache, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("79c2219e44d2461097359bec83809ecf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBitmapCache(ptr: Pointer?): WithDefault = IBitmapCache_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBitmapCache {
      val address = segment.toRawLongValue()
      return makeIBitmapCache(Pointer(address))
    }

    public override fun toNative(obj: IBitmapCache): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__67351529_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBitmapCache): Array<IBitmapCache?> = (elements as
        Array<IBitmapCache?>).castToImpl<IBitmapCache,IBitmapCache_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBitmapCache?> =
        arrayOfNulls<IBitmapCache_Impl>(size) as Array<IBitmapCache?>
  }
}
