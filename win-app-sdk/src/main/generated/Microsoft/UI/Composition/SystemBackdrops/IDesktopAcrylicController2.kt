package Microsoft.UI.Composition.SystemBackdrops

import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
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
import com.sun.jna.Function
import com.sun.jna.Function.ALT_CONVENTION
import com.sun.jna.Native
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.NativeMapped
import com.sun.jna.Pointer
import com.sun.jna.Pointer.NULL
import com.sun.jna.PointerType
import java.lang.RuntimeException
import java.lang.foreign.MemoryAddress
import java.lang.foreign.ValueLayout
import java.lang.foreign.ValueLayout.ADDRESS
import kotlin.Array
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDesktopAcrylicController2.ABI::class)
@Signature("{88e0a368-dfc7-5971-a50b-40df5aa5f5c2}")
@Guid("88e0a368dfc75971a50b40df5aa5f5c2")
@WinRTInterface("88e0a368dfc75971a50b40df5aa5f5c2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopAcrylicController2.ByReference::class)
public interface IDesktopAcrylicController2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ResetProperties(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopAcrylicController2> {
    public override fun getValue() = ABI.makeIDesktopAcrylicController2(pointer.getPointer(0))

    public fun setValue(value: IDesktopAcrylicController2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopAcrylicController2 {
    public val __216472188_Ptr: Pointer?

    public val _216472188_VtblPtr: Pointer?
      get() = __216472188_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ResetProperties(): Unit {
      val fnPtr = _216472188_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__216472188_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDesktopAcrylicController2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __216472188_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopAcrylicController2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88e0a368dfc75971a50b40df5aa5f5c2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopAcrylicController2(ptr: Pointer?): WithDefault =
        IDesktopAcrylicController2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopAcrylicController2 {
      val address = segment.toRawLongValue()
      return makeIDesktopAcrylicController2(Pointer(address))
    }

    public override fun toNative(obj: IDesktopAcrylicController2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__216472188_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopAcrylicController2):
        Array<IDesktopAcrylicController2?> = (elements as
        Array<IDesktopAcrylicController2?>).castToImpl<IDesktopAcrylicController2,IDesktopAcrylicController2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopAcrylicController2?> =
        arrayOfNulls<IDesktopAcrylicController2_Impl>(size) as Array<IDesktopAcrylicController2?>
  }
}
