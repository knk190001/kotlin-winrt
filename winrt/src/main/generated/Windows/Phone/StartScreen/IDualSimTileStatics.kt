package Windows.Phone.StartScreen

import Windows.Foundation.IAsyncOperation
import Windows.UI.Notifications.BadgeUpdater
import Windows.UI.Notifications.TileUpdater
import Windows.UI.Notifications.ToastNotifier
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

@ABIMarker(IDualSimTileStatics.ABI::class)
@Signature("{50567c9e-c58f-4dc9-b6e8-fa6777eeeb37}")
@Guid("50567c9ec58f4dc9b6e8fa6777eeeb37")
@WinRTInterface("50567c9ec58f4dc9b6e8fa6777eeeb37")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IDualSimTileStatics.ByReference::class)
public interface IDualSimTileStatics : NativeMapped, IWinRTInterface {
  @InterfaceMethod(0)
  public fun GetTileForSim2(): DualSimTile?

  @InterfaceMethod(1)
  public fun UpdateDisplayNameForSim1Async(name: String?): IAsyncOperation<Boolean>?

  @InterfaceMethod(2)
  public fun CreateTileUpdaterForSim1(): TileUpdater?

  @InterfaceMethod(3)
  public fun CreateTileUpdaterForSim2(): TileUpdater?

  @InterfaceMethod(4)
  public fun CreateBadgeUpdaterForSim1(): BadgeUpdater?

  @InterfaceMethod(5)
  public fun CreateBadgeUpdaterForSim2(): BadgeUpdater?

  @InterfaceMethod(6)
  public fun CreateToastNotifierForSim1(): ToastNotifier?

  @InterfaceMethod(7)
  public fun CreateToastNotifierForSim2(): ToastNotifier?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IDualSimTileStatics> {
    public override fun getValue() = ABI.makeIDualSimTileStatics(pointer.getPointer(0))

    public fun setValue(value: IDualSimTileStatics_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IDualSimTileStatics {
    public val __1965372130_Ptr: Pointer?

    public val _1965372130_VtblPtr: Pointer?
      get() = __1965372130_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun GetTileForSim2(): DualSimTile? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<DualSimTile>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<DualSimTile>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(1)
    public override fun UpdateDisplayNameForSim1Async(name: String?): IAsyncOperation<Boolean>? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(7L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<IAsyncOperation<Boolean>>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr, marshalToNative(name), result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<IAsyncOperation<Boolean>>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(2)
    public override fun CreateTileUpdaterForSim1(): TileUpdater? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(8L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(3)
    public override fun CreateTileUpdaterForSim2(): TileUpdater? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(9L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<TileUpdater>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<TileUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(4)
    public override fun CreateBadgeUpdaterForSim1(): BadgeUpdater? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(10L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(5)
    public override fun CreateBadgeUpdaterForSim2(): BadgeUpdater? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(11L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BadgeUpdater>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BadgeUpdater>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(6)
    public override fun CreateToastNotifierForSim1(): ToastNotifier? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(12L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotifier>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotifier>(result.getValue())
      return resultValue
    }

    @InterfaceMethod(7)
    public override fun CreateToastNotifierForSim2(): ToastNotifier? {
      val fnPtr = _1965372130_VtblPtr!!.getPointer(13L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<ToastNotifier>()
      val hr = fn.invokeHR(arrayOf(__1965372130_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<ToastNotifier>(result.getValue())
      return resultValue
    }
  }

  public class IDualSimTileStatics_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface {
    public override val __1965372130_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IDualSimTileStatics, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("50567c9ec58f4dc9b6e8fa6777eeeb37")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIDualSimTileStatics(ptr: Pointer?): WithDefault = IDualSimTileStatics_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress): IDualSimTileStatics {
      val address = segment.toRawLongValue()
      return makeIDualSimTileStatics(Pointer(address))
    }

    public override fun toNative(obj: IDualSimTileStatics): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1965372130_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IDualSimTileStatics): Array<IDualSimTileStatics?> =
        (elements as
        Array<IDualSimTileStatics?>).castToImpl<IDualSimTileStatics,IDualSimTileStatics_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IDualSimTileStatics?> =
        arrayOfNulls<IDualSimTileStatics_Impl>(size) as Array<IDualSimTileStatics?>
  }
}
