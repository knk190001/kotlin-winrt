package Windows.UI.Xaml

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

@ABIMarker(IDragOperationDeferral.ABI::class)
@Signature("{ba73ecba-1b73-4086-b3d3-c223beea1633}")
@Guid("ba73ecba1b734086b3d3c223beea1633")
@WinRTInterface("ba73ecba1b734086b3d3c223beea1633")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDragOperationDeferral.ByReference::class)
public interface IDragOperationDeferral : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Complete(): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDragOperationDeferral> {
    public override fun getValue() = ABI.makeIDragOperationDeferral(pointer.getPointer(0))

    public fun setValue(value: IDragOperationDeferral_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDragOperationDeferral {
    public val __128928780_Ptr: Pointer?

    public val _128928780_VtblPtr: Pointer?
      get() = __128928780_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Complete(): Unit {
      val fnPtr = _128928780_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__128928780_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IDragOperationDeferral_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __128928780_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDragOperationDeferral, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ba73ecba1b734086b3d3c223beea1633")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDragOperationDeferral(ptr: Pointer?): WithDefault =
        IDragOperationDeferral_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDragOperationDeferral {
      val address = segment.toRawLongValue()
      return makeIDragOperationDeferral(Pointer(address))
    }

    public override fun toNative(obj: IDragOperationDeferral): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__128928780_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDragOperationDeferral): Array<IDragOperationDeferral?> =
        (elements as
        Array<IDragOperationDeferral?>).castToImpl<IDragOperationDeferral,IDragOperationDeferral_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDragOperationDeferral?> =
        arrayOfNulls<IDragOperationDeferral_Impl>(size) as Array<IDragOperationDeferral?>
  }
}
