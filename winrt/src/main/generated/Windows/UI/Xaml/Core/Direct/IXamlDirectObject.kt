package Windows.UI.Xaml.Core.Direct

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

@ABIMarker(IXamlDirectObject.ABI::class)
@Signature("{10614a82-cee4-4645-ba25-d071ce778355}")
@Guid("10614a82cee44645ba25d071ce778355")
@WinRTInterface("10614a82cee44645ba25d071ce778355")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IXamlDirectObject.ByReference::class)
public interface IXamlDirectObject : NativeMapped, IWinRTInterface {
  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IXamlDirectObject> {
    public override fun getValue() = ABI.makeIXamlDirectObject(pointer.getPointer(0))

    public fun setValue(value: IXamlDirectObject_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IXamlDirectObject {
    public val __1326518488_Ptr: Pointer?

    public val _1326518488_VtblPtr: Pointer?
      get() = __1326518488_Ptr?.getPointer(0)
  }

  public class IXamlDirectObject_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1326518488_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IXamlDirectObject, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("10614a82cee44645ba25d071ce778355")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIXamlDirectObject(ptr: Pointer?): WithDefault = IXamlDirectObject_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IXamlDirectObject {
      val address = segment.toRawLongValue()
      return makeIXamlDirectObject(Pointer(address))
    }

    public override fun toNative(obj: IXamlDirectObject): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1326518488_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IXamlDirectObject): Array<IXamlDirectObject?> = (elements
        as Array<IXamlDirectObject?>).castToImpl<IXamlDirectObject,IXamlDirectObject_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IXamlDirectObject?> =
        arrayOfNulls<IXamlDirectObject_Impl>(size) as Array<IXamlDirectObject?>
  }
}
