package Windows.UI.Notifications

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
import kotlin.Int
import kotlin.Unit
import kotlin.jvm.JvmDefaultWithoutCompatibility
import kotlin.reflect.full.createType
import kotlin.reflect.typeOf

@ABIMarker(ITileFlyoutUpdater.ABI::class)
@Signature("{8d40c76a-c465-4052-a740-5c2654c1a089}")
@Guid("8d40c76ac4654052a7405c2654c1a089")
@WinRTInterface("8d40c76ac4654052a7405c2654c1a089")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = ITileFlyoutUpdater.ByReference::class)
public interface ITileFlyoutUpdater : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun Update(notification: TileFlyoutNotification?): Unit

  @InterfaceMethod(1)
  public fun Clear(): Unit

  @InterfaceMethod(2)
  public fun StartPeriodicUpdate(tileFlyoutContent: Uri?,
      requestedInterval: PeriodicUpdateRecurrence?): Unit

  @InterfaceMethod(3)
  public fun StartPeriodicUpdate(
    tileFlyoutContent: Uri?,
    startTime: DateTime?,
    requestedInterval: PeriodicUpdateRecurrence?
  ): Unit

  @InterfaceMethod(4)
  public fun StopPeriodicUpdate(): Unit

  @InterfaceMethod(5)
  public fun get_Setting(): NotificationSetting?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ITileFlyoutUpdater> {
    public override fun getValue() = ABI.makeITileFlyoutUpdater(pointer.getPointer(0))

    public fun setValue(value: ITileFlyoutUpdater_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : ITileFlyoutUpdater {
    public val __1491627984_Ptr: Pointer?

    public val _1491627984_VtblPtr: Pointer?
      get() = __1491627984_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun Update(notification: TileFlyoutNotification?): Unit {
      val fnPtr = _1491627984_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491627984_Ptr, marshalToNative(notification),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(1)
    public override fun Clear(): Unit {
      val fnPtr = _1491627984_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491627984_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(2)
    public override fun StartPeriodicUpdate(tileFlyoutContent: Uri?,
        requestedInterval: PeriodicUpdateRecurrence?): Unit {
      val fnPtr = _1491627984_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491627984_Ptr, marshalToNative(tileFlyoutContent),
          marshalToNative(requestedInterval),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(3)
    public override fun StartPeriodicUpdate(
      tileFlyoutContent: Uri?,
      startTime: DateTime?,
      requestedInterval: PeriodicUpdateRecurrence?
    ): Unit {
      val fnPtr = _1491627984_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491627984_Ptr, marshalToNative(tileFlyoutContent),
          marshalToNative(startTime), marshalToNative(requestedInterval),))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(4)
    public override fun StopPeriodicUpdate(): Unit {
      val fnPtr = _1491627984_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val hr = fn.invokeHR(arrayOf(__1491627984_Ptr, ))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
    }

    @InterfaceMethod(5)
    public override fun get_Setting(): NotificationSetting? {
      val fnPtr = _1491627984_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<NotificationSetting>()
      val hr = fn.invokeHR(arrayOf(__1491627984_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<NotificationSetting>(result.getValue())
      return resultValue
    }
  }

  public class ITileFlyoutUpdater_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1491627984_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<ITileFlyoutUpdater, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("8d40c76ac4654052a7405c2654c1a089")

    public override val layout: ValueLayout = ADDRESS

    public fun makeITileFlyoutUpdater(ptr: Pointer?): WithDefault = ITileFlyoutUpdater_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): ITileFlyoutUpdater {
      val address = segment.toRawLongValue()
      return makeITileFlyoutUpdater(Pointer(address))
    }

    public override fun toNative(obj: ITileFlyoutUpdater): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1491627984_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: ITileFlyoutUpdater): Array<ITileFlyoutUpdater?> =
        (elements as
        Array<ITileFlyoutUpdater?>).castToImpl<ITileFlyoutUpdater,ITileFlyoutUpdater_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<ITileFlyoutUpdater?> =
        arrayOfNulls<ITileFlyoutUpdater_Impl>(size) as Array<ITileFlyoutUpdater?>
  }
}
