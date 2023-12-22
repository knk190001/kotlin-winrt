package Windows.ApplicationModel.Contacts

import Windows.Foundation.EventRegistrationToken
import Windows.Foundation.IReference
import Windows.Foundation.TypedEventHandler
import Windows.UI.Color
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

@ABIMarker(IContactPanel.ABI::class)
@Signature("{41bf1265-d2ee-4b97-a80a-7d8d64cca6f5}")
@Guid("41bf1265d2ee4b97a80a7d8d64cca6f5")
@WinRTInterface("41bf1265d2ee4b97a80a7d8d64cca6f5")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IContactPanel.ByReference::class)
public interface IContactPanel : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun ClosePanel(): Unit

  @InterfaceMethod(1)
  public fun get_HeaderColor(): IReference<Color?>?

  @InterfaceMethod(2)
  public fun put_HeaderColor(value: IReference<Color?>?): Unit

  @InterfaceMethod(3)
  public fun add_LaunchFullAppRequested(handler: TypedEventHandler<ContactPanel?,
      ContactPanelLaunchFullAppRequestedEventArgs?>?): EventRegistrationToken?

  @InterfaceMethod(4)
  public fun remove_LaunchFullAppRequested(token: EventRegistrationToken?): Unit

  @InterfaceMethod(5)
  public fun add_Closing(handler: TypedEventHandler<ContactPanel?, ContactPanelClosingEventArgs?>?):
      EventRegistrationToken?

  @InterfaceMethod(6)
  public fun remove_Closing(token: EventRegistrationToken?): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<IContactPanel>
      {
    public override fun getValue() = ABI.makeIContactPanel(pointer.getPointer(0))

    public fun setValue(value: IContactPanel_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IContactPanel {
    public val __1316524880_Ptr: Pointer?

    public val _1316524880_VtblPtr: Pointer?
      get() = __1316524880_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun ClosePanel(): Unit {
      val fnPtr = _1316524880_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316524880_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_HeaderColor(): IReference<Color?>? {
      val fnPtr = _1316524880_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IReference<Color?>>()
      val hr = fn.invokeHR(arrayOf(__1316524880_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IReference<Color?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun put_HeaderColor(value: IReference<Color?>?): Unit {
      val fnPtr = _1316524880_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316524880_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun add_LaunchFullAppRequested(handler: TypedEventHandler<ContactPanel?,
        ContactPanelLaunchFullAppRequestedEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1316524880_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1316524880_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun remove_LaunchFullAppRequested(token: EventRegistrationToken?): Unit {
      val fnPtr = _1316524880_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316524880_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun add_Closing(handler: TypedEventHandler<ContactPanel?,
        ContactPanelClosingEventArgs?>?): EventRegistrationToken? {
      val fnPtr = _1316524880_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<EventRegistrationToken>()
      val hr = fn.invokeHR(arrayOf(__1316524880_Ptr, marshalToNative(handler), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<EventRegistrationToken>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun remove_Closing(token: EventRegistrationToken?): Unit {
      val fnPtr = _1316524880_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1316524880_Ptr, marshalToNative(token),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IContactPanel_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1316524880_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IContactPanel, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("41bf1265d2ee4b97a80a7d8d64cca6f5")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIContactPanel(ptr: Pointer?): WithDefault = IContactPanel_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IContactPanel {
      val address = segment.toRawLongValue()
      return makeIContactPanel(Pointer(address))
    }

    public override fun toNative(obj: IContactPanel): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1316524880_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IContactPanel): Array<IContactPanel?> = (elements as
        Array<IContactPanel?>).castToImpl<IContactPanel,IContactPanel_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IContactPanel?> =
        arrayOfNulls<IContactPanel_Impl>(size) as Array<IContactPanel?>
  }
}
