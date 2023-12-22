package Microsoft.UI.Input.Experimental

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

@ABIMarker(IExpInputSite.ABI::class)
@Signature("{6b707b95-bbe8-5131-a6d7-b11c26cb7cb6}")
@Guid("6b707b95bbe85131a6d7b11c26cb7cb6")
@WinRTInterface("6b707b95bbe85131a6d7b11c26cb7cb6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IExpInputSite.ByReference::class)
public interface IExpInputSite : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IExpInputSite>
      {
    public override fun getValue() = ABI.makeIExpInputSite(pointer.getPointer(0))

    public fun setValue(value: IExpInputSite_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IExpInputSite {
    public val __1760906249_Ptr: Pointer?

    public val _1760906249_VtblPtr: Pointer?
      get() = __1760906249_Ptr?.getPointer(0)
  }

  public class IExpInputSite_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1760906249_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IExpInputSite, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6b707b95bbe85131a6d7b11c26cb7cb6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIExpInputSite(ptr: Pointer?): WithDefault = IExpInputSite_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IExpInputSite {
      val address = segment.toRawLongValue()
      return makeIExpInputSite(Pointer(address))
    }

    public override fun toNative(obj: IExpInputSite): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1760906249_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IExpInputSite): Array<IExpInputSite?> = (elements as
        Array<IExpInputSite?>).castToImpl<IExpInputSite,IExpInputSite_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IExpInputSite?> =
        arrayOfNulls<IExpInputSite_Impl>(size) as Array<IExpInputSite?>
  }
}
