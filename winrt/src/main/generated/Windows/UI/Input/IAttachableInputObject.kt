package Windows.UI.Input

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

@ABIMarker(IAttachableInputObject.ABI::class)
@Signature("{9b822734-a3c1-542a-b2f4-0e32b773fb07}")
@Guid("9b822734a3c1542ab2f40e32b773fb07")
@WinRTInterface("9b822734a3c1542ab2f40e32b773fb07")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAttachableInputObject.ByReference::class)
public interface IAttachableInputObject : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAttachableInputObject> {
    public override fun getValue() = ABI.makeIAttachableInputObject(pointer.getPointer(0))

    public fun setValue(value: IAttachableInputObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAttachableInputObject {
    public val __1220166404_Ptr: Pointer?

    public val _1220166404_VtblPtr: Pointer?
      get() = __1220166404_Ptr?.getPointer(0)
  }

  public class IAttachableInputObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1220166404_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAttachableInputObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9b822734a3c1542ab2f40e32b773fb07")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAttachableInputObject(ptr: Pointer?): WithDefault =
        IAttachableInputObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAttachableInputObject {
      val address = segment.toRawLongValue()
      return makeIAttachableInputObject(Pointer(address))
    }

    public override fun toNative(obj: IAttachableInputObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1220166404_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAttachableInputObject): Array<IAttachableInputObject?> =
        (elements as
        Array<IAttachableInputObject?>).castToImpl<IAttachableInputObject,IAttachableInputObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAttachableInputObject?> =
        arrayOfNulls<IAttachableInputObject_Impl>(size) as Array<IAttachableInputObject?>
  }
}
