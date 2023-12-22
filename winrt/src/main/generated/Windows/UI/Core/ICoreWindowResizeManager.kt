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

@ABIMarker(ICoreWindowResizeManager.ABI::class)
@Signature("{b8f0b925-b350-48b3-a198-5c1a84700243}")
@Guid("b8f0b925b35048b3a1985c1a84700243")
@WinRTInterface("b8f0b925b35048b3a1985c1a84700243")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICoreWindowResizeManager.ByReference::class)
public interface ICoreWindowResizeManager : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun NotifyLayoutCompleted(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICoreWindowResizeManager> {
    public override fun getValue() = ABI.makeICoreWindowResizeManager(pointer.getPointer(0))

    public fun setValue(value: ICoreWindowResizeManager_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICoreWindowResizeManager {
    public val __396116463_Ptr: Pointer?

    public val _396116463_VtblPtr: Pointer?
      get() = __396116463_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun NotifyLayoutCompleted(): Unit {
      val fnPtr = _396116463_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__396116463_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ICoreWindowResizeManager_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __396116463_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICoreWindowResizeManager, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b8f0b925b35048b3a1985c1a84700243")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICoreWindowResizeManager(ptr: Pointer?): WithDefault =
        ICoreWindowResizeManager_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICoreWindowResizeManager {
      val address = segment.toRawLongValue()
      return makeICoreWindowResizeManager(Pointer(address))
    }

    public override fun toNative(obj: ICoreWindowResizeManager): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__396116463_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICoreWindowResizeManager):
        Array<ICoreWindowResizeManager?> = (elements as
        Array<ICoreWindowResizeManager?>).castToImpl<ICoreWindowResizeManager,ICoreWindowResizeManager_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICoreWindowResizeManager?> =
        arrayOfNulls<ICoreWindowResizeManager_Impl>(size) as Array<ICoreWindowResizeManager?>
  }
}
