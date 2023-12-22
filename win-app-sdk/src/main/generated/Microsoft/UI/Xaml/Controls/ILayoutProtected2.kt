package Microsoft.UI.Xaml.Controls

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

@ABIMarker(ILayoutProtected2.ABI::class)
@Signature("{3fffe35f-6f2e-501f-a2ad-e75a4e1cd592}")
@Guid("3fffe35f6f2e501fa2ade75a4e1cd592")
@WinRTInterface("3fffe35f6f2e501fa2ade75a4e1cd592")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ILayoutProtected2.ByReference::class)
public interface ILayoutProtected2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun SetIndexBasedLayoutOrientation(orientation: IndexBasedLayoutOrientation?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ILayoutProtected2> {
    public override fun getValue() = ABI.makeILayoutProtected2(pointer.getPointer(0))

    public fun setValue(value: ILayoutProtected2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ILayoutProtected2 {
    public val __727657259_Ptr: Pointer?

    public val _727657259_VtblPtr: Pointer?
      get() = __727657259_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun SetIndexBasedLayoutOrientation(orientation: IndexBasedLayoutOrientation?):
        Unit {
      val fnPtr = _727657259_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__727657259_Ptr, marshalToNative(orientation),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ILayoutProtected2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __727657259_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ILayoutProtected2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("3fffe35f6f2e501fa2ade75a4e1cd592")

    public override val layout: ValueLayout = ADDRESS

    public fun makeILayoutProtected2(ptr: Pointer?): WithDefault = ILayoutProtected2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ILayoutProtected2 {
      val address = segment.toRawLongValue()
      return makeILayoutProtected2(Pointer(address))
    }

    public override fun toNative(obj: ILayoutProtected2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__727657259_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ILayoutProtected2): Array<ILayoutProtected2?> = (elements
        as Array<ILayoutProtected2?>).castToImpl<ILayoutProtected2,ILayoutProtected2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ILayoutProtected2?> =
        arrayOfNulls<ILayoutProtected2_Impl>(size) as Array<ILayoutProtected2?>
  }
}
