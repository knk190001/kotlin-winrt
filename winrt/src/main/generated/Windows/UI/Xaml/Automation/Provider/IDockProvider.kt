package Windows.UI.Xaml.Automation.Provider

import Windows.UI.Xaml.Automation.DockPosition
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

@ABIMarker(IDockProvider.ABI::class)
@Signature("{48c243f8-78b1-44a0-ac5f-750757bcde3c}")
@Guid("48c243f878b144a0ac5f750757bcde3c")
@WinRTInterface("48c243f878b144a0ac5f750757bcde3c")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDockProvider.ByReference::class)
public interface IDockProvider : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_DockPosition(): DockPosition?

  @InterfaceMethod(1)
  public fun SetDockPosition(dockPosition: DockPosition?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IDockProvider>
      {
    public override fun getValue() = ABI.makeIDockProvider(pointer.getPointer(0))

    public fun setValue(value: IDockProvider_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDockProvider {
    public val __1034804828_Ptr: Pointer?

    public val _1034804828_VtblPtr: Pointer?
      get() = __1034804828_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_DockPosition(): DockPosition? {
      val fnPtr = _1034804828_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DockPosition>()
      val hr = fn.invokeHR(arrayOf(__1034804828_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DockPosition>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun SetDockPosition(dockPosition: DockPosition?): Unit {
      val fnPtr = _1034804828_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1034804828_Ptr, marshalToNative(dockPosition),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDockProvider_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1034804828_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDockProvider, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("48c243f878b144a0ac5f750757bcde3c")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDockProvider(ptr: Pointer?): WithDefault = IDockProvider_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDockProvider {
      val address = segment.toRawLongValue()
      return makeIDockProvider(Pointer(address))
    }

    public override fun toNative(obj: IDockProvider): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1034804828_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDockProvider): Array<IDockProvider?> = (elements as
        Array<IDockProvider?>).castToImpl<IDockProvider,IDockProvider_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDockProvider?> =
        arrayOfNulls<IDockProvider_Impl>(size) as Array<IDockProvider?>
  }
}
