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

@ABIMarker(IPathSegmentFactory.ABI::class)
@Signature("{0559a4ff-ac4b-5bb7-b541-d373960e083b}")
@Guid("0559a4ffac4b5bb7b541d373960e083b")
@WinRTInterface("0559a4ffac4b5bb7b541d373960e083b")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPathSegmentFactory.ByReference::class)
public interface IPathSegmentFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPathSegmentFactory> {
    public override fun getValue() = ABI.makeIPathSegmentFactory(pointer.getPointer(0))

    public fun setValue(value: IPathSegmentFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPathSegmentFactory {
    public val __2023918643_Ptr: Pointer?

    public val _2023918643_VtblPtr: Pointer?
      get() = __2023918643_Ptr?.getPointer(0)
  }

  public class IPathSegmentFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2023918643_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPathSegmentFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0559a4ffac4b5bb7b541d373960e083b")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPathSegmentFactory(ptr: Pointer?): WithDefault = IPathSegmentFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPathSegmentFactory {
      val address = segment.toRawLongValue()
      return makeIPathSegmentFactory(Pointer(address))
    }

    public override fun toNative(obj: IPathSegmentFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2023918643_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPathSegmentFactory): Array<IPathSegmentFactory?> =
        (elements as
        Array<IPathSegmentFactory?>).castToImpl<IPathSegmentFactory,IPathSegmentFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPathSegmentFactory?> =
        arrayOfNulls<IPathSegmentFactory_Impl>(size) as Array<IPathSegmentFactory?>
  }
}
