package Windows.Phone.Notification.Management

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
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(IAccessoryManager2.ABI::class)
@Signature("{bacad44d-d393-46c6-b80c-15fdf44d5386}")
@Guid("bacad44dd39346c6b80c15fdf44d5386")
@WinRTInterface("bacad44dd39346c6b80c15fdf44d5386")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IAccessoryManager2.ByReference::class)
public interface IAccessoryManager2 : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun RingDevice(): Unit

  @InterfaceMethod(1)
  public fun get_SpeedDialList(): IVectorView<SpeedDialEntry?>?

  @InterfaceMethod(2)
  public fun ClearToast(instanceId: String?): Unit

  @InterfaceMethod(3)
  public fun get_IsPhonePinLocked(): Boolean

  @InterfaceMethod(4)
  public fun IncreaseVolume(step: Int): Unit

  @InterfaceMethod(5)
  public fun DecreaseVolume(step: Int): Unit

  @InterfaceMethod(6)
  public fun SetMute(mute: Boolean): Unit

  @InterfaceMethod(7)
  public fun SetRingerVibrate(ringer: Boolean, vibrate: Boolean): Unit

  @InterfaceMethod(8)
  public fun get_VolumeInfo(): VolumeInfo?

  @InterfaceMethod(9)
  public fun GetAllEmailAccounts(): IVectorView<EmailAccountInfo?>?

  @InterfaceMethod(10)
  public fun GetFolders(emailAccount: String?): IVectorView<EmailFolderInfo?>?

  @InterfaceMethod(11)
  public fun EnableEmailNotificationEmailAccount(emailAccount: String?): Unit

  @InterfaceMethod(12)
  public fun DisableEmailNotificationEmailAccount(emailAccount: String?): Unit

  @InterfaceMethod(13)
  public fun EnableEmailNotificationFolderFilter(emailAccount: String?,
      folders: IVectorView<String?>?): Unit

  @InterfaceMethod(14)
  public fun UpdateEmailReadStatus(messageEntryId: BinaryId?, isRead: Boolean): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IAccessoryManager2> {
    public override fun getValue() = ABI.makeIAccessoryManager2(pointer.getPointer(0))

    public fun setValue(value: IAccessoryManager2_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IAccessoryManager2 {
    public val __586339447_Ptr: Pointer?

    public val _586339447_VtblPtr: Pointer?
      get() = __586339447_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun RingDevice(): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun get_SpeedDialList(): IVectorView<SpeedDialEntry?>? {
      val fnPtr = _586339447_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<SpeedDialEntry?>>()
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<SpeedDialEntry?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun ClearToast(instanceId: String?): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, marshalToNative(instanceId),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_IsPhonePinLocked(): Boolean {
      val fnPtr = _586339447_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<Boolean>()
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<Boolean>(result.getValue())
      return resultValue!!
    }

    @InterfaceMethod(4)
    public override fun IncreaseVolume(step: Int): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, step,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun DecreaseVolume(step: Int): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, step,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun SetMute(mute: Boolean): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, mute,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(7)
    public override fun SetRingerVibrate(ringer: Boolean, vibrate: Boolean): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, ringer, vibrate,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun get_VolumeInfo(): VolumeInfo? {
      val fnPtr = _586339447_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<VolumeInfo>()
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<VolumeInfo>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(9)
    public override fun GetAllEmailAccounts(): IVectorView<EmailAccountInfo?>? {
      val fnPtr = _586339447_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EmailAccountInfo?>>()
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EmailAccountInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(10)
    public override fun GetFolders(emailAccount: String?): IVectorView<EmailFolderInfo?>? {
      val fnPtr = _586339447_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<EmailFolderInfo?>>()
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, marshalToNative(emailAccount), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IVectorView<EmailFolderInfo?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(11)
    public override fun EnableEmailNotificationEmailAccount(emailAccount: String?): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, marshalToNative(emailAccount),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(12)
    public override fun DisableEmailNotificationEmailAccount(emailAccount: String?): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(18L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, marshalToNative(emailAccount),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(13)
    public override fun EnableEmailNotificationFolderFilter(emailAccount: String?,
        folders: IVectorView<String?>?): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(19L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, marshalToNative(emailAccount),
          marshalToNative(folders),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(14)
    public override fun UpdateEmailReadStatus(messageEntryId: BinaryId?, isRead: Boolean): Unit {
      val fnPtr = _586339447_VtblPtr!!.getPointer(20L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__586339447_Ptr, marshalToNative(messageEntryId), isRead,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class IAccessoryManager2_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __586339447_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IAccessoryManager2, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("bacad44dd39346c6b80c15fdf44d5386")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIAccessoryManager2(ptr: Pointer?): WithDefault = IAccessoryManager2_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IAccessoryManager2 {
      val address = segment.toRawLongValue()
      return makeIAccessoryManager2(Pointer(address))
    }

    public override fun toNative(obj: IAccessoryManager2): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__586339447_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IAccessoryManager2): Array<IAccessoryManager2?> =
        (elements as
        Array<IAccessoryManager2?>).castToImpl<IAccessoryManager2,IAccessoryManager2_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IAccessoryManager2?> =
        arrayOfNulls<IAccessoryManager2_Impl>(size) as Array<IAccessoryManager2?>
  }
}
