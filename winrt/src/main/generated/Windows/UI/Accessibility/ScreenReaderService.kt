package Windows.UI.Accessibility

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

@ABIMarker(ScreenReaderService.ABI::class)
@Signature("rc(Windows.UI.Accessibility.ScreenReaderService;{19475427-eac0-50d3-bdd9-9b487a226256})")
@WinRTByReference(brClass = ScreenReaderService.ByReference::class)
public class ScreenReaderService(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IScreenReaderService.WithDefault, IWinRTObject {
  private val __1728420260_Interface: IScreenReaderService.WithDefault by lazy {
    as_1728420260()
  }


  public override val __1728420260_Ptr: JNAPointer? by lazy {
    __1728420260_Interface.__1728420260_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1728420260_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1728420260(): IScreenReaderService.WithDefault {
    if(pointer == NULL) {
      return(IScreenReaderService.ABI.makeIScreenReaderService(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IScreenReaderService>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IScreenReaderService.ABI.makeIScreenReaderService(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<ScreenReaderService> {
    public override fun getValue() = ScreenReaderService(pointer.getPointer(0))

    public fun setValue(value: ScreenReaderService): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<ScreenReaderService, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.UI.Accessibility.ScreenReaderService".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): ScreenReaderService {
      val address = segment.toRawLongValue()
      return ScreenReaderService(Pointer(address))
    }

    public override fun toNative(obj: ScreenReaderService): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
