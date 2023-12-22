package Windows.ApplicationModel.Background

import com.github.knk190001.winrtbinding.runtime.JNAApiInterface.Companion.INSTANCE
import com.github.knk190001.winrtbinding.runtime.JNAPointer
import com.github.knk190001.winrtbinding.runtime.JNAPointer.NULL
import com.github.knk190001.winrtbinding.runtime.annotations.ABIMarker
import com.github.knk190001.winrtbinding.runtime.annotations.Signature
import com.github.knk190001.winrtbinding.runtime.annotations.WinRTByReference
import com.github.knk190001.winrtbinding.runtime.base.IABI
import com.github.knk190001.winrtbinding.runtime.checkHR
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory
import com.github.knk190001.winrtbinding.runtime.com.IActivationFactory.Companion.IID
import com.github.knk190001.winrtbinding.runtime.com.IUnknownVtbl
import com.github.knk190001.winrtbinding.runtime.com.IWinRTInterface
import com.github.knk190001.winrtbinding.runtime.com.IWinRTObject
import com.github.knk190001.winrtbinding.runtime.getValue
import com.github.knk190001.winrtbinding.runtime.interop.IByReference
import com.github.knk190001.winrtbinding.runtime.interop.guidOf
import com.github.knk190001.winrtbinding.runtime.toHandle
import com.sun.jna.Native.POINTER_SIZE
import com.sun.jna.Pointer
import com.sun.jna.PointerType
import com.sun.jna.platform.win32.Guid
import com.sun.jna.ptr.PointerByReference
import java.lang.foreign.MemoryAddress
import java.lang.foreign.MemoryLayout
import java.lang.foreign.ValueLayout
import kotlin.Array
import kotlin.Unit
import kotlin.reflect.typeOf

@ABIMarker(BluetoothLEAdvertisementWatcherTrigger.ABI::class)
@Signature("rc(Windows.ApplicationModel.Background.BluetoothLEAdvertisementWatcherTrigger;{1aab1819-bce1-48eb-a827-59fb7cee52a6})")
@WinRTByReference(brClass = BluetoothLEAdvertisementWatcherTrigger.ByReference::class)
public class BluetoothLEAdvertisementWatcherTrigger(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IBluetoothLEAdvertisementWatcherTrigger.WithDefault,
    IBackgroundTrigger.WithDefault, IBluetoothLEAdvertisementWatcherTrigger2.WithDefault,
    IWinRTObject {
  private val __1595589067_Interface: IBluetoothLEAdvertisementWatcherTrigger.WithDefault by lazy {
    as_1595589067()
  }


  private val __54213927_Interface: IBackgroundTrigger.WithDefault by lazy {
    as_54213927()
  }


  private val __2076346425_Interface: IBluetoothLEAdvertisementWatcherTrigger2.WithDefault by lazy {
    as_2076346425()
  }


  public override val __1595589067_Ptr: JNAPointer? by lazy {
    __1595589067_Interface.__1595589067_Ptr
  }


  public override val __54213927_Ptr: JNAPointer? by lazy {
    __54213927_Interface.__54213927_Ptr
  }


  public override val __2076346425_Ptr: JNAPointer? by lazy {
    __2076346425_Interface.__2076346425_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1595589067_Interface, __54213927_Interface, __2076346425_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1595589067(): IBluetoothLEAdvertisementWatcherTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementWatcherTrigger.ABI.makeIBluetoothLEAdvertisementWatcherTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementWatcherTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementWatcherTrigger.ABI.makeIBluetoothLEAdvertisementWatcherTrigger(ref.value))
  }

  private fun as_54213927(): IBackgroundTrigger.WithDefault {
    if(pointer == NULL) {
      return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBackgroundTrigger>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBackgroundTrigger.ABI.makeIBackgroundTrigger(ref.value))
  }

  private fun as_2076346425(): IBluetoothLEAdvertisementWatcherTrigger2.WithDefault {
    if(pointer == NULL) {
      return(IBluetoothLEAdvertisementWatcherTrigger2.ABI.makeIBluetoothLEAdvertisementWatcherTrigger2(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IBluetoothLEAdvertisementWatcherTrigger2>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IBluetoothLEAdvertisementWatcherTrigger2.ABI.makeIBluetoothLEAdvertisementWatcherTrigger2(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<BluetoothLEAdvertisementWatcherTrigger> {
    public override fun getValue() = BluetoothLEAdvertisementWatcherTrigger(pointer.getPointer(0))

    public fun setValue(value: BluetoothLEAdvertisementWatcherTrigger): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<BluetoothLEAdvertisementWatcherTrigger, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.ApplicationModel.Background.BluetoothLEAdvertisementWatcherTrigger".toHandle(),
          refiid, iAFPtr)
      checkHR(hr)
      return IActivationFactory(iAFPtr.value)
    }

    public fun activate(): JNAPointer {
      val result = PointerByReference()
      val hr = activationFactory.activateInstance(activationFactory.ptr!!, result)
      checkHR(hr)
      return result.value
    }

    public override fun fromNative(segment: MemoryAddress): BluetoothLEAdvertisementWatcherTrigger {
      val address = segment.toRawLongValue()
      return BluetoothLEAdvertisementWatcherTrigger(Pointer(address))
    }

    public override fun toNative(obj: BluetoothLEAdvertisementWatcherTrigger): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
