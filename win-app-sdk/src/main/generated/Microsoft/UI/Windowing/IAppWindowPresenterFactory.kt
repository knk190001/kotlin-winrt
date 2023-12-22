package Microsoft.UI.Windowing

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

@ABIMarker(IAppWindowPresenterFactory.ABI::class)
@Signature("{62082e3c-1368-5238-90d1-e932dc718a82}")
@Guid("62082e3c1368523890d1e932dc718a82")
@WinRTInterface("62082e3c1368523890d1e932dc718a82")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppWindowPresenterFactory.ByReference::class)
public interface IAppWindowPresenterFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppWindowPresenterFactory> {
    public override fun getValue() = ABI.makeIAppWindowPresenterFactory(pointer.getPointer(0))

    public fun setValue(value: IAppWindowPresenterFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppWindowPresenterFactory {
    public val __340617890_Ptr: Pointer?

    public val _340617890_VtblPtr: Pointer?
      get() = __340617890_Ptr?.getPointer(0)
  }

  public class IAppWindowPresenterFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __340617890_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppWindowPresenterFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("62082e3c1368523890d1e932dc718a82")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppWindowPresenterFactory(ptr: Pointer?): WithDefault =
        IAppWindowPresenterFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppWindowPresenterFactory {
      val address = segment.toRawLongValue()
      return makeIAppWindowPresenterFactory(Pointer(address))
    }

    public override fun toNative(obj: IAppWindowPresenterFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__340617890_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppWindowPresenterFactory):
        Array<IAppWindowPresenterFactory?> = (elements as
        Array<IAppWindowPresenterFactory?>).castToImpl<IAppWindowPresenterFactory,IAppWindowPresenterFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppWindowPresenterFactory?> =
        arrayOfNulls<IAppWindowPresenterFactory_Impl>(size) as Array<IAppWindowPresenterFactory?>
  }
}
