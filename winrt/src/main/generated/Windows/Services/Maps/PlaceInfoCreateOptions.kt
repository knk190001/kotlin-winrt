package Windows.Services.Maps

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

@ABIMarker(PlaceInfoCreateOptions.ABI::class)
@Signature("rc(Windows.Services.Maps.PlaceInfoCreateOptions;{cd33c125-67f1-4bb3-9907-ecce939b0399})")
@WinRTByReference(brClass = PlaceInfoCreateOptions.ByReference::class)
public class PlaceInfoCreateOptions(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlaceInfoCreateOptions.WithDefault, IWinRTObject {
  private val __864726022_Interface: IPlaceInfoCreateOptions.WithDefault by lazy {
    as_864726022()
  }


  public override val __864726022_Ptr: JNAPointer? by lazy {
    __864726022_Interface.__864726022_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__864726022_Interface)

  public constructor() : this(ABI.activate())

  private fun as_864726022(): IPlaceInfoCreateOptions.WithDefault {
    if(pointer == NULL) {
      return(IPlaceInfoCreateOptions.ABI.makeIPlaceInfoCreateOptions(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlaceInfoCreateOptions>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlaceInfoCreateOptions.ABI.makeIPlaceInfoCreateOptions(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlaceInfoCreateOptions> {
    public override fun getValue() = PlaceInfoCreateOptions(pointer.getPointer(0))

    public fun setValue(value: PlaceInfoCreateOptions): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlaceInfoCreateOptions, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Services.Maps.PlaceInfoCreateOptions".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PlaceInfoCreateOptions {
      val address = segment.toRawLongValue()
      return PlaceInfoCreateOptions(Pointer(address))
    }

    public override fun toNative(obj: PlaceInfoCreateOptions): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
