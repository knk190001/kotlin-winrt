package Windows.ApplicationModel.Background

import Windows.ApplicationModel.Background.IBackgroundTrigger.ABI.IID
import Windows.Devices.Bluetooth.Advertisement.BluetoothLEAdvertisement
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Guid
import com.github.knk190001.winrtbinding.runtime.annotations.InterfaceMethod
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTInterface
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.castToImpl
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
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
import com.sun.jna.ptr.PointerByReference
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

@ABIMarker(IBluetoothLEAdvertisementPublisherTrigger.ABI::class)
@Signature("{ab3e2612-25d3-48ae-8724-d81877ae6129}")
@Guid("ab3e261225d348ae8724d81877ae6129")
@WinRTInterface("ab3e261225d348ae8724d81877ae6129")
@JvmDefaultWithoutCompatibility
@WinRTByReference(brClass = IBluetoothLEAdvertisementPublisherTrigger.ByReference::class)
public interface IBluetoothLEAdvertisementPublisherTrigger : NativeMapped, IWinRTInterface,
    IBackgroundTrigger {
  @InterfaceMethod(0)
  public fun get_Advertisement(): BluetoothLEAdvertisement?

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<IBluetoothLEAdvertisementPublisherTrigger> {
    public override fun getValue() =
        ABI.makeIBluetoothLEAdvertisementPublisherTrigger(pointer.getPointer(0))

    public fun setValue(value: IBluetoothLEAdvertisementPublisherTrigger_Impl): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  @JvmDefaultWithoutCompatibility
  public interface WithDefault : IBluetoothLEAdvertisementPublisherTrigger,
      IBackgroundTrigger.WithDefault {
    public val __1803841077_Ptr: Pointer?

    public val _1803841077_VtblPtr: Pointer?
      get() = __1803841077_Ptr?.getPointer(0)

    @InterfaceMethod(0)
    public override fun get_Advertisement(): BluetoothLEAdvertisement? {
      val fnPtr = _1803841077_VtblPtr!!.getPointer(6L * POINTER_SIZE)
      val fn = Function.getFunction(fnPtr, ALT_CONVENTION)
      val result = makeByReferenceType<BluetoothLEAdvertisement>()
      val hr = fn.invokeHR(arrayOf(__1803841077_Ptr,  result))
      if (hr.toInt() != 0) {
        throw RuntimeException(hr.toString())
      }
      val resultValue = marshalFromNative<BluetoothLEAdvertisement>(result.getValue())
      return resultValue
    }
  }

  public class IBluetoothLEAdvertisementPublisherTrigger_Impl(
    ptr: Pointer? = NULL
  ) : PointerType(ptr), WithDefault, NativeMapped, IWinRTInterface, IBackgroundTrigger {
    public override val __54213927_Ptr: JNAPointer by lazy {
      val refiid = com.sun.jna.platform.win32.Guid.REFIID(IID)
      val result = PointerByReference()
      IUnknownVtbl(_1803841077_VtblPtr).queryInterface(pointer,refiid,result)
      result.value
    }


    public override val __1803841077_Ptr: Pointer?
      get() = pointer
  }

  public object ABI : IABI<IBluetoothLEAdvertisementPublisherTrigger, MemoryAddress> {
    public val IID: com.sun.jna.platform.win32.Guid.IID =
        com.sun.jna.platform.win32.Guid.IID("ab3e261225d348ae8724d81877ae6129")

    public override val layout: ValueLayout = ADDRESS

    public fun makeIBluetoothLEAdvertisementPublisherTrigger(ptr: Pointer?): WithDefault =
        IBluetoothLEAdvertisementPublisherTrigger_Impl(ptr)

    public override fun fromNative(segment: MemoryAddress):
        IBluetoothLEAdvertisementPublisherTrigger {
      val address = segment.toRawLongValue()
      return makeIBluetoothLEAdvertisementPublisherTrigger(Pointer(address))
    }

    public override fun toNative(obj: IBluetoothLEAdvertisementPublisherTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue((obj as WithDefault).__1803841077_Ptr))
  }

  public companion object {
    public fun makeArray(vararg elements: IBluetoothLEAdvertisementPublisherTrigger):
        Array<IBluetoothLEAdvertisementPublisherTrigger?> = (elements as
        Array<IBluetoothLEAdvertisementPublisherTrigger?>).castToImpl<IBluetoothLEAdvertisementPublisherTrigger,IBluetoothLEAdvertisementPublisherTrigger_Impl>()

    public fun makeArrayOfNulls(size: Int): Array<IBluetoothLEAdvertisementPublisherTrigger?> =
        arrayOfNulls<IBluetoothLEAdvertisementPublisherTrigger_Impl>(size) as
        Array<IBluetoothLEAdvertisementPublisherTrigger?>
  }
}
