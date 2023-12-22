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

@ABIMarker(ISectionsInViewChangedEventArgsFactory.ABI::class)
@Signature("{df5ab91f-e316-53cf-9636-a85bdc24e85e}")
@Guid("df5ab91fe31653cf9636a85bdc24e85e")
@WinRTInterface("df5ab91fe31653cf9636a85bdc24e85e")
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
    public val __1146822776_Ptr: Pointer?

    public val _1146822776_VtblPtr: Pointer?
      get() = __1146822776_Ptr?.getPointer(0)
  }

  public class ISectionsInViewChangedEventArgsFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1146822776_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ISectionsInViewChangedEventArgsFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("df5ab91fe31653cf9636a85bdc24e85e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeISectionsInViewChangedEventArgsFactory(ptr: Pointer?): WithDefault =
        ISectionsInViewChangedEventArgsFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ISectionsInViewChangedEventArgsFactory {
      val address = segment.toRawLongValue()
      return makeISectionsInViewChangedEventArgsFactory(Pointer(address))
    }

    public override fun toNative(obj: ISectionsInViewChangedEventArgsFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1146822776_Ptr))
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
