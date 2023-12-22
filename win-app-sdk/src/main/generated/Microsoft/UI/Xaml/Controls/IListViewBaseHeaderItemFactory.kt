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

@ABIMarker(IListViewBaseHeaderItemFactory.ABI::class)
@Signature("{228fc10a-b86f-5b57-96f4-34d9f9fb8711}")
@Guid("228fc10ab86f5b5796f434d9f9fb8711")
@WinRTInterface("228fc10ab86f5b5796f434d9f9fb8711")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IListViewBaseHeaderItemFactory.ByReference::class)
public interface IListViewBaseHeaderItemFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IListViewBaseHeaderItemFactory> {
    public override fun getValue() = ABI.makeIListViewBaseHeaderItemFactory(pointer.getPointer(0))

    public fun setValue(value: IListViewBaseHeaderItemFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IListViewBaseHeaderItemFactory {
    public val __2096089551_Ptr: Pointer?

    public val _2096089551_VtblPtr: Pointer?
      get() = __2096089551_Ptr?.getPointer(0)
  }

  public class IListViewBaseHeaderItemFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __2096089551_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IListViewBaseHeaderItemFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("228fc10ab86f5b5796f434d9f9fb8711")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIListViewBaseHeaderItemFactory(ptr: Pointer?): WithDefault =
        IListViewBaseHeaderItemFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IListViewBaseHeaderItemFactory {
      val address = segment.toRawLongValue()
      return makeIListViewBaseHeaderItemFactory(Pointer(address))
    }

    public override fun toNative(obj: IListViewBaseHeaderItemFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__2096089551_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IListViewBaseHeaderItemFactory):
        Array<IListViewBaseHeaderItemFactory?> = (elements as
        Array<IListViewBaseHeaderItemFactory?>).castToImpl<IListViewBaseHeaderItemFactory,IListViewBaseHeaderItemFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IListViewBaseHeaderItemFactory?> =
        arrayOfNulls<IListViewBaseHeaderItemFactory_Impl>(size) as
        Array<IListViewBaseHeaderItemFactory?>
  }
}
