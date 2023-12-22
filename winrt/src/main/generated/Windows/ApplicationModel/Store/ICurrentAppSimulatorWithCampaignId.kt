package Windows.ApplicationModel.Store

import Windows.Foundation.IAsyncOperation
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICurrentAppSimulatorWithCampaignId.ABI::class)
@Signature("{84678a43-df00-4672-a43f-b25b1441cfcf}")
@Guid("84678a43df004672a43fb25b1441cfcf")
@WinRTInterface("84678a43df004672a43fb25b1441cfcf")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICurrentAppSimulatorWithCampaignId.ByReference::class)
public interface ICurrentAppSimulatorWithCampaignId : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetAppPurchaseCampaignIdAsync(): IAsyncOperation<String?>?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICurrentAppSimulatorWithCampaignId> {
    public override fun getValue() =
        ABI.makeICurrentAppSimulatorWithCampaignId(pointer.getPointer(0))

    public fun setValue(value: ICurrentAppSimulatorWithCampaignId_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICurrentAppSimulatorWithCampaignId {
    public val __1080390885_Ptr: Pointer?

    public val _1080390885_VtblPtr: Pointer?
      get() = __1080390885_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetAppPurchaseCampaignIdAsync(): IAsyncOperation<String?>? {
      val fnPtr = _1080390885_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<String?>>()
      val hr = fn.invokeHR(arrayOf(__1080390885_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<String?>>(result.getValue())
      return resultValue
    }
  }

  public class ICurrentAppSimulatorWithCampaignId_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1080390885_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICurrentAppSimulatorWithCampaignId, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("84678a43df004672a43fb25b1441cfcf")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICurrentAppSimulatorWithCampaignId(ptr: Pointer?): WithDefault =
        ICurrentAppSimulatorWithCampaignId_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICurrentAppSimulatorWithCampaignId {
      val address = segment.toRawLongValue()
      return makeICurrentAppSimulatorWithCampaignId(Pointer(address))
    }

    public override fun toNative(obj: ICurrentAppSimulatorWithCampaignId): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1080390885_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICurrentAppSimulatorWithCampaignId):
        Array<ICurrentAppSimulatorWithCampaignId?> = (elements as
        Array<ICurrentAppSimulatorWithCampaignId?>).castToImpl<ICurrentAppSimulatorWithCampaignId,ICurrentAppSimulatorWithCampaignId_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICurrentAppSimulatorWithCampaignId?> =
        arrayOfNulls<ICurrentAppSimulatorWithCampaignId_Impl>(size) as
        Array<ICurrentAppSimulatorWithCampaignId?>
  }
}
