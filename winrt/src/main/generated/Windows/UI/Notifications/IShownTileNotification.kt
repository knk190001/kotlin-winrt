package Windows.UI.Notifications

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IShownTileNotification.ABI::class)
@Signature("{342d8988-5af2-481a-a6a3-f2fdc78de88e}")
@Guid("342d89885af2481aa6a3f2fdc78de88e")
@WinRTInterface("342d89885af2481aa6a3f2fdc78de88e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IShownTileNotification.ByReference::class)
public interface IShownTileNotification : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Arguments(): String?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IShownTileNotification> {
    public override fun getValue() = ABI.makeIShownTileNotification(pointer.getPointer(0))

    public fun setValue(value: IShownTileNotification_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IShownTileNotification {
    public val __878333062_Ptr: Pointer?

    public val _878333062_VtblPtr: Pointer?
      get() = __878333062_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Arguments(): String? {
      val fnPtr = _878333062_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__878333062_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }
  }

  public class IShownTileNotification_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __878333062_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IShownTileNotification, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("342d89885af2481aa6a3f2fdc78de88e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIShownTileNotification(ptr: Pointer?): WithDefault =
        IShownTileNotification_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IShownTileNotification {
      val address = segment.toRawLongValue()
      return makeIShownTileNotification(Pointer(address))
    }

    public override fun toNative(obj: IShownTileNotification): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__878333062_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IShownTileNotification): Array<IShownTileNotification?> =
        (elements as
        Array<IShownTileNotification?>).castToImpl<IShownTileNotification,IShownTileNotification_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IShownTileNotification?> =
        arrayOfNulls<IShownTileNotification_Impl>(size) as Array<IShownTileNotification?>
  }
}
