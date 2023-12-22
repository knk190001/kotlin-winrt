package Microsoft.Windows.ApplicationModel.Resources

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

@ABIMarker(IResourceManager2.ABI::class)
@Signature("{7ec10160-a154-5c42-8268-30e306b1f585}")
@Guid("7ec10160a1545c42826830e306b1f585")
@WinRTInterface("7ec10160a1545c42826830e306b1f585")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IResourceManager2.ByReference::class)
public interface IResourceManager2 : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IResourceManager2> {
    public override fun getValue() = ABI.makeIResourceManager2(pointer.getPointer(0))

    public fun setValue(value: IResourceManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IResourceManager2 {
    public val __281643617_Ptr: Pointer?

    public val _281643617_VtblPtr: Pointer?
      get() = __281643617_Ptr?.getPointer(0)
  }

  public class IResourceManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __281643617_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IResourceManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("7ec10160a1545c42826830e306b1f585")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIResourceManager2(ptr: Pointer?): WithDefault = IResourceManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IResourceManager2 {
      val address = segment.toRawLongValue()
      return makeIResourceManager2(Pointer(address))
    }

    public override fun toNative(obj: IResourceManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__281643617_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IResourceManager2): Array<IResourceManager2?> = (elements
        as Array<IResourceManager2?>).castToImpl<IResourceManager2,IResourceManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IResourceManager2?> =
        arrayOfNulls<IResourceManager2_Impl>(size) as Array<IResourceManager2?>
  }
}
