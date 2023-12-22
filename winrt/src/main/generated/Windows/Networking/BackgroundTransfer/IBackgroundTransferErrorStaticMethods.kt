package Windows.Networking.BackgroundTransfer

import Windows.Web.WebErrorStatus
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

@ABIMarker(IBackgroundTransferErrorStaticMethods.ABI::class)
@Signature("{aad33b04-1192-4bf4-8b68-39c5add244e2}")
@Guid("aad33b0411924bf48b6839c5add244e2")
@WinRTInterface("aad33b0411924bf48b6839c5add244e2")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBackgroundTransferErrorStaticMethods.ByReference::class)
public interface IBackgroundTransferErrorStaticMethods : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetStatus(hresult: Int): WebErrorStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBackgroundTransferErrorStaticMethods> {
    public override fun getValue() =
        ABI.makeIBackgroundTransferErrorStaticMethods(pointer.getPointer(0))

    public fun setValue(value: IBackgroundTransferErrorStaticMethods_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBackgroundTransferErrorStaticMethods {
    public val __63088106_Ptr: Pointer?

    public val _63088106_VtblPtr: Pointer?
      get() = __63088106_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetStatus(hresult: Int): WebErrorStatus? {
      val fnPtr = _63088106_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<WebErrorStatus>()
      val hr = fn.invokeHR(arrayOf(__63088106_Ptr, hresult, result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<WebErrorStatus>(result.getValue())
      return resultValue
    }
  }

  public class IBackgroundTransferErrorStaticMethods_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __63088106_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBackgroundTransferErrorStaticMethods, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("aad33b0411924bf48b6839c5add244e2")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBackgroundTransferErrorStaticMethods(ptr: Pointer?): WithDefault =
        IBackgroundTransferErrorStaticMethods_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IBackgroundTransferErrorStaticMethods {
      val address = segment.toRawLongValue()
      return makeIBackgroundTransferErrorStaticMethods(Pointer(address))
    }

    public override fun toNative(obj: IBackgroundTransferErrorStaticMethods): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__63088106_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBackgroundTransferErrorStaticMethods):
        Array<IBackgroundTransferErrorStaticMethods?> = (elements as
        Array<IBackgroundTransferErrorStaticMethods?>).castToImpl<IBackgroundTransferErrorStaticMethods,IBackgroundTransferErrorStaticMethods_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBackgroundTransferErrorStaticMethods?> =
        arrayOfNulls<IBackgroundTransferErrorStaticMethods_Impl>(size) as
        Array<IBackgroundTransferErrorStaticMethods?>
  }
}
