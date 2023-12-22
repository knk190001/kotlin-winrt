package Microsoft.Windows.AppNotifications.Builder

import Windows.Foundation.Collections.IMap
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

@ABIMarker(IAppNotificationComboBox.ABI::class)
@Signature("{4547c9e2-4815-538c-be26-040ce17f8b62}")
@Guid("4547c9e24815538cbe26040ce17f8b62")
@WinRTInterface("4547c9e24815538cbe26040ce17f8b62")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAppNotificationComboBox.ByReference::class)
public interface IAppNotificationComboBox : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun get_Items(): IMap<String?, String?>?

  @InterfaceMethod(1)
  public fun put_Items(value: IMap<String?, String?>?): Unit

  @InterfaceMethod(2)
  public fun get_Title(): String?

  @InterfaceMethod(3)
  public fun put_Title(value: String?): Unit

  @InterfaceMethod(4)
  public fun get_SelectedItem(): String?

  @InterfaceMethod(5)
  public fun put_SelectedItem(value: String?): Unit

  @InterfaceMethod(6)
  public fun AddItem(id: String?, content: String?): AppNotificationComboBox?

  @InterfaceMethod(7)
  public fun SetTitle(value: String?): AppNotificationComboBox?

  @InterfaceMethod(8)
  public fun SetSelectedItem(id: String?): AppNotificationComboBox?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAppNotificationComboBox> {
    public override fun getValue() = ABI.makeIAppNotificationComboBox(pointer.getPointer(0))

    public fun setValue(value: IAppNotificationComboBox_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAppNotificationComboBox {
    public val __636631329_Ptr: Pointer?

    public val _636631329_VtblPtr: Pointer?
      get() = __636631329_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Items(): IMap<String?, String?>? {
      val fnPtr = _636631329_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IMap<String?, String?>>()
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IMap<String?, String?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun put_Items(value: IMap<String?, String?>?): Unit {
      val fnPtr = _636631329_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun get_Title(): String? {
      val fnPtr = _636631329_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun put_Title(value: String?): Unit {
      val fnPtr = _636631329_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun get_SelectedItem(): String? {
      val fnPtr = _636631329_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<String>()
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<String>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun put_SelectedItem(value: String?): Unit {
      val fnPtr = _636631329_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr, marshalToNative(value),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun AddItem(id: String?, content: String?): AppNotificationComboBox? {
      val fnPtr = _636631329_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationComboBox>()
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr, marshalToNative(id), marshalToNative(content),
          result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationComboBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun SetTitle(value: String?): AppNotificationComboBox? {
      val fnPtr = _636631329_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationComboBox>()
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr, marshalToNative(value), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationComboBox>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(8)
    public override fun SetSelectedItem(id: String?): AppNotificationComboBox? {
      val fnPtr = _636631329_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<AppNotificationComboBox>()
      val hr = fn.invokeHR(arrayOf(__636631329_Ptr, marshalToNative(id), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<AppNotificationComboBox>(result.getValue())
      return resultValue
    }
  }

  public class IAppNotificationComboBox_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __636631329_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAppNotificationComboBox, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("4547c9e24815538cbe26040ce17f8b62")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAppNotificationComboBox(ptr: Pointer?): WithDefault =
        IAppNotificationComboBox_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAppNotificationComboBox {
      val address = segment.toRawLongValue()
      return makeIAppNotificationComboBox(Pointer(address))
    }

    public override fun toNative(obj: IAppNotificationComboBox): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__636631329_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAppNotificationComboBox):
        Array<IAppNotificationComboBox?> = (elements as
        Array<IAppNotificationComboBox?>).castToImpl<IAppNotificationComboBox,IAppNotificationComboBox_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAppNotificationComboBox?> =
        arrayOfNulls<IAppNotificationComboBox_Impl>(size) as Array<IAppNotificationComboBox?>
  }
}
