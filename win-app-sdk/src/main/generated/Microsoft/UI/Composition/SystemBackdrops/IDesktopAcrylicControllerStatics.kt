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
import kotlin.Boolean
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IDesktopAcrylicControllerStatics.ABI::class)
@Signature("{a9e8f790-79ef-5416-9b67-6bcfe867c8b7}")
@Guid("a9e8f79079ef54169b676bcfe867c8b7")
@WinRTInterface("a9e8f79079ef54169b676bcfe867c8b7")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDesktopAcrylicControllerStatics.ByReference::class)
public interface IDesktopAcrylicControllerStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun IsSupported(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDesktopAcrylicControllerStatics> {
    public override fun getValue() = ABI.makeIDesktopAcrylicControllerStatics(pointer.getPointer(0))

    public fun setValue(value: IDesktopAcrylicControllerStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDesktopAcrylicControllerStatics {
    public val __576541295_Ptr: Pointer?

    public val _576541295_VtblPtr: Pointer?
      get() = __576541295_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun IsSupported(): Boolean {
      val fnPtr = _576541295_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__576541295_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IDesktopAcrylicControllerStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __576541295_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDesktopAcrylicControllerStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("a9e8f79079ef54169b676bcfe867c8b7")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDesktopAcrylicControllerStatics(ptr: Pointer?): WithDefault =
        IDesktopAcrylicControllerStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDesktopAcrylicControllerStatics {
      val address = segment.toRawLongValue()
      return makeIDesktopAcrylicControllerStatics(Pointer(address))
    }

    public override fun toNative(obj: IDesktopAcrylicControllerStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__576541295_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDesktopAcrylicControllerStatics):
        Array<IDesktopAcrylicControllerStatics?> = (elements as
        Array<IDesktopAcrylicControllerStatics?>).castToImpl<IDesktopAcrylicControllerStatics,IDesktopAcrylicControllerStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDesktopAcrylicControllerStatics?> =
        arrayOfNulls<IDesktopAcrylicControllerStatics_Impl>(size) as
        Array<IDesktopAcrylicControllerStatics?>
  }
}
