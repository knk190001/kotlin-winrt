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

@ABIMarker(IIconSourceFactory.ABI::class)
@Signature("{e8bc19c6-9a64-5c54-9338-e18e076875bf}")
@Guid("e8bc19c69a645c549338e18e076875bf")
@WinRTInterface("e8bc19c69a645c549338e18e076875bf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIconSourceFactory.ByReference::class)
public interface IIconSourceFactory : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIconSourceFactory> {
    public override fun getValue() = ABI.makeIIconSourceFactory(pointer.getPointer(0))

    public fun setValue(value: IIconSourceFactory_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIconSourceFactory {
    public val __1740928399_Ptr: Pointer?

    public val _1740928399_VtblPtr: Pointer?
      get() = __1740928399_Ptr?.getPointer(0)
  }

  public class IIconSourceFactory_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1740928399_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIconSourceFactory, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("e8bc19c69a645c549338e18e076875bf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIconSourceFactory(ptr: Pointer?): WithDefault = IIconSourceFactory_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIconSourceFactory {
      val address = segment.toRawLongValue()
      return makeIIconSourceFactory(Pointer(address))
    }

    public override fun toNative(obj: IIconSourceFactory): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1740928399_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIconSourceFactory): Array<IIconSourceFactory?> =
        (elements as
        Array<IIconSourceFactory?>).castToImpl<IIconSourceFactory,IIconSourceFactory_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIconSourceFactory?> =
        arrayOfNulls<IIconSourceFactory_Impl>(size) as Array<IIconSourceFactory?>
  }
}
