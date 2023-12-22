package Windows.ApplicationModel.Contacts

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

@ABIMarker(IContactPanelLaunchFullAppRequestedEventArgs.ABI::class)
@Signature("{88d61c0e-23b4-4be8-8afc-072c25a4190d}")
@Guid("88d61c0e23b44be88afc072c25a4190d")
@WinRTInterface("88d61c0e23b44be88afc072c25a4190d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPanelLaunchFullAppRequestedEventArgs.ByReference::class)
public interface IContactPanelLaunchFullAppRequestedEventArgs : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Handled(): Boolean

  @InterfaceMethod(1)
  public fun put_Handled(value: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IContactPanelLaunchFullAppRequestedEventArgs> {
    public override fun getValue() =
        ABI.makeIContactPanelLaunchFullAppRequestedEventArgs(pointer.getPointer(0))

    public fun setValue(value: IContactPanelLaunchFullAppRequestedEventArgs_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPanelLaunchFullAppRequestedEventArgs {
    public val __1210158136_Ptr: Pointer?

    public val _1210158136_VtblPtr: Pointer?
      get() = __1210158136_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Handled(): Boolean {
      val fnPtr = _1210158136_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1210158136_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(1)
    public override fun put_Handled(value: Boolean): Unit {
      val fnPtr = _1210158136_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1210158136_Ptr, value,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactPanelLaunchFullAppRequestedEventArgs_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1210158136_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPanelLaunchFullAppRequestedEventArgs, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("88d61c0e23b44be88afc072c25a4190d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPanelLaunchFullAppRequestedEventArgs(ptr: Pointer?): WithDefault =
        IContactPanelLaunchFullAppRequestedEventArgs_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IContactPanelLaunchFullAppRequestedEventArgs {
      val address = segment.toRawLongValue()
      return makeIContactPanelLaunchFullAppRequestedEventArgs(Pointer(address))
    }

    public override fun toNative(obj: IContactPanelLaunchFullAppRequestedEventArgs): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1210158136_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPanelLaunchFullAppRequestedEventArgs):
        Array<IContactPanelLaunchFullAppRequestedEventArgs?> = (elements as
        Array<IContactPanelLaunchFullAppRequestedEventArgs?>).castToImpl<IContactPanelLaunchFullAppRequestedEventArgs,IContactPanelLaunchFullAppRequestedEventArgs_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPanelLaunchFullAppRequestedEventArgs?> =
        arrayOfNulls<IContactPanelLaunchFullAppRequestedEventArgs_Impl>(size) as
        Array<IContactPanelLaunchFullAppRequestedEventArgs?>
  }
}
