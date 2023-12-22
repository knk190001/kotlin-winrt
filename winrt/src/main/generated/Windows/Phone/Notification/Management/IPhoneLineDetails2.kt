package Windows.Phone.Notification.Management

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

@ABIMarker(IPhoneLineDetails2.ABI::class)
@Signature("{b30cd77d-0147-498c-8241-bf0cabc60a25}")
@Guid("b30cd77d0147498c8241bf0cabc60a25")
@WinRTInterface("b30cd77d0147498c8241bf0cabc60a25")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IPhoneLineDetails2.ByReference::class)
public interface IPhoneLineDetails2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_MissedCallCount(): WinDef.UINT

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IPhoneLineDetails2> {
    public override fun getValue() = ABI.makeIPhoneLineDetails2(pointer.getPointer(0))

    public fun setValue(value: IPhoneLineDetails2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IPhoneLineDetails2 {
    public val __1103550212_Ptr: Pointer?

    public val _1103550212_VtblPtr: Pointer?
      get() = __1103550212_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_MissedCallCount(): WinDef.UINT {
      val fnPtr = _1103550212_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WinDef.UINT>()
      val hr = fn.invokeHR(arrayOf(__1103550212_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WinDef.UINT>(result.getValue())
      return resultValue!!
    }
  }

  public class IPhoneLineDetails2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1103550212_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IPhoneLineDetails2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("b30cd77d0147498c8241bf0cabc60a25")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIPhoneLineDetails2(ptr: Pointer?): WithDefault = IPhoneLineDetails2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IPhoneLineDetails2 {
      val address = segment.toRawLongValue()
      return makeIPhoneLineDetails2(Pointer(address))
    }

    public override fun toNative(obj: IPhoneLineDetails2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1103550212_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IPhoneLineDetails2): Array<IPhoneLineDetails2?> =
        (elements as
        Array<IPhoneLineDetails2?>).castToImpl<IPhoneLineDetails2,IPhoneLineDetails2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IPhoneLineDetails2?> =
        arrayOfNulls<IPhoneLineDetails2_Impl>(size) as Array<IPhoneLineDetails2?>
  }
}
