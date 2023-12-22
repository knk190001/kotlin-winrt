package Windows.UI.Core

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

@ABIMarker(IInitializeWithCoreWindow.ABI::class)
@Signature("{188f20d6-9873-464a-ace5-57e010f465e6}")
@Guid("188f20d69873464aace557e010f465e6")
@WinRTInterface("188f20d69873464aace557e010f465e6")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IInitializeWithCoreWindow.ByReference::class)
public interface IInitializeWithCoreWindow : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Initialize(window: CoreWindow?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IInitializeWithCoreWindow> {
    public override fun getValue() = ABI.makeIInitializeWithCoreWindow(pointer.getPointer(0))

    public fun setValue(value: IInitializeWithCoreWindow_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IInitializeWithCoreWindow {
    public val __1468339296_Ptr: Pointer?

    public val _1468339296_VtblPtr: Pointer?
      get() = __1468339296_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Initialize(window: CoreWindow?): Unit {
      val fnPtr = _1468339296_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1468339296_Ptr, marshalToNative(window),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IInitializeWithCoreWindow_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1468339296_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IInitializeWithCoreWindow, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("188f20d69873464aace557e010f465e6")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIInitializeWithCoreWindow(ptr: Pointer?): WithDefault =
        IInitializeWithCoreWindow_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IInitializeWithCoreWindow {
      val address = segment.toRawLongValue()
      return makeIInitializeWithCoreWindow(Pointer(address))
    }

    public override fun toNative(obj: IInitializeWithCoreWindow): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1468339296_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IInitializeWithCoreWindow):
        Array<IInitializeWithCoreWindow?> = (elements as
        Array<IInitializeWithCoreWindow?>).castToImpl<IInitializeWithCoreWindow,IInitializeWithCoreWindow_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IInitializeWithCoreWindow?> =
        arrayOfNulls<IInitializeWithCoreWindow_Impl>(size) as Array<IInitializeWithCoreWindow?>
  }
}
