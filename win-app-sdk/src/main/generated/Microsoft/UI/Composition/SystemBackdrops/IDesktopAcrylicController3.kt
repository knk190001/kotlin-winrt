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

@ABIMarker(IDesktopAcrylicController3.ABI::class)
@Signature("{30d917e6-02d3-59ca-b440-bf9d2e7cc140}")
@Guid("30d917e602d359cab440bf9d2e7cc140")
@WinRTInterface("30d917e602d359cab440bf9d2e7cc140")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopAcrylicController3.ByReference::class)
public interface IDesktopAcrylicController3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): DesktopAcrylicKind?

  @InterfaceMethod(1)
  public fun put_Kind(value: DesktopAcrylicKind?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopAcrylicController3> {
    public override fun getValue() = ABI.makeIDesktopAcrylicController3(pointer.getPointer(0))

    public fun setValue(value: IDesktopAcrylicController3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopAcrylicController3 {
    public val __216472189_Ptr: Pointer?

    public val _216472189_VtblPtr: Pointer?
      get() = __216472189_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): DesktopAcrylicKind? {
      val fnPtr = _216472189_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DesktopAcrylicKind>()
      val hr = fn.invokeHR(arrayOf(__216472189_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DesktopAcrylicKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Kind(value: DesktopAcrylicKind?): Unit {
      val fnPtr = _216472189_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__216472189_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDesktopAcrylicController3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __216472189_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopAcrylicController3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("30d917e602d359cab440bf9d2e7cc140")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopAcrylicController3(ptr: Pointer?): WithDefault =
        IDesktopAcrylicController3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopAcrylicController3 {
      val address = segment.toRawLongValue()
      return makeIDesktopAcrylicController3(Pointer(address))
    }

    public override fun toNative(obj: IDesktopAcrylicController3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__216472189_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopAcrylicController3):
        Array<IDesktopAcrylicController3?> = (elements as
        Array<IDesktopAcrylicController3?>).castToImpl<IDesktopAcrylicController3,IDesktopAcrylicController3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopAcrylicController3?> =
        arrayOfNulls<IDesktopAcrylicController3_Impl>(size) as Array<IDesktopAcrylicController3?>
  }
}
