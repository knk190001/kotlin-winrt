package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Foundation.Collections.IVectorView
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

@ABIMarker(IAppInstallItem3.ABI::class)
@Signature("{6f3dc998-dd47-433c-9234-560172d67a45}")
@Guid("6f3dc998dd47433c9234560172d67a45")
@WinRTInterface("6f3dc998dd47433c9234560172d67a45")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallItem3.ByReference::class)
public interface IAppInstallItem3 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Children(): IVectorView<AppInstallItem?>?

  @InterfaceMethod(1)
  public fun get_ItemOperationsMightAffectOtherItems(): Boolean

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallItem3> {
    public override fun getValue() = ABI.makeIAppInstallItem3(pointer.getPointer(0))

    public fun setValue(value: IAppInstallItem3_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallItem3 {
    public val __972005820_Ptr: Pointer?

    public val _972005820_VtblPtr: Pointer?
      get() = __972005820_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Children(): IVectorView<AppInstallItem?>? {
      val fnPtr = _972005820_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<AppInstallItem?>>()
      val hr = fn.invokeHR(arrayOf(__972005820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<AppInstallItem?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_ItemOperationsMightAffectOtherItems(): Boolean {
      val fnPtr = _972005820_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__972005820_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }
  }

  public class IAppInstallItem3_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __972005820_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallItem3, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("6f3dc998dd47433c9234560172d67a45")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallItem3(ptr: Pointer?): WithDefault = IAppInstallItem3_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallItem3 {
      val address = segment.toRawLongValue()
      return makeIAppInstallItem3(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallItem3): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__972005820_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallItem3): Array<IAppInstallItem3?> = (elements as
        Array<IAppInstallItem3?>).castToImpl<IAppInstallItem3,IAppInstallItem3_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallItem3?> =
        arrayOfNulls<IAppInstallItem3_Impl>(size) as Array<IAppInstallItem3?>
  }
}
