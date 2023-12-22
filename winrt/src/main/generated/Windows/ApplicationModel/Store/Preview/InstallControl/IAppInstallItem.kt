package Windows.ApplicationModel.Store.Preview.InstallControl

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.TypedEventHandler
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknown
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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAppInstallItem.ABI::class)
@Signature("{49d3dfab-168a-4cbf-a93a-9e448c82737d}")
@Guid("49d3dfab168a4cbfa93a9e448c82737d")
@WinRTInterface("49d3dfab168a4cbfa93a9e448c82737d")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppInstallItem.ByReference::class)
public interface IAppInstallItem : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_ProductId(): String?

  @InterfaceMethod(1)
  public fun get_PackageFamilyName(): String?

  @InterfaceMethod(2)
  public fun get_InstallType(): AppInstallType?

  @InterfaceMethod(3)
  public fun get_IsUserInitiated(): Boolean

  @InterfaceMethod(4)
  public fun GetCurrentStatus(): AppInstallStatus?

  @InterfaceMethod(5)
  public fun Cancel(): Unit

  @InterfaceMethod(6)
  public fun Pause(): Unit

  @InterfaceMethod(7)
  public fun Restart(): Unit

  @InterfaceMethod(8)
  public fun add_Completed(handler: TypedEventHandler<AppInstallItem?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(9)
  public fun remove_Completed(token: EventRegistrationToken?): Unit

  @InterfaceMethod(10)
  public fun add_StatusChanged(handler: TypedEventHandler<AppInstallItem?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(11)
  public fun remove_StatusChanged(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppInstallItem> {
    public override fun getValue() = ABI.makeIAppInstallItem(pointer.getPointer(0))

    public fun setValue(value: IAppInstallItem_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppInstallItem {
    public val __1908307625_Ptr: Pointer?

    public val _1908307625_VtblPtr: Pointer?
      get() = __1908307625_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_ProductId(): String? {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun get_PackageFamilyName(): String? {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun get_InstallType(): AppInstallType? {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallType>()
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallType>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun get_IsUserInitiated(): Boolean {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun GetCurrentStatus(): AppInstallStatus? {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppInstallStatus>()
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppInstallStatus>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun Cancel(): Unit {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun Pause(): Unit {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun Restart(): Unit {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun add_Completed(handler: TypedEventHandler<AppInstallItem?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun remove_Completed(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun add_StatusChanged(handler: TypedEventHandler<AppInstallItem?, IUnknown?>?):
        EventRegistrationToken? {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun remove_StatusChanged(token: EventRegistrationToken?): Unit {
      val fnPtr = _1908307625_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1908307625_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAppInstallItem_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1908307625_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppInstallItem, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("49d3dfab168a4cbfa93a9e448c82737d")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppInstallItem(ptr: Pointer?): WithDefault = IAppInstallItem_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppInstallItem {
      val address = segment.toRawLongValue()
      return makeIAppInstallItem(Pointer(address))
    }

    public override fun toNative(obj: IAppInstallItem): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1908307625_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppInstallItem): Array<IAppInstallItem?> = (elements as
        Array<IAppInstallItem?>).castToImpl<IAppInstallItem,IAppInstallItem_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppInstallItem?> =
        arrayOfNulls<IAppInstallItem_Impl>(size) as Array<IAppInstallItem?>
  }
}
