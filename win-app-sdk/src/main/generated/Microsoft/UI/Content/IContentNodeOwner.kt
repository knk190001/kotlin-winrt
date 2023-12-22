package Microsoft.UI.Content

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

@ABIMarker(IContentNodeOwner.ABI::class)
@Signature("{2251c304-449d-4456-b008-fe7163403d7e}")
@Guid("2251c304449d4456b008fe7163403d7e")
@WinRTInterface("2251c304449d4456b008fe7163403d7e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContentNodeOwner.ByReference::class)
public interface IContentNodeOwner : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContentNodeOwner> {
    public override fun getValue() = ABI.makeIContentNodeOwner(pointer.getPointer(0))

    public fun setValue(value: IContentNodeOwner_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContentNodeOwner {
    public val __723244670_Ptr: Pointer?

    public val _723244670_VtblPtr: Pointer?
      get() = __723244670_Ptr?.getPointer(0)
  }

  public class IContentNodeOwner_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __723244670_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContentNodeOwner, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("2251c304449d4456b008fe7163403d7e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContentNodeOwner(ptr: Pointer?): WithDefault = IContentNodeOwner_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContentNodeOwner {
      val address = segment.toRawLongValue()
      return makeIContentNodeOwner(Pointer(address))
    }

    public override fun toNative(obj: IContentNodeOwner): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__723244670_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContentNodeOwner): Array<IContentNodeOwner?> = (elements
        as Array<IContentNodeOwner?>).castToImpl<IContentNodeOwner,IContentNodeOwner_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContentNodeOwner?> =
        arrayOfNulls<IContentNodeOwner_Impl>(size) as Array<IContentNodeOwner?>
  }
}
