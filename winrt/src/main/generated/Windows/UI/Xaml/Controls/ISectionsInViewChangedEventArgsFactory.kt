package Windows.UI.Xaml.Controls

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

@ABIMarker(ISectionsInViewChangedEventArgsFactory.ABI::class)
@Signature("{557f5244-92f8-4150-b730-e6346e8f50d1}")
@Guid("557f524492f84150b730e6346e8f50d1")
@WinRTInterface("557f524492f84150b730e6346e8f50d1")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ISectionsInViewChangedEventArgsFactory.ByReference::class)
public interface ISectionsInViewChangedEventArgsFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ISectionsInViewChangedEventArgsFactory> {
    public override fun getValue() =
        ABI.makeISectionsInViewChangedEventArgsFactory(pointer.getPointer(0))

    public fun setValue(value: ISectionsInViewChangedEventArgsFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ISectionsInViewChangedEventArgsFactory {
    public val __830664109_Ptr: Pointer?

    public val _830664109_VtblPtr: Pointer?
      get() = __830664109_Ptr?.getPointer(0)
  }

  public class ISectionsInViewChangedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __830664109_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISectionsInViewChangedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("557f524492f84150b730e6346e8f50d1")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISectionsInViewChangedEventArgsFactory(ptr: Pointer?): WithDefault =
        ISectionsInViewChangedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISectionsInViewChangedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeISectionsInViewChangedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: ISectionsInViewChangedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__830664109_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ISectionsInViewChangedEventArgsFactory):
        Array<ISectionsInViewChangedEventArgsFactory?> = (elements as
        Array<ISectionsInViewChangedEventArgsFactory?>).castToImpl<ISectionsInViewChangedEventArgsFactory,ISectionsInViewChangedEventArgsFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ISectionsInViewChangedEventArgsFactory?> =
        arrayOfNulls<ISectionsInViewChangedEventArgsFactory_Impl>(size) as
        Array<ISectionsInViewChangedEventArgsFactory?>
  }
}
