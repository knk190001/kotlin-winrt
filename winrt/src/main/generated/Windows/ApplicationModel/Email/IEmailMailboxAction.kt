package Windows.ApplicationModel.Email

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

@ABIMarker(IEmailMailboxAction.ABI::class)
@Signature("{ac9889fa-21fa-4927-9210-d410582fdf3e}")
@Guid("ac9889fa21fa49279210d410582fdf3e")
@WinRTInterface("ac9889fa21fa49279210d410582fdf3e")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IEmailMailboxAction.ByReference::class)
public interface IEmailMailboxAction : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Kind(): EmailMailboxActionKind?

  @InterfaceMethod(1)
  public fun get_ChangeNumber(): WinDef.ULONG

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IEmailMailboxAction> {
    public override fun getValue() = ABI.makeIEmailMailboxAction(pointer.getPointer(0))

    public fun setValue(value: IEmailMailboxAction_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IEmailMailboxAction {
    public val __1221189723_Ptr: Pointer?

    public val _1221189723_VtblPtr: Pointer?
      get() = __1221189723_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Kind(): EmailMailboxActionKind? {
      val fnPtr = _1221189723_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EmailMailboxActionKind>()
      val hr = fn.invokeHR(arrayOf(__1221189723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EmailMailboxActionKind>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ChangeNumber(): WinDef.ULONG {
      val fnPtr = _1221189723_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.ULONG>()
      val hr = fn.invokeHR(arrayOf(__1221189723_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.ULONG>(result.getValue())
      return resultValue!!
    }
  }

  public class IEmailMailboxAction_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1221189723_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IEmailMailboxAction, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ac9889fa21fa49279210d410582fdf3e")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIEmailMailboxAction(ptr: Pointer?): WithDefault = IEmailMailboxAction_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IEmailMailboxAction {
      val address = segment.toRawLongValue()
      return makeIEmailMailboxAction(Pointer(address))
    }

    public override fun toNative(obj: IEmailMailboxAction): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1221189723_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IEmailMailboxAction): Array<IEmailMailboxAction?> =
        (elements as
        Array<IEmailMailboxAction?>).castToImpl<IEmailMailboxAction,IEmailMailboxAction_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IEmailMailboxAction?> =
        arrayOfNulls<IEmailMailboxAction_Impl>(size) as Array<IEmailMailboxAction?>
  }
}
