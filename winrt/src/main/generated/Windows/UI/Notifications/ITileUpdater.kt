package Windows.UI.Notifications

import Windows.Foundation.Collections.IIterable
import Windows.Foundation.Collections.IVectorView
import Windows.Foundation.DateTime
import Windows.Foundation.Uri
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

@ABIMarker(ITileUpdater.ABI::class)
@Signature("{0942a48b-1d91-44ec-9243-c1e821c29a20}")
@Guid("0942a48b1d9144ec9243c1e821c29a20")
@WinRTInterface("0942a48b1d9144ec9243c1e821c29a20")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileUpdater.ByReference::class)
public interface ITileUpdater : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Update(notification: TileNotification?): Unit

  @InterfaceMethod(1)
  public fun Clear(): Unit

  @InterfaceMethod(2)
  public fun EnableNotificationQueue(enable: Boolean): Unit

  @InterfaceMethod(3)
  public fun get_Setting(): NotificationSetting?

  @InterfaceMethod(4)
  public fun AddToSchedule(scheduledTile: ScheduledTileNotification?): Unit

  @InterfaceMethod(5)
  public fun RemoveFromSchedule(scheduledTile: ScheduledTileNotification?): Unit

  @InterfaceMethod(6)
  public fun GetScheduledTileNotifications(): IVectorView<ScheduledTileNotification?>?

  @InterfaceMethod(7)
  public fun StartPeriodicUpdate(tileContent: Uri?, requestedInterval: PeriodicUpdateRecurrence?):
      Unit

  @InterfaceMethod(8)
  public fun StartPeriodicUpdate(
    tileContent: Uri?,
    startTime: DateTime?,
    requestedInterval: PeriodicUpdateRecurrence?
  ): Unit

  @InterfaceMethod(9)
  public fun StopPeriodicUpdate(): Unit

  @InterfaceMethod(10)
  public fun StartPeriodicUpdateBatch(tileContents: IIterable<Uri?>?,
      requestedInterval: PeriodicUpdateRecurrence?): Unit

  @InterfaceMethod(11)
  public fun StartPeriodicUpdateBatch(
    tileContents: IIterable<Uri?>?,
    startTime: DateTime?,
    requestedInterval: PeriodicUpdateRecurrence?
  ): Unit

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE), IByReference<ITileUpdater> {
    public override fun getValue() = ABI.makeITileUpdater(pointer.getPointer(0))

    public fun setValue(value: ITileUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileUpdater {
    public val __167662645_Ptr: Pointer?

    public val _167662645_VtblPtr: Pointer?
      get() = __167662645_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Update(notification: TileNotification?): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, marshalToNative(notification),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Clear(): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun EnableNotificationQueue(enable: Boolean): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, enable,))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun get_Setting(): NotificationSetting? {
      val fnPtr = _167662645_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationSetting>()
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationSetting>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun AddToSchedule(scheduledTile: ScheduledTileNotification?): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, marshalToNative(scheduledTile),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun RemoveFromSchedule(scheduledTile: ScheduledTileNotification?): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, marshalToNative(scheduledTile),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(6)
    public override fun GetScheduledTileNotifications(): IVectorView<ScheduledTileNotification?>? {
      val fnPtr = _167662645_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IVectorView<ScheduledTileNotification?>>()
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue =
          marshalFromNative<IVectorView<ScheduledTileNotification?>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun StartPeriodicUpdate(tileContent: Uri?,
        requestedInterval: PeriodicUpdateRecurrence?): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, marshalToNative(tileContent),
          marshalToNative(requestedInterval),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(8)
    public override fun StartPeriodicUpdate(
      tileContent: Uri?,
      startTime: DateTime?,
      requestedInterval: PeriodicUpdateRecurrence?
    ): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(14L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, marshalToNative(tileContent),
          marshalToNative(startTime), marshalToNative(requestedInterval),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(9)
    public override fun StopPeriodicUpdate(): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(15L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(10)
    public override fun StartPeriodicUpdateBatch(tileContents: IIterable<Uri?>?,
        requestedInterval: PeriodicUpdateRecurrence?): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(16L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, marshalToNative(tileContents),
          marshalToNative(requestedInterval),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(11)
    public override fun StartPeriodicUpdateBatch(
      tileContents: IIterable<Uri?>?,
      startTime: DateTime?,
      requestedInterval: PeriodicUpdateRecurrence?
    ): Unit {
      val fnPtr = _167662645_VtblPtr!!.getPointer(17L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__167662645_Ptr, marshalToNative(tileContents),
          marshalToNative(startTime), marshalToNative(requestedInterval),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }
  }

  public class ITileUpdater_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __167662645_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileUpdater, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("0942a48b1d9144ec9243c1e821c29a20")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileUpdater(ptr: Pointer?): WithDefault = ITileUpdater_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileUpdater {
      val address = segment.toRawLongValue()
      return makeITileUpdater(Pointer(address))
    }

    public override fun toNative(obj: ITileUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__167662645_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileUpdater): Array<ITileUpdater?> = (elements as
        Array<ITileUpdater?>).castToImpl<ITileUpdater,ITileUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileUpdater?> =
        arrayOfNulls<ITileUpdater_Impl>(size) as Array<ITileUpdater?>
  }
}
