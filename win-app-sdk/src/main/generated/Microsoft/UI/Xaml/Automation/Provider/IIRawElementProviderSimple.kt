package Microsoft.UI.Xaml.Automation.Provider

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

@ABIMarker(IIRawElementProviderSimple.ABI::class)
@Signature("{f90bc239-ade2-55c9-a838-a3b0579763c5}")
@Guid("f90bc239ade255c9a838a3b0579763c5")
@WinRTInterface("f90bc239ade255c9a838a3b0579763c5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IIRawElementProviderSimple.ByReference::class)
public interface IIRawElementProviderSimple : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IIRawElementProviderSimple> {
    public override fun getValue() = ABI.makeIIRawElementProviderSimple(pointer.getPointer(0))

    public fun setValue(value: IIRawElementProviderSimple_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IIRawElementProviderSimple {
    public val __558805363_Ptr: Pointer?

    public val _558805363_VtblPtr: Pointer?
      get() = __558805363_Ptr?.getPointer(0)
  }

  public class IIRawElementProviderSimple_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __558805363_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IIRawElementProviderSimple, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("f90bc239ade255c9a838a3b0579763c5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIIRawElementProviderSimple(ptr: Pointer?): WithDefault =
        IIRawElementProviderSimple_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IIRawElementProviderSimple {
      val address = segment.toRawLongValue()
      return makeIIRawElementProviderSimple(Pointer(address))
    }

    public override fun toNative(obj: IIRawElementProviderSimple): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__558805363_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IIRawElementProviderSimple):
        Array<IIRawElementProviderSimple?> = (elements as
        Array<IIRawElementProviderSimple?>).castToImpl<IIRawElementProviderSimple,IIRawElementProviderSimple_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IIRawElementProviderSimple?> =
        arrayOfNulls<IIRawElementProviderSimple_Impl>(size) as Array<IIRawElementProviderSimple?>
  }
}
