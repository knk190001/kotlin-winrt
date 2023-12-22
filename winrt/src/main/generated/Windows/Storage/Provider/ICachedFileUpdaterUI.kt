package Windows.Storage.Provider

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
import kotlin.Int
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ICachedFileUpdaterUI.ABI::class)
@Signature("{9e6f41e6-baf2-4a97-b600-9333f5df80fd}")
@Guid("9e6f41e6baf24a97b6009333f5df80fd")
@WinRTInterface("9e6f41e6baf24a97b6009333f5df80fd")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ICachedFileUpdaterUI.ByReference::class)
public interface ICachedFileUpdaterUI : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Title(): String?

  @InterfaceMethod(1)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(2)
  public fun get_UpdateTarget(): CachedFileTarget?

  @InterfaceMethod(3)
  public fun add_FileUpdateRequested(handler: TypedEventHandler<CachedFileUpdaterUI?,
      FileUpdateRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_FileUpdateRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_UIRequested(handler: TypedEventHandler<CachedFileUpdaterUI?, IUnknown?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_UIRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(7)
  public fun get_UIStatus(): UIStatus?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ICachedFileUpdaterUI> {
    public override fun getValue() = ABI.makeICachedFileUpdaterUI(pointer.getPointer(0))

    public fun setValue(value: ICachedFileUpdaterUI_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ICachedFileUpdaterUI {
    public val __1598716133_Ptr: Pointer?

    public val _1598716133_VtblPtr: Pointer?
      get() = __1598716133_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Title(): String? {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_UpdateTarget(): CachedFileTarget? {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<CachedFileTarget>()
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<CachedFileTarget>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun add_FileUpdateRequested(handler: TypedEventHandler<CachedFileUpdaterUI?,
        FileUpdateRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_FileUpdateRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_UIRequested(handler: TypedEventHandler<CachedFileUpdaterUI?,
        IUnknown?>?): EventRegistrationToken? {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_UIRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun get_UIStatus(): UIStatus? {
      val fnPtr = _1598716133_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<UIStatus>()
      val hr = fn.invokeHR(arrayOf(__1598716133_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<UIStatus>(result.getValue())
      return resultValue
    }
  }

  public class ICachedFileUpdaterUI_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1598716133_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ICachedFileUpdaterUI, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("9e6f41e6baf24a97b6009333f5df80fd")

    public override val layout: ValueLayout = ADDRESS

    public fun makeICachedFileUpdaterUI(ptr: Pointer?): WithDefault = ICachedFileUpdaterUI_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ICachedFileUpdaterUI {
      val address = segment.toRawLongValue()
      return makeICachedFileUpdaterUI(Pointer(address))
    }

    public override fun toNative(obj: ICachedFileUpdaterUI): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1598716133_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ICachedFileUpdaterUI): Array<ICachedFileUpdaterUI?> =
        (elements as
        Array<ICachedFileUpdaterUI?>).castToImpl<ICachedFileUpdaterUI,ICachedFileUpdaterUI_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ICachedFileUpdaterUI?> =
        arrayOfNulls<ICachedFileUpdaterUI_Impl>(size) as Array<ICachedFileUpdaterUI?>
  }
}
