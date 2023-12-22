package Windows.Media.Protection.PlayReady

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

@ABIMarker(PlayReadyITADataGenerator.ABI::class)
@Signature("rc(Windows.Media.Protection.PlayReady.PlayReadyITADataGenerator;{24446b8e-10b9-4530-b25b-901a8029a9b2})")
@WinRTByReference(brClass = PlayReadyITADataGenerator.ByReference::class)
public class PlayReadyITADataGenerator(
  ptr: JNAPointer? = NULL
) : PointerType(ptr), IPlayReadyITADataGenerator.WithDefault, IWinRTObject {
  private val __1911723400_Interface: IPlayReadyITADataGenerator.WithDefault by lazy {
    as_1911723400()
  }


  public override val __1911723400_Ptr: JNAPointer? by lazy {
    __1911723400_Interface.__1911723400_Ptr
  }


  public override val interfaces: Array<IWinRTInterface>
    get() = arrayOf(__1911723400_Interface)

  public constructor() : this(ABI.activate())

  private fun as_1911723400(): IPlayReadyITADataGenerator.WithDefault {
    if(pointer == NULL) {
      return(IPlayReadyITADataGenerator.ABI.makeIPlayReadyITADataGenerator(NULL))
    }
    val refiid = Guid.REFIID(guidOf<IPlayReadyITADataGenerator>())
    val ref = PointerByReference()
    IUnknownVtbl(pointer.getPointer(0)).queryInterface(pointer, refiid, ref)
    return(IPlayReadyITADataGenerator.ABI.makeIPlayReadyITADataGenerator(ref.value))
  }

  public class ByReference : com.sun.jna.ptr.ByReference(POINTER_SIZE),
      IByReference<PlayReadyITADataGenerator> {
    public override fun getValue() = PlayReadyITADataGenerator(pointer.getPointer(0))

    public fun setValue(value: PlayReadyITADataGenerator): Unit {
      pointer.setPointer(0, value.pointer)
    }
  }

  public object ABI : IABI<PlayReadyITADataGenerator, MemoryAddress> {
    public val activationFactory: IActivationFactory by lazy {
      createActivationFactory()
    }


    public override val layout: MemoryLayout = ValueLayout.ADDRESS

    public fun createActivationFactory(): IActivationFactory {
      val refiid = Guid.REFIID(IID)
      val iAFPtr = PointerByReference()
      var hr =
          INSTANCE.RoGetActivationFactory("Windows.Media.Protection.PlayReady.PlayReadyITADataGenerator".toHandle(),
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

    public override fun fromNative(segment: MemoryAddress): PlayReadyITADataGenerator {
      val address = segment.toRawLongValue()
      return PlayReadyITADataGenerator(Pointer(address))
    }

    public override fun toNative(obj: PlayReadyITADataGenerator): MemoryAddress =
        MemoryAddress.ofLong(Pointer.nativeValue(obj.pointer))
  }
}
