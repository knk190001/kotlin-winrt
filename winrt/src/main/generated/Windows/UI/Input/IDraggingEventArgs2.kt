package Windows.UI.Input

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
import com.sun.jna.platform.win32.WinDef
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

@ABIMarker(IDraggingEventArgs2.ABI::class)
@Signature("{71efdbf9-382a-55ca-b4b9-008123c1bf1a}")
@Guid("71efdbf9382a55cab4b9008123c1bf1a")
@WinRTInterface("71efdbf9382a55cab4b9008123c1bf1a")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDraggingEventArgs2.ByReference::class)
public interface IDraggingEventArgs2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ContactCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDraggingEventArgs2> {
    public override fun getValue() = ABI.makeIDraggingEventArgs2(pointer.getPointer(0))

    public fun setValue(value: IDraggingEventArgs2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDraggingEventArgs2 {
    public val __564416632_Ptr: Pointer?

    public val _564416632_VtblPtr: Pointer?
      get() = __564416632_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ContactCount(): WinDef.UINT {
      val fnPtr = _564416632_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__564416632_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IDraggingEventArgs2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __564416632_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDraggingEventArgs2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("71efdbf9382a55cab4b9008123c1bf1a")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDraggingEventArgs2(ptr: Pointer?): WithDefault = IDraggingEventArgs2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDraggingEventArgs2 {
      val address = segment.toRawLongValue()
      return makeIDraggingEventArgs2(Pointer(address))
    }

    public override fun toNative(obj: IDraggingEventArgs2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__564416632_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDraggingEventArgs2): Array<IDraggingEventArgs2?> =
        (elements as
        Array<IDraggingEventArgs2?>).castToImpl<IDraggingEventArgs2,IDraggingEventArgs2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDraggingEventArgs2?> =
        arrayOfNulls<IDraggingEventArgs2_Impl>(size) as Array<IDraggingEventArgs2?>
  }
}
